splitString = lambda s, d: s.split(d)

string = "Emma-is-a-data-scientist"
delimiter = "-"
print("Displaying each substring:")
[print(x) for x in splitString(string, delimiter)]