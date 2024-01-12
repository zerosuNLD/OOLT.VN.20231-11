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

public class individualController implements Initializable {
	@FXML
	private AnchorPane AnchorPaneCenter;

	@FXML
	private ImageView imageView;
	
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
	
	private GUI_Virus gUI_Virus;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		gUI_Virus = Model.getInstance().getViewFactory().getVirusSelected();

		setDataOnScene();

		btnBack.setOnAction(event -> onInfection());
		btnNext.setOnAction(event -> onScene5());
		btnHelp.setOnAction(event -> onHelp());
		close_btn.setOnAction(event -> onClose());
	}

	private void setDataOnScene() {
		name.setText(gUI_Virus.getName());
		title.setText("The distinct transmission of the virus " + gUI_Virus.getName());
		individualLabel.setText(gUI_Virus.getIndividual());
		individualLabel.setWrapText(true);  
	    individualLabel.setMaxWidth(610);  
	    
	    String linkImage = gUI_Virus.getImage2Link();
		Image image = new Image(getClass().getResourceAsStream(linkImage));
		imageView.setImage(image);

		gUI_Virus.infection();
	}

	private void onInfection() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showStructureScene();
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