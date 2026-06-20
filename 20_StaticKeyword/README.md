# 👥 Static Keyword

## Definition

Belongs to the class rather than individual objects.

## Diagram

```text
friend1 ─┐
friend2 ─┼──► static numOfFriends
friend3 ─┘
```

## Examples

```java
static int count;
```

```java
static void showFriends()
```

## Interview Notes

One shared copy for all objects.