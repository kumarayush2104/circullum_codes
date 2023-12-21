#include "include/enroll.h"

void main()
{
	enroll();

	char name[100], college[300], course[100], enrollNum[50];

	printf("Enter Name: ");
	scanf("%[^\n]s", name);

	printf("Enter Enrollment Number: ");
	scanf("\n%[^\n]s", &enrollNum);

	printf("Enter College name: ");
	scanf("\n%[^\n]s", college);

	printf("Enter Course name: ");
	scanf("\n%[^\n]s", course);

	printf("\n");
	printf("------------------------------------------------------------\n");
	printf("-                     Student Bio Data                     -\n");
	printf("------------------------------------------------------------\n");
	printf("Name: %s\nEnrollment Number: %s\nCollege Name: %s\nCourse: %s\n", name, enrollNum, college, course);
}
