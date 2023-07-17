package TrabalhoAutonomo.ContaBancaria;

public class ContaBancaria {

    //com senha, número, saldo e quantidade de transações realizadas)

    private String senha;
    private int numero = (int)(Math.random()*1000);

    private double saldo;

    private int transacoesRealizadas = 0;

    public ContaBancaria(String senha, double saldo) {
        this.senha = senha;
        this.saldo = saldo;

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }


    public int getTransacoesRealizadas() {
        return transacoesRealizadas;
    }

    public double levantarDinheiro(double valor){
        transacoesRealizadas++;
        return saldo - valor;
    }

    public double depositarDinheiro(double valor){
        transacoesRealizadas++;
        return saldo + valor;
    }

    public double tirarExtrato() {
        return saldo;
    }

}
