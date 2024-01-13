package Screen.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import Virus.GUI_Virus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StructureController implements Initializable {
	@FXML
	private AnchorPane AnchorPaneCenter;

	@FXML
	private Button btnBack;

	@FXML
	private Button btnHelp;

	@FXML
	private Button btnNext;

	@FXML
	private Button close_btn;

	@FXML
	private Label infectionLabel;

	@FXML
	private Label title;

	private GUI_Virus gUI_Virus;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		gUI_Virus = Model.getInstance().getViewFactory().getVirusSelected();

		setDataOnScene();

		btnBack.setOnAction(event -> onScene3());
		btnNext.setOnAction(event -> onInfection());
		btnHelp.setOnAction(event -> onHelp());
		close_btn.setOnAction(event -> onClose());
	}

	private void setDataOnScene() {
		title.setText(gUI_Virus.getName());

		infectionLabel.setText(gUI_Virus.getStructure2String());
		infectionLabel.setWrapText(true);
		infectionLabel.setMaxWidth(450);
	}

	private void onScene3() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showScene3();
	}

	private void onInfection() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showInfectionScene();
	}

	private void onHelp() {
		Model.getInstance().getViewFactory().showHelp();
	}

	private void onClose() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().showCloseConfirmationAlert(stage);
	}

}