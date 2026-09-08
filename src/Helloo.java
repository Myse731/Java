class Welcome{
    void printWelcome(String name){
        System.out.println(name+"님, 자바 수업에 오신 것을 환영합니다!");
    }
}

public class Helloo{
    static void main() {
        Welcome wl = new Welcome();
        wl.printWelcome("민준");
        wl.printWelcome("서연");
        wl.printWelcome("도윤");

    }
}