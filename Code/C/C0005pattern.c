#include <stdio.h>
int main() {
   int i, j, rows;
   
   for (i = 9; i >= 1; i= i-2) {
        printf("\n");
      for (j = 1; j <= i-1; ++j) {
         printf("* ");
      }
   }
   printf("*");
   return 0;
}