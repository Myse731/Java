package DAY11_11;
import java.util.*;

interface Chargeable{
    int cost();
}

abstract class PrintJob implements Chargeable{
    final int id;
    private static int i = 1;
    String fileName;
    int pages;
    PrintJob(String fn, int p) throws Exception{
        this.fileName = fn;
        if(p > 0){
            this.pages = p;
        }
        else{
            throw new Exception("페이지 수가 올바르지 않습니다: " + fn);
        }
        this.id = i++;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof PrintJob){
            PrintJob target = (PrintJob)obj;
            return Objects.equals(this.fileName, target.fileName);
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        //내용 어떻게 써야 할지 모르곘음
        return Objects.hash(fileName);
    }

    @Override
    public String toString(){
        return String.format("#%d %s(%d쪽, %d원)", id, fileName, pages, cost());
    }
}

class BlackJob extends PrintJob{
    BlackJob(String fn, int p) throws Exception{
        super(fn, p);
    }

    @Override
    public int cost(){
        return pages * 50;
    }
}

class ColorJob extends PrintJob{
    ColorJob(String fn, int p) throws Exception{
        super(fn, p);
    }

    @Override
    public int cost(){
        return pages * 200;
    }

    @Override
    public String toString(){
        return "[컬러] " + super.toString();
    }
}

class Printer{
    Queue<PrintJob> queue = new LinkedList<>();
    Stack<PrintJob> stack = new Stack<>();
    int totalCost = 0;

    void addJob(PrintJob job){
        if(queue.contains(job)){
            System.out.println("이미 대기 중인 파일: " + job.fileName);
            return;
        }
        queue.offer(job);
        stack.push(job);
        System.out.println("대기 등록: " + job);
    }

    void printNext(){
        if(queue.isEmpty()){
            System.out.println("대기 중인 작업이 없습니다.");
            return;
        }
        PrintJob job = queue.poll();
        totalCost += job.cost();
        System.out.println("인쇄: " + job);
    }

    void cancelLast(){
        if(stack.isEmpty()){
            System.out.println("취소할 작업이 없습니다.");
            return;
        }
        PrintJob job = stack.pop();
        if(queue.remove(job)){
            System.out.println("취소: " + job);
        }
        else{
            System.out.println("이미 인쇄된 작업: " + job);
        }
    }

    void status(){
        System.out.println("대기 " + queue.size() + "건 / 누적 비용 " + totalCost + "원");
    }
}
public class PrinterTest {
    static void register(Printer p, String type, String file, int pages) {
        try {
            PrintJob job = type.equals("컬러")
                    ? new ColorJob(file, pages)
                    : new BlackJob(file, pages);
            p.addJob(job);
        } catch (Exception e) {
            System.out.println("등록 실패: " + e.getMessage());
        }


    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        register(printer, "흑백", "보고서.pdf", 10);
        register(printer, "컬러", "포스터.png", 2);
        register(printer, "흑백", "보고서.pdf", 10);
        register(printer, "흑백", "빈문서.txt", 0);
        register(printer, "흑백", "메모.txt", 3);
        printer.status();

        printer.printNext();
        printer.cancelLast();
        printer.cancelLast();
        printer.cancelLast();
        printer.printNext();
        printer.status();
    }
}

