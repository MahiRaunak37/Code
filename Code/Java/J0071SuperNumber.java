import java.util.Scanner;
public class J0071SuperNumber {

public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=s.nextInt();
    int count=1;
    while(num>0){
        num%=10;
        count++;
    }       
    J0071SuperNumber k=new J0071SuperNumber();
    k.Super(num,count);
    boolean check=k.Super(num,count);
    if(check==true)
        System.out.println("The entered number is a Super number");
    else
        System.out.println("The entered number is not a Super number");

}
int Super(int num,int count){
int test=num;
int a=0,sum=0;
while(num>0){
a=num%10;
num/=10;
count--;
sum+= Math.pow(a, count);
}
if(sum==test)
return 1 ;
else 
return 0;

}
}