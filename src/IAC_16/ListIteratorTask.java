package IAC_16;
import java.util.*;

class ListIteratorTask {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // TODO 1: 10, 20, 30, 40, 50을 Integer.valueOf()로 추가한다
        list.add(Integer.valueOf("10"));
        list.add(Integer.valueOf("20"));
        list.add(Integer.valueOf("30"));
        list.add(Integer.valueOf("40"));
        list.add(Integer.valueOf("50"));
        ListIterator it = list.listIterator();
        // TODO 2: 순방향(hasNext, next)으로 모두 출력하고 줄을 바꾼다
        while(it.hasNext()){
            Object obj = it.next();
            System.out.print(obj + " ");
        }
        System.out.println();
        // TODO 3: 역방향(hasPrevious, previous)으로 모두 출력하고 줄을 바꾼다
        while(it.hasPrevious()){
            Object obj = it.previous();
            System.out.print(obj + " ");
        }
    }
}