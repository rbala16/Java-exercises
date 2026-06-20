# 🔐 Encapsulation

## Definition
Encapsulation is the process of hiding data and controlling access to it using private fields and public methods (getters/setters).

## Why Use It?
- Protects object data
- Prevents invalid values
- Improves maintainability

## Diagram

```text
                 ┌─────────────────────┐
                 │        Car          │
                 │---------------------│
                 │ private model       │
                 │ private color       │
                 │ private price       │
                 │---------------------│
                 │ getModel()          │
                 │ getColor()          │
                 │ setColor()          │
                 │ setPrice()          │
                 └─────────────────────┘
```

## Key Concepts

### Getter
Makes a field readable.

```java
String getColor(){
    return color;
}
```

### Setter
Makes a field writable.

```java
void setColor(String color){
    this.color = color;
}
```

## Interview Notes
- Use private variables.
- Use getters/setters for controlled access.
- Encapsulation improves security.

## Real World Example
Bank Account balance should not be directly modified.