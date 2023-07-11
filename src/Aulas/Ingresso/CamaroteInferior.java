package Aulas.Ingresso;

public class CamaroteInferior extends VIP{
    private String localização;

    public CamaroteInferior(int preço, int valorAdicional, String localização){
        super(preço, valorAdicional);
        this.localização = localização;

    }

    public void getLocalização() {
        System.out.println(localização);
    }

    @Override
    public int getPreço() {
        return super.getPreço();
    }
}
