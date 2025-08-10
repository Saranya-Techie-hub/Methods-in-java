package MethodsInJava;

public class MethodOverloading2 {
    static int reverse(int num)
    {
        int rev = 0;
        while(num > 0)
        {
           rev = rev*10+(num%10);
           num /=10;
        }
        return rev;
    }
    static int[] reverse(int[] A)
    {
        int[] B = new int[A.length];
        for(int i = A.length-1, j = 0;i >= 0; i--, j++)
        {
            B[j] = A[i];
        }
        return B;
    }
    
    public static void main(String args[])
    {
        System.out.println(reverse(1879340));
        int A[] = {1,2,3,4,5,6};
        int[] Arr = reverse(A);
        for(int x:Arr)
        {
            System.out.print(x +" ");
        }
    }
}
