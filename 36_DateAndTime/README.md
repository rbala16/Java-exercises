# 📅 Java Date & Time API

## 📌 Definition

Java Date & Time API (`java.time`) is used to work with:

- Dates
- Times
- Timestamps
- Date formatting
- Date comparisons

It replaces older classes like `Date` and `Calendar`.

---

# 🎯 Objective

This program demonstrates how to:

- Get current date
- Get current time
- Get UTC timestamp
- Format date/time
- Compare dates and times

---

# 🛠 Concepts Used

- LocalDate
- LocalTime
- LocalDateTime
- Instant (UTC time)
- DateTimeFormatter
- Conditional statements
- Comparison methods

---

# 🔄 Program Flow

```text
Start
  │
  ▼
Get LocalDate (Date)
  │
  ▼
Get LocalTime (Time)
  │
  ▼
Get LocalDateTime (Date + Time)
  │
  ▼
Get Instant (UTC Time)
  │
  ▼
Format DateTime
  │
  ▼
Compare Two DateTimes
  │
  ▼
Print Result
```

---

# 🧩 Architecture Diagram

```text
        Java Time API
              │
 ┌────────────┼────────────┐
 ▼            ▼            ▼
LocalDate   LocalTime   Instant
   │            │           │
   └──────┬─────┘           │
          ▼                 ▼
   LocalDateTime      UTC Timestamp
          │
          ▼
 DateTimeFormatter
          │
          ▼
   Formatted Output
```

---

# 📚 Classes Used

| Class | Purpose |
|------|--------|
| LocalDate | Only date (YYYY-MM-DD) |
| LocalTime | Only time (HH:MM:SS) |
| LocalDateTime | Date + Time |
| Instant | UTC timestamp |
| DateTimeFormatter | Format output |

---

# 🔧 Methods Used

## LocalDate / LocalTime / LocalDateTime

| Method | Description |
|--------|-------------|
| `now()` | Get current value |
| `of()` | Create custom date/time |

---

## Comparison Methods

| Method | Description |
|--------|-------------|
| `isBefore()` | Checks if earlier |
| `isAfter()` | Checks if later |
| `isEqual()` | Checks if same |

---

## DateTimeFormatter

| Method | Description |
|--------|-------------|
| `ofPattern()` | Define format |
| `format()` | Convert date to string |

---

# ⚠️ Notes

- `Instant` uses UTC time (not local timezone)
- `LocalDateTime` does NOT include timezone
- Formatting only affects display, not actual value

---

# 💡 Code Explanation

## 1. Get Current Date

```java
LocalDate.now();
```

Output:
```text
2026-06-25
```

---

## 2. Get Current Time

```java
LocalTime.now();
```

Output:
```text
14:35:22
```

---

## 3. Get Current Date + Time

```java
LocalDateTime.now();
```

Output:
```text
2026-06-25T14:35:22
```

---

## 4. Format Date

```java
DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
```

Example Output:

```text
25-06-2026 14:35:22
```

---

## 5. Compare Dates

```java
date1.isBefore(date2)
```

Used to check order of time.

---

# 🧠 Quick Revision Cheat Sheet

```text
LocalDate → Date only
LocalTime → Time only
LocalDateTime → Date + Time
Instant → UTC time

now() → current value
of() → custom value

isBefore() → earlier
isAfter() → later
isEqual() → same

DateTimeFormatter → format output
```

---

# 📝 Interview Notes

### What is Instant?

Represents UTC timestamp (global time).

---

### Difference between LocalDate and LocalDateTime?

| LocalDate | LocalDateTime |
|-----------|--------------|
| Only date | Date + time |

---

### Why use DateTimeFormatter?

To convert date into readable format.

---

### Why use java.time package?

Modern, thread-safe, and better than old Date/Calendar API.