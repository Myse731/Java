class Counter {
    static int count = 10;
    static int total = 100;

    static void printTotal() {
        System.out.println(total);
    }

    void printCount() {
        System.out.println(count);
    }
    static void Test() {
        Counter ct = new Counter();
        System.out.println(count);
        printTotal();
        ct.printCount();

        Counter counter = new Counter();
        System.out.println(counter.count);
        counter.printCount();
    }
}