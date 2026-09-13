class Laptops {
    String model;
    int memory;
    int storage;

    Laptops() {
        this("기본 모델", 8, 256);
    }

    Laptops(String model) {
        this(model, 8, 256);
    }

    Laptops(String model, int memory) {
        this(model, memory, 256);
    }

    Laptops(String model, int memory, int storage) {
        this.model = model;
        this.memory = memory;
        this.storage = storage;
    }

    void printInfo() {
        System.out.println("모델: " + model + ", 메모리: " + memory + "GB, 저장용량: " + storage + "GB");
    }
}

public class Laptop {
    public static void main(String[] args) {
        Laptops l1 = new Laptops();
        Laptops l2 = new Laptops("MacBook Air");
        Laptops l3 = new Laptops("Gram 16", 16);
        Laptops l4 = new Laptops("Galaxy Book", 32, 512);

        l1.printInfo();
        l2.printInfo();
        l3.printInfo();
        l4.printInfo();
    }
}