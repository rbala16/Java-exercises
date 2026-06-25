# 📂 Reading Files in Java

## Definition

File reading allows a Java program to retrieve data stored inside a file.

Common uses:

- Reading configuration files
- Reading reports
- Loading saved data
- Processing text files

---

# File Reading Flow

```text
File
 │
 ▼
FileReader
 │
 ▼
BufferedReader
 │
 ▼
readLine()
 │
 ▼
Program Output
```

---

# Diagram

```text
          test.txt
              │
              ▼
        FileReader
              │
              ▼
      BufferedReader
              │
              ▼
         readLine()
              │
              ▼
      System.out.println()
```

---

# Main Classes Used

## FileReader

Used to open a text file.

```java
new FileReader(filePath)
```

---

## BufferedReader

Reads text efficiently.

```java
new BufferedReader(...)
```

Benefits:

- Faster
- Reads line-by-line
- Less memory usage

---

# Reading Lines

```java
String line;
```

Stores one line from the file.

---

## readLine()

```java
reader.readLine();
```

Returns:

- Next line as a String
- `null` if end of file is reached

Example:

```text
Hello
World
```

Read sequence:

```text
Hello
World
null
```

---

# While Loop

```java
while((line = reader.readLine()) != null)
```

Meaning:

```text
Read a line
     │
     ▼
Line exists?
     │
 ┌───┴───┐
 │       │
Yes      No
 │       │
 ▼       ▼
Print   Stop
```

---

# try-with-resources

```java
try(BufferedReader reader = ...)
```

Automatically closes the file.

Equivalent to:

```java
finally{
    reader.close();
}
```

---

# Exceptions

## FileNotFoundException

Occurs when file path is invalid.

Example:

```java
"C:\\WrongFolder\\test.txt"
```

---

## IOException

Occurs during file reading operations.

Example:

```java
reader.readLine();
```

fails unexpectedly.

---

# Common File Reading Classes

| Class | Best Use |
|---------|---------|
| `BufferedReader` | Read text files |
| `FileReader` | Open text files |
| `Scanner` | Simple text input |
| `FileInputStream` | Binary files |
| `RandomAccessFile` | Large files / specific positions |

---

# Memory Diagram

```text
test.txt

Line 1
Line 2
Line 3

      │
      ▼

BufferedReader

      │
      ▼

line Variable

"Line 1"
"Line 2"
"Line 3"
```

---

# Example File

test.txt

```text
Roses are Red
Violets are Blue
Java is Fun
And Powerful Too
```

---

# Example Output

```text
Roses are Red
Violets are Blue
Java is Fun
And Powerful Too
```

---

# Reading vs Writing

| Writing | Reading |
|-----------|-----------|
| FileWriter | FileReader |
| write() | readLine() |
| Save data | Retrieve data |
| Output → File | File → Program |

---

# Interview Notes

## Why use BufferedReader?

Efficient reading of text files.

---

## Why use readLine()?

Reads one complete line at a time.

---

## What does readLine() return at the end?

```java
null
```

---

## Why use try-with-resources?

Automatically closes files.

Prevents memory/resource leaks.

---

# Quick Revision Cheat Sheet

```text
FileReader
    ↓
Open text file

BufferedReader
    ↓
Read efficiently

readLine()
    ↓
Read one line

null
    ↓
End of file

FileNotFoundException
    ↓
Wrong file path

IOException
    ↓
Read error

try-with-resources
    ↓
Auto close file
```