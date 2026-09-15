package hw1;

class Member{
    String name;
    String email;

    Member(String name, String email){
        this.name = name;
        this.email = email;
    }

    Member(){};

    void login(){
        System.out.println(name + " 로그인");
    }
}

class StudentMember extends Member{
    int grade;
    StudentMember(String name, String email, int grade){
        super(name, email);
        this.grade = grade;
    }
    void printInfo(){
        System.out.println("학생: " + name + ", " + grade +"학년");
    }
}

class TeacherMember extends Member{
    String subject;
    TeacherMember(String name, String email, String subject){
        super(name, email);
        this.subject = subject;
    }
    void printInfo(){
        System.out.print("교사: " + name + ", ");
        System.out.println("과목: " + subject);
    }
}
public class Student {
    static void main() {
        StudentMember st = new StudentMember("민준", "26_03@bssm.hs.kr", 2);
        TeacherMember th = new TeacherMember("김선생", "teacher091@bssm.hs.kr", "자바");

        st.login();
        st.printInfo();
        th.login();
        th.printInfo();
    }
}