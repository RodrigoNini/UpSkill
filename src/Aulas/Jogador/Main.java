package Aulas.Jogador;

public class Main {
    public static void main(String[] args) {
        GuardaRedes Casillas = new GuardaRedes("Casillas", 00,174, 5);
        JogadorDeCampo Xavi = new JogadorDeCampo("Xavi", 34, 328,48);

        System.out.println(Casillas);
        System.out.println(Xavi);
        Casillas.sofrerGolo();
        Xavi.adicionarPasse();
        Casillas.marcarGolo();
        System.out.println(Casillas);
        System.out.println(Xavi);
        Xavi.marcarGolo();
        System.out.println(Xavi);

    }
}
