package Aulas.Aula14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
/*        Consumer<Integer> method = (a) -> {System.out.println(a+a);};
        list.forEach(method);*/

        list.forEach((n)-> System.out.println(n*2));
    }

}
