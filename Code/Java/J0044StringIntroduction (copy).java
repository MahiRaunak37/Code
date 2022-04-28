import java.util.Scanner;
public class J0044StringIntroduction {
    public static void main(String[] args)
    {
        String name3,name4;

        Scanner input = new Scanner(System.in);

        String name1 = new String("Mahi Raunak");
        System.out.println(name1);

        String name2 = "mahi Raunak";
        System.out.println(name2);

        System.out.println("Enter the string:- ");
        name3 =input.next();
        System.out.println(name3);

        System.out.println("Enter the second String");
        name4 = input.nextLine();
        System.out.println(name4);
    }
    
}
