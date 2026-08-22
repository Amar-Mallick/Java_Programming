# Java Data Types — Quick Reference Cheat Sheet

Java data types specify **what kind of value a variable can store**.

## 1. Primitive Data Types

Primitive types store simple values directly. Java has **8 primitive data types**.

| Type      | Description                            | Example                          |
| --------- | -------------------------------------- | -------------------------------- |
| `byte`    | Small whole numbers from -128 to 127.  | `byte age = 25;`                 |
| `short`   | Whole numbers from -32,768 to 32,767.  | `short score = 25000;`           |
| `int`     | Common whole-number type.              | `int count = 1000;`              |
| `long`    | Very large whole numbers.              | `long population = 1400000000L;` |
| `float`   | Decimal numbers with 32-bit precision. | `float price = 99.99f;`          |
| `double`  | Decimal numbers with 64-bit precision. | `double salary = 45000.50;`      |
| `char`    | Stores one UTF-16 code unit.           | `char grade = 'A';`              |
| `boolean` | Stores `true` or `false`.              | `boolean active = true;`         |

### Primitive Types at a Glance

```text
Whole Numbers → byte, short, int, long
Decimal       → float, double
Character     → char
Logical       → boolean
```

---

## 2. Reference Types

Reference types refer to objects rather than storing a simple primitive value directly.

### String

**Description:** Represents a sequence of characters (text).

```java
String name = "Amar";
```

### Array

**Description:** Stores a fixed-size collection of values of the same type.

```java
int[] marks = {85, 90, 78};
```

---

## Primitive vs Reference Types

| Primitive | Reference |
| --------- | --------- |
| `byte`    | `String`  |
| `short`   | Array     |
| `int`     | Class     |
| `long`    | Interface |
| `float`   | Enum      |
| `double`  |           |
| `char`    |           |
| `boolean` |           |

### Quick Memory Tip

```text
Primitive  → Simple values
Reference  → Objects / collections

int        → 25
double     → 99.99
boolean    → true
char       → 'A'
String     → "Hello"
Array      → {10, 20, 30}
```
