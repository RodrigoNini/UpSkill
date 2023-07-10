package TrabalhoAutonomo.Playlist;

public class Playlist {
    private String playlist;
    private Musics[] musics;

    public Playlist(String playlist){
        this.playlist = playlist;
        musics = new Musics[3];
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public void addMusic(Musics music){
        for (int i = 0; i < 3; i++) {
            if (musics[i] == null) {
                musics[i] = music;
                break;
            }
        }
    }

    public void listMusics(){
        for (int i = 0; i < musics.length; i++) {
            System.out.println(musics[i]);
        }
    }

    public void getTotalDuration(){
        double sum = 0;
        for (int i = 0; i < musics.length; i++) {
            if(musics[i] == null){
                continue;
            }
            sum = sum + musics[i].getDuration();
        }
        System.out.println(sum);
    }

    @Override
    public String toString() {
        return playlist;
    }
}
