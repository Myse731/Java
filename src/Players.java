import java.util.Scanner;
class Player{
    String nickname;
    int score;

    void setInfo(String nn, int sc){
        nickname = nn;
        score = sc;
    }

    String getRank(){
        if(score >= 900){
            return "S";
        }
        else if(score >= 800){
            return "A";
        }
        else if(score >= 700){
            return "B";
        }
        else{
            return "C";
        }
    }

    void printInfo(){
        System.out.print("선수: " + nickname + ", ");
        System.out.print("점수: " + score + ", ");
        System.out.print("등급: " + getRank());
    }
}
public class Players {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] pl = new Player[n];

        for(int i = 0;  i < n; i++){
            pl[i] = new Player();
            String nn = sc.next();
            int scc = sc.nextInt();

            pl[i].setInfo(nn, scc);
        }

        pl[1].printInfo();
    }
}
