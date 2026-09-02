class Books{
    String title;
    String author;
    boolean borroed = false;

    void setInfo(String t, String a){
        title = t;
        author = a;
    }

    void borrow(){
        if(borroed == true){
            System.out.println("이미 대출 중인 책입니다.");
        }
        else{
            borroed = true;
        }
    }

    void returnBook(){
        borroed = false;
    }

    void printStatus(){
        System.out.print(title + " - ");
        if(borroed == false){
            System.out.println("대출 가능");
        }
        else{
            System.out.println("대출 중");
        }
    }

    int calculateLateFee(int overdueDays){
        int money = 0;
        int count = 1;
        for(int i = overdueDays; i > 0; i--){
            if(count <= 3){
                money += 500;
                count ++;
            }
            else{
                money += 1000;
                count ++;
            }
        }
        return money;
    }
}
public class Book{
    static void main() {
        Books prince = new Books();

        prince.setInfo("어린 왕자", "생텍쥐베리");
        prince.borrow();
        prince.borrow();
        prince.printStatus();
        System.out.println("5일 연체료: " + prince.calculateLateFee(5) + "원");
        prince.printStatus();
    }
}