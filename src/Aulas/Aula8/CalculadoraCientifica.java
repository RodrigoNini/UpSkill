package Aulas.Aula8;

public class CalculadoraCientifica extends Calculadora{
    private double firstN;

    private  double secondN;

    public CalculadoraCientifica(){
    }

    @Override
    public double sum(double firstN, double secondN) {
        return firstN + secondN;
    }

    @Override
    public double diff(double firstN, double secondN) {
        return firstN - secondN;
    }

    @Override
    public double div(double firstN, double secondN) {
        return firstN/secondN;
    }

    @Override
    public double mult(double firstN, double secondN) {
        return firstN*secondN;
    }

    public double raizQuadrada(double firstN){
        return Math.sqrt(firstN);
    }

    public double potencia(double firstN, double secondN){
        return Math.pow(firstN, secondN);
    }
}
