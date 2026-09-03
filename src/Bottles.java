class Botltle{
    int water;
    boolean trans = false;

    void setWater(int w){
        water = w;
    }

    void addWater(int amount){
        water += amount;
    }

    void transferTo(Botltle target, int amount){
        if(water - amount >= 0){
            water -= amount;
            target.addWater(amount);
            trans = true;
        }
    }

    void printWater(String name){
        if(trans == true){
            System.out.println(name + ": " + water);
        }
        else{
            System.out.println(name + ": " + water);
        }
    }
}
public class Bottles {
    static void main() {
        Botltle a1 = new Botltle();
        Botltle a2 = new Botltle();

        a1.setWater(300);
        a2.setWater(100);

        a1.transferTo(a2, 120);
        a1.printWater("첫 번째 물병");
        a2.printWater("두 번째 물병");

        Botltle b1 = new Botltle();
        Botltle b2 = new Botltle();
        b1.setWater(400);
        b2.setWater(100);

        b2 = b1;
        System.out.println("같은 인스턴스 참조 후 b1: " + b1.water);
        System.out.println("같은 인스턴스 참조 후 b2: " + b2.water);
    }
}
