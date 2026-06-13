package ArrayList1;
import java.util.*;

// Java Program to Input and output 2d ArrayList
public class TowDArrayList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        // matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        // matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));

        int row = sc.nextInt(); //Input no. of rows
        int col = sc.nextInt(); //Input no. of cols

        for(int i=0;i<row;i++){
            ArrayList<Integer> rowList = new ArrayList<>();
            for(int j=0;j<col;j++){
                int n = sc.nextInt();
                rowList.add(n);
            }
            matrix.add(rowList);
        }

        //Third printing method
        for(ArrayList<Integer> rows:matrix){
            for(int element:rows){
                System.out.print(element);
            }
            System.out.println();
        }

        //First printing method
        // System.out.println(matrix);

        //Second printing method
        // for(ArrayList<Integer> row:matrix){
        //     System.out.println(row);
        // }
    }
}
// 3
// 3
// 1 2 3 
// 4 5 6
// 7 8 9
// 123
// 456
// 789

// [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

// [1, 2, 3]
// [4, 5, 6]
// [7, 8, 9]