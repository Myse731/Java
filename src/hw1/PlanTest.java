package hw1;
class BasicPlan {

    String name = "기본 요금제";

    public static void printType() {
        System.out.println("BasicPlan 클래스");
    }

    public void printName() {
        System.out.println("현재 요금제: " + name);
    }
}

class PremiumPlan extends BasicPlan {

    String name = "프리미엄 요금제";

    public static void printType() {
        System.out.println("PremiumPlan 클래스");
    }

    public void printNames() {
        System.out.println("자식의 name: " + name);
        System.out.println("부모의 name: " + super.name);
    }
}

public class PlanTest {

    public static void main(String[] args) {

        BasicPlan basic = new BasicPlan();
        PremiumPlan premium = new PremiumPlan();

        System.out.println(basic.name);
        System.out.println(premium.name);

        premium.printNames();

        BasicPlan.printType();
        PremiumPlan.printType();
    }
}