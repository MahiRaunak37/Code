//Check the input is integer or not using hasNextInt() methods in Scanner class

import java.util.Scanner;

public class J0039hasNextInt {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Boolean n1;
        System.out.println("Check the number is  integer or not ");
        n1 = input.hasNextInt();
        if(n1==true)
        {
            System.out.println("Number is Integer.");
        }
        else
        {
            System.out.println("Number is not Integer.");
        }
    }
    
}
