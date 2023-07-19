package Aulas.Aula13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoas {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoas(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Nome + " + nome + ", Idade: " + idade + ", Cidade: " + cidade;
    }

    public static void main(String[] args) {
        List lista = new ArrayList<>();

        try{
            Scanner leitor = new Scanner(new File("pessoas.txt"));
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String[] sep = linha.split(";");
                String nome = sep[0];
                int idade = Integer.parseInt(sep[1]);
                String cidade = sep[2];
                Pessoas pessoa = new Pessoas(nome,idade,cidade);
                lista.add(pessoa);
            }
            System.out.println(lista);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }


}
