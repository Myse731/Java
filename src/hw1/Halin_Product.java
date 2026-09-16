package hw1;
class Product{
    int price;
    int gettPrice(){
        return price;
    }
    Product(int price){
        this.price = price;
    }
}

class DiscountProduct extends Product{
    int discountRate;
    DiscountProduct(int price, int discountRate){
        super(price);
        this.discountRate = discountRate;
    }
    int gettPrice(){
        return super.gettPrice() * (100 - discountRate) / 100;
    }
}
public class Halin_Product {
    static void main() {
        Product p1 = new Product(50000);
        DiscountProduct dp = new DiscountProduct(50000, 20);
        System.out.println("원가: " + p1.gettPrice() + "원");
        System.out.println("할인가: " + dp.gettPrice() + "원");
    }
}
