//Take the input form the user and Reverse the string
import java.util.Scanner;
public class J0031ReverseTheString
{
 public static void main(String[] agrs)
 {
  String s;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the String:- ");
  s = input.nextLine();
  char[] letters = s.toCharArray();
  System.out.print("Reverse String:- ");
  for(int i = letters.length -1;i>=0;i--)
   {
    System.out.print(letters[i]);
   }
 }
}
