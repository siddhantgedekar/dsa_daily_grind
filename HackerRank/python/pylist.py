commands = ["insert 0 5",
"insert 1 10",
"insert 0 6",
"print",
"remove 6",
"append 9",
"append 1",
"sort",
"print",
"pop",
"reverse",
"print"]

mylist = []
for i in range(12):
    command = commands[i]
    operation, *values = command.strip().split()
    match(operation):
        case "insert":
            index = int(values[0])
            value = int(values[1])
            mylist.insert(index, value)
        case "print":
            print(mylist)
        case "remove":
            mylist.remove(int(values[0]))
        case "append":
            mylist.append(int(values[0]))
        case "sort":
            mylist.sort()
        case "pop":
            mylist.pop()
        case "reverse":
            mylist.reverse()