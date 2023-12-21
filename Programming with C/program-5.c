#include "include/enroll.h"

void main()
{
	enroll();
	float tempF;
	printf("Enter Temperature in F: ");
	scanf("%f", &tempF);
	printf("Temperature in C: %.2f\n", (tempF - 32) * 5 / 9);
}
