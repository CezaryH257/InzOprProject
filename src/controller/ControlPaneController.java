package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import controller.LayoutController.ActionType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import controller.LinkPaneController;

public class ControlPaneController implements Initializable {
	
	    @FXML
	    private Button nextButton;

	    @FXML
	    private Button cancelButton;

	    @FXML
	    private Button backButton;

	    
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			configureButtons();
		}
		
		
		private void configureButtons(){
			LayoutController lC = new LayoutController();
			
			
			backButton.setOnAction(new EventHandler <ActionEvent>(){

				@Override
				public void handle(ActionEvent event) {
					lC.changeLayout(ActionType.PREVIOUS);
				}
				
			});
			
			cancelButton.setOnAction(new EventHandler <ActionEvent>(){

				@Override
				public void handle(ActionEvent event) {
					lC.setLayoutByNumber(0);
				}
				
			});
		}

		public Button getNextButton() {
			return nextButton;
		}

		public void setNextButton(Button nextButton) {
			this.nextButton = nextButton;
		}

		public Button getCancelButton() {
			return cancelButton;
		}

		public void setCancelButton(Button cancelButton) {
			this.cancelButton = cancelButton;
		}

		public Button getBackButton() {
			return backButton;
		}

		public void setBackButton(Button backButton) {
			this.backButton = backButton;
		}
		
		
}
