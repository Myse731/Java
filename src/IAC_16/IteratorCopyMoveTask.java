package IAC_16;
import java.util.*;

class IteratorCopyMoveTask {
    public static void main(String[] args) {
        ArrayList original = new ArrayList();
        ArrayList copy1 = new ArrayList();
        ArrayList copy2 = new ArrayList();

        // TODO 1: original에 0부터 9까지 Integer.valueOf()로 추가한다
        for(int i = 0; i < 10; i++){
            original.add(Integer.valueOf(i));
        }
        System.out.println("= Original에서 copy1로 복사(copy) =");
        // TODO 2: Iterator로 original을 읽어 copy1에 add한다 (original은 그대로)
        Iterator it1 = original.iterator();
        while(it1.hasNext()){
            Object ob = it1.next();
            copy1.add(ob);
        }
        System.out.println("original:" + original);
        System.out.println("copy1:" + copy1);

        System.out.println();
        System.out.println("= Original에서 copy2로 이동(move) =");
        // TODO 3: 새 Iterator로 original을 읽어 copy2에 add하고, remove()로 original에서 지운다
        Iterator it2 = original.iterator();
        while(it2.hasNext()){
            Object ob = it2.next();
            copy2.add(ob);
            it2.remove();
        }
        System.out.println("original:" + original);
        System.out.println("copy2:" + copy2);
    }
}