package Tema6.FicherosConFormato;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CrearEmpleadosXML {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException{
        ObjectInputStream f = new ObjectInputStream(new FileInputStream("./Tema6/FicherosConFormato/Empleados.obj"));
        
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("empleados");
        doc.appendChild(root);

        Empleado e;

        try {
            while (true) {
                e = (Empleado) f.readObject();
                Element emp = doc.createElement("empleado");
                emp.setAttribute("numero", Integer.toString(e.getNum()));

                Element hijo = doc.createElement("nombre");
                hijo.appendChild(doc.createTextNode(e.getNombre()));
                emp.appendChild(hijo);
                
                hijo = doc.createElement("departamento");
                hijo.appendChild(doc.createTextNode(String.valueOf(e.getDepartamento())));
                emp.appendChild(hijo);

                hijo = doc.createElement("edad");
                hijo.appendChild(doc.createTextNode(String.valueOf(e.getEdad())));
                emp.appendChild(hijo);

                hijo = doc.createElement("sueldo");
                hijo.appendChild(doc.createTextNode(String.valueOf(e.getSueldo())));
                emp.appendChild(hijo);

                root.appendChild(emp);
            }
        } catch (EOFException eof) {
            f.close();
        }
        Transformer trans = TransformerFactory.newInstance().newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream("./Tema6/FicherosConFormato/Empleados.xml"));

        trans.transform(source, result);
    }
}
