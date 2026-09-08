class Washing{
    void click(int a){
        if(a == 1){
            System.out.println("전원이 켜집니다");
        }
        else if(a == 0){
            System.out.println("전원이 꺼집니다");
        }
    }

    void click(boolean a){
        if(a){
            System.out.println("전원이 켜집니다");
        }
        else if(a == false){
            System.out.println("전원이 꺼집니다");
        }
    }
}
public class Saetak{
    static void main() {
        Washing saetak = new Washing();

        System.out.println("saetak.click(1) 결과: ");
        saetak.click(1);
        System.out.println("saetak.click(0) 결과: ");
        saetak.click(0);
        System.out.println("saetak.click(true) 결과: ");
        saetak.click(true);
        System.out.println("saetak.click(false) 결과: ");
        saetak.click(false);
    }
}