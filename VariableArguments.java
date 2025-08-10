package MethodsInJava;

public class VariableArguments {
    static void show(int...x)
    {
        for(int a : x)
            System.out.print(a+" ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        show();
        show( 30, 40, 50);
        show(new int[]{1,2,3,4,5,6,7,8,9});
    }
}
