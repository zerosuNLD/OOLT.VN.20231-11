package Screen.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import Virus.Virus;
import Virus.VirusWithLipid;
import Virus.VirusWithoutLipid;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Page3Controller implements Initializable {
	@FXML
	private AnchorPane AnchorPaneCenter;

	@FXML
	private Button btnBack;

	@FXML
	private Button btnHelp;

	@FXML
	private Button btnInfection;

	@FXML
	private ImageView imageView;

	@FXML
	private Label introductionLabel;

	@FXML
	private Label nameLabel;

	@FXML
	private Button close_btn;
	
	private Virus virusSelected;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		virusSelected = Model.getInstance().getViewFactory().getVirusSelected();
		
		setDataOnScene();
		
		btnBack.setOnAction(event -> onBack());
		btnHelp.setOnAction(event -> onHelp());
		btnInfection.setOnAction(event -> onInfection());
		close_btn.setOnAction(event -> onClose());
	}
	
	private void setDataOnScene() {
		nameLabel.setText(virusSelected.getName());
		String linkImage = virusSelected.getImageLink();
		Image image = new Image(getClass().getResourceAsStream(linkImage));
		imageView.setImage(image);
		introductionLabel.setText(virusSelected.getIntroduction());
		introductionLabel.setWrapText(true);  
	    introductionLabel.setMaxWidth(400);   
	}

	private void onBack() {
		if (virusSelected instanceof VirusWithLipid) {
			Stage stage = (Stage) nameLabel.getScene().getWindow();
			Model.getInstance().getViewFactory().closeStage(stage);
			Model.getInstance().getViewFactory().showListVirusWithLipit();
		}
		else if (virusSelected instanceof VirusWithoutLipid) {
			Stage stage = (Stage) nameLabel.getScene().getWindow();
			Model.getInstance().getViewFactory().closeStage(stage);
			Model.getInstance().getViewFactory().showListVirusWithoutLipit();
		}
	}
	
	private void onInfection() {
		Stage stage = (Stage) nameLabel.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showInfectionScene();
	}
	
	private void onHelp() {
		
		Model.getInstance().getViewFactory().showHelp();
	}
	
	private void onClose() {
		Stage stage = (Stage) nameLabel.getScene().getWindow();
		Model.getInstance().getViewFactory().showCloseConfirmationAlert(stage);
	}
}
