package Tema6.FicherosConFormato;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeerXML2 {
    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, IOException, SAXException{
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("./Tema6/FicherosConFormato/coches.xml");
        Element root = doc.getDocumentElement();
        NodeList hijos = root.getChildNodes();
        System.out.println(hijos.item(0).getNodeName());        
        System.out.println(hijos.item(1).getNodeName());
        System.out.println(hijos.item(2).getNodeName());
        System.out.println(hijos.item(3).getNodeName());
        System.out.println(hijos.item(4).getNodeName());
        System.out.println(hijos.item(5).getNodeName());
    }
}
