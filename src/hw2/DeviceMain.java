package hw2;

abstract class Device{
    final private String modelName;
    Device(String mn){
        this.modelName = mn;
    }

    final void checkSafety(){
        System.out.println("안전 점검을 완료했습니다.");
    }

    void operate(){
        System.out.println(modelName + ": " + "기기를 작동합니다.");
    }

    String getModelName(){
        return modelName;
    }
}

class Printer extends Device{
    Printer(String mn){
        super(mn);
    }

    void operate(){
        System.out.println(getModelName() + ": " + "문서를 인쇄합니다.");
    }
}

class RobotCleaner extends Device{
    RobotCleaner(String mn){
        super(mn);
    }

    void operate(){
        System.out.println(getModelName() + ": " + "바닥을 청소합니다.");
    }

    void returnToCharger(){
        System.out.println(getModelName() + ": " + "충전기로 복귀합니다.");
    }
}
public class DeviceMain {
    public static void main(String[] args) {
        Device[] devices = {
                new Printer("P100"),
                new RobotCleaner("R200")
        };

        for (Device device : devices) {
            device.checkSafety();
            device.operate();
        }

        RobotCleaner robot = (RobotCleaner) devices[1];
        robot.returnToCharger();

        System.out.println("같은 객체인가: " + (devices[1] == robot));
    }
}
