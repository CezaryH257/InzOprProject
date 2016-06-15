package application;

import java.util.List;

import iCal.VLesson;
import parser.TimeTable;

public class TemporaryObject {
	TimeTable timeTable;
	List <VLesson> vlessonList;
	String absolutePath;

	
	public TemporaryObject() {
		this.timeTable = null;
		this.vlessonList = null;
		this.absolutePath = null;
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
}
