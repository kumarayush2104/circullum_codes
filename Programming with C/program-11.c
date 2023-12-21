#include "include/enroll.h"

void main()
{
	enroll();
	int age;
	printf("Enter your age: ");
	int tmp = scanf("%d", &age);
	(tmp != 0) ? printf("\nYou have lived for %ld seconds\n", age * 365 * 24 * 60 * 60) : printf("You have entered wrong input\n");
}
