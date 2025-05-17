//wap a method called alternte that accepts two lists of integers as  its parameters and returns a new list containing alternating elements from the two lists , in the following order first element from first  list first element from second 
import java.util.*;
public class AlternateList {
    
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int size = Math.max(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            if (i < list1.size()) {
                result.add(list1.get(i));
            }
            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> result = alternate(list1, list2);
        System.out.println("Alternating merged list: " + result);
    }
}
