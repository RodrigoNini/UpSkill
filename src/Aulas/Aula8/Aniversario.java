package Aulas.Aula8;

public class Aniversario extends CartaoPresente{

    public Aniversario(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Olá " + getDestinatario() + ". Desejo-te um feliz aniversário!");
    }


}
