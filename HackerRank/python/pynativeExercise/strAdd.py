# append new string in mid of given str
def append_string_middle(string, addStr):
    mid = len(string)//2
    result = string[:mid] + addStr + string[mid:]
    return result
string = "james"
addStr = "kelly"
print(append_string_middle(string, addStr))