package Screen.Controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import Virus.Virus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Page5Controller implements Initializable {

	@FXML
	private AnchorPane AnchorPaneCenter;

	@FXML
	private Button btnBack;

	@FXML
	private Button btnHelp;

	@FXML
	private Button btnPause;

	@FXML
	private Button btnPlay;

	@FXML
	private Button btnReset;

	@FXML
	private MediaView mediaView;

	@FXML
	private Label title;

	@FXML
	private Button close_btn;
	
	private File file;
	private Media media;
	private MediaPlayer mediaPlayer;

	private Virus virus;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		virus = Model.getInstance().getViewFactory().getVirusSelected();

		setDataOnScene();

		btnPlay.setOnAction(event -> playMedia());
		btnPause.setOnAction(event -> pauseMedia());
		btnReset.setOnAction(event -> resetMedia());
		btnBack.setOnAction(event -> onIndividual());
		btnHelp.setOnAction(event -> onHelp());
		close_btn.setOnAction(event -> onClose());
	}

	private void setDataOnScene() {
		title.setText("Video the process of virus " + virus.getName() + " infection into the human body");
		String linkVideoString = virus.getLinkVideoString();
		System.out.println(linkVideoString);
		file = new File(linkVideoString);
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);

	}

	private void playMedia() {
		mediaPlayer.play();
	}

	private void pauseMedia() {
		mediaPlayer.pause();
	}

	private void resetMedia() {
		if (mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
			mediaPlayer.seek(Duration.seconds(0.0));
		}
	}

	private void onIndividual() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		pauseMedia();
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