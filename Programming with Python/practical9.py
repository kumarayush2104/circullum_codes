# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

class Matrix:
	matrix = []
	def __init__(self, matrix: list[list[int]]):
		self.order = len(matrix[0])
		self.matrix = matrix
		
	def print_matrix(self):
		for i in self.matrix:
			print("| ", end="")
			for j in i:
				print(j, " ", end = "")
			print("|")

	def transpose(self):
		for i in range(self.order):
			for j in range(i + 1, self.order):
				self.matrix[i][j], self.matrix[j][i] = self.matrix[j][i], self.matrix[i][j]

class MatrixOperator:
	def add_matrix(self, matrix1: Matrix, matrix2: Matrix) -> Matrix:
		matrix_data = []
		for i in range(matrix1.order):
			matrix_data.append([])
			for j in range(matrix1.order):
				matrix_data[i].append(matrix1.matrix[i][j] + matrix2.matrix[i][j])
		return Matrix(matrix_data)
	
	def subtract_matrix(self, matrix1: Matrix, matrix2: Matrix) -> Matrix:
		matrix_data = []
		for i in range(matrix1.order):
			matrix_data.append([])
			for j in range(matrix1.order):
				matrix_data[i].append(matrix1.matrix[i][j] - matrix2.matrix[i][j])
		return Matrix(matrix_data)
	
	def multiply_matrix(self, matrix1: Matrix, matrix2: Matrix) -> Matrix:
		matrix_data = []
		for i in range(matrix1.order):
			matrix_data.append([])
			for j in range(matrix1.order):
				out = 0
				for k in range(matrix1.order):
					out += matrix1.matrix[i][k]*matrix2.matrix[k][j]
				matrix_data[i].append(out)
		return Matrix(matrix_data)

matrix1 = Matrix([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
matrix_operator = MatrixOperator()

matrix2 = matrix_operator.multiply_matrix(matrix1, matrix1)
matrix2.print_matrix()
