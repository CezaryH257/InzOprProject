package csv;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import parser.Lesson;
import parser.TimeTable;

public class CsvGenerator {
	
	List <String> textLinesList;
	
	
	public CsvGenerator() {
		super();
		this.textLinesList = new ArrayList<>();
	}

	
	public void createListWithTextLines(TimeTable timeTable){
		ArrayList <Lesson> lessonList = timeTable.getLessonList();
		ArrayList <String> textLinesList = new ArrayList<>();
		
		String firstLine = "subGroup , statTime , endTime , subject , classType , teacher , classRoom , dueDates , infoAboutDueDates"; 
		textLinesList.add(firstLine);
		
		
		for (Lesson lesson : lessonList){
			StringBuilder line = new StringBuilder();
			line.append(lesson.getSubGroup());
			line.append(" , ");
			line.append(lesson.getStartTime());
			line.append(" , ");
			line.append(lesson.getEndTime());
			line.append(" , ");
			line.append(lesson.getSubject());
			line.append(" , ");
			line.append(lesson.getClassType());
			line.append(" , ");
			line.append(lesson.getTeacher());
			line.append(" , ");
			line.append(lesson.getClassRoom());
			line.append(" , ");
			
			StringBuilder dueDates = new StringBuilder();
			for (String date : lesson.getDueDatesList()){
				dueDates.append(date + " ");
			}
			
			line.append(dueDates);
			line.append(" , ");
			line.append(lesson.getInfoAboutDueDates());
			
			textLinesList.add(line.toString());
		}
		
		this.textLinesList.addAll(textLinesList);
		System.out.println(this.textLinesList);
	}
	
	public void generateCsvFile (String absolutePathName){
		
		Path path = Paths.get(absolutePathName);
		try {
			Files.write(path, textLinesList, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
