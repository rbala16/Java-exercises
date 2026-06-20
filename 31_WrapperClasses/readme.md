# 📦 Java Wrapper Classes & Utility Methods Cheat Sheet

## 🧠 What are Wrapper Classes?

Wrapper classes allow primitive data types to be used as objects.

| Primitive | Wrapper Class |
|-----------|--------------|
| `int` | `Integer` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

---

# 🔄 Common Conversions

## String → Primitive

| Method | Example | Result |
|---------|---------|---------|
| `Integer.parseInt()` | `Integer.parseInt("123")` | `123` |
| `Double.parseDouble()` | `Double.parseDouble("3.14")` | `3.14` |
| `Boolean.parseBoolean()` | `Boolean.parseBoolean("true")` | `true` |

### Example

```java
int age = Integer.parseInt("25");
double price = Double.parseDouble("19.99");
boolean valid = Boolean.parseBoolean("true");
```

---

## Primitive → String

| Method | Example | Result |
|---------|---------|---------|
| `Integer.toString()` | `Integer.toString(123)` | `"123"` |
| `Double.toString()` | `Double.toString(3.14)` | `"3.14"` |
| `Character.toString()` | `Character.toString('@')` | `"@"` |
| `Boolean.toString()` | `Boolean.toString(false)` | `"false"` |

### Example

```java
String age = Integer.toString(25);
String price = Double.toString(19.99);
```

---

# 📦 Integer Utility Methods

| Method | Example | Output |
|---------|---------|---------|
| `parseInt()` | `Integer.parseInt("123")` | `123` |
| `toString()` | `Integer.toString(123)` | `"123"` |
| `valueOf()` | `Integer.valueOf("123")` | Integer Object |
| `max()` | `Integer.max(5, 10)` | `10` |
| `min()` | `Integer.min(5, 10)` | `5` |
| `sum()` | `Integer.sum(5, 10)` | `15` |

### Example

```java
System.out.println(Integer.max(10, 20));
System.out.println(Integer.min(10, 20));
System.out.println(Integer.sum(10, 20));
```

---

# 🔢 Double Utility Methods

| Method | Example | Output |
|---------|---------|---------|
| `parseDouble()` | `Double.parseDouble("3.14")` | `3.14` |
| `toString()` | `Double.toString(3.14)` | `"3.14"` |
| `valueOf()` | `Double.valueOf("3.14")` | Double Object |
| `max()` | `Double.max(2.5, 4.8)` | `4.8` |
| `min()` | `Double.min(2.5, 4.8)` | `2.5` |

---

# 🔤 Character Utility Methods

| Method | Example | Output |
|---------|---------|---------|
| `isLetter()` | `Character.isLetter('A')` | `true` |
| `isDigit()` | `Character.isDigit('5')` | `true` |
| `isUpperCase()` | `Character.isUpperCase('A')` | `true` |
| `isLowerCase()` | `Character.isLowerCase('a')` | `true` |
| `toUpperCase()` | `Character.toUpperCase('a')` | `'A'` |
| `toLowerCase()` | `Character.toLowerCase('A')` | `'a'` |
| `toString()` | `Character.toString('@')` | `"@"` |

### Example

```java
char letter = 'b';

System.out.println(Character.isLetter(letter));
System.out.println(Character.isUpperCase(letter));
System.out.println(Character.toUpperCase(letter));
```

---

# ✅ Boolean Utility Methods

| Method | Example | Output |
|---------|---------|---------|
| `parseBoolean()` | `Boolean.parseBoolean("true")` | `true` |
| `toString()` | `Boolean.toString(false)` | `"false"` |
| `valueOf()` | `Boolean.valueOf("true")` | Boolean Object |

---

# 📝 Useful String Methods

| Method | Example | Output |
|---------|---------|---------|
| `charAt()` | `"Pizza".charAt(0)` | `'P'` |
| `length()` | `"Pizza".length()` | `5` |
| `toUpperCase()` | `"pizza".toUpperCase()` | `"PIZZA"` |
| `toLowerCase()` | `"PIZZA".toLowerCase()` | `"pizza"` |
| `contains()` | `"Pizza".contains("zz")` | `true` |
| `equals()` | `"abc".equals("abc")` | `true` |
| `substring()` | `"Pizza".substring(1,4)` | `"izz"` |

---

# 🔥 Most Important Methods for Interviews

| Purpose | Method |
|----------|----------|
| String → int | `Integer.parseInt()` |
| String → double | `Double.parseDouble()` |
| String → boolean | `Boolean.parseBoolean()` |
| int → String | `Integer.toString()` |
| double → String | `Double.toString()` |
| char → String | `Character.toString()` |
| Check if character is a letter | `Character.isLetter()` |
| Check if character is a digit | `Character.isDigit()` |
| Check uppercase | `Character.isUpperCase()` |
| Check lowercase | `Character.isLowerCase()` |
| Convert to uppercase | `Character.toUpperCase()` |
| Convert to lowercase | `Character.toLowerCase()` |

---

# 🧠 Quick Memory Map

```text
String → Primitive
------------------
Integer.parseInt()
Double.parseDouble()
Boolean.parseBoolean()

Primitive → String
------------------
Integer.toString()
Double.toString()
Character.toString()
Boolean.toString()

Character Checks
----------------
isLetter()
isDigit()
isUpperCase()
isLowerCase()

Character Conversion
--------------------
toUpperCase()
toLowerCase()
```

---

# 🎯 90% Beginner Java Methods

1. `Integer.parseInt()`
2. `Double.parseDouble()`
3. `Integer.toString()`
4. `Double.toString()`
5. `Character.isLetter()`
6. `Character.isDigit()`
7. `Character.toUpperCase()`
8. `Character.toLowerCase()`
9. `String.charAt()`
10. `String.length()`

These are the methods you'll use most frequently in beginner Java, coding exercises, and interviews.