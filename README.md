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
