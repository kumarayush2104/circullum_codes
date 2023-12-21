# B.Tech Computer Science and Engineering
# Ayush Kumar
# 2021031035101253

class University:
    def __init__(self, name, year_of_est, location):
        self.name = name
        self.year_of_estd = year_of_est
        self.location = location

    def display(self):
        print("\nName:", self.name, "\nYear of Establishment:", self.year_of_est, "\Location:", self.location)
    
class Employee:
    def __init__(self, name: str, highest_qualification: str, year_of_joining: str, university: University):
        self.name = name
        self.highest_qualification = highest_qualification
        self.year_of_joining = year_of_joining
        self.university = university

class Professor(Employee):
    designation = "Professor" 
    def __init__(self, name: str, highest_qualification: str, year_of_joining: str, university: University, area_of_research: str):
        super().__init__(name, highest_qualification, year_of_joining, university)
        self.area_of_research = area_of_research

    def display(self):
        print("\nName:", self.name, "\nDesignation:", self.designation, "\nHighest Qualification:", self.highest_qualification, "\nYear of Joining:", self.year_of_joining, "\nArea of Research:", self.area_of_research)

class LabAssistant(Employee):
    designation = "Lab Assistant"
    def __init__(self, name: str, highest_qualification: str, year_of_joining: str, university: University, additional_skills: str):
        super().__init__(name, highest_qualification, year_of_joining, university)
        self.additional_skills = additional_skills
        
    def display(self):
        print("\nName:", self.name, "\nDesignation:", self.designation, "\nHighest Qualification:", self.highest_qualification, "\nYear of Joining:", self.year_of_joining, "\nAdditional Skills:", self.additional_skills)

class OfficeAssistant(Employee):
    designation = "Office Assistant"
    def __init__(self, name: str, highest_qualification: str, year_of_joining: str, university: University):
        super().__init__(name, highest_qualification, year_of_joining, university)

    def display(self):
        print("\nName:", self.name, "\nDesignation:", self.designation, "\nHighest Qualification:", self.highest_qualification, "\nYear of Joining:", self.year_of_joining)

class Peon(Employee):
    designation = "Peon"
    def __init__(self, name: str, highest_qualification: str, year_of_joining: str, university: University):
        super().__init__(name, highest_qualification, year_of_joining, university)
    
    def display(self):
        print("\nName:", self.name, "\nDesignation:", self.designation, "\nHighest Qualification:", self.highest_qualification, "\nYear of Joining:", self.year_of_joining)
