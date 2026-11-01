package Os.philosopher;

// [6] 식사하는 철학자 문제 (객체 지향 버전)
// 클래스 구성
//   Kitchen     : 식당. 식탁을 차리고 철학자들을 앉혀 식사를 시작시킴 (main)
//   Table       : 원형 식탁. 포크 N개를 놓고, 자리마다 왼쪽·오른쪽 포크를 알려 줌
//   Fork        : 포크 1개 = 이진 세마포어 1개. 집기(wait) / 내려놓기(signal)
//   Philosopher : 철학자 1명 = 스레드 1개. 생각 → 포크 2개 집기 → 식사 → 포크 내려놓기

// ===== 식당: 프로그램 시작 (수정하지 않아도 됩니다) =====
public class Kitchen {
    static final int N = 5;   // 철학자 수 = 포크 수

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table(N);                    // 식탁 차리기 (포크 N개)

        Thread[] threads = new Thread[N];
        for (int i = 0; i < N; i++) {
            Philosopher p = new Philosopher(i, table); // i번 자리에 철학자 앉히기
            threads[i] = new Thread(p);                // 철학자 1명 = 스레드 1개
            threads[i].start();
        }

        for (Thread t : threads) t.join();
        System.out.println("모든 철학자 식사 완료!");
    }
}