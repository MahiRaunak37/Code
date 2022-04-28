//Program to calculate the area of polygon
import java.util.Scanner;
public class J0030AreaOfPolygon
{
 public static void main(String[] args)
 {
  double lengthOfSide,NoOfSide,AreaOfPolygon=0;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the Total sides of Regular Polygon:- ");
  NoOfSide = input.nextDouble();
  System.out.print("Enter the length of side of Regluar Polygon:- ");
  lengthOfSide = input.nextDouble(); 
  //Area of Polygon
  AreaOfPolygon = (float)(NoOfSide*lengthOfSide*lengthOfSide)/(4*Math.tan(Math.PI/NoOfSide));
  System.out.println("Area of the Polygon " + AreaOfPolygon); 
 }
}

