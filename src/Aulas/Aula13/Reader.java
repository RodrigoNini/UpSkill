package Aulas.Aula13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Reader {
    private String name;
    private int age;

    public Reader() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Diz-me o teu nome:");
        String name = input.nextLine();
        System.out.println("Diz-me a tua idade:");
        int age = input.nextInt();
        String novaLinha = name + ";" + age;

        try{
            PrintWriter escrita = new PrintWriter("registo.txt");
            escrita.println(novaLinha);
            escrita.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Scanner reader = new Scanner(new File("registo.txt"));
            System.out.println(reader.nextLine());
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
