package Screen.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Model;
import Virus.GUI_Enveloped_Virus;
import Virus.GUI_Non_Enveloped_Virus;
import Virus.GUI_Virus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class infectionController implements Initializable {
	@FXML
	private AnchorPane AnchorPaneCenter;

	@FXML
	private Button btnBack;

	@FXML
	private Button btnHelp;

	@FXML
	private Button close_btn;

	@FXML
	private Button individual_btn;

	@FXML
	private Label infection_label;

	@FXML
	private Label name;

	@FXML
	private Label title_label;

	private GUI_Virus virus;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		virus = Model.getInstance().getViewFactory().getVirusSelected();

		setDataOnScene();

		btnBack.setOnAction(event -> onBack());
		btnHelp.setOnAction(event -> onHelp());
		close_btn.setOnAction(event -> onClose());
		individual_btn.setOnAction(event -> onIndividual());
		
	}

	private void setDataOnScene() {
		name.setText(virus.getName());

		virus.infection();

		if (virus instanceof GUI_Enveloped_Virus) {
			infection_label.setText("* Transmission method: *\r\n"
					+ "Typically, lipid-enveloped viruses spread primarily through direct contact with the lipid membrane of human or animal cells they attack.\r\n"
					+ "Transmission can also occur through bodily fluids such as blood, tears, saliva, or other lipid-containing substances.\r\n"
					+ "\r\n* Strains of lipid-enveloped viruses: *\r\n"
					+ "Some common lipid-enveloped viruses include SARS-CoV-2 (causing COVID-19), HIV (causing AIDS), and many viruses causing respiratory diseases.\r\n"
					+ "\r\n* Survival capability outside the body environment: *\r\n"
					+ "The lipid membrane of viruses can make them sensitive to the external environment. However, under favorable conditions, they can still survive for a period on non-living surfaces.\r\n"
					+ "\r\n* Preventive measures: *\r\n"
					+ "The use of soap and water for handwashing can reduce the amount of lipid-enveloped viruses.\r\n"
					+ "Wearing masks and maintaining social distancing can also help prevent the transmission of these viruses.\r\n"
					+ "\r\n* Special impact on cell membranes: *\r\n"
					+ "The lipid membrane of viruses can interact with cell membranes and alter processes within the cell to facilitate virus entry and replication.");

		
			infection_label.setMaxHeight(Double.MAX_VALUE);

			infection_label.setPrefHeight(600);
		
			infection_label.setWrapText(true);
			infection_label.setMaxWidth(710);

			title_label.setText("Transmission process of the virus with lipit");

		} else if (virus instanceof GUI_Non_Enveloped_Virus) {
			infection_label.setText("Transmission characteristics of lipid-free viruses:\r\n"
					+ "\r\n* Direct Contact Transmission: *\r\n"
					+ "Lipid-free viruses typically spread primarily through direct contact with the cells of humans or animals they target.\r\n"
					+ "Transmission methods may include contact with bodily fluids such as blood, tears, saliva, or other non-lipid-containing substances.\r\n"
					+ "\r\n* Structural Diversity: *\r\n"
					+ "Lipid-free viruses can have diverse structures and are not necessarily enveloped by a lipid membrane like lipid-containing viruses.\r\n"
					+ "\r\n* Cell Entry Mechanisms: *\r\n"
					+ "These viruses often use different mechanisms to invade target cells, not relying on lipid membranes.\r\n"
					+ "They may use surface proteins to interact with host cell proteins, endocytosis procedures, or other mechanisms to enter cells.\r\n"
					+ "\r\n* Survival Outside the Body Environment: *\r\n"
					+ "While lipid-free viruses may be less sensitive to the external environment compared to lipid-containing viruses, they can still survive for a period on non-living surfaces if kept under suitable conditions.\r\n"
					+ "\r\n* Preventive Measures: *\r\n"
					+ "Preventive measures such as handwashing, wearing masks, and maintaining social distance can still help prevent the transmission of lipid-free viruses.\r\n"
					+ "\r\n* Special Impact on Cell Membranes: *\r\n"
					+ "Lipid-free viruses can interact with cell membranes and induce internal changes within cells to facilitate entry and replication processes.\r\n"
					+ "Note that each type of virus may have unique characteristics, and specific information about lipid-free viruses may depend on the particular virus under consideration.\r\n"
					+ "");

			infection_label.setMaxHeight(Double.MAX_VALUE);

			infection_label.setPrefHeight(800);

			infection_label.setWrapText(true);
			infection_label.setMaxWidth(710);

			title_label.setText("Transmission process of the virus without lipit");
		}

	}

	private void onBack() {
		Stage stage = (Stage) name.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showStructureScene();
	}

	private void onHelp() {
		Stage stage = (Stage) name.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showHelp();
	}

	private void onClose() {
		Stage stage = (Stage) name.getScene().getWindow();
		Model.getInstance().getViewFactory().showCloseConfirmationAlert(stage);
	}

	private void onIndividual() {
		Stage stage = (Stage) name.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showIndividualScene();
	}
}