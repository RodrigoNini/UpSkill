package Aulas.Aula11;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Diz-me um número");
        int firstN = keyboard.nextInt();
        System.out.println("Diz-me outro número");
        int secondN = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Qual operção devo fazer?");
        String operação = keyboard.nextLine();
        Calculadora.valueOf(operação).operation(firstN, secondN);
    }



}
