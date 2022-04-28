import java.util.Scanner;

public class J0038SumOfThreeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,sum;
        System.out.println("Enter the 1st number:- ");
        n1 = input.nextInt();
        System.out.println("Enter the 2nd number:- ");
        n2 = input.nextInt();
        System.out.println("Enter the 3rd number:- ");
        n3 = input.nextInt();

        sum = n1+n2+n3;

        System.out.println("Sum of three number is "+sum);
    }

}
