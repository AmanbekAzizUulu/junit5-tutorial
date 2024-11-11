# Getting Started

---

Test-driven programming, often referred to as **Test-Driven Development (TDD)**, is a software development methodology that emphasizes writing tests before writing the actual code that implements functionality. This approach can help ensure that the code is correct and meets the specified requirements. Here’s an overview of the key principles and practices of TDD:

### Key Principles of TDD

1. **Write a Test First**:
   - Before writing any functional code, you start by writing a test that defines a desired improvement or new function. This test will initially fail since the functionality has not yet been implemented.

2. **Run the Test**:
   - Execute the test suite to confirm that the new test fails as expected. This verifies that the test is correctly identifying the absence of the desired functionality.

3. **Write the Minimum Code**:
   - Write just enough code to make the test pass. This code should be simple and directly address the requirements specified by the test.

4. **Run All Tests**:
   - After implementing the minimal code, run all tests (including the new test) to ensure that the new code doesn’t break any existing functionality.

5. **Refactor the Code**:
   - Once the tests pass, you can refactor the code to improve its structure and readability without changing its behavior. This is crucial for maintaining code quality over time.

6. **Repeat**:
   - Continue this cycle for new features or improvements. Each new feature begins with writing a test, followed by code implementation, testing, and refactoring.

### Benefits of TDD

- **Improved Code Quality**: Writing tests first helps clarify requirements and promotes better design, leading to more maintainable and robust code.
- **Fewer Bugs**: With tests in place, there’s a safety net that can catch regressions and bugs introduced in later development stages.
- **Documentation**: Tests serve as documentation for the code, providing clear examples of how the code is expected to behave.
- **Faster Feedback**: Developers receive immediate feedback on whether new code meets the defined requirements, allowing for quicker adjustments.

### Example of TDD Cycle

1. **Write a Test**:
   ```java
   @Test
   void testAdder() {
       MathUtils mathUtils = new MathUtils();
       assertEquals(5, mathUtils.adder(2, 3));
   }
   ```

2. **Run the Test**:
   - The test fails because the `adder` method doesn’t exist yet.

3. **Write the Minimum Code**:
   ```java
   public int adder(int a, int b) {
       return a + b;
   }
   ```

4. **Run All Tests**:
   - The new test passes, confirming the functionality works.

5. **Refactor**:
   - If necessary, improve the implementation while ensuring all tests still pass.

### Conclusion

TDD is a powerful approach to software development that encourages a disciplined and structured way of coding. It helps developers stay focused on requirements and fosters a culture of continuous improvement and quality assurance in the development process.

---

Another simple example of TDD.

Sure! Here’s an example of Test-Driven Development (TDD) for a method that computes the area of a circle. We'll follow the TDD cycle of writing a test, implementing the method, running the test, and refactoring if necessary.

### Step 1: Write the Test First

First, we write a test that checks the area calculation for a circle given a specific radius.

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void testCircleArea() {
        MathUtils mathUtils = new MathUtils();
        double radius = 5.0;
        double expectedArea = Math.PI * radius * radius; // Calculate the expected area
        double actualArea = mathUtils.circleArea(radius); // Call the method to test
        assertEquals(expectedArea, actualArea, 0.0001); // Allow a small delta for floating-point comparison
    }
}
```

### Step 2: Run the Test

At this point, running the test will fail because the `circleArea` method does not exist yet.

```
> mvn test
```

**Output:**
```
1 test failed
```

### Step 3: Write the Minimum Code

Now, we implement the `circleArea` method in the `MathUtils` class.

```java
package com.dandaev.edu;

public class MathUtils {
    private static final double PI = Math.PI;

    public double circleArea(double radius) {
        return radius * radius * PI; // Calculate the area of the circle
    }
}
```

### Step 4: Run All Tests

After implementing the method, we run the test suite again.

```
> mvn test
```

**Output:**
```
All tests passed.
```

### Step 5: Refactor (if necessary)

Since the method works correctly and all tests pass, we can review the code. If there are no improvements needed, we can proceed to the next feature or requirement.

### Final Code

Here’s the final code for both the `MathUtils` class and the test:

#### MathUtils.java

```java
package com.dandaev.edu;

public class MathUtils {
    private static final double PI = Math.PI;

    public double circleArea(double radius) {
        return radius * radius * PI; // Calculate the area of the circle
    }
}
```

#### MathUtilsTest.java

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void testCircleArea() {
        MathUtils mathUtils = new MathUtils();
        double radius = 5.0;
        double expectedArea = Math.PI * radius * radius; // Calculate the expected area
        double actualArea = mathUtils.circleArea(radius); // Call the method to test
        assertEquals(expectedArea, actualArea, 0.0001); // Allow a small delta for floating-point comparison
    }
}
```

### Conclusion

This example illustrates the TDD process for implementing a method that calculates the area of a circle. By writing tests first, we ensured that the implementation meets the expected behavior right from the start.


---

You can obtain Maven plugins from the Maven Central Repository, which is the default repository that Maven uses to download dependencies and plugins. The Maven Surefire Plugin, for example, is hosted there. Here’s how you can find and use these plugins:

### 1. **Maven Central Repository**

To find plugins like the Surefire Plugin, you can search on the [Maven Central Repository](https://search.maven.org/). Here’s how to do it:

- **Go to the Maven Central Repository:** [Maven Central](https://search.maven.org/)
- **Search for the Plugin:** Enter the plugin name (e.g., `maven-surefire-plugin`) in the search bar.
- **Select the Plugin:** Click on the appropriate search result to view details, including available versions, usage instructions, and dependencies.

### 2. **POM Configuration**

Once you find the desired plugin, you can copy its configuration details (group ID, artifact ID, and version) into your `pom.xml` file as shown in the previous examples.

### 3. **Checking for Latest Versions**

To check for the latest version of a plugin, you can refer to its [official documentation](https://maven.apache.org/plugins/maven-surefire-plugin/) or look at the search results on Maven Central. Make sure to use stable releases rather than snapshot versions unless you have a specific reason to do so.

### Example: Finding Maven Surefire Plugin

1. Go to [Maven Central](https://search.maven.org/).
2. Type `maven-surefire-plugin` in the search box.
3. Select the plugin from the search results to view its details, including the latest version and a link to the documentation.

### Using Other Repositories

In addition to Maven Central, there are other repositories like JCenter and specific organizational repositories (e.g., Spring, Apache) where plugins can be hosted. You can add these repositories to your `pom.xml` if needed:

```xml
<repositories>
    <repository>
        <id>jcenter</id>
        <url>https://jcenter.bintray.com/</url>
    </repository>
</repositories>
```

### Conclusion

Maven plugins like the Surefire Plugin can be easily found and integrated into your project via the Maven Central Repository. Just ensure that you keep your plugin versions updated to benefit from improvements and bug fixes.

---

The Maven Surefire Plugin is a key tool for running tests in a Maven project. It supports running JUnit and TestNG tests and is essential for executing unit tests during the build process. Here’s a guide on how to integrate the Surefire Plugin into your Maven project.

### Step 1: Add Surefire Plugin to `pom.xml`

You need to add the Surefire Plugin configuration to your `pom.xml` file. Below is an example configuration that specifies the plugin and its version:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.dandaev.edu</groupId>
    <artifactId>junit-tutorial</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version> <!-- Use the latest stable version -->
            </plugin>
        </plugins>
    </build>
</project>
```

### Step 2: Organize Test Classes

Make sure your test classes are located in the appropriate directory structure:

```
src/
└── test/
    └── java/
        └── com/
            └── dandaev/
                └── edu/
                    └── MathUtilsTest.java
```

### Step 3: Create Test Class

Here’s a simple example of a JUnit test class, `MathUtilsTest.java`:

```java
package com.dandaev.edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    private final MathUtils mathUtils = new MathUtils();

    @Test
    void testAdder() {
        assertEquals(5, mathUtils.adder(2, 3));
    }

    @Test
    void testSubtractor() {
        assertEquals(1, mathUtils.subtractor(3, 2));
    }

    @Test
    void testCircleArea() {
        double radius = 5.0;
        double expectedArea = Math.PI * radius * radius;
        assertEquals(expectedArea, mathUtils.circleArea(radius), 0.0001);
    }
}
```

### Step 4: Run Tests

To run your tests with Maven, execute the following command in the terminal from the root of your project:

```bash
mvn test
```

This command will compile the code and run all the test cases defined in your `src/test/java` directory using the Surefire Plugin.

### Step 5: Check the Results

After running the tests, you will see the output in the terminal. It will indicate how many tests were run, how many passed, and how many failed. If all tests pass, you’ll see output similar to:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.dandaev.edu.MathUtilsTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.123 sec

Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
```

### Additional Configuration Options

You can further customize the Surefire Plugin with additional configuration options in your `pom.xml`. Here are a few common configurations:

```xml
<configuration>
    <includes>
        <include>**/*Test.java</include>
        <include>**/*Tests.java</include>
        <include>**/*TestCase.java</include>
    </includes>
    <excludes>
        <exclude>**/SomeSpecificTest.java</exclude>
    </excludes>
    <forkCount>1</forkCount>
    <reuseForks>true</reuseForks>
    <parallel>methods</parallel>
</configuration>
```

### Conclusion

The Maven Surefire Plugin is an essential tool for running tests in Maven projects. By integrating it into your `pom.xml`, you can easily manage and run your unit tests, ensuring that your code remains reliable and bug-free throughout development.

---

The `assertThrows` method in JUnit is used to test that a specific exception is thrown during the execution of a particular block of code. This is particularly useful when you want to verify that your code correctly handles exceptional cases. Here’s how it works:

### Syntax

The basic syntax for `assertThrows` is as follows:

```java
<T extends Throwable> T assertThrows(Class<T> expectedType, Executable executable);
```

- `expectedType`: The class of the exception you expect to be thrown.
- `executable`: A functional interface (usually a lambda expression or method reference) that represents the code you want to execute.

### Example Usage

Here’s an example that demonstrates how to use `assertThrows` to test for an exception:

#### 1. **Creating a Class to Test**

Let's create a simple class that throws an `IllegalArgumentException` if a negative number is passed to the `setAge` method:

```java
package com.example;

public class Person {
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

#### 2. **Writing a Test Class**

Now, let's write a test class that uses `assertThrows` to verify that an `IllegalArgumentException` is thrown when we attempt to set a negative age:

```java
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    public void testSetAgeThrowsExceptionForNegativeValue() {
        Person person = new Person();

        // Use assertThrows to verify that an IllegalArgumentException is thrown
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> person.setAge(-1), // Executable code block
            "Expected setAge(-1) to throw, but it didn't"
        );

        // Optionally, you can verify the exception message
        assertEquals("Age cannot be negative", thrown.getMessage());
    }
}
```

### How It Works

1. **Creating the Executable**: The `executable` parameter is defined as a lambda expression `() -> person.setAge(-1)`, which means when executed, it will call the `setAge` method with `-1`.

2. **Executing the Code**: JUnit runs the code within the `assertThrows` method. If the specified exception (`IllegalArgumentException` in this case) is thrown, the test passes.

3. **Handling the Exception**: If the expected exception is thrown, `assertThrows` returns the exception instance, which can be further inspected if needed (e.g., checking the message).

4. **Failing the Test**: If the code does not throw the expected exception, the test fails, indicating that the method did not behave as expected.

### Summary

The `assertThrows` method is a powerful tool in JUnit for verifying that specific exceptions are thrown during method execution, allowing for robust testing of error handling in your code.

---

The English translation for "делитель, функция которая делит" is "divider, a function that divides." If you're looking for an example of a division function in Java, here's how you could implement it:

### Example of a Divider Function in Java

```java
package com.example;

public class MathUtils {
    public double divider(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }
}
```

### Explanation

1. **Function Definition**: The `divider` function takes two parameters: `a` (the dividend) and `b` (the divisor).
2. **Error Handling**: Before performing the division, the function checks if `b` is zero. If it is, an `IllegalArgumentException` is thrown to prevent division by zero.
3. **Return Value**: If `b` is not zero, the function returns the result of `a / b`.

### Example of a Test for the Divider Function

To ensure that the `divider` function works as intended, you can write a test case using JUnit:

```java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testDivider() {
        MathUtils mathUtils = new MathUtils();

        assertEquals(2.0, mathUtils.divider(4.0, 2.0), "4.0 divided by 2.0 should be 2.0");
    }

    @Test
    public void testDividerThrowsExceptionWhenDividingByZero() {
        MathUtils mathUtils = new MathUtils();

        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> mathUtils.divider(4.0, 0),
            "Expected divider(4.0, 0) to throw, but it didn't"
        );

        assertEquals("Divider cannot be zero", thrown.getMessage());
    }
}
```

### Summary

This example illustrates how to implement a simple division function in Java, complete with error handling for division by zero, and how to write tests to verify its correctness.

---

In the context of Java and particularly JUnit testing, an **`Executable`** is a functional interface that represents a block of code that can be executed. It was introduced in JUnit 5 to provide a way to encapsulate code that is expected to throw exceptions, especially during testing.

### Characteristics of `Executable`

1. **Functional Interface**: `Executable` is a functional interface, which means it can be represented as a lambda expression or method reference. It has a single abstract method:
   ```java
   void execute() throws Throwable;
   ```

2. **Exception Handling**: The `execute` method can throw any type of exception, allowing the use of `Executable` in scenarios where you need to assert that a particular piece of code throws an expected exception.

3. **Usage**: The primary use case for `Executable` is in assertions that validate that an exception is thrown under certain conditions, which makes it easier to write cleaner and more readable test code.

### Example Usage of `Executable`

Here's how you can use `Executable` in a JUnit test to assert that a specific method throws an exception:

```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testDividerThrowsExceptionWhenDividingByZero() {
        MathUtils mathUtils = new MathUtils();

        Executable executable = () -> mathUtils.divider(4.0, 0);

        Exception exception = assertThrows(IllegalArgumentException.class, executable);
        assertEquals("Divider cannot be zero", exception.getMessage());
    }
}
```

### Explanation

- In the example above, we define an `Executable` using a lambda expression that calls the `divider` method with a zero divisor.
- The `assertThrows` method is used to execute the `Executable` and assert that an `IllegalArgumentException` is thrown.
- This pattern enhances code readability and separates the logic of the test from the assertion.

### Summary

In summary, `Executable` is a useful construct in JUnit 5 that allows you to encapsulate a block of code, making it easier to assert that certain exceptions are thrown during testing. It improves code clarity and helps in handling exceptions in a more structured way during unit tests.

---

In JUnit 4 and earlier versions of JUnit, the common way to assert that a method throws an exception was to use the `@Test(expected = Exception.class)` annotation. This approach is straightforward but does not allow for custom error messages or capturing the exception object for further assertions.

### Example of JUnit 4 Style

Here's how you would write a test for a method that divides two numbers and check that it throws an `ArithmeticException` when dividing by zero using JUnit 4:

```java
import org.junit.Test;

