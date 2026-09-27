package hw2;

import java.util.*;

abstract class DigitalProduct{
    private final String title;
    private final int price;

    DigitalProduct(String tt, int p){
        this.title = tt;
        this.price = p;
    }

    String getTitle(){
        return title;
    }

    int getPrice(){
        return price;
    }

    public abstract String getType();
}

class OnlineCourse extends DigitalProduct{
    OnlineCourse(String tt, int p){
        super(tt, p);
    }
    public String getType() {
        return "온라인 강의";
    }
}

class EBook extends DigitalProduct{
    EBook(String tt, int p){
        super(tt, p);
    }
    public String getType() {
        return "전자책";
    }
}

class Buyer{
    private int money;
    private Vector<DigitalProduct> items = new Vector<>();

    Buyer(int m){
        this.money = m;
    }

    void buy(DigitalProduct p){
        if((money - p.getPrice()) >= 0){
            System.out.println(p.getType() + " 구매: " + p.getTitle());
            items.add(p);
            this.money -= p.getPrice();
        }
        else{
            System.out.println("잔액이 부족합니다.");
        }
    }

    void refund(DigitalProduct p){
        if(items.remove(p)){
            money += p.getPrice();
            System.out.println(p.getType() + " 환불: " + p.getTitle());
        }
        else{
            System.out.println("구매 목록에 없는 상품입니다.");
        }
    }

    void summary(){
        int sum = 0;

        for(DigitalProduct p : items){
            sum += p.getPrice();
        }

        System.out.print("구매 개수: " + items.size() + "개, ");
        System.out.print("합계: " + sum + "원, ");
        System.out.println("잔액: " + money + "원");
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(50000);

        OnlineCourse course = new OnlineCourse("자바 입문", 30000);
        EBook book = new EBook("객체지향 요약집", 10000);
        OnlineCourse advanced = new OnlineCourse("고급 자바", 20000);

        buyer.buy(course);
        buyer.buy(book);
        buyer.buy(advanced);
        buyer.summary();

        buyer.refund(course);
        buyer.summary();

        buyer.refund(course);
    }
}
