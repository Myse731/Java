package IAC_16;
import java.util.*;

class BingoTask {
    public static void main(String[] args) {
        Set set = new HashSet();

        // TODO 1: set의 크기가 25가 될 때까지 1~50의 랜덤 숫자를 add한다
        while(set.size() < 25){
            double Random = Math.random();
            int num = (int) (Random * 50) + 1;
            set.add(num);
        }
        Iterator it = set.iterator();
        int count = 0;
        // TODO 2: Iterator로 읽으면서 5개를 출력할 때마다 줄을 바꾼다
        while(it.hasNext()){
            System.out.print(it.next() + " ");
            count++;
            if(count % 5 == 0){
                System.out.println();
            }
        }
    }
}