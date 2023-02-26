/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    Queue.cpp
*/

#include "Queue.hpp"
#include <iostream>

using namespace std;

Queue::Queue(int size) {
  this->queue = new int[size];
  this->size = size;
}

void Queue::display(int index) {
  if (index < 0 || index > this->rear) {
    cout << "Queue out of index" << endl;
    return;
  }

  cout << this->queue[index] << endl;
}

void Queue::display() {
  cout << "{ ";
  for (int i = this->front + 1; i <= this->rear; i++) {
    cout << this->queue[i] << " ";
  }
  cout << "}" << endl;
}

void Queue::insert(int value) {
  if (this->rear >= this->size - 1) {
    cout << "Queue Overflow" << endl;
    return;
  }

  this->queue[++this->rear] = value;
}

void Queue::remove() {
  if (this->rear < 0) {
    cout << "Queue underflow" << endl;
    return;
  }

  this->queue[++this->front] = 0;

  if (this->rear == this->front) {
    this->front = -1;
    this->rear = -1;
  }
}