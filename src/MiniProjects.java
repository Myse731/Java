import java.util.Scanner;
class Bike{
    int bikeNumber;
    String rider;
    boolean rented;
    static String stationName = "한강 공원";

    void setBikeNumber(int bn){
        bikeNumber = bn;
    }

    void rent(String rn){
        if(rented == false){
            rider = rn;
            rented = true;
        }
    }

    void returnBike(){
        if(rented == true){
            rented = false;
        }
    }

    boolean isAvailable(){
        if(rented == true){
            return true;
        }
        else{
            return false;
        }
    }

    int calculateRentalFee(int m){
        int sum = 1000;
        if(m > 30){
            int unit = (m - 30 + 9) / 10;
            sum += unit * 500;
        }
        return sum;
    }

    void printStatus(){
        if(rented == true){
            System.out.print("자전거 " + bikeNumber + ", ");
            System.out.print("대여소 " + stationName + ", ");
            System.out.print("대여 가능, ");
            System.out.println("대여 중 " + rider);
        }
        else{
            System.out.print("자전거 " + bikeNumber + ", ");
            System.out.print("대여소 " + stationName + ", ");
            System.out.println("대여 가능");
        }

    }
}
public class MiniProjects {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bike[] bk = new Bike[n];
        for(int i = 0; i < bk.length; i++){
            bk[i] = new Bike();
            int rd = sc.nextInt();
            bk[i].setBikeNumber(rd);
        }
        for(int j = 0; j < 2; j++){
            int nn = sc.nextInt();
            String na = sc.next();

            bk[nn].rent(na);
        }

        int back = sc.nextInt();
        bk[back].returnBike();

        int sum = 0;
        for(int k = 0; k < bk.length; k++){
            if(bk[k].isAvailable() == false){
                sum += 1;
            }
            bk[k].printStatus();
        }
        System.out.println("대여 가능한 자전거: " + sum + "대");
        System.out.println("민준의 67분 대여 요금: " + bk[1].calculateRentalFee(67));

        bk[0].stationName = "시민공원";
        System.out.println("대여소 이름 변경 후: " + bk[0].stationName);
    }
}
