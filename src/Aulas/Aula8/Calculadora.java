package Aulas.Aula8;

public abstract class Calculadora {

    private double firstN;
    private double secondN;

    public Calculadora(){

    }

    public abstract double sum(double firstN, double secondN);

    public abstract double diff(double firstN, double secondN);

    public abstract double div(double firstN, double secondN);

    public abstract double mult(double firstN, double secondN);
}
