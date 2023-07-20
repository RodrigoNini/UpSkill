package Aulas.Aula13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try{
            Scanner reader = new Scanner(new File("ficheiros/mapa.txt"));
            PrintWriter writer = new PrintWriter("ficheiros/mapa1.txt");
            Scanner newReader = new Scanner(new File("ficheiros/mapa1.txt"));
            while(reader.hasNextLine()){
                String linha = reader.nextLine();
                String[] something = linha.split("");
                for (String a:
                        something) {
                    if(a == "#"){
                        writer.print("W");
                }else {
                        continue;
                    }
                }
                System.out.println(newReader.nextLine());
            }
            reader.close();
            newReader.close();
            writer.close();

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
