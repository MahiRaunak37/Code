/*
execute concept in DDA
step1.		i = 1			1		//initinal state of i
step2.		if i>n go to step 6	n+1		//condition checkup
step3.		a = b+c			n		//operation applied
step4.		i = i+1			n		//increment in i
step5.		goto step 2.		n		//after all return to step2
step6.		exit			1		//When the condition will be false then exit from the loop
*/
#include <iostream>
using namespace std;

int main()
{
 int i=1 ,sum = 0, n;
 cout<<"\n Enter the value of n: ";
 cin>>n;

 while(i<=n)
 {
  sum = sum +i;
  i++;
 }
 cout<<"\n sum:- "<<sum;
 return 0;
}
