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

public class InfectionController{
	@FXML
	private ImageView imageView;
	
    @FXML
    private Label title;
	
    @FXML
    private Label infectionLabel;
    
	private Virus virus;

	public void setData(Virus virus) {
		if (virus != null) {
	        title.setText(virus.getName());
	        virus.infection();

	        if (virus instanceof VirusWithLipid) {
	            VirusWithLipid vsLipid = (VirusWithLipid) virus;

	            if (imageView != null) {
	                imageView.setImage(vsLipid.getImage2());
	            } else {
	                System.err.println("Lỗi: imageView là null");
	            }

	        } else if (virus instanceof VirusWithoutLipid) {
	            VirusWithoutLipid vsWithoutLipid = (VirusWithoutLipid) virus;

	            if (imageView != null) {
	                imageView.setImage(vsWithoutLipid.getImage2());
	            } else {
	                System.err.println("Lỗi: imageView là null");
	            }
	        }
	    } else {
	        System.err.println("Virus là null");
	    }
		
	    this.virus = virus;
	}


	
	@FXML
	void changeSceneWithBackPage3(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Page3.fxml"));
		Parent root = loader.load();

		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		Page3Controller page3Controller = loader.getController();
		if (page3Controller != null) {
	        page3Controller.setData(this.virus);
	    } else {
	        System.out.println("Page3 controller is null");
	    }
	    

		scene.getStylesheets().add(getClass().getResource("Style/Page3Style.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	void changeSceneWithBtnHelp(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);

		scene.getStylesheets().add(getClass()
        		.getResource("Style/HelpStyle.css").toExternalForm());
		
		
		Stage stage = new Stage();
		stage.setTitle("Help");
		stage.setScene(scene);

		stage.show();
	}

}