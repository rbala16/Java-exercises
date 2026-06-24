# 🍔 ArrayList with User Input

## Definition

This program combines:

- ArrayList
- Scanner
- Loops

The user enters a number of food items, and the program stores them in an ArrayList.

---

# Concepts Used

## ArrayList

Stores a dynamic list of food items.

```java
ArrayList<String> foods = new ArrayList<>();
```

---

## Scanner

Reads input from the keyboard.

```java
Scanner scanner = new Scanner(System.in);
```

---

## For Loop

Repeats based on how many foods the user wants to enter.

```java
for(int i = 1; i <= numOfFoods; i++)
```

---

# Program Flow

```text
User enters number of foods
            │
            ▼
Loop runs N times
            │
            ▼
User enters food names
            │
            ▼
Foods stored in ArrayList
            │
            ▼
Print ArrayList
```

---

# Memory Diagram

Example Input:

```text
3
Apple
Banana
Pizza
```

Memory:

```text
STACK
-----

foods
  │
  ▼

HEAP
----------------

ArrayList

[Apple]
[Banana]
[Pizza]
```

---

# Code Breakdown

## Create ArrayList

```java
ArrayList<String> foods = new ArrayList<>();
```

Creates an empty list.

---

## Read Number of Foods

```java
int numOfFoods = scanner.nextInt();
```

Example:

```text
3
```

---

## Consume Leftover Newline

```java
scanner.nextLine();
```

Needed because:

```java
nextInt()
```

does not consume the Enter key.

Without it:

```text
First food input gets skipped.
```

---

## Add Foods

```java
foods.add(food);
```

Adds food to the ArrayList.

Example:

```text
Apple
Banana
Pizza
```

Result:

```java
[Apple, Banana, Pizza]
```

---

## Display List

```java
System.out.println(foods);
```

Output:

```text
[Apple, Banana, Pizza]
```

---

# Methods Used

| Method | Description |
|----------|----------|
| `add()` | Add element |
| `nextInt()` | Read integer |
| `nextLine()` | Read text |
| `close()` | Close scanner |

---

# Example Run

```text
Enter the number of food you would like to store: 3

Enter food # : Apple
Enter food # : Banana
Enter food # : Pizza

[Apple, Banana, Pizza]
```

---

# Fully Commented Version

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Used to read user input
        Scanner scanner = new Scanner(System.in);

        // Dynamic list of food names
        ArrayList<String> foods = new ArrayList<>();

        // Ask user how many foods they want to store
        System.out.print("Enter the number of foods you would like to store: ");

        int numOfFoods = scanner.nextInt();

        // Consume leftover newline after nextInt()
        scanner.nextLine();

        /*
         * Loop runs based on number entered
         * Example:
         * User enters 3
         * Loop runs 3 times
         */

        for (int i = 1; i <= numOfFoods; i++) {

            System.out.print("Enter food #" + i + ": ");

            // Read food name
            String food = scanner.nextLine();

            // Store food in ArrayList
            foods.add(food);
        }

        // Print all foods
        System.out.println(foods);

        // Close Scanner
        scanner.close();
    }
}
```

---

# Interview Notes

### Why use ArrayList?

Because the number of foods is unknown beforehand.

```java
ArrayList<String> foods = new ArrayList<>();
```

can grow dynamically.

---

### Why call nextLine() after nextInt()?

```java
scanner.nextLine();
```

removes the leftover Enter key.

Without it:

```text
First String input gets skipped.
```

---

# Quick Revision Cheat Sheet

```text
ArrayList<String> foods = new ArrayList<>();

foods.add(item)       -> Add item

scanner.nextInt()     -> Read integer

scanner.nextLine()    -> Read String

for(...)              -> Repeat N times

System.out.println(list)
                        -> Print list
```