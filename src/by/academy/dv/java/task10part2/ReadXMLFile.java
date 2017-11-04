package by.academy.dv.java.task10part2;

import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class ReadXMLFile {

	public static void main(String argv[]) {
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			ArrayList<Point> container = new ArrayList<Point>();
			MySAXHandler handler = new MySAXHandler(container);
			saxParser.parse("file10.xml", handler);

			for (Point point : container) {
				System.out.println(point);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}