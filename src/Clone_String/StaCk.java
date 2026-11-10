package Clone_String;
import java.util.*;

public class StaCk {
    static Stack back = new Stack();
    static Stack foward = new Stack();

    static void goURL(String url){
        while(!foward.empty()){
            foward.pop();
        }
        back.push(url);
    }

    static void goBack(){
        String trash_url = (String)back.pop();
        foward.push(trash_url);
    }

    static void goForward(){
        String trash_url = (String)foward.pop();
        back.push(trash_url);
    }

    static void printStatus() {
        System.out.println("back:" + back);
        System.out.println("forward:" + foward);
        System.out.println("현재화면은 '" + back.peek() + "' 입니다.");
        System.out.println();
    }

    static void main() {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");
        printStatus();

        goBack();
        System.out.println("= 뒤로가기 버튼을 누른 후 =");
        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후 =");
        printStatus();

        goForward();
        System.out.println("= '앞으로' 버튼을 누른 후 =");
        printStatus();

        goURL("codechobo.com");
        System.out.println("= 새로운 주소로 이동 후 =");
        printStatus();

    }
}
