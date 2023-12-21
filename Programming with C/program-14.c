#include "include/enroll.h"

void main()
{
	enroll();
	int choice, num1, num2;
	printf("A Simple Calculator  \n\n");
	printf("Enter first number: ");
	scanf("%d", &num1);
	printf("Enter second number: ");
	scanf("%d", &num2);
	printf("\n");
	printf("Press 1 for addition\n");
	printf("Press 2 for Subtraction\n");
	printf("Press 3 for multiplication\n");
	printf("Press 4 for division\n");
	printf("Enter your choice: ");
	scanf("%d", &choice);
	printf("\n");
	switch (choice)
	{
	case 1:
		printf("Addition of %d and %d is %d\n", num1, num2, num1 + num2);
		break;
	case 2:
		printf("Subtraction of %d and %d is %d\n", num1, num2, num1 - num2);
		break;
	case 3:
		printf("Multiplication of %d and %d is %d\n", num1, num2, num1 * num2);
		break;
	case 4:
		printf("Division of %d and %d is %d\n", num1, num2, num1 / num2);
	default:
		break;
	}
}