public class MathUtilsTest {

    @Test(expected = ArithmeticException.class)
    public void testingDividerMethod() {
        new MathUtils().divider(10, 0); // This should throw ArithmeticException
    }
}
```

### Explanation

- **Annotation**: The `@Test(expected = ArithmeticException.class)` annotation specifies that the test is expected to throw an `ArithmeticException`. If this exception is thrown, the test passes; if it is not thrown, the test fails.
- **No Lambda**: This approach does not use a lambda expression. The code inside the test method directly invokes the method that is expected to throw the exception.

### Example of JUnit 5 Style Without Lambda

If you want to achieve similar functionality in JUnit 5 without using a lambda, you can create a separate `Executable` instance like this:

```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    void testingDividerMethod() {
        // Create an Executable without using a lambda
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                new MathUtils().divider(10, 0);
            }
        };

        // Assert that the ArithmeticException is thrown
        assertThrows(ArithmeticException.class, executable, "divide by zero should throw ArithmeticException");
    }
}
```

### Summary

- In JUnit 4, the `@Test(expected = ...)` annotation was commonly used to check for exceptions.
- In JUnit 5, you can use an `Executable` implementation to avoid lambda expressions if needed, although using lambdas is more concise and idiomatic in modern Java code.
- The choice between JUnit 4 and JUnit 5 is often based on project requirements and the need for more advanced testing features that JUnit 5 provides.

---

In Java, dividing by zero using floating-point numbers (like `double`) does not throw an exception. Instead, it returns `Infinity` or `-Infinity`, depending on the sign of the numerator. An `ArithmeticException` is only thrown for integer division when dividing by zero.

### Solution

To address this issue, you need to explicitly handle the case of division by zero in your `divider` method and throw an `ArithmeticException` yourself. Here’s how you can modify your `divider` method:

```java
public double divider(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Division by zero is not allowed.");
    }
    return a / b;
}
```

### Updated MathUtils Class

Here is the updated `MathUtils` class with the proper exception handling:

```java
package com.dandaev.edu;

public class MathUtils {
    private static final double PI = Math.PI;

    public int adder(int a, int b) {
        return a + b;
    }

    public int subtractor(int a, int b) {
        return a - b;
    }

    public double circleArea(double radius) {
        return radius * radius * PI;
    }

    public double divider(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
```

### JUnit Test Method

Your JUnit test method remains the same, as it correctly checks for the `ArithmeticException` when dividing by zero:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    void testingDividerMethod() {
        assertThrows(ArithmeticException.class, () -> new MathUtils().divider(10, 0), "divide by zero should throw ArithmeticException");
    }
}
```

### Summary

1. **Update the `divider` Method**: Ensure that the `divider` method checks for division by zero and throws an `ArithmeticException` if the divisor is zero.
2. **Retain Your Test**: Your JUnit test will correctly pass now, as it is designed to expect an `ArithmeticException` when attempting to divide by zero.

After making these changes, running your tests should result in the test passing as expected.

---

The **testing lifecycle** in JUnit defines the sequence in which various annotations and methods are executed before, during, and after each test, ensuring that necessary setup and cleanup are performed. This lifecycle enables a controlled environment for each test, maintaining independence and reliability across different test cases.

### Key Annotations and Phases in the JUnit Testing Lifecycle

1. **@BeforeAll**:
   - A method annotated with `@BeforeAll` runs once before any test methods in the class.
   - This is typically used for initializing resources that are shared across all tests, such as establishing a database connection.
   - The method must be static.

2. **@BeforeEach**:
   - A method annotated with `@BeforeEach` runs before each test method.
   - Used for setting up test-specific configurations or initializing objects to ensure a consistent state for every test.

3. **@Test**:
   - The main test method, marked with `@Test`, contains the code to execute and verify the functionality of a unit of code.
   - A test can be skipped with `@Disabled`, if necessary, to temporarily bypass certain tests.

4. **@AfterEach**:
   - A method annotated with `@AfterEach` runs after each test method.
   - It’s used for cleaning up or resetting resources specific to each test, such as closing a file or rolling back a transaction.

5. **@AfterAll**:
   - A method annotated with `@AfterAll` runs once after all test methods have been executed.
   - This is used to clean up shared resources initialized in `@BeforeAll`, like closing a database connection.
   - The method must also be static.

### Example of JUnit Testing Lifecycle

Below is an example demonstrating how these annotations work together in a simple test class:

```java
import org.junit.jupiter.api.*;

class MathUtilsTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Initializing resources before all tests.");
        // Code to initialize shared resources (e.g., database connection)
    }

    @BeforeEach
    void setupEach() {
        System.out.println("Setting up before each test.");
        // Code to set up preconditions for each test
    }

    @Test
    void testAddition() {
        System.out.println("Running testAddition");
        // Test logic and assertions
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    void testSubtraction() {
        System.out.println("Running testSubtraction");
        // Test logic and assertions
        Assertions.assertEquals(0, 1 - 1);
    }

    @AfterEach
    void tearDownEach() {
        System.out.println("Cleaning up after each test.");
        // Code to release resources specific to each test
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Releasing resources after all tests.");
        // Code to release shared resources
    }
}
```

### Output for This Example

Running this test class will produce output showing the sequence of lifecycle method calls, like:

```plaintext
Initializing resources before all tests.
Setting up before each test.
Running testAddition
Cleaning up after each test.
Setting up before each test.
Running testSubtraction
Cleaning up after each test.
Releasing resources after all tests.
```

Each phase in the lifecycle supports **test independence** and **resource management**. For example, using `@BeforeEach` and `@AfterEach` ensures each test starts fresh and doesn’t interfere with other tests, improving test reliability.

---

Если в классе с тестами JUnit создать **переменную объекта** (т.е. не `static`) и изменять её в разных методах тестирования, то это может привести к непредсказуемым результатам и ошибкам при выполнении тестов. Вот почему:

### Особенности выполнения тестов JUnit

1. **JUnit создаёт новый экземпляр класса теста для каждого метода**.
   - Это значит, что каждый метод теста выполняется в **отдельном экземпляре** класса теста.
   - Поэтому любые изменения в переменной объекта, сделанные в одном методе, **не сохранятся** в других методах. Каждый тест будет работать со своей копией переменной.

2. **Изменения не будут передаваться между тестами**.
   - Из-за того, что каждый метод теста получает новый экземпляр тестового класса, значение переменной объекта **сбрасывается** в каждом методе.
   - Поэтому, если вы пытаетесь изменять переменную объекта и полагаться на её измененное значение в следующем тесте, это не сработает.

### Пример

Рассмотрим пример с переменной объекта `counter`, которую изменяем в нескольких тестах:

```java
public class MathUtilsTest {

    private int counter = 0; // Переменная объекта

    @Test
    public void testIncrementCounter() {
        counter++;
        System.out.println("Counter in testIncrementCounter: " + counter); // Выведет 1
    }

    @Test
    public void testCounterValue() {
        System.out.println("Counter in testCounterValue: " + counter); // Выведет 0, т.к. это новый экземпляр
    }
}
```

В этом случае:
- Первый тест `testIncrementCounter` увеличит `counter` до 1, но этот результат **не повлияет** на переменную `counter` во втором тесте.
- Во втором тесте `testCounterValue`, значение `counter` снова будет равно 0, так как это новый экземпляр класса `MathUtilsTest`.

### Рекомендация
Если требуется использовать общую переменную для всех тестов и отслеживать её состояние, можно:
1. Сделать переменную `static` — тогда она будет общей для всех экземпляров и сохранит изменения между тестами. Однако это также требует осторожности, так как изменения могут вызвать побочные эффекты.
2. Использовать аннотации `@BeforeEach` и `@AfterEach`, чтобы инициализировать переменную перед каждым тестом и очищать после него, если важно, чтобы каждый тест начинал с определенного состояния.

---

`@BeforeAll` — это аннотация в JUnit 5, которая указывает, что метод должен быть выполнен **один раз перед всеми тестами в классе**. Этот метод запускается перед запуском всех тестов и подходит для действий, которые нужно сделать только один раз для всех тестов (например, настройка ресурсоёмких операций).

### Основные особенности `@BeforeAll`

1. **Выполнение только один раз**:
   - Метод, аннотированный `@BeforeAll`, запускается единожды перед всеми тестами, а не перед каждым тестом отдельно.
   - Это полезно, если нужно провести подготовку, которая будет актуальна для всех тестов.

2. **Требует `static` метода**:
   - Метод, помеченный `@BeforeAll`, должен быть `static`, так как он должен вызываться до создания экземпляра класса теста.
   - Если метод не `static`, JUnit выбросит ошибку, и тесты не будут запущены.

3. **Типичные сценарии использования**:
   - Настройка базы данных или подключение к ней, если требуется только одно подключение для всех тестов.
   - Загрузка больших наборов данных или конфигураций, которые будут использоваться несколькими тестами.
   - Инициализация ресурсов, которые требуют много времени для создания и должны быть общими для всех тестов.

### Пример использования `@BeforeAll`

```java
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    private static DatabaseConnection connection;

    @BeforeAll
    static void setup() {
        System.out.println("Setting up the database connection...");
        connection = new DatabaseConnection();
        connection.connect();  // Подключаемся к базе данных только один раз
    }

    @Test
    void testDatabaseQuery1() {
        System.out.println("Executing testDatabaseQuery1");
        // Выполнение теста с использованием connection
    }

    @Test
    void testDatabaseQuery2() {
        System.out.println("Executing testDatabaseQuery2");
        // Выполнение другого теста с использованием connection
    }
}
```

В этом примере:
- `@BeforeAll` используется для создания соединения с базой данных, которое применяется ко всем тестам в классе.
- Тесты `testDatabaseQuery1` и `testDatabaseQuery2` используют это подключение.

### Важно помнить

- Методы `@BeforeAll` не могут зависеть от экземпляров класса, поскольку они выполняются до создания любых объектов.
- Если требуется выполнить действия после завершения всех тестов, можно использовать `@AfterAll` — аналогичную аннотацию, но для очистки ресурсов после всех тестов.

Использование `@BeforeAll` помогает сделать тесты более эффективными, избегая дублирования операций настройки и экономя время на подготовке перед каждым тестом.

---

Аннотация `@AfterAll` в JUnit 5 используется для обозначения метода, который должен выполняться **один раз после завершения всех тестов** в тестовом классе. Этот метод обычно служит для освобождения ресурсов или выполнения других действий по очистке, которые нужно выполнить после всех тестов.

### Основные особенности `@AfterAll`

1. **Запуск один раз после всех тестов**:
   - Метод, аннотированный `@AfterAll`, выполняется только один раз, после завершения всех тестов в классе, а не после каждого теста.
   - Он часто используется для закрытия соединений или освобождения ресурсов, которые были созданы в методе, помеченном аннотацией `@BeforeAll`.

2. **Требует `static` метода**:
   - Метод `@AfterAll` должен быть `static`, поскольку он выполняется на уровне класса и вызывается после выполнения всех тестов.
   - Если метод не является `static`, JUnit выдаст ошибку, и тесты не будут запущены.

3. **Типичные сценарии использования**:
   - Закрытие соединений с базой данных, файлов или сетевых соединений.
   - Удаление временных файлов или данных, которые были созданы в процессе тестирования.
   - Очистка ресурсов, которые могут занимать память, если их не удалить вручную.

### Пример использования `@AfterAll`

```java
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ResourceTest {

    private static DatabaseConnection connection;

    @BeforeAll
    static void setup() {
        System.out.println("Setting up the database connection...");
        connection = new DatabaseConnection();
        connection.connect(); // Подключаемся к базе данных перед тестами
    }

    @Test
    void testDatabaseQuery1() {
        System.out.println("Executing testDatabaseQuery1");
        // Выполнение теста с использованием connection
    }

    @Test
    void testDatabaseQuery2() {
        System.out.println("Executing testDatabaseQuery2");
        // Выполнение другого теста с использованием connection
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Cleaning up resources...");
        if (connection != null) {
            connection.disconnect(); // Закрытие подключения к базе данных
        }
    }
}
```

В этом примере:
- Метод `@BeforeAll` используется для установки подключения к базе данных, которое будет использоваться во всех тестах.
- После выполнения всех тестов метод `@AfterAll` закрывает соединение, освобождая ресурсы.

### Важные моменты

- **Синхронизация**: Если у вас несколько тестовых классов, содержащих методы `@AfterAll`, каждый класс будет запускать свои методы `@AfterAll` отдельно, после выполнения всех тестов в этом классе.
- **Статический контекст**: Поскольку `@AfterAll` требует `static`, он может использовать только статические переменные и методы.
- **Логирование и очистка**: `@AfterAll` часто используется для логирования и гарантирует, что тесты не оставят за собой "следов" (например, открытых подключений, незакрытых потоков и файлов).

### Связь с аннотацией `@BeforeAll`

Аннотации `@BeforeAll` и `@AfterAll` часто используются вместе: первая — для настройки ресурсов перед началом тестов, вторая — для их очистки после всех тестов.

---

Аннотация `@BeforeEach` в JUnit 5 используется для обозначения метода, который должен выполняться **перед каждым тестовым методом** в тестовом классе. Это значит, что для каждого теста вызывается метод, помеченный этой аннотацией, обеспечивая подготовку необходимых ресурсов или начальное состояние перед выполнением каждого теста.

### Основные особенности `@BeforeEach`

1. **Выполнение перед каждым тестом**:
   - Метод, аннотированный `@BeforeEach`, запускается перед каждым тестовым методом в классе.
   - Это полезно, когда нужно гарантировать, что каждый тест запускается с чистым, предсказуемым состоянием.

2. **Инициализация состояния для каждого теста**:
   - Аннотация помогает избежать влияния одного теста на другой, так как каждый тестовый метод начинается с одинаковых условий.
   - `@BeforeEach` часто используется для установки переменных, объектов или начальных значений, которые будут использоваться только в пределах одного теста.

3. **Может быть не `static`**:
   - В отличие от `@BeforeAll`, `@BeforeEach` может (и обычно должен) быть **нестатическим**. Это позволяет использовать экземплярные переменные и состояния, которые уникальны для каждого теста.

4. **Применение с аннотацией `@AfterEach`**:
   - Часто используется вместе с `@AfterEach`, которая выполняет очистку после каждого теста, гарантируя, что каждый тест заканчивается со сброшенным состоянием.

### Пример использования `@BeforeEach`

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    private List<String> list;

    @BeforeEach
    void setup() {
        list = new ArrayList<>();
        list.add("Initial element"); // Заполнение начальным значением
        System.out.println("List initialized before each test.");
    }

    @Test
    void testListAddition() {
        list.add("New element");
        System.out.println("Running testListAddition");
        // Проверка, что элемент добавлен
        assertEquals(2, list.size());
    }

    @Test
    void testListClear() {
        list.clear();
        System.out.println("Running testListClear");
        // Проверка, что список очищен
        assertEquals(0, list.size());
    }
}
```

В этом примере:
- Метод `setup()` помечен `@BeforeEach`, и он инициализирует `list` и добавляет в него элемент.
- Каждый тест запускается с новым экземпляром `list`, в котором уже есть один элемент ("Initial element").
- Каждый метод теста работает с отдельной копией `list`, предотвращая влияние одного теста на другой.

### Типичные сценарии использования `@BeforeEach`

- **Подготовка данных**: Например, заполнение списка, создание временных файлов или объектов, настройка начальных значений.
- **Установка начального состояния**: Метод `@BeforeEach` гарантирует, что перед каждым тестом состояние является предсказуемым.
- **Инициализация зависимостей**: Создание мок-объектов или других зависимостей, которые нужны только на время выполнения одного теста.

### Важные моменты

- **Локальные изменения**: Так как `@BeforeEach` вызывается перед каждым тестом, все изменения в объекте, созданном в `@BeforeEach`, остаются локальными для этого теста.
- **Изоляция тестов**: Использование `@BeforeEach` помогает изолировать тесты друг от друга, обеспечивая, что изменения, сделанные одним тестом, не повлияют на другие.
- **Удобство при отладке**: С `@BeforeEach` легче отлаживать каждый тест отдельно, поскольку он всегда начинается с известного состояния.

### Связь с аннотацией `@BeforeAll`

- `@BeforeEach` подготавливает окружение перед каждым тестом, а `@BeforeAll` — один раз перед всеми тестами.
- `@BeforeAll` обычно используется для инициализации тяжелых ресурсов (например, соединений с базой данных), а `@BeforeEach` — для легких объектов или данных, которые специфичны для каждого теста.

---

Аннотация `@AfterEach` в JUnit 5 используется для обозначения метода, который должен выполняться **после каждого тестового метода** в тестовом классе. Этот метод выполняет задачи по очистке или сбросу состояния, чтобы подготовить тестовое окружение для следующего теста. `@AfterEach` помогает предотвратить нежелательное влияние одного теста на другой, обеспечивая изоляцию тестов и единообразное начальное состояние.

### Основные особенности `@AfterEach`

1. **Выполнение после каждого теста**:
   - Метод с `@AfterEach` запускается после каждого тестового метода в классе.
   - Это полезно для сброса изменений, которые тест мог внести в общие ресурсы или переменные, тем самым защищая следующее выполнение от воздействия предыдущего.

2. **Изоляция тестов**:
   - При правильной настройке `@AfterEach` можно быть уверенным, что каждый тест работает с "чистым" состоянием, поскольку изменения, сделанные в одном тесте, сбрасываются после его завершения.
   - Метод предотвращает накопление изменений, которое может привести к неправильным результатам, особенно если несколько тестов работают с одними и теми же объектами или ресурсами.

3. **Может быть не `static`**:
   - В отличие от аннотации `@AfterAll`, которая требует статического метода, `@AfterEach` обычно применяется к нестатическим методам, так как он имеет дело с объектом тестового класса.

4. **Часто используется с `@BeforeEach`**:
   - `@AfterEach` дополняет `@BeforeEach`, предоставляя механизм очистки или сброса, который поддерживает тесты в изолированном состоянии.

### Пример использования `@AfterEach`

```java
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

