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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class individualController {
	@FXML
	private Label name;

	@FXML
	private Label title;

	@FXML 
	private Button btnNext;
	
	@FXML
	private Label individualLabel;

	private Virus virus;

	public void setData(Virus virus) {
		if (virus != null) {

			name.setText(virus.getName());
			title.setText("The distinct transmission of the virus " + virus.getName());
			
			if (virus instanceof VirusWithLipid) {
				VirusWithLipid vsLipid = (VirusWithLipid) virus;
				individualLabel.setText(vsLipid.getIndividual());
			} else if (virus instanceof VirusWithoutLipid) {
				VirusWithoutLipid vsWithoutLipid = (VirusWithoutLipid) virus;
				individualLabel.setText(vsWithoutLipid.getIndividual());
			}

		} else {
			System.err.println("Virus là null");
		}

		this.virus = virus;
	}
	
	@FXML
	void changeSceneWithBackInfection(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("infection.fxml"));
		Parent root = loader.load();

		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		InfectionController infectionController= loader.getController();
		if (infectionController != null) {
	        infectionController.setData(this.virus);
	    } else {
	        System.out.println("controller is null");
	    }
	    

		scene.getStylesheets().add(getClass().getResource("Style/infectionStyle.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void changeSceneWithbtnNext(ActionEvent event) throws IOException {
		if (virus == null) {
			System.out.println("Virus = null");
			return;
		}

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Page5.fxml"));
		Parent root = loader.load();

		Page5Controller controller = loader.getController();

		if (controller != null) {
			controller.setData(virus);
		} else {
			System.out.println("Infection controller is null");
		}

		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		scene.getStylesheets().add(getClass().getResource("Style/Page5.css").toExternalForm());

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