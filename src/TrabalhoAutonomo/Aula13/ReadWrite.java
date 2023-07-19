package TrabalhoAutonomo.Aula13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWrite {

    private List<String> documento;
    private List<String> temp;

    public ReadWrite(){
        documento = new ArrayList<>();
        temp = new ArrayList<>();
    }
    public void read(){
        try(Scanner reader = new Scanner(new File("exemplo.txt"))){
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void write(){

        temp.add("Carro;Cliente;Reparação;Valor\n" +
                "BB-11-22;João Silva;Motor;1000.0\n" +
                "CC-11-22;Maria do Carmo;Vidro;100.0\n" +
                "DD-11-22;Manuel Damásio;Pára-choques;500.0\n" +
                "EE-11-22;Vitor Pereira;Embraiagem;500.0");

        try(PrintWriter writer = new PrintWriter(new File("exemplo.txt"))){
            for (String linha:
                 temp) {
                writer.println(linha);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void readFromMult(File a, File b){
        try {
            Scanner reader = new Scanner(new File(a.toURI()));
            Scanner reader2 = new Scanner(new File(b.toURI()));
            while(reader.hasNextLine()){
                documento.add(reader.nextLine());
                System.out.println(reader.nextLine());

            }
            while (reader2.hasNextLine()){
                documento.add(reader2.nextLine());
                System.out.println(reader2.nextLine());
            }

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void writeFromMult(){
        try {
            PrintWriter writer = new PrintWriter(new File("Gravador.txt"));

            for (String linha: documento
                 ) {
                writer.println(linha);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
