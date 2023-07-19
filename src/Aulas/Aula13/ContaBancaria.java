package Aulas.Aula13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {


    private List<String> registo ;

    public ContaBancaria(){
        registo = new ArrayList<>();
    }

    public void addTransaction(String descrição, double valor){
        String novaLinha = descrição + ";" + valor;
        registo.add(novaLinha);
    }
    public void saveFile() throws IOException {
       try(PrintWriter writer = new PrintWriter("registoBancario.txt")){
           for(String linha : registo){
               writer.println(linha);
           }
       }
    }

    public void readFile() {
        try(Scanner reader = new Scanner(new File("registoBancario.txt"))) {
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) throws IOException {

        ContaBancaria poupança = new ContaBancaria();
        poupança.addTransaction("almoço", 15);
        poupança.addTransaction("bicileta", 200);
        poupança.saveFile();
        poupança.readFile();

    }

}
