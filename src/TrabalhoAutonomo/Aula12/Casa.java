package TrabalhoAutonomo.Aula12;

import java.util.HashMap;
import java.util.Map;

public class Casa {

    public Casa(){
    }

    HashMap<String,Eletrodomestico> mapaEletrodomesticos =  new HashMap();

    public void inserirEletrodomesticos(String divisao, Eletrodomestico a){
        mapaEletrodomesticos.put(divisao, a);
    }

    @Override
    public String toString() {
            return "Divisão: " + mapaEletrodomesticos.toString() + ", Eletrodomesticos: " + mapaEletrodomesticos.values();

    }

}
