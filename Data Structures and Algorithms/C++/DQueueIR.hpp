/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    DQueueIR.hpp
*/

#ifndef DQUEUE_IR
#define DQUEUE_IR

class DQueueIR {
  private:
  int* queue;
  int front = -1;
  int rear = -1;
  int size;

  public:
  explicit DQueueIR(int size);

  void display();
  void display(int index);
  
  void insert(int value);

  void remove(int mode);
};

#endif