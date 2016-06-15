package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class EndPaneController implements Initializable {

    @FXML
    private Button endButton;

    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		configureButtons();
	}

	
	private void configureButtons(){
		endButton.setOnAction(new EventHandler <ActionEvent> (){

			@Override
			public void handle(ActionEvent event) {
				Platform.exit();
				
			}
			
		});
	}
}

