import java.util.Scanner;
public class J00532DArrays {
    public static void main(String[] args){
        int flat[][] = new int[2][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value at given location");
        
        for(int i=0;i<flat.length;i++)
        {
            for(int j=0;j<flat[i].length;j++)
            {
                System.out.print("Enter the value at location ["+i+"]["+j+"]:- ");
                flat[i][j]= input.nextInt();
            }
        }

        System.out.println("\n Value at location:- \n");
        for(int i=0;i<flat.length;i++)
        {
            for(int j=0;j<flat[i].length;j++)
            {
                System.out.print(flat[i][j]+"\t");
            }
            System.out.println("");
        }

    }
    
}
