import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("행: ");
        int hang = scanner.nextInt();

        System.out.print("열: ");
        int yul = scanner.nextInt();

        int[][] space = new int[hang][yul];

        System.out.println("최초 재고: ");
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < yul; j++){
                space[i][j] = scanner.nextInt();
            }
        }

        while(true){
            System.out.print("명령 행: ");
            int n = scanner.nextInt();
            if(n == -1){
                break;
            }
            n -= 1;
            System.out.print("명령 열: ");
            int m = scanner.nextInt() -1;
            System.out.print("변경 수량: ");
            int s = scanner.nextInt();
            System.out.println();

            if((space[n][m] + s) < 0){
                space[n][m] += 0;
            }
            else{
                space[n][m] += s;
            }
        }

        System.out.println("최종 재고: ");
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < yul; j++){
                System.out.print(space[i][j] + " ");
            }
            System.out.println();
        }

        int last_sum = 0;
        int two_less = 0;
        int max = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < hang; i++){
            int sum = 0;
            System.out.print((i+1) + "행 전체 제고: ");
            for(int j = 0; j < yul; j++){
                if(max <= space[i][j]){
                    max = space[i][j];
                    x = i;
                    y = j;
                }
                if(space[i][j] <= 2){
                    two_less += 1;
                }
                sum += space[i][j];
                last_sum += space[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
        System.out.println("전체 재고: " + last_sum);
        System.out.println("재고가 2개 이하인 보관함: " + two_less + "개");
        System.out.println("가장 많은 재고: " + max);
        System.out.println("위치: " + (x+1) +"행 " + (y+1) + "열");

        scanner.close();
    }
}