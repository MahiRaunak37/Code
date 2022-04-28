#include<stdio.h>
int main()
{
int arr[100],i,n,pos,value;
printf("\n\nEnter the array elements:");
scanf("%d",&n);
printf("\n\nEnter %d elements:",n);
for(i=0;i<n;i++)
scanf("%d",&arr[i]);
printf("\n\nEnter the location where we want to insert new element:");
scanf("%d",&pos);
printf("\n\nEnter the value to insert:");
scanf("%d",&value);
//shifting the element from the position to n to0 rigjht
for(i=i=n-1;i>=pos-1;i--)
arr[i+1]=arr[i];
arr[pos-1]=value; 
printf("\n\nResult are:\n");
/*The array size gets increased by 1
after insertion of the element
*/
for(i=0;i<=n;i++)
printf("%d\n",arr[i]);
return 0;
}
