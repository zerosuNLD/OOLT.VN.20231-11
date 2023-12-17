package Sceen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Repository.Repository;
import Virus.Virus;
import Virus.VirusWithoutLipid;
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
		VirusWithoutLipid Hiv = new VirusWithoutLipid(001, "HIV", "Nucleic Acid + Capsid", "Virus Without Lipit",
				"HIV (human immunodeficiency virus) is a virus that attacks "
				+ "\n"
				+"cells that help the body fight infection, making a person "
				+ "\n"
				+"more vulnerable to other infections and diseases. It is spread"
				+ "\n"
				+ " by contact with certain bodily fluids of a person with HIV, "
				+ "\n"
				+ "most commonly during unprotected sex (sex without a condom "
				+ "\n"
				+	"or HIV medicine to prevent or treat HIV), or through "
				+ "\n"
				+ "sharing injection drug equipment.",
				"Infection",
				"Image/HIV.jpg","Image/conDuongLayNhiemHiv.jpg");
		
		repo.addVirusToRepo(Hiv);

		idColumn.setCellValueFactory(new PropertyValueFactory<Virus, Integer>("id"));
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

		scene.getStylesheets().add(getClass()
        		.getResource("Style/HelpStyle.css").toExternalForm());
		
		
		Stage stage = new Stage();
		stage.setTitle("Help");
		stage.setScene(scene);

		stage.show();
	}

	@FXML
    void changeSceneWithBtnNext(ActionEvent event) throws IOException {
        // Kiểm tra xem có mục nào được chọn trước khi tiến hành
        if (table.getSelectionModel().getSelectedItem() != null) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Page3.fxml"));
            Parent root = loader.load();

            // Truyền dữ liệu vào Page3Controller
            Page3Controller page3Controller = loader.getController();
            Virus selectedVirus = table.getSelectionModel().getSelectedItem();
            page3Controller.setData(selectedVirus);

            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("Style/Page3Style.css").toExternalForm());

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }
}
