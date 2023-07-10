package TrabalhoAutonomo.Calculator;

public class Main {
    public static void main(String[] args) {
        Functions calculadora = new Functions();
        calculadora.sumInt(5,2);
        calculadora.divide(5,2);
        calculadora.multInt(2,3);
        calculadora.powInt(5,2);
        calculadora.showPartial();
        calculadora.showHistory();


    }
}
