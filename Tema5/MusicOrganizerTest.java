package Tema5;

public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer list1 = new MusicOrganizer();
        list1.addFile("song1");
        list1.getNumberOfFiles();
        list1.listFile(0);
        list1.checkIndex(2);
        list1.removeFile(2);

        
    }
}
