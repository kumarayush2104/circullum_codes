#include "include/enroll.h"

void main()
{
	char name[50], subject[15];
	int marks;
	enroll();
	printf("Enter full name of the student: ");
	scanf("\n%[^\n]s", name);
	printf("Enter subject name: ");
	scanf("\n%[^\n]s", subject);
	printf("Enter Student's internal marks in %s: ", subject);

	if (scanf("%d", &marks) == 0) printf("\n\nYou need to enter a valid integer\n\n", name, subject);
	else if (marks > 30 || marks < 0) printf("\n\nYou need to enter marks between 0 to 30\n\n");
	else if (marks <= 30 && marks > 25) printf("\n\nCongratulations, %s has cleared %s with A\n\n", name, subject);
	else if (marks <= 25 && marks > 21) printf("\n\nCongratulations, %s has cleared %s with B\n\n", name, subject);
	else if (marks <= 21 && marks > 12) printf("\n\nCongratulations, %s has cleared %s with C\n\n", name, subject);
	else if (marks == 12) printf("\n\nCongratulations, %s has cleared %s with D\n\n", name, subject);
	else printf("Sorry, %s has not qualified in %s. \n\n", name, subject);
}
