# 🎵 Java Audio Player (Clip Control)

## Definition

This program demonstrates how to play and control audio files in Java using the `javax.sound.sampled` package.

---

# Features

- ▶ Play audio
- ⏹ Stop audio
- 🔁 Reset audio
- ❌ Quit program

---

# Libraries Used

| Library | Purpose |
|----------|----------|
| `File` | Locate audio file |
| `Scanner` | User input |
| `AudioInputStream` | Read audio data |
| `Clip` | Control playback |
| `AudioSystem` | Load audio system |

---

# Program Flow

```text
Start
  │
  ▼
Load Audio File
  │
  ▼
Create Clip
  │
  ▼
Open Audio Stream
  │
  ▼
Show Menu
  │
  ▼
User Input (P/S/R/Q)
  │
  ▼
Perform Action
  │
  ▼
Loop until Q
  │
  ▼
Close Clip
  │
  ▼
End
```

---

# Diagram

```text
        Audio File (.wav)
                │
                ▼
      AudioInputStream
                │
                ▼
            Clip
     ┌────────┼────────┐
     ▼        ▼        ▼
   Play     Stop     Reset
```

---

# Switch Actions

| Input | Action |
|--------|--------|
| P | Play audio |
| S | Stop audio |
| R | Reset to start |
| Q | Quit program |

---

# Important Methods

## clip.start()

Starts or resumes audio.

---

## clip.stop()

Pauses audio.

---

## clip.setMicrosecondPosition(0)

Resets audio to beginning.

---

## clip.close()

Closes audio resource.

---

# Exceptions

## FileNotFoundException

File path is wrong or file missing.

---

## UnsupportedAudioFileException

File is not a valid audio format.

Example:

- .mp3 ❌
- .wav ✅

---

## LineUnavailableException

Audio system is busy or unavailable.

---

## IOException

General input/output error.

---

# Memory Diagram

```text
User Input
    │
    ▼
Scanner
    │
    ▼
Switch Statement
    │
    ▼
Clip (Audio Control)
    │
 ┌──┼──┬──┐
 ▼  ▼  ▼  ▼
Play Stop Reset Quit
```

---

# Interview Notes

## What is Clip?

A Java object that controls audio playback.

---

## Why use AudioInputStream?

To read audio file data into Java.

---

## Why use try-with-resources?

Automatically closes resources like Scanner and AudioStream.

---

## Why WAV files?

Java Sound API supports WAV natively.

---

# Quick Revision Cheat Sheet

```text
AudioInputStream → Reads audio file
Clip → Controls playback

start() → Play
stop() → Pause
setMicrosecondPosition(0) → Reset
close() → End

Exceptions:
- FileNotFoundException
- UnsupportedAudioFileException
- LineUnavailableException
- IOException
```

---

# Key Idea

👉 Java treats audio like a stream:
```

File → AudioStream → Clip → Output Sound
```