package Os.philosopher;

// ===== 원형 식탁 (수정하지 않아도 됩니다) =====
class Table {
    private final Fork[] forks;

    Table(int n) {
        forks = new Fork[n];
        for (int k = 0; k < n; k++) forks[k] = new Fork(k);
    }

    Fork leftFork(int seat)  { return forks[seat]; }                      // fork[i]
    Fork rightFork(int seat) { return forks[(seat + 1) % forks.length]; } // fork[(i + 1) % N]
}