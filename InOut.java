// Java program to take Arraylist input and print output

package ArrayList1;
import java.util.*;

public class InOut{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        System.out.println("---------------");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        System.out.println("===============");
        System.out.println(list);
    }
}
// 3
// ---------------
// 1
// 2
// 3
// ===============
// [1, 2, 3]
public clas Main{

    public static int findSum(ArrayList<Integer> list){
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>():
        
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        findSum(list);
    }
}

Good attempt! You have the right idea: create a method, pass the `ArrayList`, and calculate the sum. There are several syntax and logic errors, though.

### Errors in your code

1. `clas` → should be `class`
2. Missing imports:

   ```java
   import java.util.*;
   ```
3. `iKlist.size` → should be:

   ```java
   i < list.size()
   ```
4. `System.err.println(sum);`

   * The method is supposed to **return** the sum.
5. Missing:

   ```java
   return sum;
   ```
6. `New` → should be `new`
7. `:` → should be `;`
8. `for(int i=0i<n;i++)`

   * Missing semicolon after `0`
9. `findSum(list);`

   * You are ignoring the returned value.

---

### Correct Version

```java
import java.util.*;

public class Main {

    public static int findSum(ArrayList<Integer> list) {
        int sum = 0;

        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int result = findSum(list);

        System.out.println(result);
    }
}
```

---

### Even Better (Enhanced For Loop)

```java
public static int findSum(ArrayList<Integer> list) {
    int sum = 0;

    for(int num : list) {
        sum += num;
    }

    return sum;
}
```

---

### Small Practice Task

Write a method:

```java
public static int findMax(ArrayList<Integer> list)
```

Input:

```text
5
10 25 7 40 18
```

Output:

```text
40
```

    

Try it yourself without looking up the answer. After you send your code, I'll review it and then we'll move to **ArrayList methods (`get`, `set`, `remove`) and 2D ArrayLists**.
