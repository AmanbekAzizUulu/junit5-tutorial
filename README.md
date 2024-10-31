# Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

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
