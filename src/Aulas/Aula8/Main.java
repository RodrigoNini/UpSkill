package Aulas.Aula8;

import TrabalhoAutonomo.Car.Car;

public class Main {
    public static void main(String[] args) {
/*        Funcionario ass = new Assistente("Otávio", 800);
        ass.calcularSalario();
        Funcionario ger = new Gerente("Manel", 800);
        ger.calcularSalario();
        Funcionario vend = new Vendedor("Sofia", 800, 200);
        vend.calcularSalario();
        Calculadora calculadora = new CalculadoraCientifica();
        calculadora.diff(3,1);
        ((CalculadoraCientifica)calculadora).potencia(2,2);*/
        CartaoPresente natal = new Natal("Pai");
        CartaoPresente aniv = new Aniversario("Mãe");
        CartaoPresente namorados = new DiaDosNamorados("Milene");
        natal.showMessage();
        aniv.showMessage();
        namorados.showMessage();

    }
}
