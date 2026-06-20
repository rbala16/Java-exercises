# 🧩 Interfaces

## Definition

A contract that forces classes to implement methods.

## Diagram

```text
        Prey           Predator
          │               │
      ┌───┘               └───┐
      │                       │
    Rabbit                  Hawk

             Fish
       implements both
```

## Keyword

```java
implements
```

## Example

```java
class Fish implements Prey, Predator
```

## Interview Notes

- Supports multiple inheritance behavior.
- Methods must be implemented.