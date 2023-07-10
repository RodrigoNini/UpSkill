package TrabalhoAutonomo.Playlist;

public class Main {
    public static void main(String[] args) {
        Musics Overdue =  new Musics("Overdue",3.54);
        Musics Storm = new Musics("Storm", 4.31);
        Playlist Hype = new Playlist("Hype");
        Hype.addMusic(Overdue);
        Hype.addMusic(Storm);

        Hype.listMusics();
        Hype.getTotalDuration();
    }
}
