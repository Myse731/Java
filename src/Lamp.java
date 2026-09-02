class Lamps{
    String color;
    boolean power = false;
    int brightness;

    void setColor(String c){
        color = c;
    }

    void toggle(){
        power = !power;
    }

    void brighten(){
        brightness += 10;
    }

    double estimateEnergy(double h){
        double sobi = 0;
        sobi = brightness * h / 100;
        return sobi;
    }

    void printStatus(){
        System.out.print("색상: " + color +", ");
        System.out.print("전원: " + power +", ");
        System.out.println("밝기: " + brightness);
    }
}
public class Lamp{
    static void main() {
        Lamps lm = new Lamps();
        lm.setColor("노란색");
        lm.toggle();
        lm.brighten();
        lm.brighten();
        lm.brighten();
        lm.printStatus();
        System.out.println("5시간 예산 소비량: " + lm.estimateEnergy(5));
    }
}