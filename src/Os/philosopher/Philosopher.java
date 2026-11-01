package Os.philosopher;

// ===== 철학자 = 스레드 =====
class Philosopher implements Runnable {
    private final int id;
    private Fork first;    // 먼저 집을 포크
    private Fork second;   // 나중에 집을 포크

    Philosopher(int id, Table table) {
        this.id = id;
        Fork left = table.leftFork(id);
        Fork right = table.rightFork(id);

        first = left;
        second = right;

        // TODO 6 (교착 상태를 확인한 뒤에): 해결책(1)
        //   홀수 번호 철학자는 오른쪽 포크를 먼저 집도록 first, second 바꾸기

    }

    @Override
    public void run() {
        for (int m = 1; m <= 3; m++) {
            think();
            eat(m);
        }
    }

    private void think() {
        sleep((long) (Math.random() * 50));
    }

    private void eat(int m) {
        // TODO 3: 먼저 집을 포크(first) 집기
        first.pickUp();

        System.out.println(this + ": " + first + " 집음 → " + second + " 기다림");
        sleep(100);                       // 머뭇거림

        // TODO 4: 나중에 집을 포크(second) 집기
        second.pickUp();


        System.out.println(this + ": 🍝 식사 중 (" + m + "번째)");
        sleep(200);

        // TODO 5: 포크 2개 내려놓기 (2줄)


    }

    @Override
    public String toString() { return "P" + id; }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}