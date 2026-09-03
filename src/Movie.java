import java.util.Scanner;

class Seat{
    int seatNumber;
    boolean reserved = false;

    void setSeatNumber(int sn){
        seatNumber = sn;
    }

    void reverse(){
        if(reserved == true){
            System.out.println("이미 예약된 자석입니다.");
            reserved = false;
        }
        else{
            reserved = true;
        }
    }

    void cancle(){
        reserved = false;
    }

    int getTicketPrice(){
        if(seatNumber == 1){
            return 15000;
        }
        else if (seatNumber == 2){
            return 12000;
        }
        else{
            return 10000;
        }
    }

    void printStatus(){
        System.out.print(seatNumber + "번 좌석 예약 여부: " + reserved + ", ");
        System.out.println("가격: " + getTicketPrice() +"원");
    }
}
public class Movie {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Seat[] st = new Seat[3];
        for(int i = 0; i < st.length; i++){
            st[i] = new Seat();
            int sn = sc.nextInt();
            st[i].setSeatNumber(sn);
        }

        st[1].reverse();
        st[1].reverse();

        for(int i = 0; i < st.length; i++){
            st[i].printStatus();
        }
    }
}
