import java.util.Scanner;
public class J0054ArraysPractices {
    public static void main(String[] args) {
        float sum = 0f;
        Scanner input = new Scanner(System.in);
        float arr[] = new float[5];
        for(int i = 0;i<5;i++)
        {
            System.out.print("Enter the value at poistion ["+i+"]:- ");
            arr[i] = input.nextFloat();
        }
        for(int i =0;i<5;i++)
        {
            sum = sum +arr[i];
        }
        System.out.println("Sum of the Element of Arrays are:- "+sum);

        //Searching the element in array;
        float search;
        boolean com = false;
        System.out.println("Enter the element to search in the array:- ");
        search = input.nextFloat();

        for(int i=0;i<arr.length;i++)
        {
            if(search == arr[i])
            {
                com = true;
                break;
               
            }
          
        }
        
        if(com)
        {
            System.out.println("Number is found");
        }
        else{
                
            System.out.println("Number is not found");
        }
    }
    
}
