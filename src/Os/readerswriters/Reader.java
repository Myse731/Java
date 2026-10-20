package Os.readerswriters;
// ===== 읽기 프로세스 (수정하지 않아도 됩니다) =====
class Reader implements Runnable {
    private final SharedData data;
    private final int times;          // 읽을 횟수

    Reader(SharedData data, int times) {
        this.data = data;
        this.times = times;
    }

    @Override
    public void run() {
        for (int k = 0; k < times; k++) {
            sleep((long) (Math.random() * 300));
            data.read();
        }
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}