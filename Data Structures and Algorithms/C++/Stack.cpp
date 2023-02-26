/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    Stack.cpp
*/

#include "Stack.hpp"
#include <iostream>

using namespace std;

Stack::Stack(int size) {
  if (size <= 0) {
    throw invalid_argument("size");
    return;
  }

  this->stack = new int[size];
  this->size = size;
}

void Stack::change(int index, int value) {
  if (this->top < index || index < 0) {
    cout << "Stack Index out of bound" << endl;
    return;
  }

  this->stack[index] = value;
}

void Stack::pop() {
  if (this->top <= -1) {
    cout << "Stack Underflow" << endl;
  }

  this->stack[this->top--] = NULL;
}

int Stack::peep(int index) {
  if (index > this->top) {
    cout << "Stack Index out of bound" << endl;
    return -1;
  }

  return this->stack[index];
}

void Stack::display() {
  cout << "{ ";
  for (int i = 0; i <= this->top; i++) {
    cout << this->stack[i] << " ";
  }
  cout << "}" << endl;
}

void Stack::push(int value) {
  if (this->top >= this->size) {
    cout << "Stack Overflow" << endl;
    return;
  }

  this->stack[++this->top] = value;
}

int Stack::peep() { return Stack::peep(this->top); }

int Stack::getTop() { return this->top; }