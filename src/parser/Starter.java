package parser;
import java.io.IOException;

public class Starter {

	public static void main(String[] args) throws IOException {
		TimeTable timeTable = new TimeTable();
		Parser parser = new Parser("http://plan.uz.zgora.pl/grupy_plan.php?pId_Obiekt=16437" , timeTable);
		parser.parsePageSource();
	}

}
