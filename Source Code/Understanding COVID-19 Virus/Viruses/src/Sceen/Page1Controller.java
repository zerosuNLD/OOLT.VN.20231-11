package Sceen;

import java.io.IOException;

import DataBase.ReadFileJSonOfVirusStore;
import Repository.Repository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Page1Controller {

	@FXML
	private Button btnVirusWithLipit;

	@FXML
	private BorderPane page1Container;

	@FXML
	void changeSceneWithBtnVirusWithLipit(ActionEvent event) throws IOException {
		// Load file FXML
		FXMLLoader loader = new FXMLLoader(getClass().getResource("VirusWithLipit.fxml"));

		// Lay du lieu virus with lipit từ kho virusWithLipitStore
		Repository repositoryOfVirusWithLipit = new Repository();
		ReadFileJSonOfVirusStore readFileJSonOfVirusStore = new ReadFileJSonOfVirusStore();
		readFileJSonOfVirusStore.read("Viruses/src/DataBase/VirusWithLipitStore.json");
		repositoryOfVirusWithLipit = readFileJSonOfVirusStore.getRepository();
		repositoryOfVirusWithLipit.showListVirus();

		// Truyen data qua Scene
		VirusWithLipitController virusWithLipitController = new VirusWithLipitController(); // Tạo mới controller
		virusWithLipitController.setData(repositoryOfVirusWithLipit);
		loader.setController(virusWithLipitController);

		Parent root = loader.load(); // Load FXML file, cũng đã gọi setController trước đó
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("Style/VirusWithLipitStyle.css").toExternalForm());
		stage.setScene(scene);

		stage.show();

	}

	@FXML
	void changeSceneWithBtnVirusWithoutLipit(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("VirusWithoutLipit.fxml"));

		// Lay du lieu virus without lipit từ kho virusWithLipitStore
		Repository repositoryOfVirusWithoutLipit = new Repository();
		ReadFileJSonOfVirusStore readFileJSonOfVirusStore = new ReadFileJSonOfVirusStore();
		readFileJSonOfVirusStore.read("Viruses/src/DataBase/VirusWithoutLipitStore.json");
		repositoryOfVirusWithoutLipit = readFileJSonOfVirusStore.getRepository();
	

		// Truyen data qua Scene
		VirusWithoutLipitController virusWithoutLipitController = new VirusWithoutLipitController();
		virusWithoutLipitController.setData(repositoryOfVirusWithoutLipit);
		loader.setController(virusWithoutLipitController);


		Parent root = loader.load();
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);

		scene.getStylesheets().add(getClass().getResource("Style/VirusWithLipitStyle.css").toExternalForm());

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
