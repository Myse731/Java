class Members{
    String name;
    String email;
    int point;

    Members(){
        name = "손님";
        email = "없음";
        point = 0;
    }
    Members(String name){
        this.name = name;
        this.email = "없음";
        this.point = 0;
    }
    Members(String name, String email){
        this.name = name;
        this.email = email;
    }
    Members(String name, String email, int point){
        this.name = name;
        this.email = email;
        this.point = point;
    }

    void printInfo(){
        System.out.println(name+", " + email +", " +point+"점");
    }
}
public class Memberss {
    static void main() {
        Members m1 = new Members();
        Members m2 = new Members("민준");
        Members m3 = new Members("서연", "seoyeon@example.com");
        Members m4 = new Members("도윤", "doyun@example.com", 500);
        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
    }
}
