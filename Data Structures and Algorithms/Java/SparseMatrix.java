/*
    Ayush Kumar (202103103510253)
    4th Sem Div: A
    SparseMatrix.java
*/

package include;

public class SparseMatrix {
    int[][] matrix;
    
    public SparseMatrix(int[][] matrix) {
      int size = 0;
      for(int row = 0; row < matrix.length; row++) {
        for(int column = 0; column < matrix[0].length; column++) {
          if(matrix[row][column] != 0) {
            size++;
          }
        }
      }
  
      this.matrix = new int[3][size];
  
      int index = 0;
      for(int row = 0; row < matrix.length; row++) {
        for(int column = 0; column < matrix[0].length; column++) {
          if(matrix[row][column] != 0) {
            this.matrix[0][index] = row;
            this.matrix[1][index] = column;
            this.matrix[2][index] = matrix[row][column];
            index++;
          }
        }
      }
  
      for(int row = 0; row < this.matrix.length; row++) {
        System.out.print("| ");
        for(int column = 0; column < this.matrix[0].length; column++) {
          System.out.print(this.matrix[row][column] + " ");
        }
        System.out.println("|");
      }
    }
  }
  