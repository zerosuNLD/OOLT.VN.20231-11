package Sceen;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Virus.Virus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Page5Controller implements Initializable{

    @FXML
    private Label title;

	@FXML
	private MediaView mediaView;
	
	@FXML
	private Button btnPlay, btnPause, btnReset;
	
	private File file;
	private Media media;
	private MediaPlayer mediaPlayer;
	
	private Virus virus;
	
	public void setData(Virus virus) {		
	    this.virus = virus;
	}

	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		title.setText("Video the process of virus " + virus.getName() + " infection into the human body");
		String linkVideoString = virus.getLinkVideoString();
		System.out.println(linkVideoString);
		file = new File(linkVideoString);
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
	}
	
	@FXML
	public void playMedia(ActionEvent event) {
		
		mediaPlayer.play();
	}
	
	@FXML
	public void pauseMedia(ActionEvent event) {
		
		mediaPlayer.pause();
	}
	
	@FXML
	public void resetMedia(ActionEvent event) {
		
		if(mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
			mediaPlayer.seek(Duration.seconds(0.0));
		}
	}
	
	

	@FXML
	void changeSceneWithBack(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("individual.fxml"));
		
		individualController individualController = new individualController();
		individualController.setData(virus);
		
		loader.setController(individualController);
		
		pauseMedia(event);
		
		Parent root = loader.load();

		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		scene.getStylesheets().add(getClass().getResource("Style/individualStyle.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	void changeSceneWithBtnHelp(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);

		scene.getStylesheets().add(getClass()
        		.getResource("Style/HelpStyle.css").toExternalForm());
		
		
		Stage stage = new Stage();
		stage.setTitle("Help");
		stage.setScene(scene);

		stage.show();
	}
	
}