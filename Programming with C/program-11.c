#include <stdio.h>
#include "include/enroll.h"

void main() {
	long age; int tmp;
    enroll();
	printf("Enter your age: ");
	tmp = scanf("%ld", &age);
	if (tmp != 0){
		printf("\nYou have lived for %ld\n", age*365*24*60*60);
	} else {
		printf("You have entered wrong input\n\n");
	}
}
