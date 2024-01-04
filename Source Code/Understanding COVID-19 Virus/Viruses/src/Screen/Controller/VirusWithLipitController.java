package Screen.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import Repository.Repository;
import Virus.Virus;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VirusWithLipitController implements Initializable {
	@FXML
	private Button btnBack;

	@FXML
	private Button btnHelp;

	@FXML
	private Label title;

	@FXML
	private Button btnNextButton;

	@FXML
	private TableColumn<Virus, Integer> idColumn;

	@FXML
	private TableColumn<Virus, String> nameColumn;

	@FXML
	private TableColumn<Virus, String> structureColumn;

	@FXML
	private TableView<Virus> table;

	@FXML
	private TableColumn<Virus, String> typeColumn;

	@FXML
	private Button close_btn;
	
	private Repository repo;

	private ObservableList<Virus> virusList;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		repo = Model.getInstance().getVirusWithLipitRepository();

		idColumn.setCellValueFactory(new PropertyValueFactory<Virus, Integer>("ID"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("name"));
		structureColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("structure"));
		typeColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("type"));
		virusList = FXCollections.observableArrayList(repo.getListVirus());
		table.setItems(virusList);

		addListeners();

		btnNextButton.setOnAction(event -> onScene3());
		btnBack.setOnAction(event -> onScene1());
		btnHelp.setOnAction(event -> onHelp());
		close_btn.setOnAction(event -> onClose());
	}

	private void addListeners() {
		btnNextButton.setDisable(true);
		table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Virus>() {

			@Override
			public void changed(ObservableValue<? extends Virus> observable, Virus oldValue, Virus newValue) {
				// TODO Auto-generated method stub
				Model.getInstance().getViewFactory().setVirusSelected(newValue);
				btnNextButton.setDisable(newValue == null);
			}
		});;
	}

	private void onScene3() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showScene3();
	}

	private void onHelp() {
		Model.getInstance().getViewFactory().showHelp();
	}

	private void onScene1() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showScene1();
	}

	private void onClose() {
		Stage stage = (Stage) title.getScene().getWindow();
		Model.getInstance().getViewFactory().showCloseConfirmationAlert(stage);
	}
}
