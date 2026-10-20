package Os;

import java.util.concurrent.Semaphore;

// [3] 세마포어로 경쟁 상태 해결하기
// 실행: java SemaphoreCount.java
//
// semaphore S = 1;
// wait(S);            // 임계영역 진입 전
// critical_section();
// signal(S);          // 임계영역 종료 후
public class SemaphoreCount {
    static int count = 0;
    static Semaphore S = new Semaphore(1);   // 이진 세마포어, 초기값 1

    // 학습지와 같은 이름으로 쓰기 위한 함수 (Java의 Semaphore를 감쌈)
    static void wait(Semaphore s)   { s.acquireUninterruptibly(); }
    static void signal(Semaphore s) { s.release(); }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                wait(S);
                count++;          // critical section
                signal(S);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                wait(S);
                count--;          // critical section
                signal(S);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("result: " + count);
    }
}
