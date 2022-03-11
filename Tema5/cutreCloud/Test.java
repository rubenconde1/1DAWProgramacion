package Tema5.cutreCloud;

public class Test {
    public static void main(String[] args) {
        Usuario user1, user2, user3, user4;
        user1 = new Usuario("email1@email.com", "ejemplo1");
        user2 = new Usuario("email2@gmail.com", "ejemplo2");
        user3 = new Usuario("email1@email.com", "ejemplo3");
        user4 = new Usuario("email4@email.com", "ejemplo4");

        Media userMedia1, userMedia2, userMedia3;
        userMedia1 = new Media("audio.mp3", "aaaa", MediaType.AUDIO, user1);
        userMedia2 = new Media("video.mp4", "bbbb", MediaType.VIDEO, user2);
        userMedia3 = new Media("img.jpg", "cccc", MediaType.IMAGE, user3);

        Media.eliminarPorNombre("aaaa");
        

        Media.eliminarTipoConcreto(MediaType.VIDEO);
        

        Usuario.eliminarUsuarioPorEmail("email4@email.com");
        

        Usuario.eliminarUsuariosDominio("@gmail.com");

        Usuario.loadXML();
    }
} 