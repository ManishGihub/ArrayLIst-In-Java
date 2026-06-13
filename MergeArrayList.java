package ArrayList1;
import java.util.*;

// Java Program to merge 2 ArrayLists
public class MergeArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));

        list1.addAll(list2);
        System.out.println(list1);
    }
}
// [1, 2, 3, 4, 5, 6]
