package session01;

import org.junit.jupiter.api.*;

public class FirstTests {
    @BeforeAll
    static void beforeAll(){
        System.out.println("This is before all method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("this is the before each method");
    }

    @Test
    @DisplayName("US1234 - TC01 - First test")
    public void FirstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisplayName("US1234 - TC02 - First test")
    public void SecondMethod(){
        System.out.println("This is the second test method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("This is after each method");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("This is after all method");
    }
}
