package ArrayList1;
import java.util.*;

// Java Program to Remove duplicates

public class RemoveDuplicates{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,4,5));

        HashSet<Integer> set = new HashSet(list);

        ArrayList<Integer> result = new ArrayList<>(set);

        System.out.println(result);
    }
}
// [1, 2, 3, 4, 5]
