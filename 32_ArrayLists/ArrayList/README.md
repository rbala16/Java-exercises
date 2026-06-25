# 📋 ArrayList in Java

## Definition

An `ArrayList` is a resizable array that can grow or shrink dynamically.

Unlike regular arrays, ArrayLists do not have a fixed size.

```java
ArrayList<String> fruits = new ArrayList<>();
```

---

# Why Use ArrayList?

### Array

```java
String[] fruits = new String[5];
```

✅ Fast

❌ Fixed size

---

### ArrayList

```java
ArrayList<String> fruits = new ArrayList<>();
```

✅ Dynamic size

✅ Built-in methods

✅ Easy to add/remove elements

---

# Import Statements

```java
import java.util.ArrayList;
import java.util.Collections;
```

---

# Syntax

```java
ArrayList<DataType> list = new ArrayList<>();
```

Examples:

```java
ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<Double> prices = new ArrayList<>();
ArrayList<String> fruits = new ArrayList<>();
```

---

# Diagram

```text
ArrayList<String> fruits

┌───────────┐
│ Orange    │
├───────────┤
│ Mango     │
├───────────┤
│ PineApple │
├───────────┤
│ Banana    │
├───────────┤
│ Apple     │
└───────────┘
```

---

# Commonly Used Methods

| Method | Description | Example |
|----------|----------|----------|
| `add()` | Add element | `fruits.add("Apple")` |
| `remove()` | Remove element | `fruits.remove(0)` |
| `set()` | Replace element | `fruits.set(0,"Coconut")` |
| `get()` | Get element | `fruits.get(1)` |
| `size()` | Number of elements | `fruits.size()` |
| `contains()` | Check existence | `fruits.contains("Apple")` |
| `clear()` | Remove all elements | `fruits.clear()` |
| `isEmpty()` | Check if empty | `fruits.isEmpty()` |
| `indexOf()` | Find position | `fruits.indexOf("Apple")` |
| `lastIndexOf()` | Find last occurrence | `fruits.lastIndexOf("Apple")` |

---

# Collections Utility Methods

| Method | Description | Example |
|----------|----------|----------|
| `sort()` | Sort ascending/alphabetically | `Collections.sort(fruits)` |
| `reverse()` | Reverse order | `Collections.reverse(fruits)` |
| `shuffle()` | Random order | `Collections.shuffle(fruits)` |
| `max()` | Largest element | `Collections.max(numbers)` |
| `min()` | Smallest element | `Collections.min(numbers)` |
| `swap()` | Swap positions | `Collections.swap(list,0,1)` |
| `fill()` | Fill list with value | `Collections.fill(list,"Java")` |

---

# Methods Used In This Exercise

## add()

Adds an element to the end.

```java
fruits.add("Orange");
```

Output:

```text
[Orange]
```

---

## remove()

Removes an element by index.

```java
fruits.remove(0);
```

Before:

```text
[Orange, Mango, Apple]
```

After:

```text
[Mango, Apple]
```

---

## set()

Replaces an element.

```java
fruits.set(0, "Coconut");
```

Before:

```text
[Mango, Apple]
```

After:

```text
[Coconut, Apple]
```

---

## get()

Returns an element.

```java
fruits.get(1);
```

Output:

```text
Apple
```

---

## sort()

Sorts alphabetically.

```java
Collections.sort(fruits);
```

Before:

```text
[Coconut, PineApple, Banana, Apple]
```

After:

```text
[Apple, Banana, Coconut, PineApple]
```

---

# Enhanced For Loop

Used to iterate through all elements.

```java
for(String fruit : fruits){
    System.out.println(fruit);
}
```

Equivalent to:

```java
for(int i = 0; i < fruits.size(); i++){
    System.out.println(fruits.get(i));
}
```

---

# Autoboxing

ArrayLists store objects, not primitives.

Java automatically converts primitives into wrapper objects.

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(3);
```

Internally:

```java
numbers.add(Integer.valueOf(3));
```

This is called:

```text
Autoboxing
```

---

# Memory Diagram

```text
STACK
-----

fruits
   │
   ▼

HEAP
--------------------------------

ArrayList
 ├── Orange
 ├── Mango
 ├── PineApple
 ├── Banana
 └── Apple
```

---

# Array vs ArrayList

| Feature | Array | ArrayList |
|----------|----------|----------|
| Size | Fixed | Dynamic |
| Stores Primitives | Yes | No (Wrapper Classes) |
| Built-in Methods | No | Yes |
| Can Grow | No | Yes |
| Easy Add/Remove | No | Yes |

---

# Time Complexity

| Operation | Complexity |
|------------|------------|
| `add()` | O(1) |
| `get()` | O(1) |
| `set()` | O(1) |
| `remove()` | O(n) |
| `contains()` | O(n) |
| `sort()` | O(n log n) |

---

# Interview Notes

### Most Common Methods

```java
add()
remove()
set()
get()
size()
contains()
clear()
isEmpty()
sort()
```

### Most Common Question

Why use ArrayList instead of Array?

Answer:

- Dynamic size
- Easy insertion/removal
- Many built-in methods

---

# Quick Revision Cheat Sheet

```text
add()        -> Add element
remove()     -> Delete element
set()        -> Update element
get()        -> Read element
size()       -> Count elements
contains()   -> Check existence
clear()      -> Remove all
isEmpty()    -> Empty check

Collections.sort()      -> Sort
Collections.reverse()   -> Reverse
Collections.shuffle()   -> Randomize
Collections.max()       -> Largest
Collections.min()       -> Smallest
```

---

