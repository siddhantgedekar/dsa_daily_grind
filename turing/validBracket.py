string = "{[()]}"

def isValid(s):
    stack = []

    for char in s:
        # append openint brackets to stack
        if char == '(' or char == '{' or char == '[':
            stack.append(char)
        else: # handle closing brackets
            # if stack empty? means no closing bracket found, hence return false
            if len(stack) == 0:
                return False
            # if closing bracket found
            if (char == ']' and stack[-1] == '[') or (char == '}' and stack[-1] == '{') or (char == ')' and stack[-1] == '('):
                stack.pop() # pop it
            else: # if no closing found
                return False
    # if stack == empty, means all brackets are closed, hence return true
    return len(stack) == 0

print("Is the string valid? ",isValid(string))