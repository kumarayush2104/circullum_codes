#include "include/enroll.h"

int fac(int num)
{
	if (num == 0) return 1;
	return num * fac(num - 1);
}

void main()
{
	enroll();
	int num;
	printf("Enter a number: ");
	scanf("%d", &num);
	printf("Factorial of %d: %d\n", num, fac(num));
}
