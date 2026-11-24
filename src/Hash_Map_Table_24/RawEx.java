package Hash_Map_Table_24;
import java.util.*;

class RawEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("포도");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String fruit = it.next(); //(String 형 변환 사라짐)
            System.out.println(fruit + " : " + fruit.length() + "글자");
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("김자바", 90);
        map.put("이자바", 85);

        Iterator<String> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            String name = it2.next(); //(String 형 변환 사라짐)
            int score = map.get(name); //(Integer 형 변환 사라짐)
            System.out.println(name + " : " + score);
        }
    }
}