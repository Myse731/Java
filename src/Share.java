import java.util.Scanner;
class Member{
    String name;
    int point;
    String serviceName = "별빛 쇼핑";

    void setInfo(String n, int p){
        name = n;
        point = p;
    }

    void addPoint(int amount){
        point += amount;
    }

    String getMemberLevel(){
        if(point >= 1500){
            return "GOLD";
        }
        else if(point >= 1000){
            return "SILVER";
        }
        else{
            return "BRONZE";
        }
    }

    int calculateUsablePoint(int orderAmount){
        int toa = orderAmount * (20 / 100);
        if(toa < point){
            return toa;
        }
        else{
            return point;
        }
    }

    void printInfo(){
        System.out.print(name + ", ");
        System.out.print(point + "점, ");
        System.out.print(getMemberLevel() +", ");
        System.out.println(serviceName);
    }
}
public class Share {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Member[] m = new Member[3];
        for(int i = 0; i < m.length; i++){
            m[i] = new Member();
            String n = sc.next();
            int p = sc.nextInt();
            m[i].setInfo(n, p);
        }
        for(int j = 0; j < m.length; j++){
            m[j].serviceName = "별빛 마켓";
        }
        for(int j = 0; j < m.length; j++){
            m[j].printInfo();
        }
    }
}
