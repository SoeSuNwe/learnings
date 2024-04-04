# Object-Oriented Programming (OOP) in Java

## Introduction
This README file serves as a guide to understanding Object-Oriented Programming (OOP) principles in Java. Object-Oriented Programming is a programming paradigm that revolves around the concept of objects. In Java, everything is an object, and OOP provides a way to structure your code in a modular and reusable manner.

## Key Concepts

### 1. Classes and Objects
   - **Class**: A class is a blueprint for creating objects. It defines the properties (fields) and behaviors (methods) that objects of the class will have.
   - **Object**: An object is an instance of a class. It encapsulates data (fields) and behavior (methods).

### 2. Encapsulation
   - **Encapsulation**: Encapsulation is the bundling of data (fields) and methods that operate on the data into a single unit (class). It hides the internal state of an object from the outside world and only exposes the necessary functionalities through methods.

### 3. Inheritance
   - **Inheritance**: Inheritance is a mechanism in which a new class (subclass) is derived from an existing class (superclass). The subclass inherits the properties and behaviors of the superclass. It promotes code reusability and allows for creating a hierarchical structure of classes.

### 4. Polymorphism
   - **Polymorphism**: Polymorphism allows objects of different classes to be treated as objects of a common superclass. It enables methods to be called on objects without knowing their specific types. Polymorphism is achieved through method overriding and method overloading.

### 5. Abstraction
   - **Abstraction**: Abstraction is the process of hiding the implementation details of a class and only exposing the necessary features to the user. It helps in managing complexity by focusing on what an object does rather than how it does it.

## Example
Let's illustrate these concepts with a simple example:

```java
// Defining a class
class Vehicle {
    // Fields
    String make;
    String model;
    
    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    // Method
    public void drive() {
        System.out.println("The vehicle is driving.");
    }
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    // Additional fields
    int year;
    
    // Constructor
    public Car(String make, String model, int year) {
        super(make, model); // Call to superclass constructor
        this.year = year;
    }
    
    // Method overriding
    @Override
    public void drive() {
        System.out.println("The car is driving.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects
        Vehicle vehicle = new Vehicle("Toyota", "Corolla");
        Car car = new Car("Honda", "Civic", 2020);
        
        // Polymorphism
        Vehicle v = new Car("Ford", "Mustang", 2019);
        
        // Calling methods
        vehicle.drive(); // Output: The vehicle is driving.
        car.drive(); // Output: The car is driving.
        v.drive(); // Output: The car is driving. (Polymorphism)
    }
}
