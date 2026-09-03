import java.util.Scanner;
class Traveler{
    String name;
    int dollars;
    static int exchangeRate = 1350;

    void setInfo(String n, int dl){
        name = n;
        dollars = dl;
    }

    int getWon(){
        int wonhwa = dollars * exchangeRate;
        return wonhwa;
    }

    int getWonAfterFee(int feeRate){
        int gwa = (int)(getWon() - (getWon() * (feeRate / 100.0)));
        return gwa;
    }

    void printMoney(){
        System.out.print(name + ": " + getWon() +"원");
    }
}
public class Travel {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Traveler t1 = new Traveler();
        Traveler t2 = new Traveler();

        t1.setInfo("지우", 100);
        t2.setInfo("유나", 250);

        t1.printMoney();
        System.out.println(", 수수료 2% 적용: " + t1.getWonAfterFee(2) + "원");
        t2.printMoney();
        System.out.println(", 수수료 2% 적용: " + t2.getWonAfterFee(2) + "원");
        Traveler.exchangeRate = 1400;
        System.out.println("환율 변경 후");
        t1.printMoney();
        System.out.println();
        t2.printMoney();
    }
}
