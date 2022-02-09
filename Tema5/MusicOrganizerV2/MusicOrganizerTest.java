package Tema5.MusicOrganizerV2;

public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer player1 = new MusicOrganizer();
        player1.addFile("song1");
        player1.addFile("song2");
        player1.addFile("song3");
        player1.listAllFiles();
        player1.listMaching("ng");
    }
}
