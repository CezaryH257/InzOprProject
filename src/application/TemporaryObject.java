package application;

import java.util.List;

import csv.CsvGenerator;
import iCal.VLesson;
import javafx.stage.FileChooser.ExtensionFilter;
import parser.TimeTable;

/**
 * 
 * @author Krzysztof Kawski
 *
 */


public class TemporaryObject {
	TimeTable timeTable;
	List <VLesson> vlessonList;
	String absolutePath;
	CsvGenerator csvGenerator;
	ExtensionFilter extType; 

	
	public TemporaryObject() {
		this.timeTable = null;
		this.vlessonList = null;
		this.absolutePath = null;
		this.csvGenerator = null;
		this.extType = null;
	};
	
	
	public TimeTable getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(TimeTable timeTable) {
		this.timeTable = timeTable;
	}

	public List<VLesson> getVlessonList() {
		return vlessonList;
	}

	public void setVlessonList(List<VLesson> vlessonList) {
		this.vlessonList = vlessonList;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public CsvGenerator getCsvGenerator() {
		return csvGenerator;
	}

	public void setCsvGenerator(CsvGenerator csvGenerator) {
		this.csvGenerator = csvGenerator;
	}

	public ExtensionFilter getExtType() {
		return extType;
	}
	
	public void setExtType(ExtensionFilter extType) {
		this.extType = extType;
	}
	
}
