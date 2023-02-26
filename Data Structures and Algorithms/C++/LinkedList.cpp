/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    LinkedList.cpp
*/

#include "LinkedList.hpp"
#include <exception>
#include <iostream>

using namespace std;

void LinkedList::display() {
  Node *first = this->first;
  while (first != nullptr) {
    cout << "Value: " << first->value
         << " Next Node's Address: " << first->nextNode << endl;
    first = first->nextNode;
  }
}

int LinkedList::countNodes() {
  int count = 0;

  Node *save = this->first;

  while (save != nullptr) {
    count++;
    save = save->nextNode;
  }

  return count;
}

void LinkedList::insert(int value, int mode) {
  Node *node = new Node{value, nullptr};

  switch (mode) {
  case 0:
    if (this->first == nullptr) {
      this->first = node;
    } else {
      node->nextNode = this->first;
      this->first = node;
    }

    break;

  case 1:
    if (this->first == nullptr) {
      this->first = node;
    } else {
      Node *save = this->first;

      while (save->nextNode != nullptr) {
        save = save->nextNode;
      }
      save->nextNode = node;
    }
    break;

  case 2:
    if (this->first == nullptr) {
      this->first = node;
    } else {
      Node *save = this->first;
      LinkedList::sortLinkedList();

      for (int _ = 1; _ < LinkedList::countNodes(); _++) {
        if (save->nextNode->value < value) {
          save = save->nextNode;
        }
      }

      Node *tmp = save->nextNode;
      save->nextNode = node;
      node->nextNode = tmp;
    }
    break;
  default:
    cout << "Invalid Mode" << endl;
  }
}

Node &LinkedList::getNodeAt(int element) {
  int totalElements = LinkedList::countNodes();
  if (element > totalElements || element < 1) {
    throw invalid_argument("Element not found");
  }

  Node *save = this->first;

  for (int _ = 1; _ < element; _++) {
    save = save->nextNode;
  }

  return *save;
}

void LinkedList::remove(int mode) {
  if (this->first == nullptr) {
    cout << "LinkedList underflow" << endl;
    return;
  }

  switch (mode) {

  case 0:
    this->first = first->nextNode;
    break;

  case 1: {
    Node *save = this->first;
    for (int _ = 1; _ < LinkedList::countNodes() - 1; _++) {
      save = save->nextNode;
    }

    delete save->nextNode;
    save->nextNode = nullptr;
    break;
  }

  default:
    cout << "Invalid Mode" << endl;
  }
}

void LinkedList::sortLinkedList() {
  if (this->first == nullptr) {
    cout << "LinkedList underflow" << endl;
    return;
  }

  for (int i = 1; i <= LinkedList::countNodes(); i++) {
    for (int j = 1; j <= LinkedList::countNodes() - 1 - i; j++) {
      if (LinkedList::getNodeAt(j).value > LinkedList::getNodeAt(j + 1).value) {

        int tmp = LinkedList::getNodeAt(j).value;
        LinkedList::getNodeAt(j).value = LinkedList::getNodeAt(j + 1).value;
        LinkedList::getNodeAt(j + 1).value = tmp;
      }
    }
  }
}

void LinkedList::orderedRemove(int value) {
  if (this->first == nullptr) {
    cout << "LinkedList underflow" << endl;
    return;
  } else if (!LinkedList::contains(value)) {
    cout << "Element Doesn't exist" << endl;
    return;
  }

  LinkedList::sortLinkedList();

  Node *save = this->first;

  if (save->value == value) {
    LinkedList::remove(0);
    return;
  }

  for (int _ = 1; _ <= LinkedList::countNodes(); _++) {
    if (save->nextNode->value < value) {
      save = save->nextNode;
    }
  }

  Node *tmp = save->nextNode->nextNode;
  delete save->nextNode;
  save->nextNode = tmp;
}

bool LinkedList::contains(int value) {
  bool hasValue = false;

  for (int i = 1; i <= LinkedList::countNodes(); i++) {
    if (LinkedList::getNodeAt(i).value == value) {
      hasValue = true;
      break;
    }
  }
  return hasValue;
}