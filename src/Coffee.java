import java.util.Scanner;

class DrinkOrder{
    String menuName;
    int price;
    int quantity;

    void setOrder(String mn, int p, int q){
        menuName = mn;
        price = p;
        quantity = q;
    }

    int getAmount(){
        int sum;
        sum = price * quantity;
        return sum;
    }

    int getDiscountedAmount(){
        int amount = getAmount();
        if(amount >= 10000){
            return amount - (amount / 10);
        }
        else{
            return amount;
        }
    }

    void printOrder(){
        System.out.println(menuName +" "+ quantity + "잔: " + getAmount()+"원");
    }
}
public class Coffee {
    static void main() {
        Scanner sc = new Scanner(System.in);
        DrinkOrder[] orders = new DrinkOrder[3];

        for(int i = 0; i < orders.length; i++){
            orders[i] = new DrinkOrder();
            String n = sc.next();
            int pr = sc.nextInt();
            int qt = sc.nextInt();

            orders[i].setOrder(n, pr, qt);
        }

        for(int i = 0; i < orders.length; i++){
            orders[i].printOrder();
        }
        System.out.println("핫초코 할인 적용 금액: " + orders[orders.length-1].getDiscountedAmount() + "원");
        int sum = 0;
        for(int i = 0; i < orders.length; i++){
            sum += orders[i].getAmount();
        }
        System.out.println("총 결제 금액: " + sum + "원");
    }
}