package Sceen;

import java.io.IOException;

import Virus.Virus;
import Virus.VirusWithLipid;
import Virus.VirusWithoutLipid;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Page3Controller {
	@FXML
	private ImageView imageView;

	@FXML
	private Label introductionLabel;

	@FXML
	private Label nameLabel;

	private Virus virus;

	public void setData(Virus virus) {
		nameLabel.setText(virus.getName().toUpperCase());
		if (virus instanceof VirusWithLipid) {
			VirusWithLipid vsLipid = (VirusWithLipid)virus;
			
		
			introductionLabel.setText(vsLipid.getIntroduction());
		
			imageView.setImage(vsLipid.getImage());
			
		}else if (virus instanceof VirusWithoutLipid){
			VirusWithoutLipid vsWithoutLipid = (VirusWithoutLipid)virus;
			
			introductionLabel.setText(vsWithoutLipid.getIntroduction());
		
			imageView.setImage(vsWithoutLipid.getImage());
		}
		
		if (virus != null) {
			this.virus = virus;
		}
		
	}

	
	@FXML
	void changeSceneWithBtnHelp(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		
		scene.getStylesheets().add(getClass()
        		.getResource("Style/HelpStyle.css").toExternalForm());
		
		
		stage.setTitle("Help");
		stage.setScene(scene);

		stage.show();
	}
	
	@FXML
	void changeSceneWithBackPage2(ActionEvent event) throws IOException {
	    FXMLLoader loader;
	    Parent root;

	    if (virus instanceof VirusWithLipid) {
	        loader = new FXMLLoader(getClass().getResource("VirusWithLipit.fxml"));
	    } else if (virus instanceof VirusWithoutLipid) {
	        loader = new FXMLLoader(getClass().getResource("VirusWithoutLipit.fxml"));
	    } else {
	        // Xử lý trường hợp khác nếu cần
	        return;
	    }

	    root = loader.load();
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	}

	

}