    private List<String> list;

    @BeforeEach
    void setup() {
        list = new ArrayList<>();
        list.add("Initial element");
        System.out.println("List initialized before each test.");
    }

    @AfterEach
    void cleanup() {
        list.clear();
        System.out.println("List cleared after each test.");
    }

    @Test
    void testListAddition() {
        list.add("New element");
        System.out.println("Running testListAddition");
        // Проверка, что элемент добавлен
        assertEquals(2, list.size());
    }

    @Test
    void testListClear() {
        list.clear();
        System.out.println("Running testListClear");
        // Проверка, что список очищен
        assertEquals(0, list.size());
    }
}
```

### Объяснение примера:

- **Метод `setup()` с `@BeforeEach`**: Инициализирует список `list` перед каждым тестом и добавляет один элемент, чтобы каждый тест запускался с одним и тем же начальным состоянием.
- **Метод `cleanup()` с `@AfterEach`**: Очищает `list` после каждого теста, гарантируя, что любые изменения, сделанные во время теста (например, добавление или удаление элементов), не повлияют на последующие тесты.
- **Тесты**: Каждый тест начинается с известного состояния списка и завершается с очисткой, предотвращая влияние результатов одного теста на другой.

### Типичные сценарии использования `@AfterEach`

- **Освобождение ресурсов**: Закрытие соединений, освобождение памяти или других ресурсов, таких как временные файлы или потоки ввода-вывода.
- **Очистка данных**: Сброс изменённых объектов, переменных или коллекций, чтобы они не повлияли на следующий тест.
- **Логирование и отладка**: Удобно для вывода логов после тестов, чтобы отследить, как изменилось состояние.

### Связь с аннотацией `@AfterAll`

- `@AfterEach` применяется после каждого теста, в то время как `@AfterAll` запускается один раз после всех тестов в классе.
- `@AfterEach` используется для регулярного сброса состояния теста, а `@AfterAll` — для окончательного освобождения ресурсов, которые использовались всеми тестами.

### Важные моменты

- **Изоляция**: `@AfterEach` важна для изоляции тестов, так как сбрасывает состояние, изменённое в конкретном тесте, и предотвращает его перенос в следующий тест.
- **Универсальность**: Подходит для разнообразных задач по очистке, что позволяет поддерживать тесты в чистом и управляемом состоянии.
- **Удобство для тестирования**: Аннотация позволяет тестам быть независимыми, а это упрощает их отладку и поддержку, так как каждый тест начинает и заканчивает с предсказуемым состоянием.

---

Аннотация `@Test` в JUnit используется для обозначения методов, которые представляют собой тестовые случаи. Любой метод, помеченный этой аннотацией, будет выполнен как тест JUnit при запуске тестов. Давайте разберем её функционал и возможности.

### Основные аспекты аннотации `@Test`:

1. **Определение тестового метода**:
   - Аннотация `@Test` указывает JUnit, что данный метод является тестовым и его следует выполнять при запуске тестов.
   - Например, метод, помеченный `@Test`, может проверять корректность выполнения конкретного функционала, вызывать исключения, проверять логические операции и т. д.
   ```java
   @Test
   void testAddition() {
       assertEquals(4, MathUtils.add(2, 2));
   }
   ```

2. **Проверка утверждений (Assertions)**:
   - Тестовые методы, помеченные `@Test`, обычно содержат утверждения (`assertions`), которые проверяют ожидаемое и фактическое поведение кода.
   - Примеры утверждений: `assertEquals`, `assertTrue`, `assertFalse`, `assertThrows` и другие.

3. **Ожидание исключений**:
   - В параметрах аннотации можно указать тип ожидаемого исключения, если тест проверяет его возникновение.
   - Если ожидаемое исключение не будет выброшено, тест провалится.
   ```java
   @Test
   void testDivisionByZero() {
       assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
   }
   ```

4. **Тайм-аут (timeout)**:
   - Аннотация позволяет задавать максимальное время выполнения теста в миллисекундах.
   - Если выполнение теста превышает указанное время, он будет считаться неуспешным (не пройденным).
   ```java
   @Test(timeout = 1000)  // Тест должен завершиться за 1 секунду
   void testWithTimeout() {
       // Some code
   }
   ```

5. **Описание (displayName)** (JUnit 5):
   - В JUnit 5 можно указать понятное описание теста с помощью `@DisplayName`.
   - Это описание будет отображаться в отчетах тестирования и облегчит понимание сути теста.
   ```java
   @Test
   @DisplayName("Test for adding two positive numbers")
   void testAddition() {
       assertEquals(5, MathUtils.add(2, 3));
   }
   ```

### Жизненный цикл выполнения `@Test`:
1. Перед каждым тестом выполняются методы, помеченные `@BeforeEach` (если они существуют).
2. JUnit запускает тест, помеченный `@Test`.
3. После каждого теста выполняются методы, помеченные `@AfterEach`.

### Примеры
```java
class MathUtilsTest {

   @Test
   void testAddition() {
       assertEquals(5, MathUtils.add(2, 3), "Should return the sum of two numbers");
   }

