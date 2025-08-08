package MethodsInJava;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int num)
    {
        for(int i = 2; i <= num/2;i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(isPrime(n))
            System.out.println(n+ " is a prime number");
        else
            System.out.println(n+" is a non prime number");
        sc.close();
        
    }
    
}
