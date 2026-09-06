# Java

# Introduction to java

## What is java

1. Java is a highlevel programming language, Object oriented programming and platform independence.

2. Java source code is compiled into bytecode, which is executed by the JVM.

3. Language developed by james gosling and team at sun microstyle in 1991 as oak.

4. Java is a write once a code and run anywhere.

## How java works

1.  Work flow of the java

               Java Source Code
                      ↓
                    javac
                  (Compiler)
                      ↓
                   Bytecode
                   (.class)
                      ↓
                     JVM
            (Java Virtual Machine )
                      ↓
                Interpreter + JIT
                      ↓
                 Machine Code
                   (0101)
                      ↓
                     CPU
                   (Output)

## Components of java

1. There are three components

- JDK
- JRE
- JVM

### JDK

1.  Java Development kit is a abbrevation of JDK.

2.  And it is used to creating and developing the java program.

3.  It contain JRE + Set of tools such as javac.

4.  Structure of the JDK

                   JDK
                    ├── JRE
                    │    └── JVM
                    └── Development tools

### JRE

1.  Java runtime environment is a abbrevation of JRE.

2.  It provides everything needed to execute a Java application, but not the development tools needed to create/compile one.

3.  JRE contains JVM + Java libraries/runtime components needed to run Java applications.

4.  And javac is NOT part of the JRE; it is a JDK development tool.

5.  Structure of the JRE.

                     JRE
                      │
                      ├── JVM
                      │   └── Executes Java bytecode
                      │
                      └── Java Class Libraries
                      ├── String
                      ├── System
                      ├── Scanner
                      ├── ArrayList
                      └── many more...

6.  JRE is provide the enviroment to run the code.

### JVM

1.  Java virtual machine is a abbrevation of JVM.

2.  JVM (Java Virtual Machine) is a virtual machine that executes Java bytecode and provides the runtime environment needed to run Java programs.

3.  Structure of the JVM.

                              JVM
                               │
                               ├── 1. Class Loader
                               │
                               ├── 2. Runtime Data Areas
                               │     ├── Heap
                               │     ├── Stack
                               │     ├── Method Area
                               │     └── PC Register
                               │
                               ├── 3. Execution Engine
                               │     ├── Interpreter
                               │     ├── JIT Compiler
                               │     └── Garbage Collector
                               │
                               └── 4. JNI + Native Libraries

## Platform independence

1. Java is a platform independence and we can write a programming code once and runs a code anywhere platform. example: Windows, linux and macos

2. Java is a independent language but JVM is dependent on platform like windows, linux, macos..

## Structure of the program execute

                                Hello.java
                                     |
                                   Javac
                                (Java compiler)
                                     |
                    ------------ Hello.class ---------------
                    |                 |                    |
                  JVM                JVM                  JVM
                    |                 |                    |
               Output                Output              Output

## Usage of java

1. Desktop application (Application which runs on local machine)

2. Web application (Application run on server)

3. Enterprise application (Big server like bank, RBI etc...)

4. Mobile application (Android application, apple application etc...)

5. games (Minecraft, hide online)

## Features of java

1. Simple

2. Secure

3. Robust

4. Platform independendce

5. Portable

6. Dynamic

7. Distributed

8. Multithread

## Basic java program structure

```
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }
}
```

1. The notes explain that HelloWorld is the class, main() is the traditional entry point, and System.out.println() displays output.

2. Structure of the program
   class
   ↓
   main()
   ↓
   statements
   ↓
   output

# Data types

## What is a Data type?

1. A data type tells Java what kind of data a variable is going to store.

2. Example

   ```
   int age = 25;
   ```

   - int → data type
   - age → variable
   - 25 → value

3. Data type = tells Java what kind of container it is and how much data it can hold.

## Why do we need Data Types?

1. There are three important rules

- To tell Java what type of value we are storing

```
int age = 25;
```

age contains an integer.

- To determine memory requirements

1. Different data types require different amounts of memory.

```
byte a = 10;
long b = 10000000000L;
```

2. byte needs much less memory than long.

- To prevent invalid data

```
int age = "hello";   // ❌ Error
```

Why?

1. Because int is for whole numbers, not text.

## Types of Data types

1.  There are two types of data types
                     Data Types
                         │
                         ├── Primitive
                         │
                         └── Non-Primitive / Reference

### Primitive data types

1. There are eight types of data types

- byte
- short
- int
- long
- float
- double
- char
- boolean

2. We can use primitive data types like

#### Integer data types

1. These are used to store whole numbers.

2. There are four types of integer data types

- byte

1. Size of the byte is "1 byte = 8 bits".

2. Example
   ```
   byte age = 25;
   ```

- short

