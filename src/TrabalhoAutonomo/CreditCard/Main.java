package TrabalhoAutonomo.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard Visa = new CreditCard("Rodrigo");
        Visa.checkBalance();
        Visa.spend(1685.57,"Camera");
        Visa.checkBalance();
        Visa.getHistory();
        Visa.payDebt(2500);
        Visa.checkBalance();
        Visa.getLastTicket();
        Visa.spend(57.83,"Supermercado");
        Visa.getLastTicket();

    }
}
