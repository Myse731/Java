class Notifier{
    void send(String message){
        System.out.println(message);
    }
    void send(String name, String message){
        System.out.println(name +"에게: " + message);
    }
    String aram(boolean check){
        if(check == true){
            return "[긴급] ";
        }
        else{
            return "[알림] ";
        }
    }
    void send(String name, String message, boolean urgent){
        System.out.println(aram(urgent) + name + "에게: " + message);
    }
}

public class Thing_dong {
    static void main() {
        Notifier nt = new Notifier();
        nt.send("수업이 시작됩니다.");
        nt.send("민준", "과제를 제출하세요.");
        nt.send("서연", "교무실로 오세요.", true);
    }
}
