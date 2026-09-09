# create a string made of 1st, middle and last chars
def create_string(string):
    return string[0] + string[len(string)//2] + string[-1]
string = "james"
print(create_string(string))