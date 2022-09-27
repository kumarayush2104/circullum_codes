#include <stdio.h>
#include "include/enroll.h"

void main() {
	float tempF, tempC;
	enroll();
	printf("Enter Temperature in F: ");
	scanf("%f", &tempF);
	tempC= (tempF-32)*5/9;
	printf("Temperature in C: %.2f\n", tempC);
}

