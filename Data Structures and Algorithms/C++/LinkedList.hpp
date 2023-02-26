/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    LinkedList.hpp
*/

#ifndef LINKED_LIST
#define LINKED_LIST

struct Node {
  int value;
  struct Node* nextNode;
};

class LinkedList {
  private:
  Node* first = nullptr;
  void sortLinkedList();

  public:
  void display();
  int countNodes();
  Node& getNodeAt(int element);
  bool contains(int value);

  /*
    mode 0 for insert at beginning
    mode 1 for insert at end
    mode 2 for insert in between (Only for insert)
  */

  void insert(int value, int mode);

  void remove(int mode);
  void orderedRemove(int value);
};

#endif