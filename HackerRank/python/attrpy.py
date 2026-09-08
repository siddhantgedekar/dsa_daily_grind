class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

person = Person('John', 30)

print(getattr(person, 'name')) # john
print(getattr(person, 'age')) # 30
print(getattr(person, 'gender', 'Not Specified')) # Not Specified

print("Attributes in person object")
for attr in dir(person):
    if not attr.startswith("_") and not callable(getattr(person, attr)):
        value = getattr(person, attr)
        print(f"{attr}: {value}")