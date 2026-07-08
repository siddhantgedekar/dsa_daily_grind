import pdb

def add(a,b):
    result = a+b
    print(f'The sum of {a} and {b} is {result}')
    return result

def divide(a,b):
    pdb.set_trace()
    return (a/b)

print(divide(10,2))
print(divide(15, 3))
add(10,2)