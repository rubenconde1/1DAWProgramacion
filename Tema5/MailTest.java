package Tema5;

public class MailTest {
    public static void main(String[] args) {
    MailServer server1;

        server1 = new MailServer();
       
    MailClient user1;

        user1 = new MailClient(server1, "ruben");
       
        user1.sendMailItem("A", "asunto", "mensaje");
        System.out.println(server1.howManyMailItems("A"));
        user1.sendMailItem("A;B;C", "asunto", "mensaje");
        forwardLastMailItem("");

    }
}
