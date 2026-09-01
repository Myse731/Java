class Cha{
    String name;
    boolean lock;
    boolean park;
    int speed;

    void lock_on(){
        lock = !lock;
    }

    void park(){
        park = !park;
    }

}

public class Car {
    static void main() {
        Cha c1 = new Cha();
        Cha c2 = new Cha();

        c1.name = "bmw";
        c1.speed = 150;

        c2.name = "F1-mercedes";
        c2.speed = 350;

        c1.lock_on();
        c2.park();

        System.out.println("차의 이름은 " + c1.name + "이고, 속도는 " + c1.speed + "입니다.");
        System.out.println("차의 이름은 " + c2.name + "이고, 속도는 " + c2.speed + "입니다.");
    }
}
