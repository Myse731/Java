package DAY11_11;
import java.util.StringJoiner;

class Timetable implements Cloneable{
    String owner;
    String subjects[];
    public static final String DAYS[] = {"월", "화", "수", "목", "금"};

    Timetable(String o, String d){
        this.owner = o;
        this.subjects = d.split(",");
        for(int i = 0; i < subjects.length; i++){
            subjects[i] = subjects[i].trim();
        }
    }

    void change(String day, String subject){
        for(int i = 0; i < DAYS.length; i++){
            if(DAYS[i].equals(day)){
                subjects[i] = subject;
                return;
            }
        }
        System.out.println("잘못된 요일: " + day);
    }

    @Override
    public String toString(){
        StringJoiner sj = new StringJoiner(" | ", owner + " [", "]");
        for(int i = 0; i < subjects.length; i++){
            sj.add(DAYS[i] + ":" + subjects[i]);
        }
        return sj.toString();
    }

    @Override
    public Timetable clone() throws CloneNotSupportedException {
        Timetable copy = (Timetable) super.clone();
        copy.subjects = this.subjects.clone();
        return copy;
    }
}

public class TimeTableTest {
    static void main() throws CloneNotSupportedException{
        Timetable base = new Timetable("기본", "국어, 수학,영어 ,과학, 체육");
        Timetable kim = base.clone();
        kim.owner = "김학생";
        kim.change("수", "정보");
        kim.change("토", "미술");

        System.out.println(base);
        System.out.println(kim);
        System.out.println(base.subjects == kim.subjects);
        System.out.println(base.subjects[0] == kim.subjects[0]);
    }
}
