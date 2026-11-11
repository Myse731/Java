package DAY11_11;

abstract class Device{
    String name;
    boolean power = false;

    Device(String n){
        this.name = n;
    }

    void turnOn(){
        power = !power;
        System.out.println(name + " 전원 ON");
    }

    abstract void operate();
}

class Light extends Device implements VoiceControl{
    Light(){
        super("조명");
    }

    @Override
    void operate(){
        System.out.println("조명이 방을 밝힙니다.");
    }

    public void listen(String cd){
        if(cd.equals("켜줘")){
            turnOn();
        }
        else{
            System.out.println(name + ": 알 수 없는 명령 - " + cd);
        }
    }
}

class AirConditioner extends Device implements VoiceControl, Schedulable{
    AirConditioner(){
        super("에어컨");
    }

    @Override
    void operate(){
        System.out.println("에어컨이 냉방을 시작합니다.");
    }

    public void setTimer(int n){
        System.out.println("에어컨 " + n + "분 뒤 꺼짐 예약");
    }

    public void listen(String cd){
        if(cd.equals("켜줘")){
            turnOn();
        }
        else{
            System.out.println(name + ": 알 수 없는 명령 - " + cd);
        }
    }
}

class Robot extends Device{
    Robot(){
        super("로봇청소기");
    }

    @Override
    void operate(){
        System.out.println("로봇청소기가 청소를 시작합니다.");
    }
}

class Home{
    static Device create(String type){
        if(type.equals("light")){
            //Light 객체 반환
            return new Light();
        }
        else if(type.equals("aircon")){
            //AirConditioner 객체 반환
            return new AirConditioner();
        }
        else{
            //Robot 객체 반환
            return new Robot();
        }
    }

    static void sayAll(VoiceControl[] list, String command){
        for(VoiceControl v: list){
            v.listen(command);
        }
    }
}

interface VoiceControl{
    void listen(String command);
}

interface Schedulable{
    void setTimer(int minutes);
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Device[] devices = {
                Home.create("light"),
                Home.create("aircon"),
                Home.create("robot")
        };

        for (int i = 0; i < devices.length; i++) {
            Device d = devices[i];
            if (d instanceof VoiceControl) {
                ((VoiceControl) d).listen("켜줘");
            } else {
                d.turnOn();
            }
            d.operate();
            if (d instanceof Schedulable) {
                ((Schedulable) d).setTimer(30);
            }
        }

        System.out.println("--- 음성 명령 ---");
        VoiceControl[] speakers = {
                new Light(),
                new AirConditioner()
        };
        Home.sayAll(speakers, "노래 틀어줘");
    }
}