/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    DQueueRR.hpp
*/

#ifndef DQUEUE_RR
#define DQUEUE_RR

class DQueueRR {
  private:
  int* queue;
  int front = -1;
  int rear = -1;
  int size;

  public:
  explicit DQueueRR(int size);

  void display();
  void display(int index);
  
  void insert(int value, int mode);

  void remove();
};

#endif