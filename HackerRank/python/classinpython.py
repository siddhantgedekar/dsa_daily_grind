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


if __name__ == "__main__":
    # Create instances of the Dog class
    dog1 = Dog('Huskey', 12)
    dog2 = Dog('Indie', 10)
    
    # Invoke the bark method on each dog object
    dog1.bark()
    dog2.bark()