   @Test
   void testDivisionByZero() {
       assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0), "Should throw ArithmeticException when divided by zero");
   }

   @Test(timeout = 200)
   void testLongRunningOperation() {
       // Code that should finish within 200 ms
   }
}
```

### Зачем использовать `@Test`?
Аннотация `@Test` позволяет:
- Автоматизировать тестирование кода.
- Проверять корректность функционала.
- Делать процесс тестирования повторяемым и отслеживаемым.
- Снижать количество ошибок в проекте.

`@Test` является основным инструментом для создания тестов в JUnit, помогая разработчикам проверять и подтверждать правильность работы кода на каждом этапе разработки.

---

The `@TestInstance` annotation in JUnit 5 allows you to control the lifecycle of the test class instances. By default, JUnit creates a new instance of the test class for each test method. However, using `@TestInstance`, you can specify whether to use a "per-class" or "per-method" lifecycle, which affects how the test class is instantiated and managed.

### Usage

1. **`@TestInstance(Lifecycle.PER_CLASS)`**:
   - When you annotate a test class with `@TestInstance(Lifecycle.PER_CLASS)`, JUnit will create a single instance of the test class and reuse it for all test methods.
   - This is useful when you want to share state between test methods without needing to declare instance variables as `static`.

   ```java
   import org.junit.jupiter.api.*;

   @TestInstance(TestInstance.Lifecycle.PER_CLASS)
   public class MyTests {
       private int counter;

       @BeforeEach
       void setUp() {
           counter = 0;
       }

       @Test
       void testOne() {
           counter++;
           Assertions.assertEquals(1, counter);
       }

       @Test
       void testTwo() {
           counter++;
           Assertions.assertEquals(1, counter); // This will pass because of shared state
       }
   }
   ```

2. **`@TestInstance(Lifecycle.PER_METHOD)`**:
   - This is the default behavior if you do not specify the annotation.
   - JUnit creates a new instance of the test class for each test method, meaning instance variables will be reset for each method.

   ```java
   import org.junit.jupiter.api.*;

   @TestInstance(TestInstance.Lifecycle.PER_METHOD) // This is the default
   public class MyTests {
       private int counter;

       @BeforeEach
       void setUp() {
           counter = 0;
       }

       @Test
       void testOne() {
           counter++;
           Assertions.assertEquals(1, counter);
       }

       @Test
       void testTwo() {
           counter++;
           Assertions.assertEquals(0, counter); // This will fail because counter is reset
       }
   }
   ```

### Benefits of Using `@TestInstance`:

- **State Sharing**: By using `PER_CLASS`, you can share state (like instance variables) across multiple test methods, which can simplify setup and teardown logic.
- **Improved Readability**: Keeping related test methods within the same instance can improve readability and maintainability.

### Considerations:

- **Static Methods**: If you use `@TestInstance(Lifecycle.PER_CLASS)`, you cannot use `static` methods in your test class. JUnit requires that lifecycle methods (`@BeforeAll`, `@AfterAll`) be static when using the default `PER_METHOD` lifecycle.
- **Memory Usage**: Using `PER_CLASS` might lead to increased memory usage if the test class holds a lot of state or resources.

### Example with `@TestInstance`

```java
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    void init() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        Assertions.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        Assertions.assertEquals(1, calculator.subtract(3, 2));
    }
}
```

In this example, `Calculator` is instantiated only once, and the same instance is used for both test methods, which can be beneficial for stateful operations or configurations.

---

In JUnit 5, the `@TestInstance` annotation is used to define the lifecycle of the test class instance. By default, JUnit 5 creates a new instance of the test class for each test method, but `@TestInstance` allows you to change this behavior by choosing between `PER_METHOD` (the default) and `PER_CLASS` lifecycles.

### Lifecycles

1. **`@TestInstance(TestInstance.Lifecycle.PER_METHOD)`** (default):
   - JUnit creates a **new instance of the test class for each test method**.
   - This ensures that each test runs in isolation, with no shared state among methods.
   - Since a new instance is created for each test, any instance variables are reset for each method.

   ```java
   import org.junit.jupiter.api.*;

   @TestInstance(TestInstance.Lifecycle.PER_METHOD)
   class CalculatorTest {
       private int counter;

       @Test
       void testAddition() {
           counter++; // counter is reset to 0 for each test method
           Assertions.assertEquals(1, counter);
       }

       @Test
       void testSubtraction() {
           counter++; // This counter is separate from testAddition's counter
           Assertions.assertEquals(1, counter);
       }
   }
   ```

2. **`@TestInstance(TestInstance.Lifecycle.PER_CLASS)`**:
   - JUnit creates **a single instance of the test class**, which is shared across all test methods in the class.
   - This enables state sharing across test methods, making it useful for scenarios where you want to maintain shared setup or variables.
   - `@BeforeAll` and `@AfterAll` methods don’t need to be `static` when using `PER_CLASS`, as they can access instance variables.

   ```java
   import org.junit.jupiter.api.*;

   @TestInstance(TestInstance.Lifecycle.PER_CLASS)
   class CalculatorTest {
       private int counter = 0;

       @BeforeAll
       void init() {
           counter = 10;
       }

       @Test
       void testAddition() {
           counter += 5; // modifies shared state
           Assertions.assertEquals(15, counter);
       }

       @Test
       void testSubtraction() {
           counter -= 5; // continues using shared state
           Assertions.assertEquals(5, counter); // test results depend on previous tests
       }
   }
   ```

### When to Use `PER_CLASS`

- **Shared State**: If tests need to share state or configurations, `PER_CLASS` can simplify setup.
- **Resource-Intensive Initialization**: If creating a new instance for each test is expensive, sharing one instance can improve efficiency.
- **Setup/Teardown Access**: `@BeforeAll` and `@AfterAll` can access instance variables directly without being `static` in `PER_CLASS`.

### Considerations

- **Isolation**: In `PER_CLASS`, tests are not fully isolated, so changes in one test may affect others.
- **Static Method Restrictions**: `@BeforeAll` and `@AfterAll` must be static in `PER_METHOD` but can be instance methods in `PER_CLASS`.

Using `@TestInstance` allows flexibility in how tests are organized and executed, balancing state-sharing needs with test isolation requirements.

---

The `@DisplayName` annotation in JUnit 5 allows you to specify a custom name for test classes and test methods. This name appears in test reports and in the console output, making it easier to understand the purpose of each test, especially if the test name itself might not be descriptive enough or if you want to use a more readable format.

### Key Features
- **Custom Names**: You can provide a more human-readable name, including spaces, special characters, or even emojis.
- **Improved Readability**: Useful for making test output more understandable at a glance.
- **Documentation**: Helps in documenting the intention of the test directly in the output.

### Usage Examples

#### Applying `@DisplayName` to a Test Method

```java
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("Adding two positive numbers")
    void testAddition() {
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("Subtracting two numbers")
    void testSubtraction() {
        assertEquals(1, 3 - 2, "3 - 2 should equal 1");
    }
}
```

In this example, when running the tests, instead of showing the method names `testAddition` and `testSubtraction`, JUnit will display:
- **Adding two positive numbers**
- **Subtracting two numbers**

#### Applying `@DisplayName` to a Test Class

```java
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Test Suite")
class CalculatorTest {

    @Test
    @DisplayName("Positive Addition Test")
    void additionTest() {
        // Test logic
    }

    @Test
    @DisplayName("Positive Subtraction Test")
    void subtractionTest() {
        // Test logic
    }
}
```

When the class is executed, it will appear as **Calculator Test Suite** in test reports, providing context for all contained test cases.

### Example with Emojis and Special Characters

You can use emojis or special symbols to make test names even more visually descriptive, especially in a team setting where certain symbols may indicate priority or status.

```java
@DisplayName("🔢 Calculator Tests 🚀")
class CalculatorTest {

    @Test
    @DisplayName("✅ Adding two numbers works correctly")
    void additionTest() {
        // Test logic
    }
}
```

### Advantages of `@DisplayName`
- **Clarity**: Helps clarify test intent, which is particularly useful for complex tests.
- **Organization**: Useful for grouping related tests with a descriptive name.
- **Flexibility**: Allows using any readable format, including spaces, punctuation, and emojis, which helps make test results accessible to non-developers.

In summary, `@DisplayName` provides flexibility in naming tests, making test reports more readable and useful for both developers and non-developers.

---

The `@Disabled` annotation in JUnit 5 is used to temporarily disable a test class or test method. When a test is annotated with `@Disabled`, it will be skipped during execution, meaning JUnit will not run it, and it will not be counted as a failure or success in the test results. This can be useful for tests that are under development, are currently broken, or need to be skipped for other reasons.

### Usage of `@Disabled`

1. **Disabling Individual Test Methods**: Add `@Disabled` to specific test methods you want to skip.
2. **Disabling an Entire Test Class**: Place `@Disabled` above a class definition to skip all test methods within the class.

### Optional Description

You can provide an optional `String` value to `@Disabled` to explain why the test is disabled. This is a helpful practice, as it informs others (and yourself in the future) of the reason the test is skipped.

### Examples

#### Disabling a Single Test Method

```java
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void additionTest() {
        assertEquals(5, 2 + 3);
    }

    @Test
    @Disabled("Test temporarily disabled due to known issue")
    void subtractionTest() {
        assertEquals(1, 3 - 2); // This test will not run
    }
}
```

In this example, `subtractionTest` is marked as disabled, and the message `"Test temporarily disabled due to known issue"` will be shown in the test report, explaining why the test was skipped.

#### Disabling an Entire Class

```java
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Calculator tests are under maintenance")
class CalculatorTest {

    @Test
    void additionTest() {
        // This test will not run
    }

    @Test
    void subtractionTest() {
        // This test will also not run
    }
}
```

With `@Disabled` applied to the class, **all tests in `CalculatorTest`** are skipped.

### Key Points

- **Temporary Disabling**: `@Disabled` is generally used to skip tests temporarily. It’s a good practice to avoid leaving tests disabled for long periods.
- **Optional Message**: Adding a reason for disabling is helpful for team communication and future maintenance.
- **Flexible Scope**: `@Disabled` can be used at the method or class level, giving flexibility in disabling specific tests or entire suites.

### Best Practices

- **Document the Reason**: Always specify why a test is disabled.
- **Review Disabled Tests Regularly**: Regularly review and remove `@Disabled` annotations once the underlying issues are resolved, to ensure that your test suite remains comprehensive.

---

In JUnit 5, `@assertAll` is used to group multiple assertions together, allowing them all to execute even if one or more assertions fail. This way, you can check multiple conditions or outcomes in a single test method without stopping at the first failure, which provides a more comprehensive view of the test results.

### Usage of `assertAll`

`assertAll` accepts a collection of executable assertions, allowing you to validate multiple aspects within the same test case. If any of the assertions fail, JUnit will report all failures instead of stopping after the first one.

### Basic Syntax

```java
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void testMultipleAssertions() {
        MathUtils mathUtils = new MathUtils();

        assertAll("Testing multiple assertions",
            () -> assertEquals(4, mathUtils.adder(2, 2), "Adder test failed"),
            () -> assertEquals(0, mathUtils.subtractor(2, 2), "Subtractor test failed"),
            () -> assertEquals(1, mathUtils.divider(2, 2), "Divider test failed")
        );
    }
}
```

### How It Works

In this example, three assertions are checked:
1. `adder` result
2. `subtractor` result
3. `divider` result

If any of these assertions fail, `assertAll` will report all of the failures together, rather than stopping after the first. This helps you spot multiple issues in a single test run.

### Nested `assertAll` for Complex Structures

If you have complex objects with multiple properties, you can nest `assertAll` calls to check each part of an object.

```java
@Test
void testComplexAssertions() {
    assertAll("Testing person properties",
        () -> assertAll("Testing name",
            () -> assertEquals("John", person.getFirstName(), "First name check failed"),
            () -> assertEquals("Doe", person.getLastName(), "Last name check failed")
        ),
        () -> assertEquals(30, person.getAge(), "Age check failed")
    );
}
```

### Key Benefits
- **Comprehensive feedback**: Reports all assertion failures within the block.
- **Efficient debugging**: Allows you to quickly identify all issues without rerunning tests multiple times.

### Best Use Cases
Use `assertAll` when:
- Validating multiple properties of an object.
- Checking different outcomes or conditions within a single test.
- You want to ensure all assertions are evaluated even if some fail.

---

In JUnit, **lifecycle methods** are special methods within a test class that execute at specific points in the test execution process. These methods are annotated with `@BeforeAll`, `@AfterAll`, `@BeforeEach`, or `@AfterEach`, and they allow you to manage setup and cleanup tasks that are needed for testing. Each of these annotations has a specific purpose and scope, which allows you to control the lifecycle and execution of your tests in a precise way.

Here's a breakdown of each lifecycle annotation:

---

### 1. `@BeforeAll`
- **Purpose**: Executes once before any test methods in the class run.
- **Scope**: Runs at the class level, applying to all test methods.
- **Common Usage**: Often used for expensive or resource-heavy setup that only needs to happen once, such as connecting to a database, setting up a server, or loading large files.
- **Requirements**:
  - The method must be `static` in JUnit 5, unless the test class is annotated with `@TestInstance(TestInstance.Lifecycle.PER_CLASS)`.
  - The method should ideally be `void` and public.

#### Example:
```java
@BeforeAll
static void initAll() {
    System.out.println("Setting up resources for all tests");
    // Perform setup that applies to all tests, e.g., establishing a database connection
}
```

### 2. `@AfterAll`
- **Purpose**: Executes once after all test methods in the class have run.
- **Scope**: Runs at the class level, applying to all test methods.
- **Common Usage**: Used for cleaning up resources that were initialized in `@BeforeAll`, such as closing database connections, stopping servers, or freeing resources.
- **Requirements**:
  - Like `@BeforeAll`, it should be a `static` method in JUnit 5 unless `@TestInstance(TestInstance.Lifecycle.PER_CLASS)` is used.
  - The method should ideally be `void` and public.

#### Example:
```java
@AfterAll
static void tearDownAll() {
    System.out.println("Cleaning up resources after all tests");
    // Perform cleanup for resources created in @BeforeAll
}
```

---

### 3. `@BeforeEach`
- **Purpose**: Executes before each test method runs.
- **Scope**: Runs once per test method, resetting the test environment for each test.
- **Common Usage**: Useful for setting up data or objects that are needed by each test, ensuring that each test has a fresh and independent setup. This could include resetting variables, initializing objects, or creating test-specific data.
- **Requirements**: Does not need to be static. The method should ideally be `void`.

#### Example:
```java
@BeforeEach
void init() {
    System.out.println("Setting up for each test");
    // Prepare any data or objects that each test might need
}
```

---

### 4. `@AfterEach`
- **Purpose**: Executes after each test method completes.
- **Scope**: Runs once per test method, following its completion.
- **Common Usage**: Commonly used for cleaning up or resetting any resources or data used in each test. This ensures that each test starts with a clean slate.
- **Requirements**: Does not need to be static. The method should ideally be `void`.

#### Example:
```java
@AfterEach
void tearDown() {
    System.out.println("Cleaning up after each test");
    // Cleanup tasks to reset the environment for the next test
}
```

---

### How Lifecycle Methods Work Together
When a JUnit test class is executed, JUnit follows a sequence of method calls that incorporate these lifecycle methods:

1. **`@BeforeAll`** is executed once at the very beginning, before any tests.
2. For each test:
   - **`@BeforeEach`** is run before the test to set up a fresh environment.
   - The test method is executed.
   - **`@AfterEach`** is run after the test to clean up.
3. **`@AfterAll`** is executed once at the end, after all tests have finished.

### Example of All Lifecycle Methods in One Class

```java
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ExampleTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Setting up for all tests");
    }

    @BeforeEach
    void setupEach() {
        System.out.println("Setting up for a test");
    }

    @Test
    void testOne() {
        System.out.println("Running Test 1");
        Assertions.assertTrue(true);
    }

    @Test
    void testTwo() {
        System.out.println("Running Test 2");
        Assertions.assertTrue(true);
    }

    @AfterEach
    void cleanupEach() {
        System.out.println("Cleaning up after a test");
    }

    @AfterAll
    static void cleanupAll() {
        System.out.println("Cleaning up after all tests");
    }
}
```

### Output of the Example

Running the above example would produce output like this:
```
Setting up for all tests
Setting up for a test
Running Test 1
Cleaning up after a test
Setting up for a test
Running Test 2
Cleaning up after a test
Cleaning up after all tests
```

---

### Key Points to Remember
- **`@BeforeAll` and `@AfterAll`** are class-level setup and teardown methods, while **`@BeforeEach` and `@AfterEach`** are instance-level, executing before and after each test method.
- Using `@TestInstance(TestInstance.Lifecycle.PER_CLASS)` allows `@BeforeAll` and `@AfterAll` to be non-static in JUnit 5, enabling the sharing of class state between methods.
- These lifecycle methods ensure a controlled and repeatable test environment, reducing the chance of "test pollution" where one test might interfere with another due to shared resources or state.

---

In JUnit, a **Test Class** serves as the main container for organizing and executing test methods. Test classes are classes that contain at least one test method, meaning any method annotated with `@Test` or other test-specific annotations like `@RepeatedTest`, `@ParameterizedTest`, etc. These test methods contain the logic to verify that a specific part of the code under test behaves as expected.

Here’s a detailed look at the properties, requirements, and types of test classes in JUnit:

---

### 1. Types of Test Classes
A test class can be:
- **Top-Level Class**: A standard public class defined in its own file.
- **Static Member Class**: A `static` nested class within another class, often used to organize related tests under one main class.
- **@Nested Class**: An inner class annotated with `@Nested`, allowing it to group tests in a hierarchical structure within the outer class.

### 2. Requirements for a Test Class
JUnit imposes certain requirements on test classes to ensure they function properly within the JUnit testing framework:
   - **Not Abstract**: Test classes cannot be `abstract` because JUnit needs to instantiate them to run their test methods.
   - **Single Constructor**: Test classes should have a single, parameterless constructor (or a record-based constructor if it's a Java record). This helps JUnit manage the lifecycle of the test class instances.
   - **Method Annotations**: A test class should contain at least one method annotated with `@Test` or other JUnit test annotations like `@ParameterizedTest`, `@RepeatedTest`, or `@TestFactory`.

### 3. Structure of a Typical Test Class
A well-organized test class typically includes:
   - **Setup Methods**: Methods annotated with `@BeforeEach` and `@BeforeAll` to set up preconditions for tests.
   - **Test Methods**: Methods annotated with `@Test` that contain assertions to verify the behavior of the code under test.
   - **Teardown Methods**: Methods annotated with `@AfterEach` and `@AfterAll` to clean up after tests.

### 4. Using @Nested Classes
JUnit allows for nested test classes with the `@Nested` annotation. These can be especially useful to:
   - **Group Related Tests**: Organize tests related to specific aspects of the functionality under a single outer test class.
   - **Control Test Lifecycles**: Each `@Nested` class can have its own setup and teardown methods, enabling more precise control over the environment for specific groups of tests.
   - **Improving Readability**: `@Nested` classes help structure complex tests, making them more readable and organized.

#### Example
```java
import org.junit.jupiter.api.*;

