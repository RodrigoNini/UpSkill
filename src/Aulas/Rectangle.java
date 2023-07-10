package Aulas;

public class Rectangle {

    public int width;
    public  int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(int square){
        this.width = square;
        this.length = square;
    }

    public int getArea(){
        return width*length;
    }

    public int getPerimeter(){
        return width*2+length*2;
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
    }

    public boolean isSquare(){
        return width == length;
    }
}
