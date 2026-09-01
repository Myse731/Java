class Health{
    String name;
    static int membership_fee = 100000;
    int day_check;
    int set = 0;

    void on_off(){
        day_check++;
    }
}

public class Gym{
    static void main() {
        Health user1 = new Health();
        Health user2 = new Health();
        Health user3 = new Health();

        System.out.println("저희 헬스장 1년 회원비는 " + Health.membership_fee + "원입니다.");

        user1.set = 5;
        user1.name = "권민세";

        user2.set = 15;
        user2.name = "조재윤";

        user3.set = 0;
        user3.name = "양유진";

        for(int i = 0; i <= 10; i++){
            user1.on_off();
        }
        System.out.println(user1.name + "님은 출쳌 " + user1.day_check + "회이고, 세트수는 " + user1.set + "회입니다.");
        for(int i = 0; i <= 21; i++){
            user2.on_off();
        }
        System.out.println(user2.name + "님은 출쳌 " + user2.day_check + "회이고, 세트수는 " + user2.set + "회입니다.");
        System.out.println(user3.name + "님은 출쳌 " + user3.day_check + "회이고, 세트수는 " + user3.set + "회입니다.");

        Health.membership_fee -= 30000;
        System.out.println("이번에 새해 이벤트로 인해 " + user1.name + "님 1년 회원비가 " + user1.membership_fee + "원입니다.");
        System.out.println("이번에 새해 이벤트로 인해 " + user2.name + "님 1년 회원비가 " + user2.membership_fee + "원입니다.");
        System.out.println("이번에 새해 이벤트로 인해 " + user3.name + "님 1년 회원비가 " + user3.membership_fee + "원입니다.");
    }
}