package Sceen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VirusScreen extends Application {

//	private double xOffset = 0;
//	private double yOffset = 0;

	@Override
	public void start(Stage stage) throws Exception {
		// Load the FXML file
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Page1.fxml"));

		// Load the root node
		Parent root = loader.load();

		// Set up the scene
		Scene scene = new Scene(root);

		// Load the CSS file
		scene.getStylesheets().add(getClass().getResource("Style/Page1Style.css").toExternalForm());

		
		stage.setScene(scene);
		stage.show();
		
		
//		stage.initStyle(StageStyle.UNDECORATED);
//
//		root.setOnMousePressed(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				xOffset = event.getSceneX();
//				yOffset = event.getSceneY();
//
//			}
//		});
//
//		root.setOnMouseDragged(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				stage.setX(event.getSceneX() - xOffset);
//				stage.setY(event.getSceneY() - yOffset);
//
//			}
//		});

	


	}

	public static void main(String[] args) {
		launch(args);
	}

}
