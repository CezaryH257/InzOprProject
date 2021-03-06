package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import application.TemporaryObject;
import controller.LayoutController.ActionType;
import csv.CsvGenerator;
import iCal.Exporter;
import iCal.VLesson;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import parser.TimeTable;

public class Pane2Controller implements Initializable {
	
	@FXML
	private ExportPaneController exportPaneController;
	
	@FXML
	private ControlPaneController controlPaneController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		configureButtons();
	}
	/**
	 * Funkcja implementująca sposób zachowania przycisków.
	 */
	private void configureButtons(){
		LayoutController lC = new LayoutController();
		Button csvButton = exportPaneController.getCsvButton();
		Button icalButton = exportPaneController.getIcalButton();
		
		controlPaneController.getNextButton().setVisible(false);
		
		icalButton.setOnAction(new EventHandler <ActionEvent> () {

			@Override
			public void handle(ActionEvent event) {
				TemporaryObject tempObj = Main.tempObjRef;
				TimeTable timeTable = Main.tempObjRef.getTimeTable();
				ArrayList<VLesson> vlessons = new ArrayList<VLesson>();
				for (int i = 0; i < timeTable.getLessonList().size(); i++){
					VLesson vlesson = new VLesson(timeTable.getLessonList().get(i));
					vlessons.add(vlesson);
				}
				tempObj.setVlessonList(vlessons);
				ExtensionFilter extType = new FileChooser.ExtensionFilter("iCalendar type", "*.ics");
				tempObj.setExtType(extType);
				lC.changeLayout(ActionType.NEXT);
			}
			
		});
		
		csvButton.setOnAction(new EventHandler <ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				TemporaryObject tempObj = Main.tempObjRef;
				TimeTable timeTable = Main.tempObjRef.getTimeTable();
				CsvGenerator csvGenerator = new CsvGenerator();
				
				csvGenerator.createListWithTextLines(timeTable);
				
				tempObj.setCsvGenerator(csvGenerator);
						
				ExtensionFilter extType = new FileChooser.ExtensionFilter("CSV type", "*.csv");
				tempObj.setExtType(extType);
				lC.changeLayout(ActionType.NEXT);
			}
			
		});
	}
	
	
}
