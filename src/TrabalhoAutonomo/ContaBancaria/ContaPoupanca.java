package TrabalhoAutonomo.ContaBancaria;

public class ContaPoupanca extends ContaBancaria{

    private double taxaDeRendimento;
    public ContaPoupanca(String senha, double saldo, double taxaDeRendimento) {
        super(senha, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }


}
