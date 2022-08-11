# B.Tech Computer Science and Engineering
# Ayush Kumar
# 202103103510253

class banking:
    def __init__(self, name, num, bal):
        self.name = name
        self.acc_num = num
        self.acc_bal = bal
    def withdraw(num, bal):
        num.acc_bal = num.acc_bal - bal
        print("Name:", num.name, "\nAccount Number:", num.acc_num, "\nBalance:", num.acc_bal)
    def deposit(num, bal):
        num.acc_bal = num.acc_bal + bal
        print("Name:", num.name, "\nAccount ID:", num.acc_num, "\nBalance:", num.acc_bal)
    def status(num):
        print("Name:", num.name, "\nAccount ID:", num.acc_num, "\nBalance:", num.acc_bal)
        
uniq1 = banking("Ayush", 202103103510253, 500000)
uniq2 = banking("Balkrishna", 202103103510434, 500000)
uniq3 = banking("Virendra", 202103103510300, 500000)
uniq4 = banking("Dhruv", 2021031035103510445, 60000)

def main():
    opr = input("Enter Unique Code: ")
    try:
        eval(opr)
    except:
        print("Enter correct unique code !")
        main()
    finally:
        opt = int(input("Press 1 to withdraw\nPress 2 to deposit\nPress any other key to check status\n: "))
        if opt == 1:
            amt = int(input("Enter amount: "))
            banking.withdraw(eval(opr), amt)
            return
        elif opt == 2:
            amt = int(input("Enter amount: "))
            banking.deposit(eval(opr), amt)
            return
        else:
            banking.status(eval(opr))
            return

main()
        
    
