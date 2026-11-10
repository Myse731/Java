package Clone_String;
import java.util.*;

public class JJack {

    static boolean check_even(String a){
        int count = 0;
        char[] charArr = a.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == '('){
                count+= 1;
            }
            else if(charArr[i] == ')'){
                count+= 1;
            }
        }

        if(count % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    static void main() {
        Stack st = new Stack();
        Scanner s = new Scanner(System.in);
        System.out.print("괄호식을 입력하세요 : ");
        String expression = s.nextLine();
        st.push(expression);
        System.out.println(check_even((String)st.pop()));
    }
}
