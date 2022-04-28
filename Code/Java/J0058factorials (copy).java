import java.util.Scanner;

public class J0058factorials {
    static int factorial(int n){
        if(n==1 || n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        n = input.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }
    
}
