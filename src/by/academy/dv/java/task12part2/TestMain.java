package by.academy.dv.java.task12part2;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class TestMain {
	public static void main(String[] args) throws IOException,
			URISyntaxException, TransformerException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Source xslt = new StreamSource(new File("File.xslt"));
		Transformer transformer = factory.newTransformer(xslt);

		Source text = new StreamSource(new File("file.xml"));
		transformer.transform(text, new StreamResult(new File("output.html")));
	}
}