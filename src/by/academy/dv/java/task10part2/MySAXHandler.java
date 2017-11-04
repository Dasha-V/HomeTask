package by.academy.dv.java.task10part2;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySAXHandler extends DefaultHandler {
	private List<Point> container;
	private String currentTagName;
	private Point currentPoint;

	public MySAXHandler(List<Point> container) {
		super();
		this.container = container;
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		currentTagName = qName;
		if (qName.equals("point")) {
			currentPoint = new Point();
			container.add(currentPoint);

		}

	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String value = new String(ch, start, length);

		if (!value.matches(".+")) {
			return;
		}

		if (currentTagName.equals("x")) {
			currentPoint.setX(value);
		} else if (currentTagName.equals("y")) {
			currentPoint.setY(value);
		} else if (currentTagName.equals("unit")) {
			currentPoint.setUnit(value);
		}

	}
}
