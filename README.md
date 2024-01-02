# MyStack

MyStack is a simple Java implementation of a stack data structure.

## Table of Contents

- [Overview](#overview)
- [Usage](#usage)
- [Methods](#methods)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Overview

The `MyStack` class provides a basic stack functionality, allowing you to push, pop, peek, and check if the stack is empty. It dynamically adjusts its capacity when needed.

## Usage

To use the `MyStack` class in your Java project, you can follow these steps:

1. Copy the `MyStack.java` file into your project.
2. Create an instance of `MyStack` using one of the available constructors.
3. Perform stack operations such as push, pop, peek, etc.

## Methods

### `MyStack()`

- Default constructor, initializes the stack with a default capacity of 2.

### `MyStack(int initCap)`

- Parameterized constructor, allows you to specify an initial capacity.

### `boolean isEmpty()`

- Checks if the stack is empty.

### `Integer peek()`

- Returns the top element of the stack without removing it.

### `Integer pop()`

- Removes and returns the top element of the stack. Handles the case when the stack is empty.

### `void push(Integer x)`

- Adds an element to the top of the stack. Doubles the capacity if the stack is full.

### `private void doubleCapacity()`

- Doubles the capacity of the stack when it becomes full.

### `String toString()`

- Returns a string representation of the stack.

## Examples

```java
MyStack stack = new MyStack();

stack.push(5);
stack.push(10);
stack.push(15);

System.out.println("Top element: " + stack.peek()); // Output: 15

System.out.println("Popped element: " + stack.pop()); // Output: 15

System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: false
