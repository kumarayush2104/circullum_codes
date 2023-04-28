/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    Searching.cpp
*/

#include "Searching.hpp"

int linearSearch(int *arr, int arraySize, int value) {
  for (int i = 0; i < arraySize; i++) {
    if (arr[i] == value)
      return i;
  }
  return -1;
}

int *arraySplit(int *arr, int fromIndex, int toIndex) {
  if (fromIndex == toIndex) {
    return new int[0];
  }
  
  int *newArr = new int[toIndex - fromIndex];
  int index = 0;

  for (int i = fromIndex; i < toIndex; i++) {
    newArr[index] = arr[i];
    index++;
  }
  return newArr;
}

int binarySearch(int *arr, int arraySize, int value) {
  if (arraySize == 1) {
    if (arr[0] == value) {
      return 0;
    } else {
      return -1;
    }
  }

  int mid = arraySize / 2;

  if (value < arr[mid])
    return binarySearch(arraySplit(arr, 0, mid), mid, value);
  else if (value > arr[mid])
    return mid + binarySearch(arraySplit(arr, mid, arraySize), arraySize - mid,
                              value);

  else
    return mid;
}

