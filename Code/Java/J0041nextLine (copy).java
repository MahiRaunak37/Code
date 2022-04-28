//input of Line using nextLine() in java class

import java.util.Scanner;

public class J0041nextLine {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.println("Enter the String:- ");
        str = input.nextLine();
        System.out.println("String is:- "+str);

    }    
}
