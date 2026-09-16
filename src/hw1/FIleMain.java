package hw1;
class FileResource {
    public void open() {
        System.out.println("파일을 엽니다.");
    }
}

class ImageFile extends FileResource {
    @Override
    public void open() {
        System.out.println("이미지 파일을 엽니다.");
    }
}
public class FIleMain {
    static void main() {
        FileResource f = new FileResource();
        ImageFile imf = new ImageFile();
        f.open();
        imf.open();
    }
}
