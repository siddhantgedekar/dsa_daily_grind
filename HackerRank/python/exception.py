# exception handling
def add(a, b):
    try:
        return a + b
    except TypeError:
        print("Error: Both arguments must be numbers.")
        return None
    finally:
        print("Finally block runs no matter what!!")

print(add('a',-4))

# You can create custom error using 'raise'
# Exammple

def check_age(age):
    if age<0:
        raise ValueError("Age cannot be negative")
    return age

try:
    check_age(-5)
except ValueError as e:
    print(f'Error: {e}')

# re-raising error with 'raise'
def divide(a, b):
    try:
        return a/b
    except ZeroDivisionError:
        print('Error: Cannot divide by zero.')
        raise  # re-raise the exception to propagate it further

try:
    divide(10, 0)
except ZeroDivisionError as e:
    print(f'Caught an exception: {e}')

# create and raise custom exception using exception class
class InsufficientFundsError(Exception):
    def __init__(self, balance, amount):
        self.balance = balance
        self.amount = amount
        super().__init__(f"Insufficient funds: Balance is {balance}, but tried to withdraw {amount}")
    
def withdraw(balance, amount):
    if amount > balance:
        raise InsufficientFundsError(balance, amount)
    return balance - amount

try:
    withdraw(100, 150)
except InsufficientFundsError as e:
    print(f'Transaction Failed: {e}')


# raise with from
def parse_config(filename):
    try:
        with open(filename, 'r') as file:
            data = file.read()
            return int(data)
    except FileNotFoundError:
        raise ValueError('Configuration file is missing') from None
    except ValueError as e:
        raise ValueError('Invalid configuration format') from e

config = parse_config('config.txt')