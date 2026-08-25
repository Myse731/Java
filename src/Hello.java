import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int one = Integer.parseInt(scanner.nextLine());

        System.out.print("두 번째 숫자: ");
        int two = Integer.parseInt(scanner.nextLine());

        System.out.println("덧셈 : " + (one + two));
        System.out.println("뺄셈 : " + (one - two));
        System.out.println("곱셈 : " + (one * two));
        System.out.println("나눗셈 : " + ((double)one / two));

        scanner.close();
    }
}