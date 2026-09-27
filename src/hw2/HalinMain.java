package hw2;

abstract class DiscountPolicy{
    public abstract int apply(int amount);
}

class FixedDiscount extends DiscountPolicy{
    private int discountAmount;

    public FixedDiscount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int apply(int amount){
        if((amount - discountAmount) < 0){
            return 0;
        }
        else{
            return (amount - discountAmount);
        }
    }
}

class RateDiscount extends DiscountPolicy{
    private int discountRate;

    public RateDiscount(int discountRate) {
        this.discountRate = discountRate;
    }

    public int apply(int amount){
       return amount * (100 - discountRate) / 100;
    }
}

class Order{
    private final int amount;
    private DiscountPolicy discountPolicy;
    public Order(int amount, DiscountPolicy discountPolicy){
        this.amount = amount;
        this.discountPolicy = discountPolicy;
    }

    void setDiscountPolicy(DiscountPolicy discountPolicy){
        this.discountPolicy = discountPolicy;
    }
    public int calculatePayment(){
        return discountPolicy.apply(amount);
    }
}
public class HalinMain {
    public static void main(String[] args) {
        Order order = new Order(20000, new FixedDiscount(3000));

        System.out.println(
                "정액 할인 적용: " + order.calculatePayment() + "원"
        );

        order.setDiscountPolicy(new RateDiscount(20));

        System.out.println(
                "정률 할인 적용: " + order.calculatePayment() + "원"
        );
    }
}
