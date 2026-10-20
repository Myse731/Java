package Os.producerconsumer;

class Producer implements Runnable {
    private final Buffer buffer;
    private final int count;        // 만들 물건 개수

    Producer(Buffer buffer, int count) {
        this.buffer = buffer;
        this.count = count;
    }

    @Override
    public void run() {
        for (int item = 1; item <= count; item++) {
            sleep(100);             // 생산 (빠름)
            buffer.put(item);
        }
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}