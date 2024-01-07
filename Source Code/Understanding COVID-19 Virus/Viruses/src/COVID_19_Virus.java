
import Model.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class COVID_19_Virus extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Model.getInstance().getViewFactory().showScene1();
	}

	public static void main(String[] args) {
		launch(args);
	}
}