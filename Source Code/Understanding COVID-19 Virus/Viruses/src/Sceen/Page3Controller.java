package Sceen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import DataBase.ReadFileJSonOfVirusStore;
import Repository.Repository;
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

public class Page3Controller implements Initializable {
	@FXML
	private ImageView imageView;

	@FXML
	private Label introductionLabel;

	@FXML
	private Label nameLabel;

	private Virus virus;

	public void setData(Virus virus) {
			this.virus = virus;

	}

	//Ham khoi tao khi scene dc khoi tao
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		nameLabel.setText(virus.getName().toUpperCase());
		if (virus instanceof VirusWithLipid) {
			VirusWithLipid vsLipid = (VirusWithLipid) virus;

			introductionLabel.setText(vsLipid.getIntroduction());

			String linkImage = vsLipid.getImageLink();
			// chuyen link image thanh image
			Image image = new Image(getClass().getResourceAsStream(linkImage));
			// truyen image vao image view
			imageView.setImage(image);

		} else if (virus instanceof VirusWithoutLipid) {
			VirusWithoutLipid vsWithoutLipid = (VirusWithoutLipid) virus;

			introductionLabel.setText(vsWithoutLipid.getIntroduction());

			String linkImage = vsWithoutLipid.getImageLink();
			// chuyen link image thanh image
			Image image = new Image(getClass().getResourceAsStream(linkImage));
			// truyen image vao image view
			imageView.setImage(image);

		}
	}
	
	@FXML
	void changeSceneWithBtnHelp(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = new Stage();

		scene.getStylesheets().add(getClass().getResource("Style/HelpStyle.css").toExternalForm());

		stage.setTitle("Help");
		stage.setScene(scene);

		stage.show();
	}

	@FXML
	void changeSceneWithBackPage2(ActionEvent event) throws IOException {
		FXMLLoader loader = null;
		Parent root;

	 if (virus instanceof VirusWithoutLipid) {
			loader = new FXMLLoader(getClass().getResource("VirusWithoutLipit.fxml"));

			// Lay du lieu virus without lipit từ kho virusWithLipitStore
			Repository repositoryOfVirusWithoutLipit = new Repository();
			ReadFileJSonOfVirusStore readFileJSonOfVirusStore = new ReadFileJSonOfVirusStore();
			readFileJSonOfVirusStore.read("Viruses/src/DataBase/VirusWithoutLipitStore.json");
			repositoryOfVirusWithoutLipit = readFileJSonOfVirusStore.getRepository();

			// Truyen data qua Scene
			VirusWithoutLipitController virusWithoutLipitController = new VirusWithoutLipitController();
			virusWithoutLipitController.setData(repositoryOfVirusWithoutLipit);
			
			//set Controller cho FXMLLoader
			loader.setController(virusWithoutLipitController);
		
		} else if (virus instanceof VirusWithLipid) {
			loader = new FXMLLoader(getClass().getResource("VirusWithLipit.fxml"));

			// Lay du lieu tu kho virus with lipit
			Repository repositoryOfVirusWithLipit = new Repository();
			ReadFileJSonOfVirusStore readFileJSonOfVirusStore = new ReadFileJSonOfVirusStore();
			readFileJSonOfVirusStore.read("Viruses/src/DataBase/VirusWithLipitStore.json");
			repositoryOfVirusWithLipit = readFileJSonOfVirusStore.getRepository();

			// truyen du lieu sang page2
			VirusWithLipitController virusWithLipitController = new VirusWithLipitController();
			virusWithLipitController.setData(repositoryOfVirusWithLipit);
			loader.setController(virusWithLipitController);

		} 


		root = loader.load();
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void changeSceneWithInfection(ActionEvent event) throws IOException {
		//Load file fxml
		FXMLLoader loader = new FXMLLoader(getClass().getResource("infection.fxml"));

		InfectionController infection = new InfectionController();
		infection.setData(virus);
		loader.setController(infection);

		Parent root = loader.load();

		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		scene.getStylesheets().add(getClass().getResource("Style/infectionStyle.css").toExternalForm());

		stage.setScene(scene);
		stage.show();
	}

	
}
