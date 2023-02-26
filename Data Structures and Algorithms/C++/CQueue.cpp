#include "CQueue.hpp"
#include <iostream>

using namespace std;

CQueue::CQueue(int size) {
  this->queue = new int[size];
  this->size = size;
}

void CQueue::display(int index) {
  if (index < 0 || index >= this->count) {
    cout << "Queue out of index" << endl;
    return;
  }

  cout << this->queue[index] << endl;
}

void CQueue::display() {
  cout << "{ ";
  for (int i = 0; i < this->count; i++) {
    cout << this->queue[i] << " ";
  }
  cout << "}" << endl;
}

void CQueue::insert(int value) {
  if (this->count >= this->size) {
    cout << "Queue Overflow" << endl;
    return;
  }

  this->queue[this->count++] = value;
}

void CQueue::remove() {
  if (this->count <= 0) {
    cout << "Queue underflow" << endl;
    return;
  }

  for (int i = 1; i < this->count; i++) {
    this->queue[i - 1] = this->queue[i];
  }

  this->count--;
}