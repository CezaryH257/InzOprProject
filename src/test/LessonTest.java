package iCalTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import iCal.Lesson;

public class LessonTest {

	@Test
	public void testLesson() {
		Lesson lesson = new Lesson();
		Lesson lesson2 = new Lesson();
		assertNotNull(lesson);
		assertNotEquals(lesson, lesson2);
	}

	@Test
	public void testToString() {
		Lesson lesson = new Lesson();
		Lesson lesson2 = new Lesson();
		String a = "Lesson [subGroup=";
		assertEquals(lesson.toString(), lesson2.toString());
		assertNotNull(lesson.toString());
		assertEquals(a.substring(0, 16), lesson.toString().substring(0, 16));
	}

	@Test
	public void testGetSubGroup() {
		Lesson lesson = new Lesson();
		Lesson lesson2 = new Lesson();
		assertNull(lesson.getSubGroup());
		lesson.setSubGroup("31_INF_NP");
		lesson2.setSubGroup("31_INF_NP");
		assertEquals(lesson.getSubGroup(), lesson2.getSubGroup());
		lesson2.setSubGroup("201_IDZ");
		assertNotEquals(lesson.getSubGroup(), lesson2.getSubGroup());
	}

	@Test
	public void testSetSubGroup() {
		Lesson lesson2 = new Lesson();
		Lesson lesson = new Lesson();
		assertNotNull(lesson2);
		lesson.setSubGroup("201_IDZ");
		lesson2.setSubGroup("201_IDZ");
		assertEquals(lesson.getSubGroup(), lesson2.getSubGroup());
		// assertEquals(lesson, lesson2);
	}

	@Test
	public void testGetStartTime() {
		Lesson lesson2 = new Lesson();
		Lesson lesson = new Lesson();
		assertNotNull(lesson2);
		lesson.setStartTime("15:15");
		lesson2.setStartTime("9:15");
		assertNotEquals(lesson.getStartTime(), lesson2.getStartTime());
	}

	@Test
	public void testSetStartTime() {
		Lesson lesson2 = new Lesson();
		Lesson lesson = new Lesson();
		lesson.setStartTime("15:15");
		lesson2.setStartTime("9:15");
		assertNotEquals(lesson.getStartTime(), lesson2.getStartTime());
		assertEquals("15:15", lesson.getStartTime());
		assertNotNull(lesson2);
	}

	@Test
	public void testGetEndTime() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setEndTime("10:45");
		assertEquals("10:45", lesson.getEndTime());
	}

	@Test
	public void testSetEndTime() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setEndTime("10:45");
		assertEquals("10:45", lesson.getEndTime());
		assertNotEquals("zoygaosydiu", lesson.getEndTime());

	}

	@Test
	public void testGetClassType() {
		Lesson lesson = new Lesson();
		Lesson lesson2 = new Lesson();
		assertNotNull(lesson);
		lesson.setClassType("asdfghjkl");
		lesson2.setClassType("asdfghjkl");
		assertEquals(lesson.getClassType(),lesson2.getClassType());
	}

	@Test
	public void testSetClassType() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setClassType("24");
		assertEquals("24",lesson.getClassType());
		lesson.setClassType("usagdiygai");
		assertNotEquals("24",lesson.getClassType());
	}

	@Test
	public void testGetSubject() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setSubject("2200");
		assertEquals("2200",lesson.getSubject());
		lesson.setSubject("usagdiygai");
		assertNotEquals("2200",lesson.getSubject());
	}

	@Test
	public void testSetSubject() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setSubject("Ekonomia");
		assertEquals("Ekonomia",lesson.getSubject());
		lesson.setSubject("11111");
		assertNotEquals("Ekonomia",lesson.getSubject());
	}

	@Test
	public void testGetTeacher() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setTeacher("Kowalski");
		assertEquals("Kowalski",lesson.getTeacher());
		lesson.setTeacher("Nowak");
		assertNotEquals("Kowalski",lesson.getTeacher());
	}

	@Test
	public void testSetTeacher() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setTeacher("Kowalski");
		assertEquals("Kowalski",lesson.getTeacher());
		lesson.setTeacher("Nowak");
		assertNotEquals("Kowalski",lesson.getTeacher());
	}

	@Test
	public void testGetClassRoom() {
		Lesson lesson = new Lesson();
		Lesson lesson2 = new Lesson();
		assertNotNull(lesson);
		lesson.setClassRoom("315");
		lesson2.setClassRoom("315");
		assertEquals(lesson.getClassRoom(),lesson2.getClassRoom());
		lesson.setClassRoom("2000");
		assertNotEquals(lesson,lesson2);
		
	}

	@Test
	public void testSetClassRoom() {
		Lesson lesson = new Lesson();
		Lesson lesson2 = new Lesson();
		assertNotNull(lesson);
		lesson.setClassRoom("315");
		lesson2.setClassRoom("315");
		assertEquals(lesson.getClassRoom(),lesson2.getClassRoom());
		lesson.setClassRoom("2000");
		assertNotEquals(lesson,lesson2);
	}

	@Test
	public void testGetTerm() {
		/*Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setTerm("21.2.2016");
		assertEquals("21.2.2016",lesson.getTerm());
		lesson.setTerm("20.20.2016");
		assertNotEquals(lesson,lesson2);*/
	}

	@Test
	public void testSetTerm() {
		/*Lesson lesson = new Lesson();
		assertNotNull(lesson);*/
	}

	@Test
	public void testGetDueDate() {
		//Lesson lesson = new Lesson();
		//assertNotNull(lesson);
	}

	@Test
	public void testSetDueDate() {
		//Lesson lesson = new Lesson();
		//assertNotNull(lesson);
	}

	@Test
	public void testGetDayOfWeek() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setDayOfWeek("Monday");
		assertEquals("Monday",lesson.getDayOfWeek());
		lesson.setDayOfWeek("Friday");
		assertNotEquals("Monday",lesson.getDayOfWeek());
	}

	@Test
	public void testSetDayOfWeek() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setDayOfWeek("Monday");
		assertEquals("Monday",lesson.getDayOfWeek());
		lesson.setDayOfWeek("Friday");
		assertNotEquals("Monday",lesson.getDayOfWeek());
	}

	@Test
	public void testGetDueDatesList() {
		//Lesson lesson = new Lesson();
		//assertNotNull(lesson);
	}

	@Test
	public void testSetDueDatesList() {
		//Lesson lesson = new Lesson();
		//assertNotNull(lesson);
	}

	@Test
	public void testGetInfoAboutDueDates() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setDayOfWeek("Monday");
		assertEquals("Monday",lesson.getDayOfWeek());
		lesson.setDayOfWeek("Friday");
		assertNotEquals("Monday",lesson.getDayOfWeek());
	}

	@Test
	public void testSetInfoAboutDueDates() {
		Lesson lesson = new Lesson();
		assertNotNull(lesson);
		lesson.setInfoAboutDueDates("None");
		assertEquals("None",lesson.getInfoAboutDueDates());
		lesson.setInfoAboutDueDates("Friday");
		assertNotEquals("Monday",lesson.getInfoAboutDueDates());
	}

}
