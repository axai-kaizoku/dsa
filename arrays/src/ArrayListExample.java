import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(2);
        
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);

//        System.out.println(list.contains(4));
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }


//        System.out.println(list);

    }
}
