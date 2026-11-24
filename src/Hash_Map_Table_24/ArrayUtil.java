package Hash_Map_Table_24;

class ArrayUtil {
    // TODO 1: static <T> void printArray(T[] arr) 를 작성한다
    static <T> void printArray(T[] arr){
        for(T t : arr){
            System.out.print(t + " ");
        }
        System.out.println();
    }
    // TODO 2: static <T> int countOf(T[] arr, T target) 을 작성한다
    static <T> int countOf(T[] arr, T target){
        int count = 0;
        for(T t : arr){
            if(t.equals(target)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 2, 2};
        String[] words = {"사과", "배", "사과", "포도"};

        printArray(nums);
        System.out.println("2의 개수 : " + countOf(nums, 2));

        printArray(words);
        System.out.println("사과의 개수 : " + countOf(words, "사과"));
    }
}