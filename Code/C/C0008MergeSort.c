/*
  Assignment of Design & Analysis of Alorithms
 3. Write a program that sorts a list of integers using Mergesort
 compiled by:- Ashish Ranjan    Enrollment no:- CUSB2002312009
*/

#include<stdio.h>

void merge_sort(int, int);					//function prototype of merge_sort and merge_array
void merge_array(int, int, int, int);

int n, arr_sort[100];						//identifier 

int main()
 {
  int i;

  printf("Enter the no. of element in the list:- ");		//creating array of n elements
  scanf("%d",&n);

   for (i = 0; i < n; i++)					//accepting Value
  {
   printf("Enter the element at position %d :- ",i);
    scanf("%d", &arr_sort[i]);
  }

  printf("\n Elements in arrays:- ");				//Displaying the element of array before sort
  for (i = 0; i < n; i++)
   {
     printf("\t %d", arr_sort[i]);
    }

  merge_sort(0, n - 1);						//merge_sort function calling  and sort the value of element and return the value 

  printf("\n\n\tSorted Data :-");				//Displaying the element after sorting
  for (i = 0; i < n; i++)
  {
    printf("\t %d", arr_sort[i]);
   }
  return 0;

}

void merge_sort(int i, int j) 					//function defination of merge sort
{
  int m;

  if (i < j)
   {
     m = (i + j) / 2;						//divide and conquer rule:- element are divided into two
     merge_sort(i, m);
     merge_sort(m + 1, j);					//part i to m and m+1 to j and its recursion itself
     merge_array(i, m, m + 1, j);				//after the trivial array found then its merging the array then merge array are called.
    }
 }

void merge_array(int a, int b, int c, int d)			//definition of merge array function.
 {
  int t[100];							//creating a local array of 100 size
  int i = a, j = c, k = 0;					//assigning global variable into local variable

   while (i <= b && j <= d) 
   {
    if (arr_sort[i] < arr_sort[j])				//if ith element is less then jth element in array then
      t[k++] = arr_sort[i++];					//first of all assign the value at k and increment by index1 in  k and i
    else
      t[k++] = arr_sort[j++];					//assign the value of j in k and increment  by index 1 in k and j
   }

  while (i <= b)						//for remaining elements
    t[k++] = arr_sort[i++];

  while (j <= d)
    t[k++] = arr_sort[j++];

  for (i = a, j = 0; i <= d; i++, j++)
    arr_sort[i] = t[j];
 }
