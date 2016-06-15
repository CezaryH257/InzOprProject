package controller;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import application.Main;
import controller.LayoutController.ActionType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import parser.Parser;
import parser.TimeTable;

public class Pane1Controller implements Initializable {
	
	@FXML
	private LinkPaneController linkPaneController;
	
	@FXML
	private ControlPaneController controlPaneController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nextButtonAction();
	}
	
	
	private void nextButtonAction(){
		Button nextButton = controlPaneController.getNextButton();
		TextField textField = linkPaneController.getTextField();
		Label errorLabel = linkPaneController.getErrorLabel();
		LayoutController lC = new LayoutController();
		
		nextButton.setOnAction(new EventHandler <ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				final String pageAddressPattern = "http://plan.uz.zgora.pl/grupy_plan.php\\?pId_Obiekt=.*";
				String linkText = textField.getText();
				if (! (linkText.matches(pageAddressPattern)) ){
					errorLabel.setVisible(true);
				} else{
					lC.changeLayout(ActionType.NEXT);
					TimeTable timeTable = new TimeTable();
					
					Parser parser = new Parser(linkText , timeTable);
					try {
						parser.parsePageSource();
					} catch (IOException e) {
						e.printStackTrace();
					}
					Main.tempObjRef.setTimeTable(timeTable);
				}
				
			}
			
		});
		
	}
	
}
