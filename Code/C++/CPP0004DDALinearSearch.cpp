/*
Linear search
step 1.	i = 1							//initial value of i is 1
step 2.	while(i<=n)						//looping of array 
step 3.	if(a[i] ==x){ return(i)}				//condition checking if condition
step 4. else {i = i+1}						//if if condition will be false then execute else part
step 5. return (-1)						//no. not found
*/

#include <iostream>
using namespace std;

int main()
{
 int i,n,x,arr[10];
 cout<<"Enter the size of array between 0 to 10:- ";
 cin>>n;

 for(i=1;i<=n;i++)
 {
  cout<<"\n Enter the value at location ["<<i<<"] ";
  cin>>arr[i];
 }

 cout<<endl<<"Element is Array are:- "<<endl;
 for(i=1;i<=n;i++)
	cout<<"\t\t"<<arr[i];

 cout<<"\n Enter the no. to search:- ";
 cin>>x;

 int flag =0;
 for(i=1;i<=n;i++)
 {
  if(arr[i] == x)
  {
   flag = 1;
   break;
   }
 }

 if(flag ==1)
  cout<<x<<" is found at location "<<i<<endl;
 else
  cout<<x<<" is not found"<<endl;
/* while(i<=n)
 {
  if(arr[i] == x)
  {
   flag = 1;
   break;
  }
  else
	i++;
 }
 if(flag == 1)
	cout<<x<<" is found at"<<i<<"th position";
 else
	cout<<x<<" is not found";
*/
 return 0;
}

