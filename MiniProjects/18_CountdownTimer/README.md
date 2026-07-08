# ⏳ Java Countdown Timer

## 📌 Definition

A Countdown Timer is a program that counts down from a given number of seconds until it reaches zero.

This program uses Java's `Timer` and `TimerTask` classes to execute a countdown every second.

---

# 🎯 Objective

This program:

- Takes countdown seconds from the user.
- Decreases the value every second.
- Displays each countdown number.
- Prints a final message when the countdown finishes.

---

# 🛠 Concepts Used

- Scanner
- Timer
- TimerTask
- Anonymous Class
- Method Overriding
- Scheduling
- Variables
- Conditional Statements

---

# 🔄 Program Flow

```text
START
  │
  ▼
Ask user for seconds
  │
  ▼
Store value in response
  │
  ▼
Create Timer
  │
  ▼
Create TimerTask
  │
  ▼
Override run()
  │
  ▼
Start timer
  │
  ▼
Print countdown
  │
  ▼
Decrease count
  │
  ▼
count < 0 ?
  │
 ┌──────────┐
 │          │
 NO        YES
 │          │
Repeat   Print HAPPY NEW YEAR
 │          │
 └────Stop Timer
```

---

# 🏗 Architecture Diagram

```text
              User Input
                  │
                  ▼
              Scanner
                  │
                  ▼
            response variable
                  │
                  ▼
                Timer
                  │
                  ▼
             TimerTask
          (Anonymous Class)
                  │
                  ▼
                run()
                  │
        ┌─────────┴─────────┐
        ▼                   ▼
    Print count        count--
                              │
                              ▼
                       count < 0?
                              │
                     ┌────────┴────────┐
                     ▼                 ▼
                    NO                YES
                     │                 │
                 Continue        Cancel Timer
                                    │
                                    ▼
                             HAPPY NEW YEAR
```

---

# 🧩 Variables Used

| Variable | Type | Purpose |
|---|---|---|
| scanner | Scanner | Reads user input |
| response | int | Starting countdown value |
| timer | Timer | Controls scheduling |
| task | TimerTask | Contains countdown logic |
| count | int | Current countdown number |

---

# 📚 Classes Used

| Class | Purpose |
|---|---|
| Scanner | Takes input from user |
| Timer | Schedules repeated execution |
| TimerTask | Defines the task to execute |

---

# 🔧 Important Methods

## Scanner

| Method | Purpose |
|---|---|
| `nextInt()` | Reads integer input |

---

## Timer

| Method | Purpose |
|---|---|
| `scheduleAtFixedRate()` | Runs task repeatedly |
| `cancel()` | Stops timer |

---

## TimerTask

| Method | Purpose |
|---|---|
| `run()` | Code executed every interval |

---

# 💡 Code Explanation

## Getting User Input

```java
int response = scanner.nextInt();
```

Example:

```
Enter seconds: 5
```

---

## Creating Countdown

```java
int count = response;
```

If user enters:

```
5
```

The countdown starts:

```
5
4
3
2
1
0
```

---

## Scheduling Timer

```java
timer.scheduleAtFixedRate(task,0,1000);
```

Meaning:

| Value | Meaning |
|---|---|
| task | Code to execute |
| 0 | Start immediately |
| 1000 | Repeat every 1 second |

---

# ▶ Example Output

```
Enter the number of secs to countDown from: 5

5
4
3
2
1
0
HAPPY NEW YEAR
```

---

# 📝 Interview Notes

### What is Timer?

A class used to schedule tasks.

---

### What is TimerTask?

A class representing a task executed by Timer.

---

### Difference between schedule() and scheduleAtFixedRate()?

| schedule() | scheduleAtFixedRate() |
|-|-|
| Executes once or repeated with delay | Executes repeatedly at fixed interval |
| Timing depends on completion | Maintains fixed frequency |

---

### Why use Anonymous Class here?

Because the TimerTask is only needed once.

---

# 🧠 Quick Revision Cheat Sheet

```text
Scanner
   │
   ▼
User enters seconds

   │

Timer
   │
   ▼
TimerTask

   │

run()
   │
   ▼

Print count
   │
   ▼
count--

   │

count < 0 ?

YES
 │
 ▼
Cancel Timer
 │
 ▼
HAPPY NEW YEAR
```

---

# ⏰ Timer Timeline Example

For input = 5

```text
Time 0 sec → 5
Time 1 sec → 4
Time 2 sec → 3
Time 3 sec → 2
Time 4 sec → 1
Time 5 sec → 0
Time 6 sec → HAPPY NEW YEAR
```