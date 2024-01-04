
import Model.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class COVID_19_Virus extends Application {
	
	@Override
	public void start(Stage stage) {
		Model.getInstance().getViewFactory().showScene1();
	}
}