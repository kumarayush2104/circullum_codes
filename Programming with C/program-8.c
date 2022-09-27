#include <stdio.h>
#include "include/enroll.h"

void main() {
	int date, month, year; char *day;
    enroll();
	printf("Enter day, followed by date (dd-mm-yyyy): ");
	scanf("%s %d-%d-%d", day, &date, &month, &year);
	printf("\nDay: %s\nDate: %d\nMonth: %d\nYear: %d\n\n", day, date, month, year);
}
