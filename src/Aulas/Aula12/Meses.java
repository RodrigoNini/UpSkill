package Aulas.Aula12;
import java.util.HashMap;

public class Meses {
    public static String getMes(int mes) {
        HashMap<Integer, String> mapaMeses = new HashMap<>();
        mapaMeses.put(1, "Janeiro");
        mapaMeses.put(2, "Fevereiro");
        mapaMeses.put(3, "Março");
        mapaMeses.put(4, "Abril");
        mapaMeses.put(5, "Maio");
        mapaMeses.put(6, "Junho");
        mapaMeses.put(7, "Julho");
        mapaMeses.put(8, "Agosto");
        mapaMeses.put(9, "Setembro");
        mapaMeses.put(10, "Outubro");
        mapaMeses.put(11, "Novembro");
        mapaMeses.put(12, "Dezembro");

        return mapaMeses.getOrDefault(mes, "Mês inválido");
    }

    public static void main(String[] args) {
        int mes = 7;
        String nomeMes = getMes(mes);
        System.out.println("Mês: " + nomeMes);
    }
}

