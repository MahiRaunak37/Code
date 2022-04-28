import java.util.Scanner;
public class J0042CBSCPercentageCalculator {
    public static void main(String[] args)
    {
        float totalmarks,percentage;
        float sub1,sub2,sub3,sub4,sub5;
        
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter the full marks in one subject:- ");
        totalmarks = input.nextFloat();

        System.out.println("Enter the marks of 1st subject:- ");
        sub1 = input.nextFloat();
        System.out.println("Enter the marks of 2st subject:- ");
        sub2 = input.nextFloat();
        System.out.println("Enter the marks of 3st subject:- ");
        sub3 = input.nextFloat();
        System.out.println("Enter the marks of 4st subject:- ");
        sub4 = input.nextFloat();
        System.out.println("Enter the marks of 5st subject:- ");
        sub5 = input.nextFloat();
        if(sub1<=totalmarks && sub2<=totalmarks && sub3<=totalmarks && sub4<totalmarks && sub5<=totalmarks)
        {
            percentage = ((sub1+sub2+sub3+sub4+sub5)/(totalmarks*5))*100;
            
            System.out.println("Percentage:- "+percentage+"%");
        }

        else
        {
            System.out.println("Invalid input");
        }

    }
    
}