public class ExampleTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Setting up resources for all tests");
    }

    @BeforeEach
    void setup() {
        System.out.println("Setting up before each test");
    }

    @Test
    void testMethod1() {
        System.out.println("Running testMethod1");
        Assertions.assertTrue(true);
    }

    @Nested
    class NestedTestClass {

        @BeforeEach
        void setupNested() {
            System.out.println("Setup for each test in NestedTestClass");
        }

        @Test
        void testMethodInNested() {
            System.out.println("Running testMethodInNested");
            Assertions.assertTrue(true);
        }

        @AfterEach
        void tearDownNested() {
            System.out.println("Teardown for each test in NestedTestClass");
        }
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after each test");
    }

    @AfterAll
    static void cleanupAll() {
        System.out.println("Cleaning up resources after all tests");
    }
}
```

### Output of the Example
```
Setting up resources for all tests
Setting up before each test
Running testMethod1
Cleaning up after each test
Setup for each test in NestedTestClass
Running testMethodInNested
Teardown for each test in NestedTestClass
Cleaning up after each test
Cleaning up resources after all tests
```

In this example:
- **`ExampleTest`** is a top-level test class containing a test method `testMethod1`.
- **`NestedTestClass`** is an inner class annotated with `@Nested`. It has its own setup and teardown methods (`setupNested` and `tearDownNested`), which run before and after each test within the nested class.
- Each nested class can access the setup of the outer class, enabling hierarchical organization without sacrificing independence between tests.

---

### 5. Java Record Classes as Test Classes
JUnit 5 supports test classes as **Java records**. Records can serve as test classes if they:
   - Have a primary constructor (as required by Java’s record syntax).
   - Are non-abstract.

Using records in this way is rare and typically reserved for scenarios where immutability and specific structured data storage in the test setup are desired.

---

### Benefits of Test Classes
Using test classes allows you to:
- **Isolate and Organize Tests**: Group related test methods, making it easier to manage test logic and isolate functionality.
- **Control Test Lifecycle**: Use lifecycle methods like `@BeforeEach` and `@AfterEach` to manage setup and teardown at both the class and method levels.
- **Use Nested Classes for Grouping**: With `@Nested`, you can group related tests within a single class, reducing clutter and improving readability.

### Summary
A test class is essentially a container for one or more test methods and lifecycle methods, providing a structured environment to verify code behavior. Using top-level, static, and nested classes in JUnit enables well-organized, maintainable tests that can be flexibly managed within their own isolated contexts, supporting effective and comprehensive test coverage.


---

In JUnit, a **Test Method** is an instance method that serves as a core unit of testing, containing assertions to verify specific behaviors or outcomes of the code under test. A test method is directly annotated with `@Test`, `@RepeatedTest`, `@ParameterizedTest`, `@TestFactory`, or `@TestTemplate`, each serving different purposes and enabling a variety of testing approaches.

Here’s a more detailed look at each of these annotations:

---

### 1. `@Test`
- **Purpose**: Marks a method as a standard test case.
- **Usage**: Simple test method that executes assertions to check for expected results.
- **Example**:
  ```java
  @Test
  void additionTest() {
      assertEquals(5, MathUtils.add(2, 3));
  }
  ```
  This method checks if the `add` method in `MathUtils` correctly sums 2 and 3.

### 2. `@RepeatedTest`
- **Purpose**: Repeats a test multiple times, useful for testing reliability or performance over repeated runs.
- **Parameters**: Specifies the number of repetitions.
- **Example**:
  ```java
  @RepeatedTest(5)
  void repeatedAdditionTest() {
      assertEquals(5, MathUtils.add(2, 3));
  }
  ```
  This method will run the test 5 times to verify that the addition consistently works as expected.

### 3. `@ParameterizedTest`
- **Purpose**: Runs the same test method multiple times with different input values, which is useful for testing functions with a range of inputs.
- **Parameters**: Requires a source of arguments, such as `@ValueSource`, `@CsvSource`, `@MethodSource`, etc.
- **Example**:
  ```java
  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3, 4, 5})
  void testSquareOfNumbers(int number) {
      assertTrue(MathUtils.square(number) >= 0);
  }
  ```
  This method tests that the square of any number from the provided list is non-negative.

### 4. `@TestFactory`
- **Purpose**: Used to create **Dynamic Tests** that are generated at runtime instead of being defined statically. This is useful for cases where the number of tests isn’t fixed, such as when generating tests based on data.
- **Returns**: A collection or stream of dynamic test instances, such as `DynamicTest`.
- **Example**:
  ```java
  @TestFactory
  Collection<DynamicTest> dynamicTestsWithEvenNumbers() {
      return Arrays.asList(
          DynamicTest.dynamicTest("2 is even", () -> assertTrue(MathUtils.isEven(2))),
          DynamicTest.dynamicTest("4 is even", () -> assertTrue(MathUtils.isEven(4)))
      );
  }
  ```
  This method dynamically generates tests to check whether numbers are even.

### 5. `@TestTemplate`
- **Purpose**: Defines a method as a template for multiple test invocations with different configurations, usually working in combination with custom `TestTemplateInvocationContextProviders`.
- **Example Use Case**: Often used for testing custom configurations or environments that require special setup for each test run.
- **Example**:
  ```java
  @TestTemplate
  @ExtendWith(CustomInvocationContextProvider.class)
  void testWithCustomContext() {
      // custom test logic
  }
  ```

---

### Organizing Test Methods in the Test Tree
Each of these annotations impacts the **test tree** (the hierarchical structure of test execution and reporting) in different ways:
- **`@Test`**: Each `@Test` method appears as an individual test node in the test tree.
- **`@RepeatedTest`**: Shows as a container node grouping each repetition as a child.
- **`@ParameterizedTest`**: Creates a container node, with each parameterized execution as a child node.
- **`@TestFactory`**: Appears as a container in the test tree, with each dynamically created test as a child node.
- **`@TestTemplate`**: Custom-defined with specific contexts, often displayed as a container when multiple invocations are used.

### Summary
A **Test Method** is the fundamental building block of testing in JUnit. By using different annotations, JUnit allows you to test functions thoroughly, with flexibility in the data, repetitions, and even custom contexts.

---

Методы тестирования в JUnit должны соответствовать определённым требованиям для корректного выполнения тестов. Вот подробное объяснение, какими должны быть тестовые методы и почему:

---

### 1. **Возвращаемый тип `void`**

   - **Почему**: Метод тестирования должен быть самостоятельным и **не возвращать никаких значений**, так как его задача — проверить поведение тестируемого кода, а не вычислять или возвращать результат. JUnit оценивает успех или провал теста только на основе утверждений (assertions), а не возвращаемого значения.
   - **Как это работает**:
      - JUnit считает метод тестирования успешным, если все проверки (assertions) в нём прошли.
      - Если хотя бы одно утверждение не выполнится, JUnit выбрасывает исключение (например, `AssertionError`), и тест автоматически отмечается как провалившийся.
   - **Пример**:
     ```java
     @Test
     void testAddition() {
         assertEquals(5, MathUtils.add(2, 3));
     }
     ```

### 2. **Отсутствие параметров**

   - **Почему**: **Методы тестирования не должны принимать параметры**, потому что они выполняются JUnit автоматически, и параметры не передаются. Методы тестирования должны быть независимыми и не зависеть от внешних данных, за исключением того, что определено в самом методе или подготовлено в `@BeforeEach`/`@BeforeAll`.
   - **Исключение**:
      - Параметризованные тесты (аннотированные `@ParameterizedTest`) допускают использование параметров, которые задаются через специальные аннотации, такие как `@ValueSource` или `@CsvSource`. Они позволяют запустить тест с различными значениями параметров.
   - **Пример параметризованного теста**:
     ```java
     @ParameterizedTest
     @ValueSource(ints = {1, 2, 3})
     void testSquare(int number) {
         assertTrue(MathUtils.square(number) >= 0);
     }
     ```

### 3. **Аннотация `@Test` или альтернативные аннотации**

   - **Почему**: Аннотация `@Test` обозначает метод как тестируемый, что позволяет JUnit автоматически распознавать и выполнять его.
   - **Альтернативные аннотации**:
     - `@RepeatedTest` — запускает тест несколько раз.
     - `@ParameterizedTest` — позволяет задавать входные параметры для тестов.
     - `@TestFactory` — используется для создания динамических тестов (можно генерировать тесты в процессе выполнения).
     - `@TestTemplate` — используется для шаблонов тестирования, когда тестовая структура может быть одинаковой, но содержание — разным.
   - **Как это работает**:
      - Если метод не аннотирован одной из этих аннотаций, JUnit не воспринимает его как тест и не выполняет.
   - **Пример**:
     ```java
     @Test
     void shouldReturnSum() {
         assertEquals(5, MathUtils.add(2, 3));
     }
     ```

### 4. **Публичные или пакетные методы**

   - **Почему**: Тестовые методы **должны быть доступны JUnit**, что требует, чтобы они были как минимум пакетными (package-private). Частные (private) методы не обнаруживаются и не выполняются.
   - **Как это работает**:
      - Методы тестирования могут быть объявлены как `public` или с пактной видимостью (по умолчанию).
      - Приватные методы не будут выполнены JUnit, что приведёт к пропуску теста.
   - **Пример**:
     ```java
     @Test
     void calculateAreaTest() {
         assertEquals(78.5, MathUtils.calculateCircleArea(5), 0.1);
     }
     ```

### 5. **Отсутствие проверяемых исключений в сигнатуре метода**

   - **Почему**: Тестовые методы **не должны объявлять проверяемые исключения** в сигнатуре, поскольку JUnit обрабатывает все исключения сам и использует их для определения результата теста. Если тест завершится с необработанным исключением, это будет рассматриваться как провал теста.
   - **Как это работает**:
      - JUnit позволяет ожидать выброса исключений с помощью метода `assertThrows`.
      - Если ожидается выброс исключения, и оно выбрасывается, тест проходит. Если исключение не выбрасывается, тест проваливается.
   - **Пример**:
     ```java
     @Test
     void testDivideByZero() {
         assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
     }
     ```

### 6. **Информативные имена методов**

   - **Почему**: Название тестового метода должно описывать, что проверяет тест, что помогает понять логику тестов и упрощает поиск ошибок.
   - **Как это работает**:
      - Выбирайте такие имена, которые объясняют поведение, например, `calculateAreaShouldReturnCorrectValue()` вместо `test1()`.
      - Ясные имена делают результаты тестирования легко читаемыми.
   - **Пример**:
     ```java
     @Test
     void shouldCalculateCircleAreaCorrectly() {
         assertEquals(78.5, MathUtils.calculateCircleArea(5), 0.1);
     }
     ```

### 7. **Изоляция и независимость тестов**

   - **Почему**: Тесты должны быть **изолированными** и **независимыми** друг от друга. Это значит, что выполнение одного теста не должно влиять на результаты других тестов.
   - **Как это работает**:
      - Используйте аннотации `@BeforeEach` и `@AfterEach` для подготовки окружения перед каждым тестом и очистки после.
      - Это помогает избежать зависимости тестов от предыдущего состояния, что обеспечивает консистентные результаты при каждом запуске.
   - **Пример использования `@BeforeEach` и `@AfterEach`**:
     ```java
     private MathUtils mathUtils;

     @BeforeEach
     void setUp() {
         mathUtils = new MathUtils();
     }

     @AfterEach
     void tearDown() {
         // clean-up logic if needed
     }

     @Test
     void testAddition() {
         assertEquals(5, mathUtils.add(2, 3));
     }
     ```

---

### Подытоживая:

- Методы тестирования должны быть `void`, без параметров (кроме параметризованных тестов), аннотированы, доступные JUnit (public или package-private), без проверяемых исключений, с информативными названиями и независимыми.

Эти правила делают тесты надёжными, понятными и воспроизводимыми, что упрощает их использование и отладку.


---


В JUnit, вложенные (nested) классы используются для группировки тестов и логически разделяют разные аспекты тестирования одного класса или функциональности. Это удобно, когда есть несколько связанных тестов, которые можно организовать в одном основном классе, но они проверяют разные части функциональности или разные сценарии.

В JUnit 5 добавлена поддержка вложенных классов с помощью аннотации `@Nested`. Этот подход позволяет создавать более структурированные и организованные тесты.

### Пример: Использование `@Nested` в тестах JUnit

```java
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Nested
    @DisplayName("Tests for the adder method")
    class AdderTests {
        @Test
        @DisplayName("Adding two positive numbers")
        void addPositiveNumbers() {
            assertEquals(7, mathUtils.adder(3, 4));
        }

        @Test
        @DisplayName("Adding a positive and a negative number")
        void addPositiveAndNegativeNumber() {
            assertEquals(1, mathUtils.adder(3, -2));
        }
    }

    @Nested
    @DisplayName("Tests for the subtractor method")
    class SubtractorTests {
        @Test
        @DisplayName("Subtracting two positive numbers")
        void subtractPositiveNumbers() {
            assertEquals(2, mathUtils.subtractor(5, 3));
        }

        @Test
        @DisplayName("Subtracting a larger number from a smaller number")
        void subtractLargerFromSmaller() {
            assertEquals(-3, mathUtils.subtractor(2, 5));
        }
    }

    @Nested
    @DisplayName("Tests for the divider method")
    class DividerTests {
        @Test
        @DisplayName("Dividing by a non-zero number")
        void divideByNonZero() {
            assertEquals(2.5, mathUtils.divider(5, 2), 0.01);
        }

        @Test
        @DisplayName("Dividing by zero should throw ArithmeticException")
        void divideByZero() {
            assertThrows(ArithmeticException.class, () -> mathUtils.divider(10, 0), "divide by zero should throw ArithmeticException");
        }
    }
}
```

### Разбор примера:

1. **Основной тестовый класс `MathUtilsTest`**:
   - В этом классе мы создаём экземпляр `MathUtils`, который используется в каждом из тестов.

2. **Вложенные классы с аннотацией `@Nested`**:
   - **`AdderTests`** — вложенный класс, содержащий тесты для метода `adder`. Он проверяет различные сценарии сложения чисел.
   - **`SubtractorTests`** — вложенный класс для тестов метода `subtractor`. Он также проверяет несколько сценариев вычитания.
   - **`DividerTests`** — вложенный класс для тестов метода `divider`. Он проверяет обычное деление и деление на ноль, которое должно вызвать исключение.

3. **Аннотация `@DisplayName`**:
   - `@DisplayName` используется для создания читаемых имён тестов. Это улучшает читаемость вывода тестов, так как каждый тест и каждый вложенный класс получают понятное описание, отображаемое при запуске тестов.

4. **Организация тестов**:
   - Каждое из тестовых условий (например, сложение, вычитание, деление) логически разделено по классам, что делает тесты более структурированными и помогает избежать путаницы при работе с большими наборами тестов.

### Преимущества вложенных классов в JUnit:

- **Организация и структура**: Группировка тестов в классы помогает разбить крупные тестовые сценарии на небольшие логически связанные блоки.
- **Повторное использование и настройка окружения**: Можно использовать разные `@BeforeEach` и `@AfterEach` методы для разных вложенных классов, если требуется настроить окружение по-разному для каждой группы тестов.
- **Улучшение читаемости**: `@DisplayName` помогает добавить описательные заголовки для каждого теста и каждого набора тестов, что делает тесты более понятными при их чтении.

### Заключение

Вложенные тесты с `@Nested` полезны для организации сложных тестов и помогают сделать тестовые классы более структурированными и понятными.

---


In JUnit 5, you can use `Supplier<String>` to defer the creation of assertion messages until they are needed. This is useful in situations where constructing the message might be costly in terms of performance. The message will only be created if the assertion fails.

Here's how you can use a `Supplier<String>` in JUnit assertions:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testFirstName() {
        Person person = new Person("John", "Doe", 25);
        assertEquals("John", person.getFirstName(), () -> "Expected first name to be 'John' but was '" + person.getFirstName() + "'");
    }

    @Test
    void testLastName() {
        Person person = new Person("John", "Doe", 25);
        assertEquals("Doe", person.getLastName(), () -> "Expected last name to be 'Doe' but was '" + person.getLastName() + "'");
    }

    @Test
    void testAge() {
        Person person = new Person("John", "Doe", 25);
        assertEquals(25, person.getAge(), () -> "Expected age to be 25 but was " + person.getAge());
    }
}
```

