package Os.producerconsumer;

// ===== 소비자 (수정하지 않아도 됩니다) =====
class Consumer implements Runnable {
    private final Buffer buffer;
    private final int count;        // 꺼낼 물건 개수

    Consumer(Buffer buffer, int count) {
        this.buffer = buffer;
        this.count = count;
    }

    @Override
    public void run() {
        for (int k = 1; k <= count; k++) {
            buffer.take();
            sleep(300);             // 소비 (느림)
        }
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}