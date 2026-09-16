package hw1;
class Storage{
    String text;

    void save(String text){
        System.out.println("저장 내용: " + text);
    }

    void save(String text, boolean backup){
        if(backup == true){
            System.out.println("백업 저장: " + text);
        }
        else{
            save(text);
        }
    }
}

class CloudStorage extends Storage{
    void save(String text){
        System.out.println("클라우드 저장: " + text);
    }
}
public class StorageMain {
    static void main() {
        Storage storage = new Storage();
        storage.save("일기");
        storage.save("일기", true);

        Storage cloud = new CloudStorage();
        cloud.save("사진");
        cloud.save("사진", false);
    }
}
