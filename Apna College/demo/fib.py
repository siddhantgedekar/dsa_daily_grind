def fibo(n):
    "Fibonacci series"
    a, b = 0, 1
    print(a, b, "", end="")
    sum = 0
    for i in range(n):
        sum = a + b
        a = b
        b = sum
        print(sum, "", end="")
    print()

fibo(10)

# reverse a string using stack
s = "siddhant"
print("Original String: ", s)

stack = []
for char in s:
    stack.append(char)

reversed_s = ""

while stack:
    reversed_s += stack.pop()
print("Reversed String: ", reversed_s)


# factorial
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

num = 5
print(f"Factorial of {num} is {factorial(num)}")