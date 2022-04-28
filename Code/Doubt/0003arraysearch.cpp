#include <stdio.h>
#include <stdlib.h>

int main()
{
	int *arr;
	int n, i, pos, value, key;

	printf("\n Enter the size of array: ");
	scanf("%d", &n);
	
	printf("\n Size of array which is dynamically created %d",n);

	// Dynamically allocate memory using malloc()
	arr = (int *)malloc(n * sizeof(int));

	for (i = 0; i < n; i++)
	 {
		printf("\n Enter the element at location arr[%d]",i);
		scanf("%d", &arr[i]);
	 }

	printf("\nEnter the location where we want to insert new element:- ");
	scanf("%d", &pos);

	printf("\n\nEnter the value to insert:");
	scanf("%d", &value);

	// Check if the memory has been successfully
	// allocated by malloc or not
	if (arr == NULL)
	{
		printf("Memory not allocated.\n");
		exit(0);
	}
	else
	{

		// Memory has been successfully allocated
		for (i = n; i > pos - 1; i--)
		{
			arr[i] = arr[i-1];
			
		}
		arr[pos - 1] = value;
		// Display the elements of the array
		printf("Results:\n ");
		for (i = 0; i <= n; i++)
		{
			printf("%d\n ", arr[i]);
		}
	}

	printf("\n\nEnter element to Search:\n");
	scanf("%d", &key);
	int numberforset = 0;
	for (i = 0; i < n; i++)
	{
		if (arr[i] == key)
		{
			numberforset = 1;
			break;
		}
	}
	if (numberforset == 1)
	{
		printf("%d is found at location %d", key, i + 1);
	}

	else
	{
		printf("%d is not found", key);
	}
	return 0;
}

