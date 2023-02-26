#
# Ayush Kumar (202103103510253)
# 4th Sem Div: A
# Array.py
#

class Array:
  __array = []

  def __init__(self, size):
    if (size <= 0):
      raise Exception("Invalid Size")
    self.__size = size

  def insert(self, value, index=None):
    if (len(self.__array) >= self.__size):
      print("Array Overflow")
      return

    if (index == None or index >= self.__size or index < 0):
      self.__array.append(value)
      return

    self.__array.insert(index, value)

  def search(self, value):
    try:
      self.__array.index(value)
    except:
      print("Value not found")

  def update(self, index, value):
    if (index >= len(self.__array) or index < 0):
      print("Array Out of index")
      return

    self.__array[index] = value

  def remove(self, index):
    if (index >= len(self.__array) or index < 0):
      print("Array out of index")
      return

    self.__array.remove(self.__array[index])

  def display(self, index=None):
    if (index == None):
      print(self.__array)
      return

    if(index < 0):
      print("Array out of index")
      return
      
    print(self.__array[index])
