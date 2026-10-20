package Os;

// [1] 경쟁 상태 — 같이 쳐 보기
// 실행: java RaceCondition.java
public class RaceCondition {
    static int count = 0;   // 공유 변수

    public static void main(String[] args) throws InterruptedException {
        // TODO 1: count를 100000번 1씩 "증가"시키는 스레드 t1 만들기
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < 1000000; i++){
                count ++;
            }
        });

        // TODO 2: count를 100000번 1씩 "감소"시키는 스레드 t2 만들기
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 1000000; i++){
                count --;
            }
        });


        // TODO 3: 두 스레드 실행하기 (start)
        t1.start();
        t2.start();

        // TODO 4: 두 스레드가 끝날 때까지 기다리기 (join)
        t1.join();
        t2.join();

        System.out.println("result: " + count);   // 0이 나와야 하는데...?
    }
}
