package Sceen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VirusScreen extends Application{

	@Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Page1.fxml"));
        
        // Load the root node
        Parent root = loader.load();

        // Set up the scene
        Scene scene = new Scene(root);
        stage.setTitle("Virus");
        stage.setScene(scene);
        stage.show();
    }
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
