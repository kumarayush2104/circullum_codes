# B.Tech Computer Science and Engineering
# Ayush Kumar
# 2021031035101253

class Area:
    def __init__(self, arg1: int, arg2: int = None):
        self.area = 3.14 * arg1 ** 2 if  arg2 == None  else arg1 * arg2

area_of_circle = Area(12)
print("Area of Circle:", area_of_circle.area)

area_of_rectangle = Area(12, 12)
print("Area of Rectangle:", area_of_rectangle.area)