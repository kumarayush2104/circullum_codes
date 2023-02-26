/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    DQueueRR.cpp
*/

#include "DQueueRR.hpp"
#include <iostream>

using namespace std;

DQueueRR::DQueueRR(int size) {
  this->queue = new int[size];
  this->size = size;
}

void DQueueRR::display(int index) {
  if (index < 0 || index > this->rear) {
    cout << "Queue out of index" << endl;
    return;
  }

  cout << this->queue[index] << endl;
}

void DQueueRR::display() {
  cout << "{ ";
  if (this->front != -1 && this->rear != -1) {
    for (int i = this->front; i <= this->rear; i++) {
      cout << this->queue[i] << " ";
    }
  }
  cout << "}" << endl;
}

void DQueueRR::insert(int value, int mode) {
  switch (mode) {
  case 0: {
    if (this->front <= 0) {
      cout << "No Space left on front pointer !" << endl;
      return;
    }

    this->queue[--this->front] = value;
    break;
  }

  case 1: {
    if (this->rear >= this->size - 1) {
      cout << "Queue Overflow" << endl;
      return;
    }

    if (this->front == -1) {
      this->front = 0;
    }

    this->queue[++this->rear] = value;
    break;
  }

  default:
    cout << "Invalid mode";
    return;
  }
}

void DQueueRR::remove() {
  if (this->rear < 0) {
    cout << "Queue underflow" << endl;
    return;
  }

  this->queue[this->front++] = 0;

  if (this->rear + 1 == this->front) {
    this->front = -1;
    this->rear = -1;
  }
}