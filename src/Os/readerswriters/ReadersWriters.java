package Os.readerswriters;

// [5] 읽기-쓰기 문제 (읽기 우선)
// 클래스 구성
//   ReadersWriters : 프로그램 시작. 공유 데이터를 만들고 읽기·쓰기 스레드를 실행 (main)
//   SharedData     : 공유 데이터 + 세마포어(wrt, mutex) + readcount. read()로 읽고 write()로 씀
//   Reader         : 읽기 프로세스 = 스레드 1개. data.read()
//   Writer         : 쓰기 프로세스 = 스레드 1개. data.write()

// ===== 프로그램 시작 (수정하지 않아도 됩니다) =====
public class ReadersWriters {
    public static void main(String[] args) throws InterruptedException {
        SharedData data = new SharedData();

        Thread[] t = {
                new Thread(new Reader(data, 3), "R1"),   // 3번 읽기
                new Thread(new Reader(data, 3), "R2"),
                new Thread(new Reader(data, 3), "R3"),
                new Thread(new Writer(data, 2), "W1"),   // 2번 쓰기
                new Thread(new Writer(data, 2), "W2"),
        };
        for (Thread th : t) th.start();
        for (Thread th : t) th.join();
        System.out.println("끝!");
    }
}
