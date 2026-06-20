# 🎭 Abstraction

## Definition

Hide implementation details and show only essential features.

## Diagram

```text
                Shape
           (Abstract Class)
                  │
      ┌───────────┼───────────┐
      │           │           │
   Circle     Rectangle    Triangle
```

## Keywords

```java
abstract
```

## Abstract Method

```java
abstract double area();
```

## Interview Notes

- Cannot instantiate abstract classes.
- Child classes must implement abstract methods.