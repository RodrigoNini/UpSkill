package Aulas.Aula11;

import Aulas.Aula11.Interfaces.FiguraGeometricaPlana;

public class Rectangulo implements FiguraGeometricaPlana {

    private String name;
    private double height;
    private double length;
    private double width;

    public Rectangulo(String name, double height, double length, double width){
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public void getNomeFiguraPlana() {
        System.out.println(name);

    @Override
    public int getArea() {
        return (int) (width*length);
    }

    @Override
    public int getPerimetro() {
        return (int)((width*4)+(length*4)+(height*4));
    }
}
