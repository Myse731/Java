class FoodOrder{
    String menuName;
    int price;
    int quantity;
    boolean delivery;

    FoodOrder(){
        this("미정", 0, 1, false);
    }

    FoodOrder(String menuName, int price){
        this(menuName, price, 1, false);
    }

    FoodOrder(String menuName, int price, int quantity){
        this(menuName, price, quantity, false);
    }

    FoodOrder(String menuName, int price, int quantity, boolean delivery){
        this.menuName = menuName;
        this.price = price;
        this.quantity = quantity;
        this.delivery = delivery;
    }

    int calculateTotal(){
        if(delivery == true){
            return (price * quantity) + 3000;
        }
        else{
            return price * quantity;
        }
    }

    int calculateTotal(int discountRate){
        if(delivery == true){
            return ((price * quantity  + 3000) * (100 - discountRate) / 100);
        }
        else{
            return (price * quantity) * (100 - discountRate) / 100;
        }
    }

    int calculateTotal(int discountRate, int coupon){
        if(calculateTotal(discountRate) - coupon <= 0){
            return 0;
        }
        else{
            return calculateTotal(discountRate) - coupon;
        }
    }

    static boolean isValidPrice(int price){
        if(price <= 0){
            return false;
        }
        else{
            return true;
        }
    }

    String del(boolean delivery){
        if(delivery == true){
            return "배달";
        }
        else{
            return "포장";
        }
    }

    void printOrder(int final_price){
        System.out.print(menuName + " " + quantity +"개, ");
        System.out.print(del(delivery) +", ");
        System.out.println("최종 금액: " + final_price +"원");
    }
}
public class FoodMain {
    static void main() {
        FoodOrder fo1 = new FoodOrder("김밥", 3500, 2, false);
        FoodOrder fo2 = new FoodOrder("치킨", 20000, 1, true);

        int price1 = fo1.calculateTotal(10);
        int price2 = fo2.calculateTotal(10, 5000);
        fo1.printOrder(price1);
        fo2.printOrder(price2);
    }
}
