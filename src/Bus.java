import java.util.Scanner;

class Buss{
    int number;
    int passengers;

    void setNumber(int n){
        number = n;
    }

    void ride(int c){
        passengers += c;
    }

    int calculateFare(int ac, int sc){
        int sum;
        sum = ac * 1500 + sc * 900;
        return sum;
    }
    void printStatus(){
        System.out.print("버스 " + number+ "번, ");
        System.out.println("현재 승객: " + passengers + "명");
    }
}
public class Bus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Buss bs = new Buss();
        int n = sc.nextInt();
        int acc = sc.nextInt();
        int scc = sc.nextInt();
        bs.setNumber(n);
        bs.ride(acc + scc);
        bs.printStatus();
        System.out.println("이번 탑승 요금: " + bs.calculateFare(acc, scc) + "원");
    }
}
