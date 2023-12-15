package Sceen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Repository.Repository;
import Virus.Virus;
import Virus.VirusWithLipid;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VirusWithLipitController implements Initializable {
	private Repository repo;

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

	VirusWithLipid covid = new VirusWithLipid(001,"COVID-19", "Nucleic Acid + Capsid", "Virus With Lipit");
	VirusWithLipid rotavirus = new VirusWithLipid(002,"Rotaviruses", "Nucleic Acid + Capsid", "Virus With Lipit");

	public VirusWithLipitController() {
		this.repo = new Repository();
	}

	public VirusWithLipitController(Repository repo) {
		super();
		this.repo = repo;
	}

	private ObservableList<Virus> virusList;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		repo.addVirusToRepo(covid, rotavirus);
		idColumn.setCellValueFactory(new PropertyValueFactory<Virus, Integer>("id"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("name"));
		structureColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("structure"));
		typeColumn.setCellValueFactory(new PropertyValueFactory<Virus, String>("type"));
		virusList = FXCollections.observableArrayList(repo.getListVirus());
		table.setItems(virusList);
	}

	@FXML
	void changeSceneWithBackPage1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Page1.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	void changeSceneWithBtnHelp(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		Stage stage = new Stage();
        stage.setTitle("Help");
        stage.setScene(scene);
        
        stage.show();
	}

}
