package TrabalhoAutonomo.Playlist;

public class Musics {
    private String name;
    private String artist;
    private String genre;
    private double duration;

    public Musics(String name, String artist, String genre, double duration){
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public Musics(String name, double duration){
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Title: " + name + ", " + duration + "s;";
    }
}
