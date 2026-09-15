package hw1;
class Content{
    String title;
    Content(String title){
        this.title = title;
    }
    void play(){
        System.out.print("재생: " + title);
    }
}

class Music extends Content{
    String artist;
    Music(String title, String artist){
        super(title);
        this.artist = artist;
    }
    void play(){
        System.out.print("음악 ");
        super.play();
        System.out.println(" - " + artist);
    }
}

class Video extends Content{
    int runningTime;
    Video(String title, int runningTime){
        super(title);
        this.runningTime = runningTime;
    }
    void play(){
        System.out.print("영상 ");
        super.play();
        System.out.println(" (" + runningTime + "분)");
    }
}

public class MusicMain {
    static void main() {
        Music m = new Music("밤하늘", "루나");
        Video v = new Video("자바 클래스", 15);
        m.play();
        v.play();
    }
}
