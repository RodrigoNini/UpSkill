package Aulas.Aula12;

public class Contato {
    private String name;
    private long mobile;
    private String email;

    public Contato(String name, long mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", Telf: " + mobile + ", Email: " + email;
    }
}
