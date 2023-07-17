package Aulas.Aula8;

public class Vendedor extends Funcionario{

    private int comissão;

    public Vendedor(String nome, double salarioBase, int comissão){
        super(nome, salarioBase);
        this.comissão = comissão;
    }

    @Override
    public void calcularSalario(){
        System.out.println(getSalarioBase()+comissão);
    }
}
