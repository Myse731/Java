package Os.philosopher;

import java.util.concurrent.Semaphore;

// ===== 포크 = 이진 세마포어 =====
class Fork {
    private final int id;
    private final Semaphore semaphore = new Semaphore(1);   // 1 = 사용 가능

    Fork(int id) { this.id = id; }

    void pickUp() {
        // TODO 1: 포크 집기 = 세마포어 wait

    }

    void putDown() {
        // TODO 2: 포크 내려놓기 = 세마포어 signal

    }

    private static void wait(Semaphore s)   { s.acquireUninterruptibly(); }
    private static void signal(Semaphore s) { s.release(); }

    @Override
    public String toString() { return "fork[" + id + "]"; }
}