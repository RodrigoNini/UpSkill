package Aulas.Aula12;

import java.util.Comparator;

public class Financas implements Comparable<Financas> {
    private int senha;
    private String nome;
    private long nif;

    public Financas(int senha, String nome, long nif) {
        this.senha = senha;
        this.nome = nome;
        this.nif = nif;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public long getNif() {
        return nif;
    }

    @Override
    public int compareTo(Financas outraFinanca) {
        return Integer.compare(this.senha, outraFinanca.getSenha());
    }
}
