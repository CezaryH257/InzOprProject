package controller;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import application.TemporaryObject;
import iCal.Exporter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class DestinationPaneController implements Initializable {

    @FXML
	private Button browseButton;

    @FXML
    private Label locationLabel;
    
    @FXML
    private Label errorLabel;
    
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		configureButtons();
	}
	
	
	private void configureButtons(){
		browseButton.setOnAction(new EventHandler <ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				FileChooser fileChooser = new FileChooser();
				String absolutePath = null;
				TemporaryObject tempObjRef = Main.tempObjRef;
				
				fileChooser.setTitle("Wybierz folder docelowy dla pliku");
				fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("iCalendar type", "*.ics"));
				
				File file = fileChooser.showSaveDialog(Main.stageRef);			
				absolutePath = file.getAbsolutePath();
	
				locationLabel.setText(absolutePath);
			}
			
		});
	}

	
	public Button getBrowseButton() {
		return browseButton;
	}

	public void setBrowseButton(Button browseButton) {
		this.browseButton = browseButton;
	}

	public Label getLocationLabel() {
		return locationLabel;
	}

	public void setLocationLabel(Label locationLabel) {
		this.locationLabel = locationLabel;
	}

	public Label getErrorLabel() {
		return errorLabel;
	}

	public void setErrorLabel(Label errorLabel) {
		this.errorLabel = errorLabel;
	}

}
