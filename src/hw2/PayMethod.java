package hw2;

abstract class Payment{
    abstract boolean pay(int amount);
}

class CardPayment extends Payment{
    boolean pay(int amount){
        System.out.println("카드 결제: " + amount + "원");
        return true;
    }
}

class PointPayment extends Payment{
    boolean pay(int amount){
        System.out.println("포인트 결제: " + amount + "원");
        return true;
    }
}

class UnsupportedPayment extends Payment{
    boolean pay(int amount){
        System.out.println("지원하지 않는 결제 방식입니다.");
        return false;
    }
}

class PaymentFactory{
    public static Payment create(String option) {
        if(option.equals("card")){
            return new CardPayment();
        }
        else if(option.equals("point")){
            return new PointPayment();
        }
        else{
            return new UnsupportedPayment();
        }
    }
}

class PaymentService{
    public void process(String option, int amount) {
        Payment payment = PaymentFactory.create(option);

        boolean man = payment.pay(amount);

        if(man == true){
            System.out.println("결제 성공");
        }
        else{
            System.out.println("결제 실패");
        }
    }
}
public class PayMethod {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.process("card", 5000);
        service.process("point", 10000);
        service.process("cash", 3000);
    }
}
