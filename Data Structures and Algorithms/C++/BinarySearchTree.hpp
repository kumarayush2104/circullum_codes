/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    BinarySearchTree.hpp
*/

#ifndef BINARY_SEARCH_TREE
#define BINARY_SEARCH_TREE

struct Node {
  Node *left;
  int value;
  Node *right;
};

class BinarySearchTree {
  private:
  Node* root = nullptr;

  public:
  void search(int value);
  void remove(int value);
  void insert(int value);

  /*
    mode 1: Inorder Traverse
    mode 2: Preorder Travserse
    mode 3: Postorder Traverse
  */

  void display(int mode);
};

#endif