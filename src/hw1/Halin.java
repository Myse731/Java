package hw1;
class Calculator {
    public double calculate(int amount) {
        return amount;
    }
}

class DiscountCalculator extends Calculator {
    double calculate(double amount) {
        return amount * 0.9;
    }
}
public class Halin {
    static void main() {
        DiscountCalculator dc = new DiscountCalculator();
        System.out.println("할인 금액: " + dc.calculate(10000.0) +"원");
    }
}
