#
# Ayush Kumar (202103103510253)
# 4th Sem Div: A
# SparseMatrix.py
#

class SparseMatrix:
  __matrix = [[], [], []]
  def __init__(self, matrix):
    for row in range(len(matrix)):
      for column in range(len(matrix[0])):
        if(matrix[row][column] != 0):
          self.__matrix[0].append(row)
          self.__matrix[1].append(column)
          self.__matrix[2].append(matrix[row][column])
          
    for row in self.__matrix:
      print("|", end =" ")
      for element in row:
        print(element, end = " ")
      print("|")