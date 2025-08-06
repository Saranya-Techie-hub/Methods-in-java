package MethodsInJava;

public class Increment {
    void increment(int x)
  {
   x++;
   System.out.println("After incrementing the value become " +x);
  }

    public static void main(String[] args) {
      int a = 10;
      Increment inc = new Increment();

      inc.increment (a);
      System.out.println("The original value of a is "+a);
    }
    
}
