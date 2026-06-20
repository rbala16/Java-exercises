# 🚗 Composition

## Definition

A PART-OF relationship where objects depend on the owner.

## Diagram

```text
Car
 │
 └── Engine
```

## Example

```java
this.engine = new Engine(type);
```

## Interview Notes

If Car is deleted:

Engine is deleted too.