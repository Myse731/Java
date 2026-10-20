package Os.readerswriters;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

// ===== 공유 데이터 =====
class SharedData {
    private int data = 0;                                    // 공유 데이터

    private final Semaphore wrt   = new Semaphore(1);        // 읽기/쓰기 동시 사용 방지
    private final Semaphore mutex = new Semaphore(1);        // readcount 보호
    private int readcount = 0;                               // 지금 읽고 있는 수

    private final AtomicInteger reading = new AtomicInteger(); // 출력용: 실제로 읽는 중인 수

    // 읽기 프로세스가 부름
    void read() {
        String name = Thread.currentThread().getName();

        // TODO 1: 읽기 전 (4줄) — 첫 번째 읽기라면 쓰기를 막기



        // 읽기 수행
        System.out.println(name + ": 읽기 시작  data=" + data + "  (읽는 중 " + reading.incrementAndGet() + "명)");
        sleep(200);
        reading.decrementAndGet();

        // TODO 2: 읽은 후 (4줄) — 마지막 읽기라면 쓰기를 허용하기


    }

    // 쓰기 프로세스가 부름 (완성되어 있습니다)
    void write() {
        String name = Thread.currentThread().getName();

        wait(wrt);

        // 쓰기 수행
        data++;
        System.out.println("        " + name + ": 쓰기  data → " + data + "  (읽는 중 " + reading.get() + "명)");
        sleep(200);

        signal(wrt);
    }

    private static void wait(Semaphore s)   { s.acquireUninterruptibly(); }
    private static void signal(Semaphore s) { s.release(); }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}
