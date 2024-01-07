package Screen.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import Virus.GUI_Virus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InfectionController implements Initializable {
	@FXML
	private AnchorPane AnchorPaneCenter;

	@FXML
	private Button btnBack;

	@FXML
	private Button btnHelp;

	@FXML
	private Button btnNext;

	@FXML
	private ImageView imageView;

	@FXML
	private Label infectionLabel;

	@FXML
	private Label title;

	@FXML
	private Button close_btn;

	private GUI_Virus gUI_Virus;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		gUI_Virus = Model.getInstance().getViewFactory().getVirusSelected();

		setDataOnScene();

		btnBack.setOnAction(event -> onScene3());
		btnNext.setOnAction(event -> onIndividual());
		btnHelp.setOnAction(event -> onHelp());
		close_btn.setOnAction(event -> onClose());
	}

	private void setDataOnScene() {
		title.setText(gUI_Virus.getName());

		String linkImage = gUI_Virus.getImage2Link();
		Image image = new Image(getClass().getResourceAsStream(linkImage));
		imageView.setImage(image);
		
		infectionLabel.setText(gUI_Virus.getInfectionString());
		infectionLabel.setWrapText(true);  
	    infectionLabel.setMaxWidth(450);   
	}

	private void onScene3() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showScene3();
	}

	private void onIndividual() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showIndividualScene();
	}

	private void onHelp() {
		Model.getInstance().getViewFactory().showHelp();
	}

	private void onClose() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().showCloseConfirmationAlert(stage);
	}

}