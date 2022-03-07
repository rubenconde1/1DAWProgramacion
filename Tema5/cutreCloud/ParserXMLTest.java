package Tema5.cutreCloud;
public class ParserXMLTest {

    public static void printXML(ParserXML imprimible) {
        System.out.println(imprimible.generateXML());
    }
    public static void main(String[] args) {
        Usuario u1 = new Usuario("kk@gmail.com", "blablabla");
        Usuario u2 = new Usuario("bb@gmail.com", "asasasas");
        Media m1 = new Media("peli.avi", "aaaa", MediaType.VIDEO, u1);
        Media m2 = new Media("audio.mp3", "bbbb", MediaType.AUDIO, u2);

        printXML(u1);
        printXML(m1);

        u1.writeXML();
        u2.writeXML();
        m1.writeXML();
        m2.writeXML();
    }
}