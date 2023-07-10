package TrabalhoAutonomo.Car;

import Aulas.Person;

public class Main {
    public static void main(String[] args) {
        Person Rodrigo = new Person("Rodrigo", "Alves", 23);
        Car Polo = new Car("VW", 5, 47, "June 2012", 4.7);
        Polo.ignition();
        Polo.run(100);
        Polo.ignition();
        Polo.setOwner(Rodrigo);

        System.out.println(Polo);
    }
}
