//Compare two numbers in java program 

import java.util.Scanner;

public class J0028CampareTwoNumber
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  int num1;	//first number 
  int num2;	//second number

  //input of first number
  System.out.println("\n Enter the 1st number:- ");
  num1 = input.nextInt();

  //input of second number
  System.out.println("\n Enter the 2nd number:- ");
  num2 = input.nextInt();

  if(num1 == num2)
 	System.out.println("Both number are equal");
  else if(num1 > num2)
 	System.out.println("1st number is greater than 2nd number");
  else if(num1 < num2)
	System.out.println("2nd number is greater than 1st number");
  else
	System.out.println("invalid input");
  }
}
