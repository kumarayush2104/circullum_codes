#include "include/enroll.h"

void main()
{
	enroll();
	int num;
	long long factorial = 1;
	printf("Enter a number to get its factorial: ");
	scanf("%d", &num);
	for (int i = 1; i <= num; i++)
		factorial *= i;
	printf("\nFactorial of %d is %lld\n", num, factorial);
}
