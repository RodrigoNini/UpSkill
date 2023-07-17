package TrabalhoAutonomo.Aula11;

public class Contato {

    private String name;
    private int mobile;

    public Contato(String name,int mobile){
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public int getMobile() {
        return mobile;
    }

    public void modificaName(final String name){
        this.name = name;
    }
    public void modificaMobile(final int mobile){
        this.mobile = mobile;
    }

}