### Explanation

- **Message as `Supplier<String>`**: Instead of passing a simple `String` as the last parameter in `assertEquals`, we pass a lambda expression (`() -> "message"`). This lambda will only be evaluated if the assertion fails, meaning the message will only be constructed in case of failure.

- **Performance Benefit**: When the test passes, JUnit doesn’t create the message, which is particularly helpful if constructing the message involves complex calculations or expensive operations.

Using `Supplier<String>` for assertion messages is recommended in scenarios where the message creation is complex or computationally expensive, as it prevents unnecessary overhead during test execution.


---

The `@RepeatedTest` annotation in JUnit 5 is used to run the same test multiple times. This can be useful in cases where you want to verify that a piece of code behaves consistently or is reliable over repeated executions. It’s often applied in scenarios like:

- Testing code that may produce different results on repeated executions, such as random number generation.
- Checking for potential issues related to caching, memory leaks, or concurrency, which might only become apparent after multiple runs.
- Ensuring stability under repetitive conditions, such as with performance-sensitive code.

### Basic Usage

The `@RepeatedTest` annotation takes a single parameter, `value`, which specifies the number of times the test should run.

```java
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

class MyTests {

    @RepeatedTest(5)  // Run this test 5 times
    void testRepeatedExecution() {
        int expected = 5;
        int actual = 2 + 3;
        assertEquals(expected, actual, "2 + 3 should equal 5");
    }
}
```

In this example, the `testRepeatedExecution` method will run 5 times, and each time, JUnit will assert that `2 + 3` equals `5`.

### Accessing Repetition Information

JUnit 5 also allows you to add a `RepetitionInfo` parameter to the test method to get information about the current repetition count and total repetitions. This can be useful if you want to customize behavior based on the repetition number.

```java
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

class MyTests {

    @RepeatedTest(3)
    void testWithRepetitionInfo(RepetitionInfo repetitionInfo) {
        System.out.println("Repetition " + repetitionInfo.getCurrentRepetition() +
                           " of " + repetitionInfo.getTotalRepetitions());
        // Additional test logic here
    }
}
```

Here, `RepetitionInfo` allows us to see which repetition is currently running. If this test is set to run 3 times, the output will show:
```
Repetition 1 of 3
Repetition 2 of 3
Repetition 3 of 3
```

### Custom Display Names

You can provide custom display names for each repetition by using `name` in `@RepeatedTest`. It allows placeholders like `{currentRepetition}` and `{totalRepetitions}`.

```java
@RepeatedTest(value = 3, name = "Repetition {currentRepetition} of {totalRepetitions}")
void customDisplayNameTest() {
    // Test logic
}
```

### Benefits of Using `@RepeatedTest`

- **Consistency Checks**: Helps identify flaky tests, which might pass or fail inconsistently due to timing or other factors.
- **Performance and Load Testing**: Enables repeated execution to observe performance under repeated load.
- **Concurrency Testing**: Can help detect issues that only emerge in certain concurrent situations.

The `@RepeatedTest` annotation is a valuable tool in scenarios where test stability, consistency, and repeated behavior need to be verified.

---

In Java, the `@Repeatable` annotation allows you to apply the same annotation multiple times to a single element. Introduced in Java 8, it’s commonly used for cases where an element needs more than one instance of the same annotation type, such as in scenarios where you want to specify multiple configurations or settings for a particular method, class, or field.

### How `@Repeatable` Works

To make an annotation repeatable, you define it with the `@Repeatable` annotation, which itself takes a container annotation as an argument. The container annotation holds multiple instances of the repeatable annotation.

Here’s a breakdown of how to create and use a repeatable annotation.

### Step-by-Step Example

1. **Define the Repeatable Annotation**: Create an annotation (e.g., `@Role`) that can be repeated. Mark it with `@Repeatable`, specifying a container annotation (`Roles`) that will hold multiple instances of `@Role`.

2. **Define the Container Annotation**: Create the container annotation (`@Roles`), which is simply an annotation that has an array of the repeatable annotation (in this case, `Role[]`).

3. **Use the Repeatable Annotation**: Apply the annotation multiple times to a target element (like a class or method).

### Example Code

Let’s go through the example of a `Role` annotation, which can be used multiple times to assign different roles to a user.

#### Step 1: Define the Repeatable Annotation

```java
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Roles.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Role {
    String value();
}
```

#### Step 2: Define the Container Annotation

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Roles {
    Role[] value();
}
```

#### Step 3: Apply the Repeatable Annotation

Now, you can use `@Role` multiple times on a class or method.

```java
@Role("Admin")
@Role("User")
public class Person {
    // class implementation
}
```

Alternatively, without using `@Repeatable`, you would need to use the container annotation directly, like this:

```java
@Roles({
    @Role("Admin"),
    @Role("User")
})
public class Person {
    // class implementation
}
```

### Accessing Repeatable Annotations via Reflection

To retrieve repeatable annotations at runtime, use reflection. If `@Role` is used multiple times on a class, you can retrieve them as follows:

```java
import java.lang.annotation.Annotation;

public class AnnotationExample {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;

        // Retrieve all Role annotations
        Role[] roles = personClass.getAnnotationsByType(Role.class);

