package TrabalhoAutonomo.Aula11;

public enum Sueca {
    AS(11),
    MANILHA(10),
    REI(4),
    VALETE(3),
    DAMA(2),
    DEZ(0),
    NOVE(0),
    OITO(0),
    SEIS(0),
    CINCO(0),
    QUATRO(0 ),
    TRES(0 ),
    DOIS(0 );

    int pontos;
    Sueca(int pontos){
        this.pontos = pontos;
    }

    public int totalPoints(Sueca[]v){
        int sum = 0;
        for (Sueca cards:
             v) {
            sum =  sum + cards.pontos;
        }
        return sum;
    }

}
// Não sei como evocar o método sem usar uma carta