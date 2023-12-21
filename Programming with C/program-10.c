#include "include/enroll.h"

void main()
{
	enroll();
	int num;

	printf("Enter a number to check its divisibility by 3: ");
	scanf("%d", &num);
	if (num % 3 == 0) printf("\nYes, %d is divisible by 3\n", num);
	else printf("\nNo, %d is not divisible by 3\n", num);
}
