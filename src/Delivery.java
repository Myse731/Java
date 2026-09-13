class Delivery_calculator{
    int calculateFee(int distance){
        return distance * 500;
    }
    int calculateFee(int distance, int weight){
        return ((distance * 500) + (weight * 300));
    }
    int calculateFee(int distance, int weight, boolean express){
        if(express == true){
            return ((distance * 500) + (weight * 300)) + 5000;
        }
        else{
            return ((distance * 500) + (weight * 300));
        }
    }
}
public class Delivery {
    static void main() {
        Delivery_calculator d = new Delivery_calculator();
        System.out.println("기본 배송비: " + d.calculateFee(10) + "원");
        System.out.println("무게 포함 배송비: " + d.calculateFee(10, 5) + "원");
        System.out.println("빠른 배송비: " + d.calculateFee(10, 5, true) + "원");
    }
}