#include <stdio.h>
int main()
{
	int arr[100],i,pos,value,n;
	printf("Enter the array element:\n");
	scanf("%d",&n);
	printf("\n\nEnter %d Elements:",n);
	for(i=0;i<n;i++)
	scanf("%d",&arr[i]);
	printf("\n\nEnter the location where we want to delete:");
	scanf("%d",&pos);
	printf("\n\n Enter the value to delete:");
	scanf("%d",&value);
	for(i=pos;i<n-1;i++)
	arr[i]=arr[i+1];
	n=n-1;
	printf("Result:\n");
	for(i=0;i<n;i++)
	printf("%d\n",arr[i]);
	return 0;
}
