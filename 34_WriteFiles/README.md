# 📝 Writing Files in Java

## Definition

Java allows programs to create files and write data to them.

This is useful for:

- Saving user data
- Creating reports
- Writing logs
- Exporting information

---

# File Writing Flow

```text
Program
   │
   ▼
FileWriter
   │
   ▼
Write Text
   │
   ▼
Save File
   │
   ▼
Close File
```

---

# Diagram

```text
            Java Program
                   │
                   ▼
        ┌──────────────────┐
        │   FileWriter     │
        └────────┬─────────┘
                 │
                 ▼
         Write Text Content
                 │
                 ▼
            test.txt
```

---

# Main Class Used

## FileWriter

Used to write text to a file.

```java
FileWriter writer = new FileWriter("test.txt");
```

---

# Writing Data

```java
writer.write(textContent);
```

Writes the contents of the String into the file.

---

# try-with-resources

```java
try(FileWriter writer = new FileWriter(filePath))
```

Automatically closes the file.

Equivalent to:

```java
FileWriter writer = new FileWriter(filePath);

try{
   ...
}
finally{
   writer.close();
}
```

---

# Exceptions Used

## FileNotFoundException

Occurs when Java cannot find the file path.

Example:

```java
"C:\\WrongFolder\\test.txt"
```

---

## IOException

Occurs during reading/writing operations.

Example:

```java
writer.write(...)
```

fails unexpectedly.

---

# Common File Writing Classes

| Class | Best Use |
|---------|---------|
| `FileWriter` | Small/medium text files |
| `BufferedWriter` | Large text files |
| `PrintWriter` | Reports and formatted output |
| `FileOutputStream` | Images, audio, binary files |

---

# Memory Diagram

```text
String textContent
        │
        ▼

"Roses are Red..."

        │
        ▼

FileWriter
        │
        ▼

test.txt
```

---

# Example Output

Console:

```text
File has been written
```

File:

```text
Roses are Red
Violets are Blue
BOOTY BOOTY BOOTY
ROCKIN' EVERYWHERE!
```

---

# Interview Notes

## What does FileWriter do?

Writes character data to a file.

---

## Why use try-with-resources?

Automatically closes files.

Prevents resource leaks.

---

## Difference Between FileWriter and FileOutputStream?

| FileWriter | FileOutputStream |
|-------------|-----------------|
| Text Files | Binary Files |
| Characters | Raw Bytes |
| .txt files | Images, Audio |

---

# Quick Revision Cheat Sheet

```text
FileWriter
    ↓
Write text files

writer.write()
    ↓
Write content

try-with-resources
    ↓
Auto close file

FileNotFoundException
    ↓
Bad file path

IOException
    ↓
File operation failed
```