package Hash_Map_Table_24;
import java.util.ArrayList;

class Fruit3                { public String toString() { return "Fruit"; } }
class Apple3 extends Fruit3 { public String toString() { return "Apple"; } }
class Grape3 extends Fruit3 { public String toString() { return "Grape"; } }

class Juice {
    // TODO 1: 이름을 받는 생성자와 toString()을 작성한다
    String name;
    Juice(String n){
        this.name = n;
    }

    @Override
    public String toString(){
        return name + "Juice";
    }
}

class Juicer {
    // TODO 2: 와일드카드를 사용한 static Juice makeJuice(...) 하나를 작성한다
    static Juice makeJuice(FruitBox3<? extends Fruit3> box){
        String tmp = "";
        for (Fruit3 f : box.getList()){
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

class JuiceTask {
    public static void main(String[] args) {
        // TODO 3: fruitBox, appleBox를 만들어 과일을 넣는다
        FruitBox3<Fruit3> fruitBox = new FruitBox3<>();
        fruitBox.add(new Apple3());
        fruitBox.add(new Grape3());

        FruitBox3<Apple3> appleBox = new FruitBox3<>();
        appleBox.add(new Apple3());
        appleBox.add(new Apple3());
        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox3<T extends Fruit3> extends Box3<T> {}

class Box3<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i)     { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size()       { return list.size(); }
    public String toString() { return list.toString(); }
}