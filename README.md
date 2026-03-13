# Furniture E-Commerce Shipping System

## Problem Scenario
You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size. 

Each furniture type might have its own unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty adding new furniture types in the future.

This solution implements a **Visitor Design Pattern** approach to separate the shipping logic from the furniture objects, ensuring the system remains flexible and follows the Open/Closed Principle.

---

## Visitor Pattern Implementation Details
This solution demonstrates the different elements of the Visitor Design pattern without the use of abstract classes:

* **Visitable Interface (`Furniture`)**: Declares the `accept` method, which allows a visitor to perform operations on the furniture object.
* **Concrete Visitable Classes (`Chair`, `Table`, `Sofa`)**: These classes implement the `Furniture` interface. They represent the data structures and override the `accept` method to delegate the work to the specific Visitor.
* **Visitor Interface (`ShippingVisitor`)**: Declares a specific `visit` method for each concrete furniture type.
* **Concrete Visitor Class (`ShippingCostCalculator`)**: Implements the actual shipping algorithms (flat rate, area-based, or distance-based) for each furniture type.

---

## UML Class Diagram
<img width="2186" height="1480" alt="LabAssignment4_VisitorDesignPattern" src="https://github.com/user-attachments/assets/7aa955b0-2df9-4ab5-a786-48aecd23fab2" />
