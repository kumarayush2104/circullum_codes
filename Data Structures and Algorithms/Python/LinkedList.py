class Node:
  value = None
  nextNode = None

  def __init__(self, value):
    self.value = value


class LinkedList:
  first = None

  def countNodes(self):
    if self.first == None:
      return 0

    count = 0
    save = self.first
    while (save != None):
      count += 1
      save = save.nextNode

    return count

  def getNodeAt(self, element):
    totalCount = self.countNodes()

    if element > totalCount or element < 1:
      print("Element doesn't exist")
      return
    
    if self.first == None:
      return 0
      
    save = self.first
    for i in range(1, element):
      save = save.nextNode

    return save
  
  def __sortLinkedList(self):
    if self.first == None:
      print("Linkedlist Underflow")
      return
    
    for i in range(1, self.countNodes()):
      for j in range(1, self.countNodes() - i):
        if self.getNodeAt(j).value > self.getNodeAt(j + 1).value:
          self.getNodeAt(j).value, self.getNodeAt(j + 1).value = self.getNodeAt(j + 1).value, self.getNodeAt(j).value
    
 
  def display(self):
    save = self.first
    while (save != None):
      print("Value:", save.value, "Next Node's Address:", save.nextNode)
      save = save.nextNode

  # mode 0 for insert at beginning
  # mode 1 for insert at end
  # mode 2 for insert in between (Only for insert)
  
  def insert(self, value, mode):
    node = Node(value)
    match mode:
      case 0:
        if self.first == None:
          self.first = node
        else:
          node.nextNode = self.first
          self.first = node
  
      case 1:
        if self.first == None:
          self.first = node
        else:
          save = self.first
          while(save.nextNode != None):
            save = save.nextNode
          save.nextNode = node
          
      case 2:
        if self.first == None:
          self.first = node
        else:
          save = self.first
          self.__sortLinkedList()
          for i in range(1, self.countNodes()):
            if(save.nextNode.value < value):
              save = save.nextNode
              
          save.nextNode, node.nextNode = node, save.nextNode

  def contains(self, value):
    for i in range(1, self.countNodes() + 1):
      if(value == self.getNodeAt(i).value):
        hasValue = True
        break
      else:
        hasValue = False

    return hasValue

  def remove(self, mode):
    if self.first == None:
      print("Linkedlist Underflow")
      return

    match mode:
      case 0:
        self.first = self.first.nextNode
        return

      case 1:
        save = self.first
        for i in range(1, self.countNodes() - 1):
          save = save.nextNode

        save.nextNode = None
        return

  print("Invalid Mode")

  def orderedRemove(self, value):
    if self.first == None:
      print("Linkedlist Underflow")
      return
    elif self.contains(value) == False:
      print("Element doesn't exist")
      return

    self.__sortLinkedList()
    save = self.first

    if save.value == value:
      self.remove(0)
      return
    
    for i in range(1, self.countNodes()):
      if save.nextNode.value == value:
        break
      else:
        save = save.nextNode

    tmp = save.nextNode.nextNode
    save.nextNode = tmp
    