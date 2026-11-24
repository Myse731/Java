package Hash_Map_Table_24;

import java.util.ArrayList;

class Fruit               { public String toString() { return "Fruit"; } }
class Apple extends Fruit { public String toString() { return "Apple"; } }
class Toy                 { public String toString() { return "Toy"; } }

// TODO 1: 제네릭 클래스 Box<T>를 작성한다
class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item){
        list.add(item);
    }

    @Override
    public String toString(){
        return list.toString();
    }
}

class BoxTask {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy>   toyBox   = new Box<Toy>();

        // TODO 2: 출력 결과가 나오도록 add()로 요소를 넣는다
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}