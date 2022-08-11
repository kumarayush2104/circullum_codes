# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

class c:
    def __init__(self, c_learning, c_professor):
        self.c_learning = c_learning.replace(" ", "").split(",")
        self.c_professor = c_professor
class python:
    def __init__(self, py_learning, py_professor):
        self.py_learning = py_learning.replace(" ", "").split(",")
        self.py_professor = py_professor
class web_designing:
    def __init__(self, wd_learning, wd_professor):
        self.wd_learning = wd_learning.replace(" ", "").split(",")
        self.wd_professor = wd_professor

class student(c, python, web_designing):
    std_college = "Asha M Tarsadia Institute of Computer Science and Technology"
    def __init__(self, std_name, std_enroll, std_course, c_learning, c_professor, py_learning, py_professor, wd_learning, wd_professor):
        self.std_name = std_name
        self.std_enroll = std_enroll
        self.std_course = std_course
        c.__init__(self, c_learning, c_professor)
        python.__init__(self, py_learning, py_professor)
        web_designing.__init__(self, wd_learning, wd_professor)
    def display(self):
        print("------------------------------------------------------------------------------", "\n|  Welcome to", self.std_college, "  |", "\n------------------------------------------------------------------------------", "\nName:", self.std_name, "\nEnrollment Number:", self.std_enroll, "\nCourse:", self.std_course, "\n------------------------------------------------------------------------------")
        print(self.std_name, "'s Learning in C: ")
        for i in self.c_learning:
            print("-", end="")
            print(i)
        print("\nC's Professor:", self.c_professor, "\n------------------------------------------------------------------------------")
        print(self.std_name, "'s Learning in Python: ")
        for i in self.py_learning:
            print("-", end="")
            print(i)
        print("\nPython's Professor:", self.py_professor, "\n------------------------------------------------------------------------------")
        print(self.std_name, "'s Learning in Web Designing: ")
        for i in self.wd_learning:
            print("-", end="")
            print(i)
        print("\nWeb Designing's Professor:", self.wd_professor, "\n------------------------------------------------------------------------------")

def main():
    print("\033c", end="")
    name = input("Enter student's name: ")
    enroll = input("Enter enrollment number: ")
    course = input("Enter course: ")
    c_l = input("Enter C's learning of student (Seperated by comma): ")
    c_p = input("Enter C professor's name: ")
    py_l = input("Enter Python's learning of student (Seperated by comma): ")
    py_p = input("Enter Python professor's name: ")
    wd_l = input("Enter Web Designing's learning of student (Seperated by comma): ")
    wd_p = input("Enter Web Designing professor's name: ")
    std1 = student(name, enroll, course, c_l , c_p, py_l, py_p, wd_l, wd_p)
    print("\033c", end="")
    std1.display()
main()
