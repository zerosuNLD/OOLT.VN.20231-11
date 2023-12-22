
import Sceen.Page1Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class COVID_19_Virus extends Application {
	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Sceen/Page1.fxml"));

		Page1Controller page1Controller = new Page1Controller();
		loader.setController(page1Controller);
		
		Parent root = loader.load();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("Sceen/Style/Page1Style.css").toExternalForm());
		stage.setScene(scene);

		stage.show();
	}
}