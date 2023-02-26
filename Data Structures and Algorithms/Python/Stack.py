#
# Ayush Kumar (202103103510253)
# 4th Sem Div: A
# Stack.py
#

class Stack:
  __stack = []

  def __init__(self, size):
    if(size <= 0):
      raise Exception("Invalid Size")
      return
    self.__size = size

  def push(self, value):
    if (len(self.__stack) >= self.__size):
      print("Stack overflow")
      return
    self.__stack.append(value)

  def pop(self):
    if (len(self.__stack) == 0):
      print("Stack underflow")
      return
    self.__stack.pop(-1)

  def peep(self, index=None):
    if (index == None):
      return self.__stack[-1]

    if (index >= len(self.__stack) or index < 0):
      print("Stack out of index")
      return
    return self.__stack[index]

  def getTop(self):
    return len(self.__stack) - 1

  def change(self, index, value):
    if (index >= len(self.__stack) or index < 0):
      print("Stack out of index")
      return
    self.stack[index] = value

  def display(self):
    print(self.__stack)