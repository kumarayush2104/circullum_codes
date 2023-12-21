#include "include/enroll.h"

void swap(int *ptr1, int *ptr2)
{
    int tmp = *ptr1;
    *ptr1 = *ptr2;
    *ptr2 = tmp;
    printf("\nNumber after swapping: %d, %d\n", *ptr1, *ptr2);
}

void main()
{
    int num1, num2;
    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);
    printf("Number before swapping: %d, %d\n", *&num1, *&num2);
    swap(&num1, &num2);
}
