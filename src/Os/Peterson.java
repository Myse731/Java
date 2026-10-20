package Os;

import java.util.concurrent.atomic.AtomicIntegerArray;

// 실행: java Peterson.java
//
// // Pi의 구조 (j는 상대 번호)
// while (1){
//   flag[i] = 1;
//   turn = j;
//   while(flag[j] && turn == j);
//   // critical section
//   flag[i] = 0;
//   // remainder section
// }
//
// 의사코드 → Java
//   flag[i] = 1;    →  flag.set(i, 1);
//   flag[j]         →  flag.get(j) == 1
//   turn = j;       →  turn = j;  (그대로)
public class Peterson {
    static AtomicIntegerArray flag = new AtomicIntegerArray(2);   // flag[i] == 1 : Pi가 들어가고 싶다
    static volatile int turn = 0;                                 // 누구에게 양보했는가
    static int count = 0;                                         // 공유 변수

    static void process(int i) {
        int j = 1 - i;                // 상대 번호
        for (int k = 0; k < 1000000; k++) {
            // TODO 1: entry section (의사코드 3줄)
            flag.set(i, 1);
            turn = j;
            while(flag.get(j) == 1 && turn == j);
            // critical section
            if (i == 0) count++;   // P0은 증가
            else        count--;   // P1은 감소

            // TODO 2: exit section (의사코드 1줄)
            flag.set(i, 0);
        }
    }

    // ===== 아래는 수정하지 않아도 됩니다 =====
    public static void main(String[] args) throws InterruptedException {
        Thread p0 = new Thread(() -> process(0));
        Thread p1 = new Thread(() -> process(1));
        p0.start();
        p1.start();
        p0.join();
        p1.join();

        System.out.println("result: " + count + "   (기대값 0)");
    }
}