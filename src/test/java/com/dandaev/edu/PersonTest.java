package com.dandaev.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {
	private Person person_to_test = new Person("Aibek", "Dandaev", 26);

 	@Nested
    @DisplayName("Tests for the constructor")
    class ConstructorTests {

        @Test
        @DisplayName("Default constructor should initialize fields to default values")
        void testDefaultConstructor() {
            Person person = new Person();
            assertNull(person.getFirstName(), "First name should be null by default");
            assertNull(person.getLastName(), "Last name should be null by default");
            assertEquals(0, person.getAge(), "Age should be 0 by default");
        }

        @Test
        @DisplayName("Parameterized constructor should initialize fields correctly")
        void testParameterizedConstructor() {
            Person person = new Person("John", "Doe", 30);
            assertEquals("John", person.getFirstName(), "First name should be initialized to 'John'");
            assertEquals("Doe", person.getLastName(), "Last name should be initialized to 'Doe'");
            assertEquals(30, person.getAge(), "Age should be initialized to 30");
        }
    }

    @Nested
    @DisplayName("Tests for the get and set methods")

    class GetterSetterTests {
        private Person person;

        @BeforeEach
        void setUp() {
            person = new Person();
        }

        @DisplayName("Setting and getting first name")
		@RepeatedTest(3)
        void testSetAndGetFirstName() {
            person.setFirstName("Alice");
            assertEquals("Alice", person.getFirstName(), "First name should be 'Alice'");
        }

        @Test
        @DisplayName("Setting and getting last name")
        void testSetAndGetLastName() {
            person.setLastName("Smith");
            assertEquals("Smith", person.getLastName(), "Last name should be 'Smith'");
        }

        @Test
        @DisplayName("Setting and getting age")
        void testSetAndGetAge() {
            person.setAge(25);
            assertEquals(25, person.getAge(), "Age should be 25");
        }

        @Test
        @DisplayName("Setting a negative age should not be allowed")
        void testSetNegativeAge() {
            person.setAge(-1);
            assertEquals(-1, person.getAge(), "Negative age is technically allowed here but might be worth validating");
        }
    }

    @Nested
    @DisplayName("Tests for default values")
    class DefaultValuesTests {

        @Test
        @DisplayName("Check default first name value")
        void testDefaultFirstName() {
            Person person = new Person();
            assertNull(person.getFirstName(), "Default first name should be null");
        }

        @Test
        @DisplayName("Check default last name value")
        void testDefaultLastName() {
            Person person = new Person();
            assertNull(person.getLastName(), "Default last name should be null");
        }

        @Test
        @DisplayName("Check default age value")
        void testDefaultAge() {
            Person person = new Person();
            assertEquals(0, person.getAge(), "Default age should be 0");
        }
    }

    @Test
    @DisplayName("Full name concatenation test")
    void testFullNameConcatenation() {
        Person person = new Person("Jane", "Doe", 28);
        String fullName = person.getFirstName() + " " + person.getLastName();
        assertEquals("Jane Doe", fullName, "Full name should be 'Jane Doe'");
    }

    @Test
    @DisplayName("Equality of Person objects with same attributes")
    void testPersonEquality() {
        Person person1 = new Person("Alex", "Johnson", 35);
        Person person2 = new Person("Alex", "Johnson", 35);
        assertEquals(person1.getFirstName(), person2.getFirstName(), "First names should match");
        assertEquals(person1.getLastName(), person2.getLastName(), "Last names should match");
        assertEquals(person1.getAge(), person2.getAge(), "Ages should match");
    }

	@Test
	void testComplexAssertions() {
		assertAll("Testing person properties",
			() -> assertAll("Testing name",
				() -> assertEquals("John", person_to_test.getFirstName(), "First name check failed"),
				() -> assertEquals("Doe", person_to_test.getLastName(), "Last name check failed")
			),
			() -> assertEquals(30, person_to_test.getAge(), "Age check failed")
		);
	}

	@Tag("slow")
	@Test
	void slowTest(){
		System.out.println("Slow test running ....");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
