countries = [
    "United States",
    "Canada",
    "Mexico",
    "Brazil",
    "Argentina",
    "United Kingdom",
    "France",
    "Germany",
    "Italy",]

print("Size Before ",len(countries))
countries.remove("United Kingdom")
print("Size After ",len(countries))

# using list constructor
fruits = list(("Apple", "Banana", "Cherry")) # we can have any value in list
# wether you create like this or using [] it is same
print(fruits)
# join lists
vegetables = ["Carrot", "Potato", "Cabbage"]
all_foods = fruits + vegetables
print("All Foods: ", all_foods)
# or using extend method
fruits.extend(vegetables)
print("Fruits after extend: ", fruits)
# using append method to add single item
fruits.append("Mango")
print("Fruits after append: ", fruits)

print("Index of Banana: ", fruits.index("Banana"))

# count occurrences of an item
fruits.append("Apple")
print("Fruits after adding another Apple: ", fruits)
apple_count = fruits.count("Apple")
print("Number of Apples: ", apple_count)
# sort the list
fruits.sort()
print("Sorted Fruits: ", fruits)
# reverse the list
fruits.reverse()
print("Reversed Fruits: ", fruits)

# even odd checker
num = int(input("Enter number: "))
print("Even" if num % 2 == 0 else "Odd")

# dictionary demo
my_dict = {
    'sid': '5inch',
    'vis': '5inch',
    'gut': '10inch'
}

print("Dictionary: ", my_dict)