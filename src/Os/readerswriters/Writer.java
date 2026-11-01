package Os.readerswriters;

// ===== 쓰기 프로세스 (수정하지 않아도 됩니다) =====
class Writer implements Runnable {
    private final SharedData data;
    private final int times;          // 쓸 횟수

    Writer(SharedData data, int times) {
        this.data = data;
        this.times = times;
    }

    @Override
    public void run() {
        for (int k = 0; k < times; k++) {
            sleep((long) (Math.random() * 500));
            data.write();
        }
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}