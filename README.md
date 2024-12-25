
# JUnit 5 Demo

## Overview
This repository contains a demo project to illustrate the use of JUnit 5 for unit testing in Java. It includes various examples of writing tests, using assertions, and working with test lifecycle methods.

## Features
- **JUnit 5 Basics**: Basic structure and annotations used in JUnit 5.
- **Assertions**: Examples of different assertions provided by JUnit 5.
- **Test Lifecycle**: Usage of lifecycle annotations such as @BeforeEach and @AfterEach.
- **Parameterized Tests**: Writing tests that run multiple times with different parameters.
- **Exception Testing**: Handling and testing exceptions in your code.
- **Integration with Build Tools**: Running JUnit 5 tests with Maven.

## Prerequisites
- Java 8 or above
- Maven

## Getting Started

### Clone the repository
```bash
git clone https://github.com/GRVKMR2003/Junit5.git
cd Junit5
```

### Build the project
```bash
mvn clean install
```

### Run the tests
```bash
mvn test
```

## Project Structure
- **src/main/java**: Contains the main application code.
- **src/test/java**: Contains the test cases using JUnit 5.

## Writing Tests
Here are some examples of how to write tests with JUnit 5:

### Basic Test
```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ExampleTest {

    @Test
    void addition() {
        assertEquals(2, 1 + 1);
    }
}
```

### Lifecycle Methods
```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class LifecycleTest {

    @BeforeEach
    void setUp() {
        // Code to set up test environment
    }

    @AfterEach
    void tearDown() {
        // Code to clean up after the test
    }

    @Test
    void sampleTest() {
        // Test code
    }
}
```

### Parameterized Test
```java
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestExample {

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "level" })
    void palindromes(String candidate) {
        assertTrue(isPalindrome(candidate));
    }

    boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
```

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements
- JUnit 5
- Maven
- Java

