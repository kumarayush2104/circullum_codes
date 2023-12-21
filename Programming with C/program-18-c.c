#include "include/enroll.h"

void main()
{
	enroll();
	int rows;
	printf("Enter number of rows: ");
	scanf("%d", &rows);
	int base = rows;

	for (int x = 1; x <= rows; x++)
	{
		for (int y = base; y > 1; y--)
			printf("  ");
		for (int z = 1; z <= (x * 2) - 1; z++)
			printf("* ");
			
		printf("\n");
		base--;
	}
}
