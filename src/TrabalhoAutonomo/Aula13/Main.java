package TrabalhoAutonomo.Aula13;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ReadWrite something = new ReadWrite();
        //something.write();
        //something.read();
        something.readFromMult(new File("exemplo.txt"), new File("exemplo2.txt"));
        something.writeFromMult();
    }
}