        for (Role role : roles) {
            System.out.println("Role: " + role.value());
        }
    }
}
```

### Benefits and Use Cases of `@Repeatable`

- **Increased Flexibility**: Allows cleaner code, especially in configurations or metadata where multiple annotations of the same type are needed.
- **Improved Readability**: Instead of wrapping annotations in a container manually, `@Repeatable` enables straightforward usage.
- **Common Use Cases**:
  - Specifying multiple roles or permissions (as in the example above).
  - Declaring multiple scheduled tasks or configurations for testing.
  - Documenting multiple authors or contributors for code elements.

Using `@Repeatable` simplifies working with repeated configurations and improves readability by allowing direct, concise annotation application.

---

The `@Repeatable` annotation in Java is used to indicate that an annotation type can be applied multiple times to a single declaration (e.g., class, method, field). The primary difference between `@Repeatable` annotations and regular annotations lies in how you can apply and access them. Here's a detailed comparison of these two types:

### 1. Application

- **Regular Annotation**:
  - A standard annotation can only be applied once to a target element.
  - If you try to apply it more than once, it will result in a compilation error.

  **Example**:
  ```java
  @MyAnnotation
  @MyAnnotation // This will cause a compilation error
  public class Example {}
  ```

- **Repeatable Annotation**:
  - A repeatable annotation can be applied multiple times to the same element.
  - You must use a container annotation (defined with `@Repeatable`) to hold the repeated instances or simply apply the annotation multiple times directly.

  **Example**:
  ```java
  @Role("Admin")
  @Role("User") // Allowed because Role is repeatable
  public class User {}
  ```

### 2. Container Annotation

- **Regular Annotation**:
  - Does not require a container annotation. You simply declare the annotation.

- **Repeatable Annotation**:
  - Requires a container annotation, which must be defined to hold the array of the repeatable annotation instances.
  - The container annotation is marked with the same retention policy as the repeatable annotation.

  **Example of Container**:
  ```java
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Roles {
      Role[] value();
  }
  ```

### 3. Accessing Annotations

- **Regular Annotation**:
  - You access a regular annotation using the `getAnnotation()` method.

  **Example**:
  ```java
  MyAnnotation annotation = myClass.getAnnotation(MyAnnotation.class);
  ```

- **Repeatable Annotation**:
  - You can retrieve all instances of the repeatable annotation using `getAnnotationsByType()`, which returns an array of all instances of that annotation.

  **Example**:
  ```java
  Role[] roles = myClass.getAnnotationsByType(Role.class);
  ```

### 4. Design Purpose

- **Regular Annotation**:
  - Used for situations where a single instance is sufficient to convey the needed information.
  - Ideal for single-value configurations or settings.

- **Repeatable Annotation**:
  - Used when the same kind of information needs to be specified multiple times for a single element.
  - Useful for scenarios such as specifying multiple roles, permissions, or multiple values for a single attribute.

### Summary

| Feature                        | Regular Annotation                          | Repeatable Annotation                      |
|--------------------------------|--------------------------------------------|-------------------------------------------|
| **Application**                | Can only be used once per target element. | Can be applied multiple times.            |
| **Container Requirement**      | No container needed.                       | Requires a container annotation.          |
| **Access Method**             | `getAnnotation()`                          | `getAnnotationsByType()`                  |
| **Design Purpose**             | For single-value configurations.           | For specifying multiple values.           |

### Conclusion

The main difference lies in the flexibility offered by repeatable annotations, allowing developers to express complex configurations or metadata more clearly without needing to define multiple container annotations or change existing code structures. This feature enhances code readability and maintainability, especially in cases where multiple similar attributes are necessary.

---

The `@Repeatable` and `@RepeatedTest` annotations serve different purposes in Java's annotation and testing frameworks, specifically JUnit 5. Here’s a detailed breakdown of the differences between them:

### 1. **Purpose**

- **`@Repeatable`**:
  - This annotation is used to indicate that an annotation type can be applied multiple times to the same declaration (e.g., a class, method, or field).
  - It allows developers to define annotations that can be stacked on top of each other, providing flexibility in specifying multiple attributes.

- **`@RepeatedTest`**:
  - This annotation is used to indicate that a test method should be executed multiple times.
  - It is part of the JUnit 5 testing framework and is designed specifically for test execution, allowing developers to run the same test with the specified number of repetitions.

### 2. **Usage**

- **`@Repeatable`**:
  - When you declare an annotation with `@Repeatable`, you must also define a container annotation that holds an array of the repeatable annotations.
  - It is used for metadata and can be applied to any element (classes, methods, fields, etc.).

  **Example**:
  ```java
  @Repeatable(Roles.class)
  public @interface Role {
      String value();
  }

  @Retention(RetentionPolicy.RUNTIME)
  public @interface Roles {
      Role[] value();
  }
  ```

- **`@RepeatedTest`**:
  - It is used on test methods within a test class to specify how many times the test should be executed.
  - It can include additional parameters to control the execution, such as the display name for each repetition.

  **Example**:
  ```java
  @RepeatedTest(5)
  void testMethod() {
      // This test will run 5 times
  }
  ```

### 3. **Context of Use**

- **`@Repeatable`**:
  - Used in the context of defining custom annotations that can be applied repeatedly.
  - Useful for scenarios where multiple annotations need to convey related information, like roles, permissions, or configuration settings.

- **`@RepeatedTest`**:
  - Used in the context of unit testing to allow a single test method to be executed multiple times.
  - Useful for validating that a particular behavior is consistent across multiple executions, such as random data tests or performance tests.

### 4. **Example**

- **Using `@Repeatable`**:
  ```java
  @Repeatable(Roles.class)
  public @interface Role {
      String value();
  }

  @Retention(RetentionPolicy.RUNTIME)
  public @interface Roles {
      Role[] value();
  }

  @Role("Admin")
  @Role("User")
  public class User {}
  ```

- **Using `@RepeatedTest`**:
  ```java
  import org.junit.jupiter.api.RepeatedTest;

  public class ExampleTest {
      @RepeatedTest(3)
      void test() {
          System.out.println("This test will run 3 times");
      }
  }
  ```

### Summary of Differences

| Feature                | `@Repeatable`                        | `@RepeatedTest`                         |
|------------------------|-------------------------------------|-----------------------------------------|
| **Purpose**            | Enables annotations to be repeated  | Allows test methods to be executed multiple times |
| **Context**            | Used for creating repeatable annotations | Used in JUnit for executing tests        |
| **Application**        | Applied to any element              | Applied only to test methods            |
| **Container Requirement** | Requires a container annotation    | No container required                    |

### Conclusion

In summary, `@Repeatable` is focused on defining custom annotations that can be applied multiple times, while `@RepeatedTest` is focused on executing a single test method multiple times during testing. They serve distinct roles within the Java programming language and the JUnit testing framework, and understanding their differences is crucial for effectively leveraging annotations and test methodologies in Java applications.

---

In JUnit 5, you can use Java record classes as test classes. Java records are a special kind of class introduced in Java 14 as a preview feature and became a standard feature in Java 16. They are a concise way to create data-carrying classes without having to write boilerplate code like constructors, getters, `toString()`, `hashCode()`, and `equals()`.

### Why Use Records as Test Classes?

Using records as test classes can help you keep your test code clean and focused. Since records are immutable, they provide a clear structure for the data used in your tests. Here’s a detailed explanation along with an example.

### Characteristics of Records

1. **Immutable**: Once created, the fields of a record cannot be changed, ensuring that the test data remains consistent throughout the test lifecycle.
2. **Compact Syntax**: Records reduce boilerplate code, making your test classes more readable and maintainable.
3. **Automatic Implementations**: The compiler automatically generates common methods like `equals()`, `hashCode()`, and `toString()`.

### Example of Using a Record as a Test Class

Let’s say we want to test a simple calculator utility that adds two numbers. We can use a record to represent our test cases.

#### Calculator Class

First, we create a simple calculator class with an `add` method.

```java
package com.dandaev.edu;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

#### Record for Test Cases

Next, we define a record that will hold our test cases. The record will contain the input values and the expected result.

```java
package com.dandaev.edu;

public record AdditionTestCase(int a, int b, int expected) {
}
```

#### Test Class Using Records

Now we can write a test class that uses the `AdditionTestCase` record to store our test data.

```java
package com.dandaev.edu;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @TestFactory
    Collection<DynamicTest> dynamicTestsForAddition() {
        // Create test cases using the record
        AdditionTestCase[] testCases = {
                new AdditionTestCase(1, 1, 2),
                new AdditionTestCase(2, 3, 5),
                new AdditionTestCase(-1, -1, -2),
                new AdditionTestCase(100, 200, 300)
        };

        // Return dynamic tests for each case
        return Arrays.stream(testCases)
                .map(testCase -> DynamicTest.dynamicTest(
                        String.format("Adding %d and %d should equal %d", testCase.a(), testCase.b(), testCase.expected()),
                        () -> assertEquals(testCase.expected(), new Calculator().add(testCase.a(), testCase.b()))
                ))
                .toList();
    }
}
```

### Explanation of the Test Class

1. **Dynamic Tests**:
   - The `@TestFactory` annotation allows you to create dynamic tests, which are generated at runtime. In this example, we create a collection of dynamic tests based on the `AdditionTestCase` records.

2. **Creating Test Cases**:
   - We define an array of `AdditionTestCase` records, each holding the two input values and the expected result.

3. **Mapping to Dynamic Tests**:
   - We use `Arrays.stream()` to convert the array of test cases into a stream, then map each case to a `DynamicTest`.
   - The `dynamicTest` method takes a display name and a lambda expression that contains the actual test logic, which checks if the result of the addition is as expected.

4. **Assertions**:
   - Inside the dynamic test, we use `assertEquals` to compare the expected result with the actual result from the `add` method of the `Calculator`.

### Advantages of Using Records in Tests

- **Clarity**: Using records for test cases makes it clear what data is being passed to the tests, enhancing readability.
- **Immutability**: Since records are immutable, you avoid accidental modifications of test case data, which helps maintain test integrity.
- **Less Boilerplate**: You don’t need to write additional boilerplate code for getters or constructors, making your tests cleaner.

### Conclusion

Using Java records as test classes in JUnit 5 is a powerful technique that can enhance the organization and clarity of your tests. By leveraging the features of records, you can create more maintainable and expressive test cases, especially when dealing with multiple input scenarios.

---

`RepetitionInfo` — это интерфейс в JUnit 5, который предоставляет дополнительную информацию о текущем повторении при использовании аннотации `@RepeatedTest`. С его помощью можно получить данные о номере текущего выполнения теста и общем количестве повторений, что позволяет писать более гибкие и информативные тесты.

### Где используется

`RepetitionInfo` используется в качестве параметра тестовых методов, которые помечены аннотацией `@RepeatedTest`. Это помогает контролировать и управлять логикой в каждом повторении, основываясь на текущем состоянии.

### Пример

```java
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTestExample {

    @RepeatedTest(5)
    void testWithRepetitionInfo(RepetitionInfo repetitionInfo) {
        System.out.println("Execution #" + repetitionInfo.getCurrentRepetition() +
                           " of " + repetitionInfo.getTotalRepetitions());
    }
}
```

### Объяснение

- `repetitionInfo.getCurrentRepetition()` возвращает номер текущего повторения теста.
- `repetitionInfo.getTotalRepetitions()` возвращает общее количество повторений.

В данном примере тест будет выполнен 5 раз. На каждом повторении будет выводиться номер текущего выполнения, что полезно для контроля состояния теста на разных этапах.

### Пример применения

`RepetitionInfo` особенно полезен, когда поведение теста зависит от номера повторения. Например, можно использовать разное тестовое состояние на каждом этапе или проводить проверки на определённых итерациях:

```java
@RepeatedTest(3)
void testWithConditionsBasedOnRepetition(RepetitionInfo repetitionInfo) {
    if (repetitionInfo.getCurrentRepetition() == 1) {
        System.out.println("First iteration-specific setup");
    } else if (repetitionInfo.getCurrentRepetition() == repetitionInfo.getTotalRepetitions()) {
        System.out.println("Last iteration-specific cleanup");
    }
}
```

### Зачем нужен `RepetitionInfo`

1. **Гибкость**. Можно управлять логикой теста на каждом повторении.
2. **Настройка состояния**. Например, настраивать специфическое состояние для определённых повторений.
3. **Отладка и логгирование**. Удобно выводить номера повторений для отслеживания тестов.

`RepetitionInfo` делает тесты с `@RepeatedTest` более информативными и позволяет создавать вариативные сценарии на каждом этапе выполнения теста.


---


**Параметризованные тесты** в JUnit 5 позволяют запускать один и тот же тестовый метод с различными наборами данных. Это полезно для проверки одинаковой логики с разными входными данными, что уменьшает дублирование кода и упрощает управление тестами. Параметризованные тесты особенно удобны, когда у вас есть несколько вариантов входных данных и ожидаемых результатов для одной и той же функции.

### Основные компоненты параметризованных тестов

1. **Аннотация `@ParameterizedTest`**: Это аннотация, которая указывает, что метод является параметризованным тестом.

2. **Поставщики данных (Data Providers)**: Это методы, которые возвращают наборы данных для тестирования. Они могут возвращать данные в различных форматах, таких как массивы, списки или потоки (Streams).

### Пример использования параметризованных тестов

Рассмотрим пример, в котором мы тестируем метод сложения.

#### Шаг 1: Определение класса и метода

Создадим класс `Calculator` с методом `add`, который складывает два числа:

```java
package com.dandaev.edu;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

#### Шаг 2: Параметризованный тест

Теперь создадим тестовый класс с параметризованным тестом:

```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class CalculatorTest {

    @ParameterizedTest
    @MethodSource("additionProvider")
    void testAddition(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b));
    }

    static Stream<Arguments> additionProvider() {
        return Stream.of(
                Arguments.of(1, 1, 2),         // 1 + 1 = 2
                Arguments.of(2, 3, 5),         // 2 + 3 = 5
                Arguments.of(-1, -1, -2),      // -1 + -1 = -2
                Arguments.of(100, 200, 300)    // 100 + 200 = 300
        );
    }
}
```

### Как это работает

1. **Аннотация `@ParameterizedTest`**: Указывает, что метод `testAddition` будет запущен несколько раз с различными наборами данных.

2. **Метод `additionProvider`**: Это метод, который возвращает `Stream` с аргументами. Каждый набор аргументов представляет собой входные данные для теста: два числа и ожидаемый результат. Он возвращает объекты `Arguments`, которые содержат данные, передаваемые в тестовый метод.

3. **Метод `assertEquals`**: Внутри `testAddition` мы используем `assertEquals` для проверки, что результат сложения равен ожидаемому значению.

### Другие способы поставки данных

JUnit 5 предлагает несколько других аннотаций для предоставления данных для параметризованных тестов:

1. **`@ValueSource`**: Позволяет передавать простые типы данных (например, строки, числа):

   ```java
   @ParameterizedTest
   @ValueSource(ints = {1, 2, 3, 4, 5})
   void testIsPositive(int number) {
       assertTrue(number > 0);
   }
   ```

2. **`@EnumSource`**: Позволяет передавать значения перечислений (enum):

   ```java
   enum Color {
       RED, GREEN, BLUE
   }

   @ParameterizedTest
   @EnumSource(Color.class)
   void testColor(Color color) {
       assertNotNull(color);
   }
   ```

3. **`@CsvSource`**: Позволяет передавать данные в формате CSV:

   ```java
   @ParameterizedTest
   @CsvSource({
       "1, 1, 2",
       "2, 3, 5",
       "-1, -1, -2"
   })
   void testAdditionCsv(int a, int b, int expected) {
       assertEquals(expected, new Calculator().add(a, b));
   }
   ```

4. **`@MethodSource`**: Как показано ранее, позволяет использовать любой метод, возвращающий поток данных.

### Заключение

Параметризованные тесты в JUnit 5 делают тестирование более гибким и эффективным, позволяя проверять одинаковую логику с различными наборами входных данных. Они помогают уменьшить дублирование кода и упрощают поддержку тестов, делая их более читабельными и понятными. Благодаря различным способам поставки данных, разработчики могут выбрать наиболее подходящий для своих нужд метод.

---

Аннотация `@Tag` в JUnit 5 используется для маркировки тестов и создания групп тестов, которые можно запускать выборочно. Это позволяет организовать тесты по категориям и выбирать только те, которые соответствуют определённым требованиям, например, по сложности, скорости выполнения, компоненту системы и т. д.

### Как работает `@Tag`

Аннотация `@Tag` применяется на уровне класса или метода. Тесты, помеченные определённым тегом, можно запускать отдельно, используя команду запуска с фильтром по тегу, или же исключать определённые теги из запуска.

### Пример использования `@Tag`

```java
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagExampleTest {

    @Test
    @Tag("fast")
    void fastTest() {
        System.out.println("This is a fast test.");
    }

    @Test
    @Tag("slow")
    void slowTest() {
        System.out.println("This is a slow test.");
    }
}
```

В этом примере:
- `fastTest` помечен тегом `"fast"`.
- `slowTest` помечен тегом `"slow"`.

### Запуск тестов по тегам

JUnit позволяет запускать тесты с определённым тегом через настройки в инструменте сборки (например, Maven или Gradle) или IDE. Например:

- **Maven**: В `pom.xml` можно добавить профиль для выполнения тестов по тегам:

  ```xml
  <profiles>
    <profile>
      <id>fast-tests</id>
      <build>
        <plugins>
          <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M5</version>
            <configuration>
              <groups>fast</groups>
            </configuration>
          </plugin>
        </plugins>
      </build>
    </profile>
  </profiles>
  ```

  Здесь тесты с тегом `fast` будут запускаться через профиль `fast-tests`.

- **Gradle**: В `build.gradle` можно указать фильтр по тегам:

  ```groovy
  test {
      useJUnitPlatform {
          includeTags 'fast'
          excludeTags 'slow'
      }
  }
  ```

  В этом примере будут запускаться только тесты с тегом `fast`, и тесты с тегом `slow` будут исключены.

### Зачем нужен `@Tag`

- **Фильтрация тестов**. Полезно, когда нужно запускать только подмножество тестов, например, быстрые или специфичные для определённого компонента.
- **Разделение тестов по категориям**. Можно маркировать тесты по сложности, окружению (`@Tag("integration")`, `@Tag("unit")`), скорости выполнения и другим критериям.
- **Упрощение CI/CD**. Можно выполнять определённые группы тестов на различных этапах пайплайна, например, быстрые тесты на каждом коммите и интеграционные тесты только при сборке на сервере.

### Дополнительные примеры

```java
@Tag("database")
@Tag("integration")
public class DatabaseIntegrationTest {

