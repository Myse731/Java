class NumberTool {
    int convert(int number) {
        return number * 2;
    }

    long convert(long number) {
        return number * 3L;
    }
}
public class Numtool{
    static void main() {
        NumberTool nt = new NumberTool();
        int result1 = nt.convert(5);
        System.out.println("convert(int): " + result1);
        long result2 = nt.convert(10L);
        System.out.println("convert(long): " + result2);
    }
}