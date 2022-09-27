#include <stdio.h>
#include "include/enroll.h"

void main() {
	long enrollNum;
	char name[100], college[300], course[100];
	enroll();
	printf("Enter Name: ");
	scanf("%[^\n]s", name);
	printf("Enter Enrollment Number: ");
	scanf("%ld", &enrollNum);
	printf("Enter College name: ");
	scanf("\n%[^\n]s", college);
	printf("Enter Course name: ");
	scanf("\n%[^\n]s", course);
	printf("\n");
	printf("------------------------------------------------------------\n");
        printf("-           		Student Bio Data          	   -\n");
        printf("------------------------------------------------------------\n");
	printf("%s\n%ld\n%s\n%s\n\n", name, enrollNum, college, course);
}
