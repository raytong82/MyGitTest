package com.rym82.dummy;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

}
