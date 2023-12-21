#include "include/enroll.h"

void main()
{
	enroll();

	int date, month, year;
	char *day;

	printf("Enter day, followed by date (dd-mm-yyyy): ");
	scanf("%s %d-%d-%d", day, &date, &month, &year);
	printf("\nDay: %s\nDate: %d\nMonth: %d\nYear: %d\n\n", day, date, month, year);
}
