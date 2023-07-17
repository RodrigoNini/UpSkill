package Aulas.Aula8;

public class DiaDosNamorados extends CartaoPresente{
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println("Olá " + getDestinatario() + ". Desejo-te um feliz dia de São Valentim!");
    }
}

