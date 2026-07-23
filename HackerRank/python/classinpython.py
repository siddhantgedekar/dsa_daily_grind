"""
Module demonstrating basic object-oriented programming in Python.

This module showcases class creation, object instantiation, and method invocation
using a simple Dog class as an example.
"""


class Dog:
    """A simple class representing a dog with basic properties and behaviors.
    
    Attributes:
        name (str): The name of the dog.
        age (int): The age of the dog in years.
    """
    
    def __init__(self, name, age):
        """Initialize a Dog object with a name and age.
        
        Args:
            name (str): The name of the dog.
            age (int): The age of the dog in years.
        """
        self.name = name
        self.age = age
    
    def bark(self):
        """Print a message representing the dog's bark.
        
        This method demonstrates instance method behavior, where the object
        (self) is automatically passed to the method.
        """
        print(f"{self.name} says woof!! I'm {self.age} years old!")


class Cart:
    def __init__(self):
        self.items = []
    
    def add(self, item):
        self.items.append(item)
    
    def remove(self, item):
        if item in self.items:
            self.items.remove(item)
        else:
            print(f"item {item} not found in the cart.")
    
    def show(self):
        print("Items in the cart:")
        for item in self.items:
            print(item)
    
    def __len__(self):
        return len(self.items)
    
    def __getitem__(self, index):
        return self.items[index]
    
    def __contains__(self, item):
        return item in self.items
    
    def __iter__(self):
        return iter(self.items)

cart = Cart()

cart.add("apple")
cart.add("banana")
cart.add("orange")
cart.add("grape")
cart.show()

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def greet(self):
        print(f"Hello, my name is {self.name} and I am {self.age} years old.")

person = Person('John Doe', 30)
attr_name = input("Enter attribute you want to see: ")
print(getattr(person, attr_name, 'Attribute not found'))


if __name__ == "__main__":
    # Create instances of the Dog class
    dog1 = Dog('Huskey', 12)
    dog2 = Dog('Indie', 10)
    
    # Invoke the bark method on each dog object
    dog1.bark()
    dog2.bark()