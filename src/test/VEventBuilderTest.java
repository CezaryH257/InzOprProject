package iCalTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import iCal.VEventBuilder;
public class VEventBuilderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Object vEvent;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVEventBuilder() {
		this.vEvent = vEvent;
		assertEquals(this.vEvent, vEvent);
		
	}

	@Test
	public void testSetSummary() {
		String summary = "temat";
		VEventBuilder cos = new VEventBuilder();
		cos.setSummary("temat");
		assertEquals("temat", cos.setSummary(summary));
	cos.setSummary("32131231");
		assertNotEquals("temat", cos.setSummary(summary));

		
		

	}

	@Test
	public void testSetDescription() {
		String description = "opis";
		VEventBuilder cos = new VEventBuilder();
		cos.setSummary("temat");
		assertEquals("opis", cos.setSummary(description));
	cos.setSummary("32131231");
		assertNotEquals("opis", cos.setSummary(description));
	}

	@Test
	public void testSetDate() {
		VEventBuilder cos = new VEventBuilder();
		Date date = null;
		cos.setDate(date);
		assertEquals(date, cos.setDate(date));
	}

	@Test
	public void testSetDuration() {
		VEventBuilder cos = new VEventBuilder();
		int czas = 200;
		cos.setDuration(czas);
		assertEquals(200, cos.setDuration(czas));
	}

}
