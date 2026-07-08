# 👤 Java Anonymous Class

## 📌 Definition

An Anonymous Class is a class without a name.

It is created and instantiated at the same time and is mainly used when a class is needed only once.

Instead of creating another Java file, we can directly override methods inside the object creation.

---

# 🎯 Objective

This program demonstrates how to:

- Create a normal object.
- Create an anonymous class.
- Override a method without creating a new Java class.
- Compare normal and customized behavior.

---

# 🛠 Concepts Used

- Objects
- Classes
- Method Overriding
- Polymorphism
- Anonymous Classes

---

# 🔄 Program Flow

```text
Start
   │
   ▼
Create Normal Dog
   │
   ▼
Create Anonymous Dog
   │
   ▼
Override speak()
   │
   ▼
Call dog1.speak()
   │
   ▼
Call dog2.speak()
   │
   ▼
End
```

---

# 🧩 Variables Used

| Variable | Type | Purpose |
|----------|------|---------|
| dog1 | Dog | Normal object |
| dog2 | Dog | Anonymous class object |

---

# 📚 Classes Used

| Class | Purpose |
|--------|---------|
| Dog | Parent class |
| Anonymous Class | Overrides speak() without creating another file |

---

# 🔧 Methods Used

| Method | Description |
|---------|-------------|
| speak() | Prints the dog's sound |

---

# 💡 Code Explanation

## 1. Create Normal Object

```java
Dog dog1 = new Dog();
```

Uses the original implementation.

---

## 2. Create Anonymous Class

```java
Dog dog2 = new Dog(){

    @Override
    void speak(){
        ...
    }

};
```

Creates:

- A new Dog object
- A hidden subclass
- Overrides `speak()` only for this object

---

## 3. Call Methods

```java
dog1.speak();
dog2.speak();
```

Outputs:

```text
The dog goes *woof*
Scooby Doo says *Ruh Roh*
```

---

# ▶ Example Output

```text
The dog goes *woof*
Scooby Doo says *Ruh Roh*
```

---

# 📝 Interview Notes

### What is an Anonymous Class?

A class without a name that is created only once.

---

### Why use it?

To customize behavior without creating another class.

---

### Can it be reused?

No.

---

### Where is it commonly used?

- Runnable
- TimerTask
- Event Listeners
- Callbacks

---

# 🧠 Quick Revision Cheat Sheet

```text
Anonymous Class

✔ No class name
✔ One-time use
✔ Cannot be reused
✔ Overrides methods
✔ Created during object creation

Dog dog = new Dog(){

   @Override
   void speak(){}

};
```