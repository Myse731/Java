class Movies {
    String title;
    int runningTime;

    Movies() {
        // 제목: 미정, 상영 시간: 0으로 초기화
        this("미정", 0);
    }

    Movies(String title) {
        // 전달받은 제목, 상영 시간: 0으로 초기화
        this(title, 0);
    }

    Movies(String title, int runningTime) {
        this.title = title;
        this.runningTime = runningTime;
    }
}