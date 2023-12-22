package Sceen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Repository.Repository;
import Virus.Virus;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VirusWithoutLipitController implements Initializable {
	private Repository repo;

	public void setData(Repository repository) {
		this.repo = repository;
		repository.showListVirus();
	}

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

	public VirusWithoutLipitController() {
		this.repo = new Repository();
	}

	public VirusWithoutLipitController(Repository repo) {
		super();
		this.repo = repo;
	}

	private ObservableList<Virus> virusList;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		idColumn.setCellValueFactory(new PropertyValueFactory<Virus, Integer>("ID"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("name"));
		structureColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("structure"));
		typeColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("type"));
		virusList = FXCollections.observableArrayList(repo.getListVirus());
		table.setItems(virusList);

		btnNextButton.setDisable(true);

		table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Virus>() {
			@Override
			public void changed(ObservableValue<? extends Virus> observable, Virus oldValue, Virus newValue) {
				// Bật hoặc vô hiệu hóa nút "Next" dựa trên việc có mục được chọn hay không
				btnNextButton.setDisable(newValue == null);
			}
		});

	}

	@FXML
	void changeSceneWithBackPage1(ActionEvent event) throws IOException {
		// Loader la load file Page1.fxml
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Page1.fxml"));
		
		Page1Controller page1Controller = new Page1Controller();
		loader.setController(page1Controller);
		
		Parent root = loader.load();
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("Style/Page1Style.css").toExternalForm());
		stage.setScene(scene);

		stage.show();
	}

	@FXML
	void changeSceneWithBtnHelp(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);

		scene.getStylesheets().add(getClass().getResource("Style/HelpStyle.css").toExternalForm());

		Stage stage = new Stage();
		stage.setTitle("Help");
		stage.setScene(scene);

		stage.show();
	}

	@FXML
	void changeSceneWithBtnNext(ActionEvent event) throws IOException {
	    if (table.getSelectionModel().getSelectedItem() != null) {

	        // Load Page3
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Page3.fxml"));
	        
	        // Lấy controller đã tạo bởi FXMLLoader
	        Page3Controller page3Controller = new Page3Controller();
	        page3Controller.setData(table.getSelectionModel().getSelectedItem());
	        loader.setController(page3Controller);
	        
	        Parent root = loader.load();
	        Scene scene = new Scene(root);
	        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

	        // Style css
	        scene.getStylesheets().add(getClass().getResource("Style/Page3Style.css").toExternalForm());

	        stage.setScene(scene);
	        stage.show();
	    }
	}
}
