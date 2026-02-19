string = "{[()]}"

def isValid(s):
    stack = []
    map = {')': '(', '}': '{', ']': '['}
    # loop through string
    # check for closing bracket
    # pop the last el from stack

print("Is the string valid? ",isValid(string))