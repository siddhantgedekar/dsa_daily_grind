# find occurence of a substring in a given string and return the last index of the substring if found in the given string. If not found, it returns -1.
findCount = lambda string, substring: string.count(substring.lower())

string = "Welcome to USA. usa awesome, isn't it?"
substring = "usa"
print(f"The {substring.upper()} count is: {findCount(string.lower(), substring)}")