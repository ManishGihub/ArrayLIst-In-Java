package ArrayList1;
import java.util.*;

// Java Program to find second largest element
public class SecondLargestNo{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,1,23,12,7));

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-2));
    }
}
// [1, 5, 7, 12, 23]
// 12