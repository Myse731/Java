package DAY11_11;

public class DeliveryTest {
    static class Delivery{
        String item;
        int distance;

        Delivery(String i, int d){
            this.item = i;
            this.distance = d;
        }

        int fee(){
            return 3000 + (distance * 100);
        }

        @Override
        public String toString(){
            return item + "(" + distance + "Km)";
        }
    }

    static class Express extends Delivery{
        Express(String item, int distance){
            super(item, distance);
        }
        int fee(){
            return super.fee() + 2000;
        }
    }

    static class Drone extends Delivery{
        int weight;

        Drone(String item, int distance, int w){
            super(item, distance);
            this.weight = w;
        }

        int fee(){
            return super.fee() * 2;
        }

        boolean canFly(){
            if(weight <= 5){
                return true;
            }
            else{
                return false;
            }
        }
    }

    static int totalFee(Delivery[] list){
        int total = 0;
        for(int i = 0; i < list.length; i++){
            total += list[i].fee();
        }
        return total;
    }

    public static void main(String[] args) {
        Delivery[] list = {
                new Delivery("책", 10),
                new Express("케이크", 5),
                new Drone("약", 3, 1),
                new Drone("의자", 2, 12)
        };

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " 요금: " + list[i].fee() + "원");
            if (list[i] instanceof Drone) {
                Drone d = (Drone) list[i];
                System.out.println("  → 드론 비행 " + (d.canFly() ? "가능" : "불가"));
            }
        }
        System.out.println("총 요금: " + totalFee(list) + "원");
    }
}