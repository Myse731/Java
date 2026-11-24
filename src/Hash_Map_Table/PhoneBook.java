package Hash_Map_Table;
import java.util.*;

public class PhoneBook {
    static HashMap phone = new HashMap();

    static void addPhoneNo(String name, String tel){
        addPhoneNo("기타", name, tel);
    }

    static void addPhoneNo(String group, String name, String tel){
        if(!phone.containsKey(group)){
            phone.put(group, new HashMap());
        }
        HashMap subMap = (HashMap) phone.get(group);
        subMap.put(tel, name);
    }

    static void printList(){
        Iterator it1 = phone.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry e = (Map.Entry) it1.next();
            HashMap subMap = (HashMap) e.getValue();
            System.out.println(" * " + e.getKey() + " [" + subMap.size() + "]");
            Iterator it2 = subMap.entrySet().iterator();
            while(it2.hasNext()){
                Map.Entry e2 = (Map.Entry) it2.next();
                System.out.println(e2.getValue() + " " + e2.getKey());
            }
            System.out.println();
        }
    }

    static void main() {
        addPhoneNo("친구", "이자바", "010-111-1111");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-333-3333");
        addPhoneNo("회사", "김대리", "010-444-4444");
        addPhoneNo("회사", "김대리", "010-555-5555");
        addPhoneNo("회사", "박대리", "010-666-6666");
        addPhoneNo("회사", "이과장", "010-777-7777");
        addPhoneNo("세탁", "010-888-8888");
        printList();
    }
}