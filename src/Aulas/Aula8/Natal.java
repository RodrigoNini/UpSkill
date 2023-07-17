package Aulas.Aula8;

public class Natal extends CartaoPresente{

    public Natal(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println("Olá " + getDestinatario() + ". Desejo-te um feliz Natal!");
    }
}
