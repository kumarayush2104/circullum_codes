#include "include/enroll.h"

void main()
{
	enroll();
	int rows;
	printf("Enter number of rows: ");
	scanf("%d", &rows);
	for (int x = 1; x <= rows; x++)
	{
		for (int y = 1; y <= x; y++)
		{
			if (y < 10) printf("0");
			printf("%d ", y);
		}
		printf("\n");
	}
}
