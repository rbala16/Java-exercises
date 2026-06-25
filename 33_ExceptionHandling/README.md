# ⚠️ Exception Handling

## Definition

An exception is an event that interrupts the normal flow of a program.

Exception handling prevents a program from crashing when an error occurs.

---

# Why Use Exception Handling?

Without handling:

```java
int x = 10 / 0;
```

Program crashes.

With handling:

```java
try{
    int x = 10 / 0;
}
catch(Exception e){
    System.out.println("Error occurred");
}
```

Program continues running.

---

# Keywords

| Keyword | Purpose |
|----------|----------|
| `try` | Contains risky code |
| `catch` | Handles exceptions |
| `finally` | Always executes |
| `throw` | Creates an exception |
| `throws` | Declares exceptions |

---

# Basic Structure

```java
try{
    // dangerous code
}
catch(Exception e){
    // handle error
}
finally{
    // always executes
}
```

---

# Program Flow Diagram

```text
               Start
                 │
                 ▼
           try { code }
                 │
        ┌────────┴────────┐
        │                 │
        ▼                 ▼
   No Exception      Exception Occurs
        │                 │
        ▼                 ▼
 Continue Program    catch block runs
        │                 │
        └────────┬────────┘
                 ▼
            finally
                 │
                 ▼
                End
```

---

# Exceptions Used In This Exercise

## InputMismatchException

Occurs when input type doesn't match.

Example:

```text
Enter a number:
hello
```

Result:

```text
That wasn't a number
```

---

## ArithmeticException

Occurs during illegal arithmetic operations.

Example:

```java
int result = 10 / 0;
```

Result:

```text
You can't divide by zero
```

---

## Exception

Parent class of most exceptions.

Acts as a backup catch block.

```java
catch(Exception e)
```

---

# Catch Block Order

Most specific first.

✅ Correct

```java
catch(InputMismatchException e)

catch(ArithmeticException e)

catch(Exception e)
```

❌ Wrong

```java
catch(Exception e)

catch(InputMismatchException e)
```

The compiler will complain because Exception catches everything.

---

# Finally Block

Always executes.

```java
finally{
    scanner.close();
}
```

Even if:

- Exception occurs
- No exception occurs

finally still runs.

---

# Memory Diagram

```text
Scanner
   │
   ▼

try
 │
 ▼

nextInt()

 │
 ├── valid input
 │      ▼
 │   continue
 │
 └── invalid input
        ▼
InputMismatchException
        ▼
catch block
        ▼
finally
```

---

# Common Exceptions

| Exception | Cause |
|------------|--------|
| `InputMismatchException` | Wrong input type |
| `ArithmeticException` | Divide by zero |
| `NullPointerException` | Null object access |
| `ArrayIndexOutOfBoundsException` | Invalid array index |
| `FileNotFoundException` | Missing file |
| `NumberFormatException` | Invalid parse |

---

# Example Run

## Valid Input

```text
Enter a number: 25

You entered: 25

This always executes
```

---

## Invalid Input

```text
Enter a number: hello

That wasn't a number

This always executes
```

---

# Interview Notes

## What is an exception?

An error that occurs while a program is running.

---

## What does try do?

Contains code that may throw exceptions.

---

## What does catch do?

Handles exceptions.

---

## What does finally do?

Always executes.

Usually used for cleanup.

---

# Quick Revision Cheat Sheet

```text
try
 ↓
Dangerous code

catch
 ↓
Handle exception

finally
 ↓
Always runs

InputMismatchException
 ↓
Wrong input type

ArithmeticException
 ↓
Divide by zero

Exception
 ↓
Generic backup catch block
```