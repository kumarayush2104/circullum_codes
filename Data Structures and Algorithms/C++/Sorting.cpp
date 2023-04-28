/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    Sorting.cpp
*/

#include "Sorting.hpp"
#include <iostream>

using namespace std;

int* arraySplit(int* arr, int fromIndex, int toIndex) {
  int* newArr = new int[toIndex - fromIndex];
  int index = 0;

  for(int i = fromIndex; i < toIndex; i++) {
    newArr[index] = arr[i];
    index++;
  }

  return newArr;
}

void arrayPop(int*& arr, int arraySize, int popIndex) {
  int* newArr = new int[arraySize - 1];
  int index = 0;

  for(int i = 0; i < arraySize; i++) {
    if(i == popIndex) continue;
    newArr[index] = arr[i];
    index++;
  }

  delete[] arr;
  arr = newArr;
}

int* arrayExtend(int* arrayOne, int arrayOneSize, int* arrayTwo, int arrayTwoSize) {
  int* result = new int[arrayOneSize + arrayTwoSize];
  int index = 0;

  for(int i = 0; i < arrayOneSize; i++) {
    result[index++] = arrayOne[i];
  }

  for(int i = 0; i < arrayTwoSize; i++) {
    result[index++] = arrayTwo[i];
  }

  return result;
}

int* arrayMerge(int* left, int leftSize, int* right, int rightSize) {
  int* result = new int[leftSize + rightSize];
  int index = 0;

  while(left && right && leftSize > 0 && rightSize > 0) {
    if(left[0] <= right[0]) {
      result[index++] = left[0];
      arrayPop(left, leftSize, 0);
      leftSize--;
    } else {
      result[index++] = right[0];
      arrayPop(right, rightSize, 0);
      rightSize--;
    }
  }

  if(left && leftSize > 0) {
    result = arrayExtend(result, index, left, leftSize);
    delete[] left;
  }
  if(right && rightSize > 0) {
    result = arrayExtend(result, index, right, rightSize);
    delete[] right;
  }

  return result;
}


int* mergeSort(int* arr, int arraySize) {

  if(arraySize == 1) return arr;

  int mid = arraySize / 2;

  int* left = arraySplit(arr, 0, mid);
  int* right = arraySplit(arr, mid, arraySize);

  left = mergeSort(left, mid);
  right = mergeSort(right, arraySize - mid);

  int* result = arrayMerge(left, mid, right, arraySize - mid);

  return result;
}

void selectionSort(int* arr, const int size) {
  for(int i = 0; i < size; i++) {
    for(int j = i + 1; j < size; j++) {
      if(arr[i] > arr[j]) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
      }
    }
  }
}

void bubbleSort(int* arr, const int size) {
  for(int i = 0; i < size; i++) {
    for(int j = 0; j < size - 1 - i; j++) {
      if(arr[j] > arr[j+1]) {
        int tmp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = tmp;
      }
    }
  }
}
