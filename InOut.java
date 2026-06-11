package ArrayList1;
import java.util.*;

// Write a java program to take input and print output in using arraylist

public class InOut {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);
        for(int i:list){
            System.out.println(i);
        }
    }
}
// 3
// 1
// 2
// 3
// [1, 2, 3]
// 1
// 2
// 3

