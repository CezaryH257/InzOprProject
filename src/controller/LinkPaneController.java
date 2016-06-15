package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.fxml.Initializable;

public class LinkPaneController implements Initializable {

	@FXML
	private Label errorLabel;
	
    @FXML
    private TextField textField;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}


	public TextField getTextField() {
		return textField;
	}

	public void setTextField(TextField textField) {
		this.textField = textField;
	}

	public Label getErrorLabel() {
		return errorLabel;
	}

	public void setErrorLabel(Label errorLabel) {
		this.errorLabel = errorLabel;
	}

}
