interface Playable {
    void play();
}

class Music implements Playable {
    public void play() {
        System.out.println("Music is playing");
    }
}

class Video implements Playable {
    public void play() {
        System.out.println("Video is playing");
    }
}

public class Main {
    public static void main(String[] args) {
        Music sn = new Music();
        Video vdo = new Video();
        
        sn.play();
        vdo.play();
    }
}
