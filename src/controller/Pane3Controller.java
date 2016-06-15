package controller;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import application.TemporaryObject;
import controller.LayoutController.ActionType;
import iCal.Exporter;
import iCal.VLesson;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Pane3Controller implements Initializable {

	@FXML
	DestinationPaneController destinationPaneController;
	
	@FXML
	ControlPaneController controlPaneController;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		configureButtons();
	}

	private void configureButtons(){
		Button nextButton = controlPaneController.getNextButton();
		Label locationLabel = destinationPaneController.getLocationLabel();
		Label errorLabel = destinationPaneController.getErrorLabel();
		LayoutController lC = new LayoutController();
		
		nextButton.setOnAction(new EventHandler <ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String absolutePathName = locationLabel.getText();
				TemporaryObject tempObjRef = Main.tempObjRef;
				
				errorLabel.setVisible(true);
				
				tempObjRef.setAbsolutePath(absolutePathName);
				
				if (absolutePathName != ""){
					Exporter exporter = new Exporter( (ArrayList <VLesson>) tempObjRef.getVlessonList());
					exporter.exportEvents(absolutePathName);
					lC.changeLayout(ActionType.NEXT);
				} else {
					
				}
			}
			
		});
	}

}
