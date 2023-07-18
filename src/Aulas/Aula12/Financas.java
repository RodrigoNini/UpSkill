package Aulas.Aula12;

public class Financas {
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
}
