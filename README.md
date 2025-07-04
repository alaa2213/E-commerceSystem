# 🛒 Java E-Commerce Checkout System

This project is a simple Java-based e-commerce system that demonstrates core **Object-Oriented Programming (OOP)** concepts, including:

- Product management
- Shipping service integration
- Expiry tracking for some items
- Checkout with shipping fee calculation
  

---

## 📦 Features

- Add products to a shopping cart
- Support for 4 types of items which are:
  1-**shippable with expiry date products**
  2- **nonshippable with expiry date products**
  3-**shippable without expiry date products**
  4-**normal products"nonshippable without expiry date"**
s
- Calculate **shipping fees based on weight**(10$ per KG)
- Validate checkout total including shipping fees
- Show **remaining balance** after checkout
- Filter and process items through a centralized **ShippingService**

---

## 🧩 Key OOP Concepts Used

| Concept             | Implementation |
|---------------------|----------------|
| **Encapsulation**   | Fields in `Product`, `Cart`, `Customer` are private/protected |
| **Inheritance**     | Specialized products like `shippable`and `nonshippable` extend base `Product` |
| **Interfaces**      | `Shippable` defines `getName()` and `getWeight()` for shipping and  `expiryDate` defines `getExpiryDate()` |
| **Composition**     | `Cart` has a list of `Product` items |

---

## 🏗️ Class Overview

| Class / Interface | Description |
|-------------------|-------------|
| `Product`         | Base class for all products (name, price) |
| `nonShippableProductwithExpiry`          | class for nonshippable product which has expiryDate |
| `ShippableProductwithExpiry`          | class for shippable product which has expiryDate |
| `ShippablewithoutExpiry`          | class for shippable product which has no expiryDate |
| `Cart`            | Holds products and calculates totals |
| `Customer`        | Represents a user with a balance,name and cart |
| `Shippable` (interface) | Implemented by products that can be shipped |
| `expiryDate` (interface) | Implemented by products that have can be expried |
| `ShippingService` | Accepts a list of `shippable` objects and processes shipping |
| `test`            | Demonstrates usage and checkout flow |

---



