class Producct{
    String name;
    int price;
    int stock;

    Producct(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    int getInventoryValue(){
        return price * stock;
    }
}
public class Productt {
    static void main() {
        Producct pt1 = new Producct("키보드", 35000, 4);
        Producct pt2 = new Producct("마우스", 18000, 6);

        System.out.println(pt1.name + "재고 가치: " + pt1.getInventoryValue() + "원");
        System.out.println(pt2.name + "재고 가치: " + pt2.getInventoryValue() + "원");
    }
}
