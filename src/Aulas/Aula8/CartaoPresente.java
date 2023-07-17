package Aulas.Aula8;

public abstract class CartaoPresente {
    private String destinatario;

    public CartaoPresente(String destinatario){
        this.destinatario = destinatario;
    }

    public abstract void showMessage();

    public String getDestinatario() {
        return destinatario;
    }
}
