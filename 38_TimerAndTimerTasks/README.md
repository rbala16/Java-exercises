# ⏰ Java Timer & TimerTask

## 📌 Definition

`Timer` is a Java class used to schedule tasks that run once or repeatedly after a specified delay.

`TimerTask` represents the task that the `Timer` executes.

Usually, you override the `run()` method to define what should happen when the timer executes.

---

# 🎯 Objective

This program demonstrates how to:

- Create a Timer.
- Create a TimerTask.
- Execute a task repeatedly.
- Stop the timer after a certain number of executions.

---

# 🛠 Concepts Used

- Timer
- TimerTask
- Anonymous Class
- Method Overriding
- Scheduling
- Countdown

---

# 🔄 Program Flow

```text
Start
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
Wait 3 seconds
   │
   ▼
Print "Hello!"
   │
   ▼
Decrease count
   │
   ▼
count > 0 ?
   │
 ┌─┴──────────┐
 │            │
Yes          No
 │            │
 │       Cancel Timer
 │            │
 └────Repeat──┘
```

---

# 🧩 Variables Used

| Variable | Type | Purpose |
|----------|------|---------|
| timer | Timer | Schedules tasks |
| task | TimerTask | Task executed by the timer |
| count | int | Tracks remaining executions |

---

# 📚 Classes Used

| Class | Purpose |
|--------|---------|
| Timer | Schedules tasks |
| TimerTask | Defines the work to perform |

---

# 🔧 Important Methods

## Timer

| Method | Description |
|---------|-------------|
| schedule(task, delay, period) | Schedule repeated task |
| cancel() | Stop timer |

---

## TimerTask

| Method | Description |
|---------|-------------|
| run() | Code executed by the timer |

---

# 💡 Code Explanation

## 1. Create Timer

```java
Timer timer = new Timer();
```

Creates a scheduler.

---

## 2. Create TimerTask

```java
TimerTask task = new TimerTask(){...};
```

Creates an anonymous TimerTask.

---

## 3. Override run()

```java
public void run()
```

Runs every time the timer triggers.

---

## 4. Schedule Task

```java
timer.schedule(task,3000,1000);
```

Meaning:

- Wait 3 seconds
- Run every 1 second

---

## 5. Cancel Timer

```java
timer.cancel();
```

Stops all future executions.

---

# ▶ Example Output

```text
(Wait 3 seconds...)

Hello!
Hello!
Hello!
Task completed!
```

---

# 📝 Interview Notes

### What is Timer?

Schedules tasks to execute later or repeatedly.

---

### What is TimerTask?

Represents the task executed by the Timer.

---

### Why override run()?

Because `run()` contains the code executed each time the timer fires.

---

### Why call cancel()?

Stops the timer and releases resources.

---

# 🧠 Quick Revision Cheat Sheet

```text
Timer
│
├── schedule()
├── cancel()

TimerTask
│
└── run()

schedule(task, delay, period)

delay → first execution
period → repeat interval
```