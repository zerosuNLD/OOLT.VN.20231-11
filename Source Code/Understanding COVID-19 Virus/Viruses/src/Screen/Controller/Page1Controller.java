package Screen.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Page1Controller implements Initializable{
	@FXML
	private AnchorPane AnchorPaneCenter;

	@FXML
	private Button btnHelp;

	@FXML
	private Button btnVirusWithLipit;

	@FXML
	private Button btnVirusWithoutLipit;

	@FXML
	private BorderPane page1Container;
	
	@FXML
	private Button close_btn;

	@FXML
	private Label titleLabel;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btnHelp.setOnAction(event -> onHelp());
		btnVirusWithLipit.setOnAction(event -> onVirusWithLipit());
		btnVirusWithoutLipit.setOnAction(event -> onVirusWithoutLipit());
		close_btn.setOnAction(event -> onClose());
		
	}
	
	private void onHelp() {
		Model.getInstance().getViewFactory().showHelp();
	}
	
	private void onVirusWithLipit() {
		Stage stage = (Stage) titleLabel.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showListVirusWithLipit();
	}
	
	private void onVirusWithoutLipit() {
		Stage stage = (Stage) titleLabel.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showListVirusWithoutLipit();
	}
	
	private void onClose() {
		Stage stage = (Stage) titleLabel.getScene().getWindow();
		Model.getInstance().getViewFactory().showCloseConfirmationAlert(stage);
	}
}
