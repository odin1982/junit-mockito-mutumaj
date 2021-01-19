package org.junit.recap;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class AssertThatTest {

	@Test
	public void verify_Matcher() throws Exception{
		int age = 30;
		double marks = 100.00;
		assertThat(age,equalTo(30));
		assertThat(age,is(30));
		assertThat(age,not(equalTo(31)));
		assertThat(age,is(not(31)));
		
		assertThat(marks, either(is(100.00)).or(is(90.9)));
		assertThat(marks,both(not(99.99)).and(not(60.00)));
		assertThat(marks,anyOf(is(100.00),is(1.00),is(55.00),is(88.00),is(67.00)));
		assertThat(marks,not(anyOf(is(0.00),is(200.00))));
	}
}
