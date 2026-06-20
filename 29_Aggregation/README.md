# 📚 Aggregation

## Definition

A HAS-A relationship where objects can exist independently.

## Diagram

```text
Library
   │
   ├── Book
   ├── Book
   └── Book
```

## Example

```java
Library HAS-A Book
```

## Interview Notes

If Library is deleted:

Books still exist.