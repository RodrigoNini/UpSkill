package Aulas.Aula12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
/*        Contato rodrigo = new Contato("Rodrigo", 939253174l, "rodrigoninialves@gmail.com");
        Contato paula  = new Contato("Paula", 917349878l, "paulanini@gmail.com");
        List<Contato> contatos = new ArrayList<>();
        contatos.add(rodrigo);
        contatos.add(paula);
        System.out.println(contatos);

        Map<String, Carro> carros = new HashMap();
        Carro polo = new Carro("47-NB-69", "VW",2012);
        Carro mercedes = new Carro("78-JM-98", "Mercedes", 2016);

        carros.put("47-NB- 69", polo);
        carros.put("78-JM-98", mercedes);
        System.out.println(carros);
        carros.remove("78-JM-98");
        System.out.println(carros);*/

        Financas rodrigo = new Financas(2,"Rodrigo", 255199066l);
        Financas milene = new Financas(6, "Milene", 536618357l);
        Financas otavio = new Financas(1,"Otavio", 81651516l);
        Financas raquel = new Financas(8, "Raquel", 536987357l);
        Queue<Financas> fila = new PriorityQueue<>();
        fila.add(rodrigo);
        fila.add(milene);
        fila.add(otavio);
        fila.add(raquel);
        System.out.println(fila);

    }
}
