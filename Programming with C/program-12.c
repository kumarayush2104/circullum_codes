#include "include/enroll.h"

void main()
{
	enroll();
	int num1, num2, num3;
	printf("Enter First number: ");
	scanf("%d", &num1);
	printf("Enter Second number: ");
	scanf("%d", &num2);
	printf("Enter Third number: ");
	scanf("%d", &num3);

	int big;
	big = num1;
	if (num2 > big) big = num2;
	if (num3 > big) big = num3;

	printf("Largest number among them is %d.\n", big);
}
