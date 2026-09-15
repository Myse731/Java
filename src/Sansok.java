class Cars{
    int kilo = 100;
    String name;
    int baki = 4;
    int oils = 100;

    void ride(){
        System.out.println("부릉부릉 출발합니더");
    }
    void nam_oil(){
        System.out.println("남은 기름 : " + oils);
    }

    Cars(int kilo, String name, int baki, int oils){
        this.kilo = kilo;
        this.name = name;
        this.baki = baki;
        this.oils = baki;
    }

    Cars(int kilo, int oils){
        this(kilo,"아반떼",4,oils);
    }
    Cars(){};
}

class Engine{
    String oil = "카놀라유";
    void my_oil_check(){
        System.out.println("니가 쓰는 기름의 이름은? ->" + oil);
    }
}

class F1 extends Cars{
    Engine eg = new Engine();
    F1() {
        super.name = "메르세데스 벤츠";
    }
    F1(int kilo, int oils){
        super(kilo, oils);
    }
}
public class Sansok {
    static void main() {
        F1 f1 = new F1();
        f1.ride();
        f1.nam_oil();
        f1.eg.my_oil_check();
        f1.eg.oil = "동원 냉참치";
        f1.eg.my_oil_check();
    }
}
