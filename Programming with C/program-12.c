#include <stdio.h>
#include "include/enroll.h"

void main() {
	int num1, num2, num3;
    enroll();
	printf("Enter First number: ");
	int a = scanf("%d", &num1);
	printf("Enter Second number: ");
	int b = scanf("%d", &num2);
	printf("Enter Third number: ");
	int c = scanf("%d", &num3);

	int big;
	big = num1;
	if(num2>big) big = num2;
	if(num3>big) big = num3;

	printf("%d", big);
}
