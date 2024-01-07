package View;

import Virus.GUI_Virus;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ViewFactory {
    private GUI_Virus virusSelected = null;

    public void setVirusSelected(GUI_Virus gUI_Virus) {
        this.virusSelected = gUI_Virus;
    }

    public GUI_Virus getVirusSelected() {
        return virusSelected;
    }

    public void showScene1() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Screen/XML/FXMLFile/Page1.fxml"));

        createStage(loader);
    }

    public void showListVirusWithLipit() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Screen/XML/FXMLFile/VirusWithLipit.fxml"));

        createStage(loader);
    }

    public void showListVirusWithoutLipit() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Screen/XML/FXMLFile/VirusWithoutLipit.fxml"));

        createStage(loader);
    }

    public void showScene3() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Screen/XML/FXMLFile/Page3.fxml"));

        createStage(loader);
    }

    public void showInfectionScene() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Screen/XML/FXMLFile/infection.fxml"));

        createStage(loader);
    }

    public void showIndividualScene() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Screen/XML/FXMLFile/individual.fxml"));

        createStage(loader);
    }

    public void showScene5() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Screen/XML/FXMLFile/Page5.fxml"));

        createStage(loader);
    }

    public void showHelp() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Screen/XML/FXMLFile/Help.fxml"));

        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        Parent root = null;
        try {
            root = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        
        moveStage(stage);
        
        stage.show();
    }

    public void showCloseConfirmationAlert(Stage stage) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Are you sure you want to exit the program?");

        ButtonType buttonTypeYes = new ButtonType("Yes");
        ButtonType buttonTypeNo = new ButtonType("No");

        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);

        alert.showAndWait().ifPresent(response -> {
            if (response == buttonTypeYes) {
                closeStage(stage);
            }
        });
    }

    public void closeStage(Stage stage) {
        stage.close();
    }

    private void moveStage(Stage stage) {
    	final DoubleProperty xOffset = new SimpleDoubleProperty(0);
    	final DoubleProperty yOffset = new SimpleDoubleProperty(0);

    	stage.initStyle(StageStyle.UNDECORATED);

    	stage.getScene().getRoot().setOnMousePressed((MouseEvent event) -> {
             xOffset.set(event.getSceneX());
             yOffset.set(event.getSceneY());
         });

         stage.getScene().getRoot().setOnMouseDragged((MouseEvent event) -> {
             stage.setX(event.getScreenX() - xOffset.get());
             stage.setY(event.getScreenY() - yOffset.get());
         });
	}

}
