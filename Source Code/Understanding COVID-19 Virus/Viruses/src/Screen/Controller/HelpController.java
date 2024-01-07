package Screen.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelpController implements Initializable {
	@FXML
	private Button close_btn;

	@FXML
	private Label helpLabel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		close_btn.setOnAction(event -> onClose());
		helpLabel.setWrapText(true); 
		helpLabel.setMaxWidth(550);
	}

	private void onClose() {
		Stage stage = (Stage) close_btn.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
	}
}
