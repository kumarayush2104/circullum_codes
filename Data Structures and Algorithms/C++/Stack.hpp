/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    Stack.hpp
*/

#ifndef STACK
#define STACK

class Stack {
  private:
  
  int* stack;
  int size;
  int top = -1;

  public:
  
  explicit Stack(int size);
  
  void change(int index, int value);
  
  void display();

  int getTop();
  
  int peep();
  int peep(int index);
  
  void pop();
  
  void push(int value);
};

#endif