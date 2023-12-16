package Sceen;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Page1Controller {

	@FXML
	void changeSceneWithBtnVirusWithLipit(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("VirusWithLipit.fxml"));
		Parent root = loader.load();
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		
		scene.getStylesheets().add(getClass()
	        		.getResource("Style/VirusWithLipitStyle.css").toExternalForm());
		
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void changeSceneWithBtnVirusWithoutLipit(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("VirusWithoutLipit.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		
		scene.getStylesheets().add(getClass()
        		.getResource("Style/VirusWithLipitStyle.css").toExternalForm());
		
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
