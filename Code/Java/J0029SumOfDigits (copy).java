//sum of all digits in java program
import java.util.Scanner;
public class J0029SumOfDigits
{
 public static void main(String[] args)
 {
  int num,sum=0;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number:- ");
  num = input.nextInt();
  while(num>0)
  {
   sum = sum + num%10;
   num = num/10;
  }
  System.out.println("Sum of the Digit of given number:- "+sum);
 }
}
