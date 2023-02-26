/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    Queue.hpp
*/

#ifndef QUEUE
#define QUEUE

class Queue {
  private:
  int* queue;
  int front = -1;
  int rear = -1;
  int size;

  public:
  explicit Queue(int size);

  void display();
  void display(int index);
  
  void insert(int value);

  void remove();
};

#endif