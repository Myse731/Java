class ArrayCalculator{
    int sum(int[] values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    double sum(double[] values){
        double sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
}
public class Sum {
    static void main() {
        ArrayCalculator ac = new ArrayCalculator();
        int[] a1 = {10, 20, 30};
        double[] a2 = {1.5, 2.5, 3.5};
        System.out.println("정수 배열의 합: " + ac.sum(a1));
        System.out.println("실수 배열의 합: " + ac.sum(a2));
    }
}
