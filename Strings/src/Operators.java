import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        String name = "Akshay";
        String newName = "Yelle";
        System.out.println(name+" "+newName);

        System.out.println('a' + 'b');
        System.out.println('a' - 'b');

        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a" + 1);
        System.out.println("Akshay" + new ArrayList<Integer>(){});
        System.out.println(34+""+new ArrayList<>());
//         ' + ' operator only works for primitives

    }
}
