//Calculate the ASCII value
import java.util.Scanner;

public class J0035PrintASCIIValue
{
 public static void main(String[] args)
 {
  char ch;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the Character:- ");
  ch = input.next().charAt(0);
  int chr = ch;
  System.out.println("ASCII character of "+ch+":- "+chr);
 }
}
