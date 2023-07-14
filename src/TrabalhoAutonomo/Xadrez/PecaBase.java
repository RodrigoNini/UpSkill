package TrabalhoAutonomo.Xadrez;

public abstract class PecaBase {
    private int eixoX;
    private int eixoY;

    public PecaBase(int eixoX, int eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }

    public int getEixoX() {
        return eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }


    public abstract void movimentosPossiveis();
    @Override
    public String toString() {
        return "Coordenadas: eixo x = " + getEixoX() + " , eixo y = " + getEixoY();
    }
}
