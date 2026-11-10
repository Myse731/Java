package Clone_String;
import java.lang.*;
import java.util.ArrayList;

class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(Integer.valueOf(5));
        list1.add(Integer.valueOf(4));
        list1.add(Integer.valueOf(2));
        list1.add(Integer.valueOf(0));
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4)); /* ① list1의 인덱스 1 이상 4 미만 구간을 복사한 새 ArrayList */;
        print(list1, list2);

        /* ② list1을 오름차순 정렬 */;
        list1.sort(null);
        /* ③ list2를 오름차순 정렬 */;
        list2.sort(null);
        print(list1, list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        /* ④ 인덱스 3 위치에 "A"를 끼워 넣기 */;
        list2.add(3, "A");
        print(list1, list2);

        /* ⑤ 인덱스 3의 요소를 "AA"로 바꾸기 */;
        list2.set(3, "AA");
        print(list1, list2);

        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 들어 있는 요소를 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            /* ⑥ list1이 list2의 i번째 요소를 포함하는지 */
            if (list1.contains(list2.get(i))){
                list2.remove(i);
            }
                /* ⑦ list2에서 i번째 요소를 삭제 */;
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();
    }
}