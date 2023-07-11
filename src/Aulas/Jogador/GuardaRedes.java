package Aulas.Jogador;

public class GuardaRedes extends Jogador{

    private int golosSofridos;

    public GuardaRedes(String nome, int numero, int golosSofridos, int golosMarcados){
        super(nome, numero, golosMarcados);
        this.golosSofridos = golosSofridos;
    }

    public void sofrerGolo(){
        golosSofridos++;
    }

    public int getGolosSofridos() {
        return golosSofridos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Posição: Guarda Redes, Golos Sofridos: " + golosSofridos;
    }
}
