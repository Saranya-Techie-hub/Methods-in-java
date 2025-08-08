
package MethodsInJava;
import java.util.Scanner;

public class GreatestCommonDivisor {
    static int gcd(int m, int n)
    {
        while(m != n)
        {
            if(m > n)
                m-=n;
            else
                n-=m;
        }
        return m;
    }
    public static void main(String args[])
    {
        System.out.println("Enter the values of m and n");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("The result is "+ gcd(m, n));
        sc.close();
    }
    
}
