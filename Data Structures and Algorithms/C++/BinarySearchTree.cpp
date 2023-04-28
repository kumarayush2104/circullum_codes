/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    BinarySearchTree.cpp
*/

#include "BinarySearchTree.hpp"
#include <iostream>

using namespace std;

void inorderTraverse(Node *node) {
  if (node == nullptr)
    return;

  inorderTraverse(node->left);
  cout << "\tNode Address: " << node << " Node Value: " << node->value << ",\n";
  inorderTraverse(node->right);
}

Node* findNode(Node *node, int value) {
  if (node != nullptr && node->value == value) return node;
  else if(node != nullptr && node -> value < value) {
      return findNode(node->right, value);
  } else if(node != nullptr && node -> value > value) {
      return findNode(node->left, value);
  } else {
    return nullptr;
  }
}

void postorderTraverse(Node *node) {
  if (node == nullptr)
    return;

  postorderTraverse(node->left);
  postorderTraverse(node->right);
  cout << "\tNode Address: " << node << " Node Value: " << node->value << ",\n";
}

void preorderTraverse(Node *node) {
  if (node == nullptr)
    return;

  cout << "\tNode Address: " << node << " Node Value: " << node->value << ",\n";
  preorderTraverse(node->left);
  preorderTraverse(node->right);
}

void BinarySearchTree::insert(int value) {
  Node *node = new Node{nullptr, value, nullptr};

  if (this->root == nullptr)
    this->root = node;
  else {
    Node *save = this->root;

    while (true) {
      if (save->value < value) {
        if (save->right == nullptr) {
          save->right = node;
          break;
        } else
          save = save->right;
      } else if (save->value > value) {
        if (save->left == nullptr) {
          save->left = node;
          break;
        } else
          save = save->left;
      }
    }
  }
}

void BinarySearchTree::display(int mode) {
  cout << "{\n";
  switch (mode) {
  case 1: {
    inorderTraverse(this->root);
    break;
  }
  case 2: {
    preorderTraverse(this->root);
    break;
  }
  case 3: {
    postorderTraverse(this->root);
    break;
  }
  }
  cout << "}\n";
}

Node* findParent(Node* node, int value) {
  if (node == nullptr)
    return nullptr;

  if ((node->left != nullptr && node->left->value == value) ||
      (node->right != nullptr && node->right->value == value))
    return node;

  if (node->value > value)
    return findParent(node->left, value);
  else
    return findParent(node->right, value);
}


void BinarySearchTree::remove(int value) {
  Node *nodeToRemove = findNode(this->root, value);
  
  if (nodeToRemove == nullptr) {
    cout << "Value not found\n";
    return;
  }
  
  Node *parentNode = findParent(this->root, value);

  if (nodeToRemove->left == nullptr && nodeToRemove->right == nullptr) {
    if (parentNode == nullptr) {
      this->root = nullptr;
    } else if (parentNode->left == nodeToRemove) {
      parentNode->left = nullptr;
    } else {
      parentNode->right = nullptr;
    }
    delete nodeToRemove;
  } else if (nodeToRemove->left == nullptr) {
    if (parentNode == nullptr) {
      this->root = nodeToRemove->right;
    } else if (parentNode->left == nodeToRemove) {
      parentNode->left = nodeToRemove->right;
    } else {
      parentNode->right = nodeToRemove->right;
    }
    delete nodeToRemove;
  } else if (nodeToRemove->right == nullptr) {
    if (parentNode == nullptr) {
      this->root = nodeToRemove->left;
    } else if (parentNode->left == nodeToRemove) {
      parentNode->left = nodeToRemove->left;
    } else {
      parentNode->right = nodeToRemove->left;
    }
    delete nodeToRemove;
  } else {
    Node *replacementNode = nodeToRemove->right;
    while (replacementNode->left != nullptr) {
      replacementNode = replacementNode->left;
    }
    int temp = replacementNode->value;
    remove(replacementNode->value);
    nodeToRemove->value = temp;
  }
}
