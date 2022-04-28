import java.util.Scanner;

public class J0059FibonacciSeries {
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter the value of n:- ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        fibonacci(n);
    }
     
    public static void fibonacci(int n)
    {
        int n1= 0, n2 = 1, n3;
        System.out.print(n1+"  "+n2+" ");
        for(int i=0;i<n;i++)
        {
           n3 = n1+n2;
           System.out.print("  "+n3);
           n1 = n2;
           n2 = n3;
        }
 }
    
}
