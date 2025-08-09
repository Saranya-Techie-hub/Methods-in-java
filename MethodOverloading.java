package MethodsInJava;

public class MethodOverloading {
    int max(int x, int y)
    {
        return x > y ? x:y;
    }
    float max(float x, float y)
    {
        return x > y ? x:y;
    }
    int max(int x, int y, int z)
    {
        return x>y && x>z ?x: y>z? y:z;
    }
    public static void main(String args[])
    {
        int x = 15, y =10;
        MethodOverloading mp = new MethodOverloading();
        System.out.println(mp.max(x, y));  
        System.out.println(mp.max(10.5f, 12.7f));
        System.out.println(mp.max(19, 30, 12));
    }
}
