package TrabalhoAutonomo.Aula11;

import java.util.Comparator;

public class Aluno implements Comparator<Aluno> {

    private String name;
    private int number;

    public Aluno(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return 0;
    }


    // Comparador por número de aluno
    public static Comparator<Aluno> comparadorNumeroAluno = new Comparator<Aluno>() {
        @Override
        public String compare(Aluno aluno1, Aluno aluno2) {
            return Integer.compare(aluno1.getName(), aluno2.getNumber());
        }
    };

    // Comparador por nome de aluno
    public static Comparator<Aluno> comparadorNomeAluno = new Comparator<Aluno>() {
        @Override
        public int compare(Aluno aluno1, Aluno aluno2) {
            return aluno1.getName().compare(aluno2.getNumber());
        }
    };
}
