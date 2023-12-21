# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

class person:
    def __init__(self, name: str, age: str, city: str):
        self.name = name
        self.age =  age
        self.city = city

class employee(person):
     def __init__(self, name: str, age: str, city: str, company_name: str):
        super().__init__(name, age, city)
        self.company_name = company_name

employee1 = employee("Ayush Kumar", "21", "Surat", "Uka Tarsadia University")
print("Name:", employee1.name, "\nAge:", employee1.age, "\nCity:", employee1.city, "\nCompany name:", employee1.company_name)

