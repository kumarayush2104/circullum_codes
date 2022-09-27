#include <stdio.h>
#include "include/enroll.h"

void main() {
    enroll();
	int num;
	printf("Enter a Number: ");
	scanf("%d", &num);
	printf("Entered number is %d\n", num);
}
