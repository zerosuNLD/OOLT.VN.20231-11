package Sceen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Virus.Virus;
import Virus.VirusWithLipid;
import Virus.VirusWithoutLipid;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class InfectionController implements Initializable {
	@FXML
	private ImageView imageView;

	@FXML
	private Label title;

	@FXML
	private Label infectionLabel;

	private Virus virus;

	public void setData(Virus virus) {
		this.virus = virus;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		title.setText(virus.getName());
		if (virus instanceof VirusWithLipid) {
			VirusWithLipid vsLipid = (VirusWithLipid) virus;
			String linkImage2 = vsLipid.getImage2Link();
			// chuyen link image thanh image
			Image image = new Image(getClass().getResourceAsStream(linkImage2));
			
			//truyen image vao imageView
			imageView.setImage(image);
			
			//truyen infection vao infectionLabel
			infectionLabel.setText("Infection Of Virus with Lipit");

		} else if (virus instanceof VirusWithoutLipid) {
			VirusWithoutLipid vsWithoutLipid = (VirusWithoutLipid) virus;
			String linkImage2 = vsWithoutLipid.getImage2Link();
			// chuyen link image thanh image
			Image image = new Image(getClass().getResourceAsStream(linkImage2));
			
			imageView.setImage(image);
			
			infectionLabel.setText("Infecton Of Virus without Lipit");

		}
	}

	@FXML
	void changeSceneWithBackPage3(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Page3.fxml"));
		
		Page3Controller page3Controller = new Page3Controller();
		page3Controller.setData(virus);
		loader.setController(page3Controller);
		
		Parent root = loader.load();

		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		scene.getStylesheets().add(getClass().getResource("Style/Page3Style.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void changeSceneWithBtnHelp(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);

		scene.getStylesheets().add(getClass().getResource("Style/HelpStyle.css").toExternalForm());

		Stage stage = new Stage();
		stage.setTitle("Help");
		stage.setScene(scene);

		stage.show();
	}

	@FXML
	void changeSceneWithbtnNext(ActionEvent event) throws IOException {
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("individual.fxml"));
		
		//Truyen Data
		individualController individualController = new individualController();
		individualController.setData(virus);
		loader.setController(individualController);
		
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		scene.getStylesheets().add(getClass().getResource("Style/individualStyle.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
	}

}