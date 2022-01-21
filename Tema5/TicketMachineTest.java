package Tema5;

public class TicketMachineTest {
    public static void main(String[] args) {
        TicketMachine maquina = new TicketMachine(10);

        maquina.prompt();
        maquina.insertMoney(10);
        maquina.insertMoney(2);
        maquina.printTicket();
        maquina.showPrice();
        maquina.empty();
        maquina.showPrice();
    }
}
