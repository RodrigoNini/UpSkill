package Aulas.Ingresso;

public class VIP extends Ingresso{
    private int valorAdicional;

    public VIP(int preço, int valorAdicional){
        super(preço);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public int getPreço() {
        return super.getPreço()+valorAdicional;
    }

}
