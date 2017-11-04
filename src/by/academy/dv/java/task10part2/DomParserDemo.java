package by.academy.dv.java.task10part2;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class DomParserDemo {

	public static void main(String[] args) throws SAXException, IOException,
			ParserConfigurationException {

		File inputFile = new File("file10.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
		Element documentElement = doc.getDocumentElement();
		NodeList elementsByTagName = documentElement
				.getElementsByTagName("point");

		for (int j = 0; j < elementsByTagName.getLength(); j++) {
			Node poinNode = elementsByTagName.item(j);

			Element eElement = (Element) poinNode;

			String valX = extractvar(eElement, "x");

			String valY = extractvar(eElement, "y");

			String valUnit = extractvar(eElement, "unit");

			System.out.println(String.format("%s %s %s", valX, valY, valUnit));

		}
	}

	private static String extractvar(Element eElement, String tagName) {

		NodeList allyTags = eElement.getElementsByTagName(tagName);
		String val = allyTags.item(0).getTextContent();
		return val;
	}
}