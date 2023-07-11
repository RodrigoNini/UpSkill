package Aulas.Jogador;

public class JogadorDeCampo extends Jogador{

    private int passesSucedidos;

    public JogadorDeCampo(String nome, int numero, int passesSucedidos, int golosMarcados){
        super(nome, numero, golosMarcados);
        this.passesSucedidos = passesSucedidos;
    }

    public void adicionarPasse(){
        passesSucedidos++;
    }

    public int getPassesSucedidos() {
        return passesSucedidos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Posição: Jogador de Campo, Passes sucedidos: " + passesSucedidos;
    }
}
