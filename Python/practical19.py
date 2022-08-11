# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

class base:
    def display(self):
        print("This is base class")

class derived(base):
    def display(self, opt = None):
        if(opt==None):
            print("This is a derived class")
        else:
            super().display()

obj1 = derived()
obj1.display()