1. The size of the byte is "2 bytes = 16 bits".

2. Example
   ```
   short age = 30000;
   ```

- int

1. The size of the byte is "4 bytes = 32 bits".

2. Example
   ```
   int salary = 50000;
   ```

- long

1. The size of the byte is "8 bytes = 64 bits".

2. Example

   ```
   long population = 8000000000L;
   ```

3. The L tells Java that the number is a long literal.

#### Decimal data types

1. These are numbers containing decimal points.

2. There are two types of decimal data types.

-float

1. The size of the byte is "4 bytes = 32 bits".

2. Example
   ```
   float price = 99.5f
   ```

-double

1. The size of the byte is "8 bytes = 64 bits".

2. Example
   ```
   double salary = 45000.50;
   ```
3. double gives greater precision than float.

4. Usually use double for decimal values.

#### Char

1. char stores one character.

2. The size of the byte is "2 bytes = 16 bits".

3. Example
   ```
   char grade = 'A';
   ```
4. Char uses Single quotes only.

#### Boolean

1. boolean stores only: - True - False

2. The size of the byte is "1 bytes = 8 bits".

3. Example
   ```
   boolean passed = true;
   ```

### Refrence data types

1.  A reference data type stores a reference (address-like reference) to an object, rather than directly storing the object's actual data in the variable.

2.  There are five types of refrence data types - String - Array - Object/Class - Interface - Enum

- String

1. String is a sequence of characters used to represent text.

2. Example
   ```
   String name = "Krishna";
   ```

- Array

1. An array is a container object that holds a fixed number of values of a single type.

2. Example
   ```
   int[] marks = {80, 90, 85};
   ```

- Class/Object

**I. Class**

1. A class is a blueprint or template from which objects are created.

**II. Object**

1. An object is an instance of a class.

2. Example for object/class.

```
class Student {
    String name;
}

Student s1 = new Student();
```

- Interface

1. An interface is a reference type in Java that defines a contract that classes can implement.

2. Example
   ```
   interface Animal {
    void sound();
    }
   ```

- Enum

1. An enum is a special Java type used to define a collection of predefined constants.

2. Example
   ```
   enum Day {
    MONDAY, TUESDAY, WEDNESDAY
   }
   ```

#### Primitive vs Refrence data type

| Primitive data type    | Refrence data type          |
| ---------------------- | --------------------------- |
| 1. It can store single | It can store multiple value |
| value.                 |

# Variable

## What is a variable?

1. A variable is a named memory location used to store a value that can be changed during program execution.

2. Example
   ```
   int age = 22;
   ```
   int → data type
   age → variable name
   22 → value
   = → assignment operator

## Types of instance

1. There are three types of variable
   - Local variable
   - Instance variable
   - Static variable

### Local variable

1. A local variable is a variable declared inside a method, constructor, or block and is accessible only within that area.

2. Example

   ```
   class Student {

    void display() {
        int age = 22;

        System.out.println(age);
    }
   }
   ```

   ```
    void display() {
       int age = 22;

       System.out.println(age);
   }
   ```

3. Is a local variable because it is declared inside the display() method.

4. We need to use a local variable when you need a value temporarily inside a method or block.

### Instance variable

1. An instance variable is a variable declared inside a class but outside methods, constructors, or blocks, and each object has its own copy.

2. Example

   ```
   class Student {

      String name;
      int age;
    }
   ```

3. ```
   String name;
   int age;
   ```

   are instance variables.

4. We need to use an instance variable when the data belongs to an individual object.

### Static variable

1. A static variable is a variable declared with the static keyword and is shared by all objects of a class.

2. Example

   ```
   class Student {

    static String college = "ABC College";

    String name;
    }
   ```

   ```
   static String college = "ABC College";
   ```

   Is a static variable

3. We need to use a static variable when the value is common/shared among all objects.

## Local Vs Instance Vs Static

| Variable     | Declared where?               | Belongs to   | Example                  |
| ------------ | ----------------------------- | ------------ | ------------------------ |
| **Local**    | Inside method/block           | Method/block | `int sum = 10;`          |
| **Instance** | Inside class, outside methods | Object       | `String name;`           |
| **Static**   | Inside class with `static`    | Class        | `static String college;` |

# Operators

## What is an operator?

1. An operator is a symbol that tells Java to perform an operation on one or more values or variables.

## Why we need an operator?

1. Without operators, we couldn't easily: - Calculate values - Compare values - Assign/update values - Check conditions - Make logical decisions - Increase/decrease values

## Operator Types

There are nine types of character

- Arithmetic
- Assignment
- Relational / Comparison
- Logical
- Unary
- Ternary
- Bitwise
- Shift
- Increament / Decreament operator
