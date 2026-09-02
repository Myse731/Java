import java.util.Scanner;
class Product{
    String name;
    int price;
    int stock;

    void input(String n, int p, int st){
        name = n;
        price = p;
        stock = st;
    }

    String canSell(){
        if(stock >= 1){
            return "판매 가능";
        }
        else{
            return "품절";
        }
    }

    void printInfo(){
        System.out.print(name+", ");
        System.out.print(price + "원, ");
        System.out.print("재고: " + stock + ", ");
        System.out.println(canSell());
    }
}
public class Products {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Product[] pr = new Product[3];
        for(int i = 0; i < pr.length; i++){
            pr[i] = new Product();
            String n = sc.next();
            int p = sc.nextInt();
            int st = sc.nextInt();
            pr[i].input(n, p, st);
        }

        for(int j = 0; j < pr.length; j++){
            pr[j].printInfo();
        }
    }
}
