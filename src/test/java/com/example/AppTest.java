package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
     @Test
    public void testFibonacci() {
        App app = new App();
        assertEquals(0, app.fibonacci(0));
        assertEquals(1, app.fibonacci(1));
        assertEquals(5, app.fibonacci(5));
        assertEquals(8, app.fibonacci(6));
    }
}

