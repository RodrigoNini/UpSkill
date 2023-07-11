package Aulas.Jogador;

public class Jogador {
    private String nome;
    private int numero;

    private int golosMarcados;

    public Jogador(String nome, int numero, int golosMarcados){
        this.nome = nome;
        this.numero = numero;
        this.golosMarcados = golosMarcados;
    }

    public void marcarGolo() {
        golosMarcados++;
    }

    public int getGolosMarcados() {
        return golosMarcados;
    }

    @Override
    public String toString() {
        return "Jogador " + nome + ", número " + numero + ", Golos marcados: " + golosMarcados;
    }
}
