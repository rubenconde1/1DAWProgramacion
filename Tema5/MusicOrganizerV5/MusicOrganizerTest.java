package Tema5.MusicOrganizerV5;

public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer player = new MusicOrganizer();

        player.addFile("song1");
        player.addFile("song2");
        player.addFile("truck");
        player.addFile("song3");
        player.addFile("song4");
        player.findInTittle("song");
    }
}
