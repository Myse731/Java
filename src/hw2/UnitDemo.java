package hw2;
abstract class Unit {
    int x, y;
    abstract void move(int x, int y);

    void stop() {
        System.out.println("정지 위치: " + x + ", " + y);
    }
}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() { }
}

class Tank extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() { }
}

class Dropship extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load() { }
    void unload() { }
}

class Medic extends Unit{
    @Override
    void move(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Medic[x=" + x + ",y=" + y + "]");
    }
    void heal(){
        System.out.println("치료합니다");
    }
}

public class UnitDemo {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new Dropship(), new Medic()};
        for (int i = 0; i < group.length; i++) {
            // 각 group에서 어떤 move가 실행되는지 확인하기
            group[i].move(100, 200);
        }
        group[0].stop();
    }
}
