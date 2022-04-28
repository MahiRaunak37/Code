/*
  Assignment of Design & Analysis of Alorithms
 4. Write a program that sorts a list of integers using quicksort
 compiled by:- Ashish Ranjan    Enrollment no:- CUSB2002312009
*/

#include<stdio.h>

void quickSort(int arr[100],int n,int i);				//function prototype

int main()
{
  int arr[100],n,i;						//Identifiers

  printf("Enter size of the Array:-  ");			//Total no. of element in arrray
  scanf("%d",&n);

  for(i = 0; i < n; i++)					//Inserting element in Array
  {
   printf("Enter the element ar position arr[%d]:-  ",i); 
    scanf("%d",&arr[i]);
  }

  quickSort(arr,0,n-1);						//Function call

  printf("After Sorting of Array :-  ");

  for(i = 0; i < n; i++)					//Displaying the element after sort
    printf(" %d",arr[i]);

  return 0;
}

void quickSort(int arr[100],int beg,int last)			//definition of  quicksort 
{
    int pivot,left,right,temp;					//creating a pivot variable and  takes it on left

     if(beg< last)
	{
         pivot = beg;
         left = beg;
         right = last;

         while(left < right)
	  {
             while(arr[left] <= arr[pivot] && left < last)	//if arr[left] is less then the arr[pivot] then increment in left by 1
                 left++;
             while(arr[right] > arr[pivot])			//if arr[right] is greater then the arr[pivot] then decrement in right
                 right--;
             if(left <right)					//swapping of the elements
		{
                  temp = arr[left];
                  arr[left] = arr[right];
                  arr[right] = temp;
                }
           }

         temp = arr[pivot];
         arr[pivot] = arr[right];
         arr[right] = temp;
         quickSort(arr,beg,right-1);				//recursive call of quickSort function after the element 
         quickSort(arr,right+1,last);				//of pivot takes its location
    }
}
