package by.academy.dv.java.task11part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxTry {

	public static void main(String[] args) throws FileNotFoundException,
			XMLStreamException {

		boolean isUnit = false;
		boolean isX = false;
		String x = null;
		String unit = null;

		XMLInputFactory factory = XMLInputFactory.newFactory();
		XMLStreamReader reader = factory
				.createXMLStreamReader(new FileInputStream("file11.xml"));
		while (reader.hasNext()) {

			int res = reader.next();
			if (res == XMLStreamConstants.START_ELEMENT) {
				if (reader.getLocalName().equals("x"))
					isX = true;
				else if (reader.getLocalName().equals("unit"))
					isUnit = true;
			} else if (res == XMLStreamConstants.CHARACTERS) {

				if (isX) {
					x = reader.getText();
					isX = false;

				} else if (isUnit) {
					unit = reader.getText();
					System.out.println(String.format("%s %s", x, unit));
					isUnit = false;

				}

			}

		}
	}
}
