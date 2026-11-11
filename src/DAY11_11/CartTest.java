package DAY11_11;

import java.util.ArrayList;
import java.util.Objects;

class Item{
    String code;
    String name;
    int price;
    int qty = 1;

    Item(String c, String n, int p){
        this.code = c;
        this.name = n;
        this.price = p;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Item){
            Item target = (Item)obj;
            return Objects.equals(this.code, target.code);
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        //내용 어떻게 써야 할지 모르곘음
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return String.format("%s(%s) %d원 x %d", name, code, price, qty);
    }
}

class Cart{
    private ArrayList<Item> list = new ArrayList<>();

    public void add(Item item){
        for(Item i : list){
            if(i.equals(item)){
                i.qty += 1;
                return;
            }
        }
        list.add(item);
    }

    public boolean remove(String code){
        for(Item i : list){
            if(i.code.equals(code)){
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public void removeUnder(int price){
        for(int i = list.size()-1; i >= 0; i--){
            if(list.get(i).price < price){
                list.remove(i);
            }
        }
    }

    public void print(){
        if(list.size() == 0){
            System.out.println("장바구니가 비었습니다");
            return;
        }
        System.out.println("= 장바구니 =");
        int sum = 0;
        for(Item i : list){
            System.out.println(i.toString());
            sum += i.price * i.qty;
        }
        System.out.println("합계: " + sum + "원");
    }
}
public class CartTest {
    static void main() {
        Cart cart = new Cart();
        cart.add(new Item("A01", "우유", 2500));
        cart.add(new Item("B02", "빵", 3000));
        cart.add(new Item("A01", "우유", 2500));
        cart.add(new Item("C03", "껌", 1000));
        cart.add(new Item("D04", "사과", 1500));
        cart.print();

        System.out.println("B02 삭제: " + cart.remove("B02"));
        System.out.println("Z99 삭제: " + cart.remove("Z99"));

        cart.removeUnder(2000);
        cart.print();
    }
}