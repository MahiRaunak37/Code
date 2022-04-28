/*
  Assignment of Design & Analysis of Alorithms
 2. Write a program that sorts a list of integers using Selection sort
 compiled by:- Ashish Ranjan 	Enrollment no:- CUSB2002312009
*/
#include <stdio.h>
int main()
{
 int a[100], n, i, j, position, swap;				//Identifier declearation

 printf("Enter number of elements in List:- ");			//No. of element in the list
 scanf("%d", &n);

 for (i = 0; i < n; i++)					//Element insertion in the Array
  {
    printf("Enter the value at loaction a[%d]:- ",i);
    scanf("%d", &a[i]);
   }
								//selection sort starts
 for(i = 0; i < n - 1; i++)					//in selection sort total no of loop is always = (No. of element -1)
 {
  position=i;							//Assign the value of i in position for comparing 
  for(j = i + 1; j < n; j++)					//This this loop Elements are compare which next forward elements in the list.
  {
   if(a[position] > a[j])					//compare the positionth element to jth element in the list
     position=j;						//if element at position is greater than jth element then assign the position value =j
   }
   if(position!=i)						//when the value assign to the j then it is not equal to i in the list
   {
    swap=a[i];							//swap the element in the list
    a[i]=a[position];
    a[position]=swap;
  }
 }
  //Seleciton sort stop

 printf("After Sorting the list:- ");			//displaying the list 
 for(i = 0; i < n; i++)
   printf("%d \t", a[i]);

 return 0;
}
