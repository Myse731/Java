import java.util.Scanner;
class Parked{
    String carNumber;
    int parkedMintes;

    void input(String cn, int pm){
        carNumber = cn;
        parkedMintes = pm;
    }
    int calculateFee(int p){
        int fee = 2000;
        if (p > 30) {
            int extraMinutes = p - 30;
            fee += ((extraMinutes + 9) / 10) * 500;
        }
        return fee;
    }

    void printResult(){
        System.out.print("차량: " + carNumber + ", ");
        System.out.print("주차: " + parkedMintes + ", ");
        System.out.println("요금: " + calculateFee(parkedMintes) + "원");
    }
}
public class Parking {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Parked[] pk = new Parked[2];
        for(int i = 0; i < pk.length; i++){
            pk[i] = new Parked();
            String cnb = sc.next();
            int pkm = sc.nextInt();
            pk[i].input(cnb, pkm);
        }
        for(int i = 0; i < pk.length; i++){
            pk[i].printResult();
        }
    }
}
