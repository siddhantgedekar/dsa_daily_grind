import random
# A banking application in python
# Bank has 4 major operations
"""
1. Deopsit
2. Withdrawl
3. Balance
4. Bank Account Creation
"""

# Let's create the The Most major class
# Bank Account
class BankAccount:
    name = ""
    ifsc = 53400
    acc_no = 534000000000000
    def __init__(self, name, balance=0.0):
        self.balance_amt = 0
        self.name = name
        self.acc_no += 1
        print("Welcome to Python Bank.")
        print(f"Name: {self.name}\nA/C no: {self.acc_no}")
    
    def deposit(self):
        amount = float(input("Enter amount to be deposited: "))
        if amount < 0:
            print(f"Invalid amount provided. Amount can't be negative.")
        else:
            self.balance_amt += amount
        print(f"Amount {amount} deposited. Balance: {self.balance_amt}")
    
    def withdraw(self):
        amount = int(input("Enter withdrawal amount: "))
        if amount < 0 or amount > self.balance_amt:
            print(f"Not enough balance to withdraw.")
        else:
            self.balance_amt -= amount
            print(f"{amount} has been withdrawn.\nYour current balance: {self.balance_amt}")
    
    def display(self):
        print(f"Your current balance: {self.balance_amt}")



# Driver code
if __name__ == "__main__":
    print(f"=====Welcome to Python Bank=====")
    name = input("Enter your name: ")
    s = BankAccount(name)
    print("Congrulations on creating you first account.")
    print("===Operations you can perform in you account===\n0.Exit operation mode\n1. Check Balance\n2. Withdraw\n3. Deposit")
    ch = int(input("choice: "))
    while True:
        match ch:
            case 0:
                print("Thank you for using Python Bank.")
                break
            case 1:
                s.display()
            case 2:
                s.withdraw()
            case 3:
                s.deposit()
        ch = int(input("choice: "))
