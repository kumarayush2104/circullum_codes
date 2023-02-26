/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    CQueue.hpp
*/

#ifndef CQUEUE
#define CQUEUE

class CQueue {
  private:
  int* queue;
  int count = 0;
  int size;

  public:
  explicit CQueue(int size);

  void display();
  void display(int index);
  
  void insert(int value);

  void remove();
};

#endif