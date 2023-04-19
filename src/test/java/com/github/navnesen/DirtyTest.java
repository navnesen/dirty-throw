package com.github.navnesen;

import org.junit.jupiter.api.Test;

import static com.github.navnesen.Dirty.raise;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DirtyTest {

	@Test
	public void test() {
		assertThrows(Exception.class, () -> raise(new Exception("Hello")), "Hello");
	}

}