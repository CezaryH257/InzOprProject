package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import controller.LayoutController.ActionType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.fxml.Initializable;

public class StartPaneController implements Initializable  {


	@FXML
    private Button startButton;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		configureButtons();
	}
	
	
	private void configureButtons(){
		LayoutController lC = new LayoutController();
		
		startButton.setOnAction(new EventHandler <ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				lC.changeLayout(ActionType.NEXT);
			}
			
		});
	}

}
