class Queue:

  def __init__(self, size):
    self.__queue = []
    self.__rear = 0
    self.size = size

  def display(self, element = None):
    if(element == None):
      print(self.__queue)
    else:
      if(element <= 0 or element > len(self.__queue)):
        print("Queue out of index")
        return
      else:
        print(self.__queue[element - 1])

  def insert(self, value):
    if(self.__rear >= self.size):
      print("Stack overflow")
      return

    self.__queue.append(value)
    self.__rear += 1
      

  def remove(self):
    if(len(self.__queue) <= 0):
      print("Stack underflow")
      return

    self.__queue.pop(0)
    if len(self.__queue) == 0:
      self.__rear = 0
    
      