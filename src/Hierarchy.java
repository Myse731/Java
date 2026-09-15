class Parent{
    int age;
}
class Child extends Parent{
    void play(){
        System.out.println("놀자~");
    }
}
public class Hierarchy {
    static void main() {
        Child c = new Child();
        c.age = 20;
        System.out.println(c.age);
        c.play();

        Parent p = new Parent();
        //p.play(); <- 자식은 부모를 참조하지만 부모는 자식을 참조하지 못한다
    }
}
