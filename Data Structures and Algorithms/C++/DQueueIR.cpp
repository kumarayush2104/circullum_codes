/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    DQueueIR.cpp
*/

#include "DQueueIR.hpp"
#include <iostream>

using namespace std;

DQueueIR::DQueueIR(int size) {
  this->queue = new int[size];
  this->size = size;
}

void DQueueIR::display(int index) {
  if (index < 0 || index > this->rear) {
    cout << "Queue out of index" << endl;
    return;
  }

  cout << this->queue[index] << endl;
}

void DQueueIR::display() {
  cout << "{ ";
  if (this->front != -1 && this->rear != -1) {
    for (int i = this->front; i <= this->rear; i++) {
      cout << this->queue[i] << " ";
    }
  }
  cout << "}" << endl;
}

void DQueueIR::insert(int value) {
  if (this->rear >= this->size - 1) {
    cout << "Queue Overflow" << endl;
    return;
  }

  if (this->front == -1) {
    this->front++;
  }

  this->queue[++this->rear] = value;
}

void DQueueIR::remove(int mode) {
  if (this->rear < 0) {
    cout << "Queue underflow" << endl;
    return;
  }

  if (this->rear == this->front) {
    this->queue[this->front] = 0;
    this->front = -1;
    this->rear = -1;
    return;
  }

  switch (mode) {
  case 0:
    this->queue[this->front++] = 0;
    break;
  case 1:
    this->queue[this->rear--] = 0;
    break;
  }
}