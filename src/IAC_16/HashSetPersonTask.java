package IAC_16;
import java.util.*;

class HashSetPersonTask {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 10));

        System.out.println(set);
    }
}

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person2){
            Person2 target = (Person2) obj;
            return Objects.equals(this.name, target.name) && this.age == target.age;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}