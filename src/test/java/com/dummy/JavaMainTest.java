package com.dummy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.dummy.JavaMain;

public class JavaMainTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldThrowException() {
        exception.expect(RuntimeException.class);
        exception.expectMessage("XXX");
        throw new RuntimeException("XXX");
    }

    @Test
    public void shouldPass() {
    }

    @Test
    public void shouldSum() {
        final JavaMain main = new JavaMain();
        assertEquals(3, main.sum(1, 2));
    }

    @Test
    public void shouldReturnPositive() {
        final JavaMain main = new JavaMain();
        assertTrue(main.isPositive(1));
    }

    @Test
    public void shouldReturnNonPositive() {
        final JavaMain main = new JavaMain();
        assertFalse(main.isPositive(-1));
    }
}
