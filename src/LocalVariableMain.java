public class LocalVariableMain {
    int price;
    int quantity;

    LocalVariableMain(int price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }
    static int calculateTotal(int price, int quantity) {
        int total = price * quantity;
        return total;
    }

    public static void main(String[] args) {
        LocalVariableMain lv = new LocalVariableMain(3000, 4);
        System.out.println("결제 금액: " + lv.calculateTotal(3000, 4));
        //System.out.println("total: " + lv.total); //-> 인스턴스 변수여서 total을 불러올수없다.
    }
}