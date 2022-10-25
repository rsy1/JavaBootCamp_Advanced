package bk8_5WorkingwithXML;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ReadXML {

	public static void main(String[] args) {		
		String xmlFile = "/home/jonathansiyanata/Downloads/Boot Camp/Boot Camp II/src/bk8_5WorkingwithXML/movies1.xml";
		Document domDocument = getDocument(xmlFile);
		
		countElemetNodes(domDocument);
		listAllNodeElements(domDocument);
	}

	private static void countElemetNodes(Document domDocument) {
		int count = 0;
		Element root = domDocument.getDocumentElement();
		Node movie = root.getFirstChild();
		while (movie != null) {
			count++;
			movie = movie.getNextSibling();
		}
		System.out.println("There are " + count + " movies.");
	}
	
	private static void listAllNodeElements(Document domDocument) {
		Element root = domDocument.getDocumentElement();
		NodeList movies = root.getChildNodes();
		for (int i = 0; i < movies.getLength(); i++) {
			Node movie = movies.item(i);
			System.out.println(movie.getNodeName());
		}
	}

	private static Document getDocument(String name) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setIgnoringComments(true);
			factory.setIgnoringElementContentWhitespace(true);
			factory.setValidating(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			return builder.parse(new InputSource(name));
		} catch (ParserConfigurationException | IOException | SAXException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
