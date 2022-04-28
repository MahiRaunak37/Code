import java.util.Scanner;

public class J0060PracticeSet {
    static void table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n);
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        n = input.nextInt();
        table(n);
    }
    
}
