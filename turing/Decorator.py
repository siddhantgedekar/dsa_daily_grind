# Concept: A function that takes another function 
# and extends its behavior without modifying it.

# Turing Question: Write a decorator that 
# logs how long a function takes to run.

import time

# a simple time decorator

# factorials
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

def time_decorator(func):
    def wrapper():
        start = time.time() # start time
        result = factorial(10) # call the func..
        end = time.time() # end time
        print(f"{func.__name__} took {end - start} seconds")
        return result
    return wrapper

@time_decorator
def heavy_computation():
    time.sleep(1) # sleep a sec

heavy_computation() # call the func..