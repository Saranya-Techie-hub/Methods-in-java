package MethodsInJava;
import java.util.Scanner;

public class ParameterPassing {
    void update(int []arr, int index, int val)
    {
        arr[index] = val;
    }

    public static void main(String[] args) {
        int []arr = {1, 3, 5, 7, 9, 11, 13};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to update");
        int index = sc.nextInt();
        System.out.println("Enter the value");
        int val = sc.nextInt();
        ParameterPassing mp = new ParameterPassing();
        mp.update(arr, index, val);
        for(int x : arr)
        {
            System.out.print(x+ " ");
        }
        sc.close();
    }
    
}
