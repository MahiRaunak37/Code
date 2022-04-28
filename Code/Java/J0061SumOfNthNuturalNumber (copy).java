import java.util.Scanner;
public class J0061SumOfNthNuturalNumber {
    static int sum(int n)
    {
        int s=0;
        if(n==1)
        {
            return s;
        }
        else{
         s = s + sum(n-1);
         return s;
        }

    }

    public static void main(String[] args)
    {
        int n,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Nth term:- ");
        n= input.nextInt();
        System.out.println("Sum of all Integers upto nth terms "+sum(n));
    }

    
}
