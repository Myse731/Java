class Workouts{
    String name;
    int sets;
    int minutesPerset;

    void input(String n, int s, int mps){
        name = n;
        sets = s;
        minutesPerset = mps;
    }

    int getTotalMinutes(){
        int total;
        total = minutesPerset * sets;
        return total;
    }

    void printSummary(){
        System.out.println(name + " 총 운동시간: " + getTotalMinutes() + "분");
    }
}
public class WorkOut{
    static void main() {
        Workouts jp = new Workouts();
        Workouts sqt = new Workouts();

        jp.input("줄넘기", 3, 5);
        sqt.input("스쿼트", 4, 3);

        jp.printSummary();
        sqt.printSummary();
    }
}