package dsa;

/**
 * FuncOverLoading
 */
public class FuncOverLoading {

  public static void main(String[] args) {
    fun(10);
    fun("Akshay");
  }

  static void fun(int a) {
    System.out.println(a);
  }

  static void fun(String name) {
    System.out.println(name);
  }
}