package Aulas.Aula8;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override

    public void calcularSalario(){
        System.out.println(getSalarioBase() * 2);
    }

}
