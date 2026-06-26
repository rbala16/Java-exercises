# 🎮 Java Hangman Game

## 📌 Definition

Hangman is a classic word-guessing game where the player attempts to guess a hidden word one letter at a time. For each incorrect guess, a part of the hangman is drawn. The game ends when the player guesses the entire word or reaches the maximum number of incorrect guesses.

---

# 🎯 Objective

This program:

- Reads a list of words from a text file.
- Randomly selects one word.
- Hides the word using underscores (`_`).
- Allows the user to guess one letter at a time.
- Reveals correct letters.
- Draws the hangman after each wrong guess.
- Ends when the player wins or loses.

---

# 🛠 Concepts Used

- File Handling (`BufferedReader`, `FileReader`)
- Exception Handling
- ArrayList
- Random
- Scanner
- Strings
- Characters
- Loops (`while`, `for`)
- Conditional Statements (`if`, `switch`)
- Methods

---

# 🔄 Program Flow

```text
Start
   │
   ▼
Read words.txt
   │
   ▼
Store words in ArrayList
   │
   ▼
Randomly choose one word
   │
   ▼
Create hidden word
(_ _ _ _ _)
   │
   ▼
Display Hangman
   │
   ▼
Ask player for a letter
   │
   ├───────────────┐
   ▼               ▼
Correct         Incorrect
Guess            Guess
   │               │
Reveal         Increase
Letter      wrongGuesses
   │               │
   └───────┬───────┘
           ▼
Check Win / Lose
           │
    ┌──────┴───────┐
    ▼              ▼
YOU WIN      GAME OVER
```

---

# 🏗 Architecture Diagram

```text
              words.txt
                   │
                   ▼
      BufferedReader + FileReader
                   │
                   ▼
      ArrayList<String> words
                   │
                   ▼
              Random Class
                   │
                   ▼
          Selected Random Word
                   │
                   ▼
 ArrayList<Character> wordState
        (_ _ _ _ _ _)
                   │
                   ▼
            Main Game Loop
                   │
        ┌──────────┴──────────┐
        ▼                     ▼
 Correct Guess         Wrong Guess
        │                     │
 Reveal Letter      wrongGuesses++
        │                     │
        └──────────┬──────────┘
                   ▼
             Win or Lose?
```

---

# 🧩 Variables Used

| Variable | Type | Purpose |
|----------|------|---------|
| `filePath` | String | Stores the path to the words file |
| `words` | ArrayList<String> | Stores all words from the file |
| `word` | String | Randomly selected word |
| `scanner` | Scanner | Reads user input |
| `wordState` | ArrayList<Character> | Stores the current visible state of the word |
| `wrongGuesses` | int | Counts incorrect guesses |
| `guess` | char | Stores the player's guessed letter |
| `line` | String | Reads one line from the text file |

---

# 📚 Classes Used

| Class | Purpose |
|---------|---------|
| `BufferedReader` | Reads the file line by line |
| `FileReader` | Opens the text file |
| `ArrayList` | Stores words and guessed letters |
| `Random` | Selects a random word |
| `Scanner` | Reads keyboard input |

---

# 🔧 Methods Used

## BufferedReader

| Method | Description |
|---------|-------------|
| `readLine()` | Reads one line from the file |

---

## ArrayList

| Method | Description |
|---------|-------------|
| `add()` | Adds an item |
| `get()` | Retrieves an item |
| `set()` | Replaces an item |
| `contains()` | Checks if an item exists |
| `size()` | Returns the number of items |

---

## String

| Method | Description |
|---------|-------------|
| `trim()` | Removes leading and trailing spaces |
| `length()` | Returns the number of characters |
| `charAt()` | Returns the character at a specific index |
| `indexOf()` | Checks whether a character exists |
| `toLowerCase()` | Converts text to lowercase |

---

## Scanner

| Method | Description |
|---------|-------------|
| `next()` | Reads one word from the keyboard |

---

## Random

| Method | Description |
|---------|-------------|
| `nextInt()` | Generates a random number |

---

# ⚠️ Exceptions Handled

| Exception | Cause |
|------------|-------|
| `FileNotFoundException` | File path is incorrect |
| `IOException` | Error while reading the file |

---

# 💡 Code Explanation

## 1. Read Words

The program opens `words.txt` and reads every line.

```java
while ((line = reader.readLine()) != null) {
    words.add(line.trim());
}
```

---

## 2. Select Random Word

One random word is chosen from the list.

```java
String word = words.get(random.nextInt(words.size()));
```

---

## 3. Create Hidden Word

Each letter is replaced with an underscore.

Example:

```text
APPLE

↓

_ _ _ _ _
```

---

## 4. Start Game Loop

The loop continues until:

- Player wins
- Player reaches six wrong guesses

```java
while(wrongGuesses < 6)
```

---

## 5. Read Player Guess

The player enters one letter.

```java
char guess = scanner.next()
                    .toLowerCase()
                    .charAt(0);
```

---

## 6. Correct Guess

If the guessed letter exists, reveal every occurrence.

Example:

```text
BANANA

Guess: A

↓

_ A _ A _ A
```

---

## 7. Wrong Guess

Increase the number of wrong guesses.

```java
wrongGuesses++;
```

---

## 8. Check Win

If there are no underscores left:

```java
!wordState.contains('_')
```

The player wins.

---

## 9. Check Lose

If:

```java
wrongGuesses >= 6
```

The game ends.

---

# 🎨 Hangman Stages

```text
0 Wrong



1 Wrong

 o


2 Wrong

 o
 |


3 Wrong

 o
/|


4 Wrong

 o
/|\


5 Wrong

 o
/|\
/


6 Wrong

 o
/|\
/ \
```

---

# ▶ Example Output

```text
************************
Welcome to Java Hangman!
************************

Word:
_ _ _ _ _

Guess a letter:
a

Correct guess!

Word:
_ A _ A _

Guess a letter:
z

Wrong guess

 o
```

---

# 📝 Interview Notes

### Why use an ArrayList for `wordState`?

Because letters need to be updated individually using `set()`.

---

### Why use `Random`?

To choose a different word every time the game starts.

---

### Why use `BufferedReader`?

It efficiently reads text files one line at a time.

---

### Why use `indexOf()`?

To quickly check whether the guessed letter exists in the word.

---

### Why use `contains('_')`?

To determine whether the player has guessed all letters.

---

# 🧠 Quick Revision Cheat Sheet

```text
BufferedReader
        │
        ▼
Read words.txt

        │
        ▼
ArrayList<String>

        │
        ▼
Random Word

        │
        ▼
Create _ _ _ _

        │
        ▼
while()

        │
        ▼
Player Guess

        │
   ┌────┴────┐
   ▼         ▼
Correct    Wrong
   │         │
Reveal   wrongGuesses++

   │
   ▼
No '_' Left?
   │
YES → YOU WIN

6 Wrong Guesses?
   │
YES → GAME OVER
```