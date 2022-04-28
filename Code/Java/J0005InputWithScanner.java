//Input with Scanner file in Java
import java.util.Scanner;
public class J0005InputWithScanner
{
  public static void main(String[] args)
  {
	int a,b,c;
	String S1,S2;
	System.out.println("Enter two number");
	a = new Scanner(System.in).nextInt();
	b = new Scanner(System.in).nextInt();
	c = a + b;
	System.out.println("The sum is "+c);
   }
}

