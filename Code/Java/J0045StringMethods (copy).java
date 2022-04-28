import java.util.Scanner;

public class J0045StringMethods {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);                     //create a new Scanner which name as input
        String str;
        System.out.println("Enter the value of String:- ");
        str = input.nextLine();                                     //for line input

        System.out.println(str);
        System.out.println(str.length());                           //str.length() are use to calculate the length of the string

        System.out.println(str.toLowerCase());                      //str.toLowerCase are use to change the whole string in the lower case 

        System.out.println(str.toUpperCase());                       //str.toUpperCase are use to change the whole string in the upper case

        System.out.println(str.trim());                              //trim the String remove unwanted space

        //System.out.println(str.substring(beginIndex))    are use to show the string from index (beginIndex) to last
        System.out.println(str.substring(2));

        //System.out.println(str.substring(beginIndex, endIndex)) are use to show the string from index beginIndex to endIndex -1
        System.out.println(str.substring(2,7));

        //System.out.println(str.replace(arg0, arg1));     are use to replace the character arg0 to arg1 it should be words
        System.out.println(str.replace('a','p'));

        //System.out.println(str.startsWith(args));     its check the starting string and compare with args and return the boolean value according to condition.
        System.out.println(str.startsWith("rau"));
         
        //System.out.println(str.endsWith(suffix));     its check the ending string and compare with suffix and return the boolean value according to condition.
        System.out.println(str.endsWith("nak"));

        //System.out.println(str.charAt(index));         its return the character at index no. (index)
        System.out.println(str.charAt(3));

        //System.out.println(str.indexOf(value));               its return 1st index number of the given value
        System.out.println(str.indexOf(str));

        //System.out.println(str.indexOf(ch, fromIndex));         its return 1st ch from index fromIndex
        System.out.println(str.indexOf(str,2));

        //System.out.println(str.equals("string"));               check the str is equal to string then return true either wise false
        System.out.println(str.equals("string"));



    }
    
}
