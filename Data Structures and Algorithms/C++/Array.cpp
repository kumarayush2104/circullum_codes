/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    Array.cpp
*/

#include <iostream>
#include <stdexcept>
#include "Array.hpp"

using namespace std;

Array::Array(int size) {
  if(size <= 0) {
    throw invalid_argument("size");
    return;
  }

  this->size = size;
  this->array = new int[size];
}

void Array::remove(int index) {
  if ((index < 0) || index > this->index) {
    cout << "Array Out of Index" << endl;
    return;
  }
  
  for(int i = index; i < this -> size; i++) {
    this -> array[i] = this -> array[i + 1];
  }
  
  this -> index--;
}

void Array::insert(int index, int value) {
  if ((++this->index) >= (this->size)) {
    cout << "Array Overflow" << endl;
    return;
  }

  for (int i = this->size; i > index; i--) {
    this->array[i] = this->array[i - 1];
  }

  this->array[index] = value;
}

int Array::search(int value) {
  for (int i = 0; i <= this->index; i++) {
    if (this->array[i] == value) {
      return i;
    }
  }
  return -1;
}

void Array::update(int index, int value) {
  if ((index < 0) || (index > this->index)) {
    cout << "Array Out of Index" << endl;
    return;
  }
  this->array[index] = value;
}

void Array::insert(int value) {
  if ((++this->index) >= (this->size)) {
    cout << "Array Overflow" << endl;
    return;
  }
  this->array[this->index] = value;
}

void Array::display() {
  cout << "{ ";
  for (int i = 0; i <= this->index; i++) {
    cout << this->array[i] << " ";
  }
  cout << "}" << endl;
}

void Array::display(int index) {
  if ((index < 0) || index >= this->index) {
    cout << "Array Out of Index" << endl;
    return;
  }
  cout << this->array[index] << endl;
}