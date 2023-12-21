#include "include/enroll.h"

void main()
{
	enroll();
	printf("\nPrinting prime numbers between 1 to 100\n");
	for (int i = 2; i < 100; i++)
	{
		int prime = 1;
		for (int j = 2; j < i; j++)
		{
			if (i % j == 0)
			{
				prime = 0;
				break;
			}
		}
		if (prime == 1) printf("Prime number: %d\n", i);
	}
}
