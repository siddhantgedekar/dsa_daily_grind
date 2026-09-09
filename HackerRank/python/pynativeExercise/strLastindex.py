def lastIndex(a, value):
    # str.find() method searches from the beginning, while rfind() method searches from the end of the string.
    return a.rfind(value)

string = "Emma is a data scientist who knows Python. Emma works at google."
print(lastIndex(string, "Emma"))