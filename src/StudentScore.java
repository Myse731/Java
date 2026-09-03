import java.util.Scanner;
class SScore{
    String name;
    int score;

    void setInfo(String n, int s){
        name = n;
        score = s;
    }

    String getGrade(){
        if(score >= 90){
            return "A";
        }
        else if(score >= 80){
            return "B";
        }
        else if(score >= 70){
            return "C";
        }
        else{
            return "D";
        }
    }

    boolean isScholarshipTarget(){
        if(score >= 90){
            return true;
        }
        else{
            return false;
        }
    }

    void printResult(){
        System.out.print(name + ", ");
        System.out.print("점수: " + score +", ");
        System.out.print("등급: " + getGrade() + ", ");
        System.out.println("장학 대상: " + isScholarshipTarget());
    }
}
public class StudentScore {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SScore[] ssc = new SScore[n];
        for(int i = 0; i < ssc.length; i++){
            ssc[i] = new SScore();
            String na = sc.next();
            int score = sc.nextInt();
            ssc[i].setInfo(na, score);
        }
        for(int j = 0; j < ssc.length; j++){
            ssc[j].printResult();
        }
    }
}