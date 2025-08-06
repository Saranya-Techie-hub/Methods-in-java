package MethodsInJava;

class Maximum {
    
int max(int x, int y)
  {
  if(x > y)
   return x;
  else
   return y;
  }

    public static void main(String[] args) {
      int a = 10, b = 15, c;
      Maximum mx = new Maximum();

      c = mx.max (a, b);
      System.out.println("The maximum value is "+c);
    }
    
}