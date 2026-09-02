class Robots{
    String name;
    int battery;

    void setInfo(String n, int bt){
        name = n;
        battery = bt;
    }

    void performTask(String tn, int rbt ){
        if(battery - rbt >= 0){
            System.out.println(tn + " 성공");
            battery -= rbt;
        }
        else{
            System.out.println(tn + " 실패");
        }
    }

    void charge(int at){
        if(battery + at <= 100){
            battery += at;
        }
    }

    String getBatteryLevel(){
        if(battery >= 60){
            return "충분";
        }
        else if(battery >= 20){
            return "주의";
        }
        else{
            return "충전 필요";
        }
    }

    void printBattery(){
        System.out.print(name + "배터리: " + battery + ", ");
        System.out.println("상태: " + getBatteryLevel());
    }
}

public class Robot{
    static void main() {
        Robots cl = new Robots();
        Robots ifr = new Robots();

        cl.setInfo("청소봇", 100);
        ifr.setInfo("안내봇", 100);

        cl.performTask("바닥 청소", 35);
        cl.performTask("물걸레 청소", 30);
        cl.printBattery();
        ifr.printBattery();
    }
}