class Studentsss{
    String name;
    int grade;
    boolean active;

    Studentsss(){
        name = "이름 없음";
        grade = 1;
        active = true;
    }
}
public class Studentss {
    static void main() {
        Studentsss st = new Studentsss();
        System.out.println("이름: " + st.name + ", 학년: " + st.grade + ", 재학 중: " + st.active);
    }
}
