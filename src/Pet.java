class Pets{
    String name;
    String type;
    int age;

    void printInfo(){
        System.out.print("이름: " + name + ", 종류: " + type + ", 나이: " + age +"살, ");
        getAgeGroup();
    }
    void getAgeGroup(){
        System.out.print("성장 단계: ");
        if(age <= 1){
            System.out.print("아기");
        }
        else if(age <= 7){
            System.out.print("성체");
        }
        else{
            System.out.print("노령");
        }
    }
}
public class Pet{
    static void main() {
        Pets dog = new Pets();
        Pets cat = new Pets();

        dog.name = "초코";
        dog.type = "강아지";
        dog.age = 3;

        cat.name = "나비";
        cat.type = "고양이";
        cat.age = 9;

        dog.printInfo();
        System.out.println();
        cat.printInfo();
    }
}