// Abstract

abstract class calculator {
    abstract int add (int a, int b);
}

class Sum extends calculator {
    public int add (int a, int b) {
        return a+b;
    }
}

public class Exam {
    public static void main (String[] args){
        calculator obj = new Sum();
        System.out.println("The sum is: "+ obj.add(2,3));
    }
}