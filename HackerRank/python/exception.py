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