package Aulas.Aula11;

public enum Calculadora {
    SUM,
    DIFF,
    MULT,
    DIV;

    Calculadora(){

    }

    public void operation(int a, int b){
        switch(this){
            case SUM:
                System.out.println("A soma é " + (a+b));
                break;
            case DIFF:
                System.out.println("A diferença é " + (a-b));
                break;
            case MULT:
                System.out.println("A soma é "+ (a*b));
                break;
            case DIV:
                System.out.println("A soma é " + (a/b));
                break;
        }
    }

    }
