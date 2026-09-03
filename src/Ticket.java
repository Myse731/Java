import java.util.Scanner;
class Tickets{
    String destination;

    void setDestination(String des){
        destination = des;
    }

    int calcultePrice() {
        if (destination.equals("서울")) {
            return 30000;
        } else if (destination.equals("부산")) {
            return 50000;
        } else if (destination.equals("대전")) {
            return 40000;
        }
        return 0;
    }

    void printTicket(int number){
        System.out.print("티켓 " + number + " 목적지: " + destination +", ");
        System.out.println("가격: " + calcultePrice() + "원");
    }
}
public class Ticket {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Tickets[] tickets = new Tickets[3];

        for(int i = 0; i < tickets.length; i++){
            tickets[i] = new Tickets();
            String des = sc.next();
            tickets[i].setDestination(des);
        }

        for(int j = 0; j < tickets.length; j++){
            tickets[j].printTicket(j+1);
        }
    }
}