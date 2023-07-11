package Aulas.Ingresso;


public class Main {
    public static void main(String[] args) {
        Ingresso bilhete = new Ingresso(70);
        VIP bilheteVip = new VIP(70,15);
        CamaroteInferior bilheteInferior = new CamaroteInferior(70,20);
        CamaroteSuperior bilheteSuperior = new CamaroteSuperior(70,15,25);

        System.out.println(bilhete.getPreço());
        System.out.println(bilheteVip.getPreço());
        System.out.println(bilheteInferior.getPreço());
        bilheteInferior.getLocalização();
        System.out.println(bilheteSuperior.getPreço());
        bilheteSuperior.getLocalização();
    }



}
