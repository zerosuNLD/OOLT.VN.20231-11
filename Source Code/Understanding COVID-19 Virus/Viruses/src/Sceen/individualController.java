package Sceen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Virus.Virus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class individualController implements Initializable {
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
		this.virus = virus;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		name.setText(virus.getName());
		title.setText("The distinct transmission of the virus " + virus.getName());
		individualLabel.setText(virus.getIndividual());
	}

	@FXML
	void changeSceneWithBackInfection(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("infection.fxml"));
		
		//Truyen data 
		InfectionController infectionController = new InfectionController();
		infectionController.setData(virus);
		
		//Set controller
		loader.setController(infectionController);
		
		Parent root = loader.load();

		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene.getStylesheets().add(getClass().getResource("Style/infectionStyle.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void changeSceneWithbtnNext(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Page5.fxml"));
		
		Page5Controller controller = new Page5Controller();
		controller.setData(virus);
		
		loader.setController(controller);
		
		Parent root = loader.load();	

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

		scene.getStylesheets().add(getClass().getResource("Style/HelpStyle.css").toExternalForm());

		Stage stage = new Stage();
		stage.setTitle("Help");
		stage.setScene(scene);

		stage.show();
	}

}