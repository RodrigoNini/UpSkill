package Aulas.Ingresso;

public class CamaroteSuperior extends CamaroteInferior{
    private int preçoExtraAdicional;

    public CamaroteSuperior(int preço, int preçoAdicional, int preçoExtraAdicional, String localização){
        super(preço, preçoAdicional, localização);
        this.preçoExtraAdicional = preçoExtraAdicional;
    }

    public int getPreçoExtraAdicional() {
        return preçoExtraAdicional;
    }

    @Override
    public int getPreço() {
        return super.getPreço() + preçoExtraAdicional ;
    }
}
