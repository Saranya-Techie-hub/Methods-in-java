package MethodsInJava;

public class VariableArguments1 {
     static void showList(int x, String...A)
    {
        for(String name : A)
        {
            System.out.println(x+"."+name);
            x++;
        }
            
        System.out.println();
    }
    public static void main(String[] args)
    {
        showList(1, "John","Smith","Albert", "Ronald","Harry");
    }
}
