package Aulas.Aula11;

import Aulas.Aula11.Interfaces.FiguraGeometricaPlana;

public class Circulo implements FiguraGeometricaPlana {

    private String name;
    private double radius;

    public Circulo(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    @Override
    public void getNomeFiguraPlana() {
        System.out.println(name);
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getPerimetro() {
        return 0;
    }
}
