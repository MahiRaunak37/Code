import java.util.Scanner;

public class J0049SumOfFirstnEvenNumbers {
    public static void main(String[] args)
    {
        int i=1, n, sum =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth terms:- ");
        n = input.nextInt();
        while(n>=i)
        {
            sum = sum +2*i;
            i++;
            //System.out.println(i);
        }
        System.out.println(sum);
    }
    
}
