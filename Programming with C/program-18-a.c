#include "include/enroll.h"

void main()
{
	enroll();
	int rows;
	printf("Enter number of rows: ");
	scanf("%d", &rows);
	for (int x = 0; x < rows; x++)
	{
		for (int y = 0; y <= x; y++)
		{
			printf("* ");
		}
		printf("\n");
	}
}
