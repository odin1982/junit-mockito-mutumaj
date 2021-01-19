package org.junit.recap;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class AssertThatTest {

	@Test
	public void verify_Matcher() throws Exception{
		int age = 30;
		assertThat(age,equalTo(30));
		assertThat(age,is(30));
		assertThat(age,not(equalTo(30)));
		assertThat(age,is(not(30)));
		
	}
}
