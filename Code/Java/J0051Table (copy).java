import java.util.Scanner;

public class J0051Table {
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        n = input.nextInt();
        for(int i=10;i>=1;i--)
        {
            System.out.println(n*i);
        }

    }
    
}
