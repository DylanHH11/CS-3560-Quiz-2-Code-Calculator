# Calculator - TDD & JUnit 5 Implementation

## Overview
`Calculator` is a Java utility implemented using Test-Driven Development (TDD) and JUnit 5. It provides integer arithmetic operations and parity checks with defensive edge-case handling.

---

## Functional Specifications

- **`sum(int x, int y)`**: Returns the sum of two integers; verified against positive, negative, and zero values.
- **`subtract(int x, int y)`**: Returns the difference (`x - y`); verified with negative and positive outcomes.
- **`multiply(int x, int y)`**: Returns the product (`x * y`); verified with positive, zero, and negative values.
- **`divide(int x, int y)`**: Returns the integer quotient (`x / y`); rejects division by zero by throwing an `IllegalArgumentException`.
- **`isEven(int value)`**: Evaluates integer parity using modulo arithmetic (`value % 2 == 0`), returning `true` for even and `false` for odd integers across positive, negative, and zero inputs.

---

## Test Execution Instructions

### Prerequisites
- Java 17+
- Apache Maven 3.8+

### Running the Test Suite
Execute all unit tests using Maven:

```bash
mvn clean test
```