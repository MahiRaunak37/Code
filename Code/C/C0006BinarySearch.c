//Assignment of Design & Analysis of Algorithms
//1. Write a program that searches a given number from a given sorted list of numbers using Binary Search
//Compiled by:Ashish Ranjan 	Enrollment no:- CUSB2002312009

#include<stdio.h>

int main()
{
   int first, last, middle, size, i, sElement, list[100];	//variable declearation

   printf("Enter the size of the array:- ");			//Enter the side of Array
   scanf("%d",&size);

   printf("Enter %d integer values in Ascending order\n", size);	//Putiing the value of array in Ascending order

   for (i = 0; i < size; i++)						//Accepting input in array
      scanf("%d",&list[i]);

   printf("Enter value of Integer to be search:- ");				//Enter the value of Integer to be search
      scanf("%d", &sElement);

   first = 0;							//assign the value of first as a index first of array &
   last = size - 1;						//last as index (size -1)
   middle = (first+last)/2;					//then middle element is lower bound of average of firt and last element of the array

   while (first <= last)					//for non-trivial array then enter in while loop 
   {
      if (list[middle] < sElement)				//if sElement is greater then element at index number middle then total works goes on right side of the array and left part of array will be ingored
         first = middle + 1;

      else if (list[middle] == sElement) 			//if sElement is found at middle then it not check other portion of the array  and break from the while loop
	{
         printf("Element found at index %d.\n",middle);
         break;
      	}

      else
         last = middle - 1;					//if middle is greater than last then it shift left part of array
     middle = (first + last)/2;
   }

   if (first > last)						//when first is greater then last then we traverse all element of array 
     printf("Element Not found in the Array.");

   return 0;
}

