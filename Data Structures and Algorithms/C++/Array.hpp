/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    Array.hpp
*/

#ifndef ARRAY
#define ARRAY

class Array {
  private:

  int index = -1;
  int size;
  int* array;
  
  public:
  
  explicit Array(int size);
  
  void insert(int value);
  void insert(int index, int value);
  
  int search(int value);
  
  void update(int index, int value);

  void remove(int index);

  void display();
  void display(int index);
};

#endif