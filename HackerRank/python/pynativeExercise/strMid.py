# create a string made of middle three chars
def middle_three_chars(string):
    mid = len(string)//2
    return string[mid-1:mid+2]
string = "james"
print(middle_three_chars(string))