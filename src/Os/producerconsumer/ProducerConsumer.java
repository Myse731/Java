package Os.producerconsumer;

// [4] 생산자-소비자 문제 — 정답

// 클래스 구성
//   ProducerConsumer : 프로그램 시작. 버퍼를 만들고 생산자·소비자 스레드를 실행 (main)
//   Buffer           : 공유 버퍼 + 세마포어 3개. put()으로 넣고 take()로 꺼냄
//   Producer         : 생산자 = 스레드 1개. 물건을 만들어 buffer.put()
//   Consumer         : 소비자 = 스레드 1개. buffer.take()로 꺼내서 소비

// ===== 프로그램 시작 (수정하지 않아도 됩니다) =====
public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer(5);                              // 버퍼 크기 5

        Thread c = new Thread(new Consumer(buffer, 10), "소비자");   // 10개 꺼내기
        Thread p = new Thread(new Producer(buffer, 10), "생산자");   // 10개 만들기
        c.start();                                                  // 소비자가 먼저 시작
        p.start();

        p.join();
        c.join();
        System.out.println("끝!");
    }
}