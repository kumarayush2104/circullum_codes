#include "include/enroll.h"

void main()
{
	enroll();
	for (int i = 1; i <= 3; i++)
	{
		printf("------------------\n");
		printf("    Table of %d   \n", i);
		printf("------------------\n");
		for (int j = 1; j <= 10; j++)
			printf("%d x %d = %d\n", i, j, j * i);
		printf("\n");
	}
}
