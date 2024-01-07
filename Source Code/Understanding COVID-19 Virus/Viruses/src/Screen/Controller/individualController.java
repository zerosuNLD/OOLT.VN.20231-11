package Screen.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import Virus.Virus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class individualController implements Initializable {
	@FXML
	private AnchorPane AnchorPaneCenter;

	@FXML
	private Button btnBack;

	@FXML
	private Button btnHelp;

	@FXML
	private Button btnNext;

	@FXML
	private Label individualLabel;

	@FXML
	private Label name;

	@FXML
	private Label title;

	@FXML
	private Button close_btn;
	
	private Virus virus;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		virus = Model.getInstance().getViewFactory().getVirusSelected();

		setDataOnScene();

		btnBack.setOnAction(event -> onInfection());
		btnNext.setOnAction(event -> onScene5());
		btnHelp.setOnAction(event -> onHelp());
		close_btn.setOnAction(event -> onClose());
	}

	private void setDataOnScene() {
		name.setText(virus.getName());
		title.setText("The distinct transmission of the virus " + virus.getName());
		individualLabel.setText(virus.getIndividual());
		individualLabel.setWrapText(true);  
	    individualLabel.setMaxWidth(610);  
	}

	private void onInfection() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showInfectionScene();
	}

	private void onScene5() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showScene5();
	}

	private void onHelp() {
		Model.getInstance().getViewFactory().showHelp();
	}
	
	private void onClose() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().showCloseConfirmationAlert(stage);
	}

}