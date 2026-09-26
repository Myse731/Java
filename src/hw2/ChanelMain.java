package hw2;

abstract class Notification{
    private String receiver;

    public Notification(String r){
        this.receiver = r;
    }

    public String getReceiver() {
        return receiver;
    }

    public abstract void send(String message);
}

class EmailNotification extends Notification{
    public EmailNotification(String r){
        super(r);
    }

    public void send(String message){
        System.out.println("이메일(" + getReceiver() + ")" + ": " + message);
    }
}

class SmsNotification extends Notification{
    public SmsNotification(String r){
        super(r);
    }

    public void send(String messsage){
        System.out.println("SMS(" + getReceiver() + ")" + ": " + messsage);
    }
}


class AppNotification extends Notification{
    public AppNotification(String r){
        super(r);
    }

    public void send(String message){
        System.out.println("앱 알림(" + getReceiver() + ")" + ": " + message);
    }
}
public class ChanelMain {
    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification("student@example.com"),
                new SmsNotification("010-1234-5678"),
                new AppNotification("민준")
        };

        for (Notification notification : notifications) {
            notification.send("과제를 확인하세요.");
        }
    }
}
