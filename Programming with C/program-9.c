#include "include/enroll.h"

void main()
{
        enroll();

        int date, month, year;
        char *getMonth;
        char day[10];

        printf("\nEnter day, followed by date (eg: Wednesday 21-01-2021): ");
        scanf("%s %d-%d-%d", day, &date, &month, &year);
        char *months[12] = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (month < 1 && month > 12) getMonth = "Not a Valid Month value";
        else getMonth = months[month - 1];
        printf("Day: %s\nDate: %d\nMonth: %s\nYear: %d\n\n", day, date, getMonth, year);
}
