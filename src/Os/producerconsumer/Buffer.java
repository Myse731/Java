package Os.producerconsumer;

import java.util.Arrays;
import java.util.concurrent.Semaphore;
// ===== 공유 버퍼 (원형 버퍼) =====
class Buffer {
    private final int[] items;      // 0 = 빈칸
    private int in = 0;             // 다음에 넣을 위치
    private int out = 0;            // 다음에 꺼낼 위치

    private Semaphore mutex;        // 버퍼 접근 상호 배제
    private Semaphore empty;        // 빈칸 수
    private Semaphore full;         // 채워진 칸 수

    Buffer(int size) {
        items = new int[size];

        // TODO 1: 세마포어 3개 만들기 — 초기값은 학습지 표를 보고 정하기 (버퍼 크기는 size)
        mutex = new Semaphore(1);
        empty = new Semaphore(size);
        full  = new Semaphore(0);


    }

    // 생산자가 부름
    void put(int item) {
        // TODO 2: 진입 (2줄) — 빈칸 기다리기 → 버퍼 잠그기
        wait(empty);
        wait(mutex);

        items[in] = item;           // buffer에 추가
        in = (in + 1) % items.length;
        System.out.println(Thread.currentThread().getName() + ": " + item + " 넣음   " + this);
        // TODO 3: 퇴장 (2줄) — 버퍼 풀기 → 물건이 생겼다고 알리기

        signal(mutex);
        signal(full);

    }

    // 소비자가 부름
    int take() {
        // TODO 4: 진입 (2줄) — 물건 기다리기 → 버퍼 잠그기
        wait(full);
        wait(mutex);

        int item = items[out];      // buffer에서 제거
        items[out] = 0;
        out = (out + 1) % items.length;
        System.out.println(Thread.currentThread().getName() + ": " + item + " 꺼냄   " + this);

        // TODO 5: 퇴장 (2줄) — 버퍼 풀기 → 빈칸이 생겼다고 알리기
        signal(mutex);
        signal(empty);

        return item;
    }
    private static void wait(Semaphore s)   { s.acquireUninterruptibly(); }
    private static void signal(Semaphore s) { s.release(); }

    @Override
    public String toString() { return Arrays.toString(items); }
}