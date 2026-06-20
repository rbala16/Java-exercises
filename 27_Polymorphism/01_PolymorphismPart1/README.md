# 🔁 Polymorphism

## Definition

One interface/reference can represent many forms.

## Diagram

```text
            Vehicle
               │
      ┌────────┼────────┐
      │        │        │
     Car     Bike     Boat
```

## Example

```java
Vehicle vehicle = new Car();
```

## Runtime Polymorphism

```java
vehicle.go();
```

Java decides which method runs at runtime.

## Interview Notes

- Achieved through inheritance/interfaces.
- Method overriding is required.