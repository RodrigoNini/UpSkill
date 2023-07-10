package TrabalhoAutonomo.CreditCard;

import java.time.LocalDate;

public class CreditCard {
    private String owner;
    private int id;
    private String expireAt;
    private int budget;
    private double expenses;
    private String[] history;

    private double balance;

    private int count;

    public CreditCard(String owner){
        this.owner = owner;
        id = (int) (Math.random() * 10);
        expireAt = "June 2028";
        budget = -2500;
        history = new String[5];
        balance = 0;
        count = 0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void checkBalance(){
        System.out.println("Current balance is " + (double)Math.round(balance*100)/100 + "€");
    }

    public void payDebt(double payment){
        balance += payment;
        history[count] = "Foi depositado " + payment + "€";
        count++;
    }

    public void spend(double expenses, String what) {
        if ((balance - expenses) <= budget) {
            System.out.println("O orçamento foi ultrapassado. Transação recusada.");
        } else {
            balance -= expenses;
            history[count] = "Foi gasto " + expenses + "€ " + "em " + what;
            count++;
        }
    }

    public void getLastTicket(){
        System.out.println(history[count-1]);
    }

    public void getHistory(){
        String allHistory = null;
        for (int i = 0; i < history.length ; i++) {
            if(history[i] == null){
                continue;
            }
            System.out.println(history[i]);
        }

    }

}

