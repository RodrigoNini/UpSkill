package TrabalhoAutonomo.Aula12;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Ex3 {
        public static void main(String[] args) {
/*            Set<Integer> set = new TreeSet<Integer>();
            Integer i = 1;
            set.add(i);
            set.add(i);
            set.add(new Integer(1));
            System.out .println(set);
            set.add(new Integer(2));
            System.out .println(set);*/

            Stack stack = new Stack();
            stack.add(2);
            stack.add(5);
            stack.add(8);
            stack.add(7);
            stack.add(3);
            stack.add(1);
            stack.add(9);
            stack.add(4);
            System.out.println(stack);
            stack.pop();
            System.out.println(stack);
            stack.push(5);
            System.out.println(stack);
        }
    }
