#include "include/enroll.h"

int *sort(int arr[10], int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
    return arr;
}

void main()
{
    enroll();
    int arr[10], size = sizeof(arr) / sizeof(int);

    for (int i = 0; i < size; i++)
    {
        printf("Enter number %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    int *sortedArray = sort(arr, size);

    printf("Numbers in ascending order: ");
    for (int i = 0; i < size; i++)
    {
        printf("%d ", sortedArray[i]);
    }
}
