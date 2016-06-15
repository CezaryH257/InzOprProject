package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ExportPaneController implements Initializable {

    @FXML
    private Button icalButton;

    @FXML
    private Button csvButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	
	public Button getIcalButton() {
		return icalButton;
	}

	public void setIcalButton(Button icalButton) {
		this.icalButton = icalButton;
	}

	public Button getCsvButton() {
		return csvButton;
	}

	public void setCsvButton(Button csvButton) {
		this.csvButton = csvButton;
	}

	
	
}

