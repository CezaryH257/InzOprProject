package iCalTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import iCal.Lesson;
import iCal.TimeTable;
import iCal.VLesson;
import iCal.VLessons;

public class TimeTableTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Object lessonList;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTimeTable() {
		this.lessonList = lessonList;
		assertNull(lessonList);
	}

	@Test
	public void testAddLessonToList() {
		this.lessonList = lessonList;
		assertEquals(this.lessonList, lessonList);
		ArrayList<VLesson> vlessons = new ArrayList<VLesson>();
		ArrayList<Lesson> lesson = new ArrayList<Lesson>();
		ArrayList<Lesson> lesson1 = new ArrayList<Lesson>();
		ArrayList lessonist3 = new ArrayList<>();
		ArrayList lessonist4 = new ArrayList<>();

		VLessons vleson = new VLessons(lesson);
		TimeTable TimeTable1 = new TimeTable();
		int rozmiar = lesson.size();
		int rozmiar1 = 0;
		Lesson lessonlist3 = null;
		TimeTable1.addLessonToList(lessonlist3);
		Lesson lessonlist4 = null;
		TimeTable1.addLessonToList(lessonlist4);
		
	}

	@Test
	public void testGetLessonList() {
		this.lessonList = lessonList;
		assertEquals(this.lessonList, lessonList);
		ArrayList<VLesson> vlessons = new ArrayList<VLesson>();
		ArrayList<Lesson> lesson = new ArrayList<Lesson>();
		VLessons vleson = new VLessons(lesson);
		TimeTable TimeTable1 = new TimeTable();
		TimeTable1.setLessonList(lesson);
		assertEquals(lesson, TimeTable1.getLessonList());
		
		
		
	}

	@Test
	public void testSetLessonList() {
		this.lessonList = lessonList;
		assertEquals(this.lessonList, lessonList);
		ArrayList<VLesson> vlessons = new ArrayList<VLesson>();
		ArrayList<Lesson> lesson = new ArrayList<Lesson>();
		VLessons vleson = new VLessons(lesson);
		TimeTable TimeTable1 = new TimeTable();
		TimeTable1.setLessonList(lesson);
		assertEquals(lesson, TimeTable1.getLessonList());
		
	}

}
