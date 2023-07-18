package Aulas.Aula12;

import java.util.Comparator;

public class Senha implements Comparator<Financas> {
    @Override
    public int compare(Financas o1, Financas o2) {
        if(o1.getSenha() <o2.getSenha()){
            return -1;
        } else if (o2.getSenha()<o1.getSenha()) {
            return 1;
        } else {
            return 0;
        }
    }

}