    @Test
    @Tag("critical")
    void criticalDatabaseTest() {
        System.out.println("Running a critical database test.");
    }
}
```

В этом примере:
- Сам класс помечен как `database` и `integration`.
- Метод `criticalDatabaseTest` имеет дополнительный тег `critical`.

Используя фильтры по тегам, можно выбрать тесты, которые необходимо запускать, что делает аннотацию `@Tag` удобным и гибким инструментом для управления тестами.

---

`TestInfo` и `TestReporter` — это специальные интерфейсы в JUnit 5, которые помогают получить информацию о текущем тесте и передавать дополнительные данные во время тестирования. Их часто используют для логгирования, диагностики и дополнительного анализа.

### `TestInfo`

Интерфейс `TestInfo` предоставляет информацию о тесте, такую как:
- Имя тестового метода
- Название тестового класса
- Аннотации, примененные к тесту (например, `@Tag`, `@DisplayName`)

`TestInfo` можно передать в метод тестирования или в методы жизненного цикла, и тогда JUnit автоматически передаст соответствующую информацию о текущем тесте.

#### Пример использования `TestInfo`

```java
import org.junit.jupiter.api.*;

@DisplayName("Тесты для класса MyClass")
class MyClassTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Выполняем " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Простой тест")
    @Tag("fast")
    void simpleTest(TestInfo testInfo) {
        System.out.println("Метод: " + testInfo.getTestMethod().orElseThrow().getName());
        System.out.println("Класс: " + testInfo.getTestClass().orElseThrow().getName());
        System.out.println("Теги: " + testInfo.getTags());
    }
}
```

В этом примере:
- `@BeforeEach` использует `TestInfo`, чтобы вывести имя текущего теста перед его выполнением.
- Тестовый метод `simpleTest` также использует `TestInfo`, чтобы вывести метод, класс и теги теста.

### `TestReporter`

Интерфейс `TestReporter` позволяет добавлять в отчет дополнительные сообщения или данные. Это полезно для логгирования промежуточных данных и предоставления дополнительной информации, которая может помочь в диагностике ошибок.

`TestReporter` передается в тестовые методы или методы жизненного цикла, и с его помощью можно выводить пользовательские сообщения, которые будут отображаться в логах тестов.

#### Пример использования `TestReporter`

```java
import org.junit.jupiter.api.*;

class MyClassTest {

    @Test
    void reportTest(TestReporter testReporter) {
        testReporter.publishEntry("Начало теста", "Проверка начальных условий");
        // Симулируем выполнение теста
        testReporter.publishEntry("Результат", "Успешно");
    }
}
```

В этом примере:
- `TestReporter.publishEntry()` используется для публикации пользовательских сообщений. Сообщения отображаются в логах и помогают следить за выполнением теста.

### Основные различия и рекомендации по использованию

- `TestInfo` удобен, когда необходимо получить контекстную информацию о текущем тесте (например, имя метода, класс и теги).
- `TestReporter` помогает добавлять дополнительные комментарии в отчет, особенно полезно для логгирования.

### Совместное использование `TestInfo` и `TestReporter`

```java
class CombinedTest {

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Подготовка к тесту", "Выполняем " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Тест с отчетом")
    void testWithReporting(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Запуск теста", testInfo.getTestMethod().orElseThrow().getName());
        // Симулируем процесс тестирования
        testReporter.publishEntry("Результат", "Проверка прошла успешно");
    }
}
```

В этом примере:
- `TestInfo` используется для вывода имени теста.
- `TestReporter` для логгирования дополнительных сообщений.

`TestInfo` и `TestReporter` делают тестирование более наглядным и помогают лучше понимать выполнение тестов, особенно в больших проектах с множеством тестов.

---

`@TestInfo` и `@TestReporter` — это аннотации в JUnit 5, которые предоставляют дополнительные возможности для работы с тестовой информацией и отчетностью в ходе выполнения тестов.

### 1. `@TestInfo`
Аннотация `@TestInfo` позволяет получать сведения о текущем тесте, такие как его имя, теги, имя класса, и имя метода. Она особенно полезна, когда нужно логировать или проверять дополнительную информацию о тесте в процессе его выполнения. `TestInfo` используется как параметр метода, и JUnit автоматически передаёт его, когда тест запускается.

#### Пример использования `@TestInfo`
```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {

    @Test
    void sampleTest(TestInfo testInfo) {
        System.out.println("Running test: " + testInfo.getDisplayName());
        System.out.println("Tags: " + testInfo.getTags());

        // Пример использования TestInfo в проверке
        assertTrue(testInfo.getDisplayName().contains("sample"));
    }
}
```

#### Методы `TestInfo`
- **`getDisplayName()`** — возвращает имя теста. По умолчанию это имя метода, но оно может быть изменено с помощью аннотации `@DisplayName`.
- **`getTags()`** — возвращает набор тегов, которые были присвоены тесту (например, с помощью аннотации `@Tag`).
- **`getTestClass()`** — возвращает объект класса, в котором находится текущий тест.
- **`getTestMethod()`** — возвращает объект метода, представляющий текущий тест.

### 2. `@TestReporter`
Аннотация `@TestReporter` используется для создания отчетов и добавления пользовательской информации в отчет о выполнении теста. В отличие от простого вывода в консоль, `TestReporter` предоставляет способ структурированного вывода сообщений и ключ-значение данных, которые могут быть полезны для отладки и анализа тестов.

#### Пример использования `@TestReporter`
```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

public class MyTest {

    @Test
    void reportTest(TestReporter testReporter) {
        // Простое сообщение
        testReporter.publishEntry("Running test reportTest");

        // Сообщение с несколькими параметрами в формате ключ-значение
        Map<String, String> data = new HashMap<>();
        data.put("user", "john.doe");
        data.put("operation", "database update");
        testReporter.publishEntry(data);
    }
}
```

#### Методы `TestReporter`
- **`publishEntry(String message)`** — записывает сообщение в отчет теста. Обычно используется для простых уведомлений или логов.
- **`publishEntry(String key, String value)`** — записывает сообщение в виде пары ключ-значение.
- **`publishEntry(Map<String, String> entries)`** — записывает несколько пар ключ-значение одновременно.

### Применение `@TestInfo` и `@TestReporter` вместе
Эти аннотации можно комбинировать, чтобы не только передавать данные о тесте, но и создавать информативные отчеты.

```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import java.util.Map;

public class MyTest {

    @Test
    void combinedTest(TestInfo testInfo, TestReporter testReporter) {
        // Вывод информации о тесте
        String testName = testInfo.getDisplayName();
        testReporter.publishEntry("Starting test", testName);

        // Логирование информации о тесте в отчет
        Map<String, String> reportData = Map.of(
            "class", testInfo.getTestClass().orElse(null).getSimpleName(),
            "method", testInfo.getTestMethod().orElse(null).getName()
        );
        testReporter.publishEntry(reportData);

        // Проверка и логика теста...
    }
}
```

### Когда использовать `@TestInfo` и `@TestReporter`
- **`@TestInfo`** полезен для тестов, которые требуют информации о самом тесте, чтобы проверять или логировать её (например, имя теста, теги).
- **`@TestReporter`** полезен для добавления пользовательских сообщений или данных, которые должны быть включены в отчеты, что упрощает анализ результатов тестов.

Эти аннотации помогают улучшить понимание и прозрачность тестов, особенно при использовании CI/CD для мониторинга и отладки.

---

В JUnit 5 можно использовать параметризованные тесты, чтобы выполнить тест с разными наборами данных, избегая дублирования кода. Параметризованные тесты позволяют запускать тестовый метод несколько раз с разными аргументами, что полезно для проверки различных условий и сценариев.

### Основные аннотации для поставки данных
JUnit 5 предоставляет несколько аннотаций, чтобы задать параметры для тестов. Вот основные из них:

1. **@ValueSource**: Подаёт простые значения, такие как массив строк, целых чисел, логических значений и т.д.
2. **@EnumSource**: Используется для передачи значений перечислений (`enum`).
3. **@CsvSource**: Позволяет передавать строки в формате CSV.
4. **@CsvFileSource**: Загружает данные из CSV-файла.
5. **@MethodSource**: Использует метод для поставки аргументов.
6. **@ArgumentsSource**: Предоставляет возможность использовать пользовательский источник аргументов.

### Примеры использования

#### 1. `@ValueSource`
Эта аннотация позволяет передавать массив простых значений, таких как `int`, `String`, `double` и `boolean`.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceExample {

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "JUnit"})
    void testWithStringValueSource(String word) {
        assertTrue(word.length() > 3);
    }
}
```

В данном примере тест выполнится 3 раза с разными значениями строки.

#### 2. `@EnumSource`
Используется для передачи значений из `enum`. Можно указать конкретные значения, которые будут переданы в тест.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnumSourceExample {

    enum Status {
        ACTIVE, INACTIVE, DELETED
    }

    @ParameterizedTest
    @EnumSource(value = Status.class, names = {"ACTIVE", "INACTIVE"})
    void testWithEnumSource(Status status) {
        assertNotNull(status);
    }
}
```

Здесь тест выполнится дважды, для значений `ACTIVE` и `INACTIVE`.

#### 3. `@CsvSource`
Эта аннотация позволяет передавать наборы данных в формате CSV.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvSourceExample {

    @ParameterizedTest
    @CsvSource({
        "test, 4",
        "JUnit, 5",
        "param, 5"
    })
    void testWithCsvSource(String word, int length) {
        assertEquals(length, word.length());
    }
}
```

Тест выполнится три раза с указанными значениями.

#### 4. `@CsvFileSource`
Загружает данные из CSV-файла, который находится в ресурсах.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvFileSourceExample {

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(String word, int length) {
        assertEquals(length, word.length());
    }
}
```

Параметр `numLinesToSkip` используется для пропуска заголовков.

#### 5. `@MethodSource`
Эта аннотация позволяет использовать метод в качестве источника данных. Метод должен возвращать поток (`Stream`), список (`List`), коллекцию (`Collection`) или массив.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MethodSourceExample {

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "cherry");
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithMethodSource(String word) {
        assertTrue(word.length() > 3);
    }
}
```

Тест выполнится для каждого значения, возвращенного методом `stringProvider`.

#### 6. `@ArgumentsSource`
Эта аннотация предоставляет возможность использовать пользовательский источник аргументов, реализуя интерфейс `ArgumentsProvider`.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArgumentsSourceExample {

    static class CustomArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                Arguments.of("apple", 5),
                Arguments.of("banana", 6)
            );
        }
    }

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsProvider.class)
    void testWithArgumentsSource(String word, int length) {
        assertNotNull(word);
        assertEquals(length, word.length());
    }
}
```

### Преимущества параметризованных тестов
- **Повышают читабельность кода** за счёт отсутствия дублирования.
- **Уменьшают количество тестовых методов**, поскольку один тест можно выполнить с разными данными.
- **Облегчают поддержку кода**, так как изменение в одном тесте будет применено ко всем наборам данных.

Эти аннотации позволяют гибко использовать разнообразные данные, что делает тесты более мощными и легкими для понимания.
