package MethodsInJava;

public class MethodOverloading3 {
    static boolean valid(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean valid(int age)
    {
        return age >= 3 && age <=15;
    }
    public static void main(String args[])
    {
        if(valid("saranya"))
            System.out.println("Valid Name");
        else
            System.out.println("Invalid Name");
        if(valid(17))
            System.out.println("Valid Age");
        else
            System.out.println("Invalid Age");
    }
}
