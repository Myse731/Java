package hw1;
class SmartHome{
    DoorLock dl = new DoorLock();
    AirConditioner act = new AirConditioner();
}
class DoorLock{
    boolean lock = false;
    void lock(){
        System.out.println("문이 잠겼습니다");
        lock = true;
    }
}
class AirConditioner{
    int temperature;
    void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("에어컨 온도: " + temperature + "도");
    }
}

class PremiumSmartHome extends SmartHome{
    void activateSecurityMode(){
        boolean security = false;
        System.out.println("보안 모드가 실행되었습니다");
    }
}
public class SmartHomeMain {
    static void main() {
        PremiumSmartHome psh = new PremiumSmartHome();
        psh.dl.lock();
        psh.act.setTemperature(24);
        psh.activateSecurityMode();
    }
}
