# 🧬 Inheritance

## Definition
Inheritance allows a class to acquire properties and methods from another class.

## Why Use It?
- Code reusability
- Reduces duplication
- Creates class hierarchies

## Diagram

```text
              Organism
                  │
          ┌───────┴───────┐
          │               │
        Animal         Plant
          │
      ┌───┴───┐
      │       │
     Dog     Cat
```

## Keywords

```java
extends
```

## Example

```java
class Dog extends Animal
```

## Interview Notes

Dog IS-A Animal

Animal IS-A Organism

## Real World Example

Employee IS-A Person