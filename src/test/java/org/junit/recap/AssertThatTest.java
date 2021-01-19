package org.junit.recap;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AssertThatTest {

	@Test
	public void verify_Matcher() throws Exception{
		int age = 30;
		assertThat(age,equalTo(30));
		assertThat(age,is(30));
		assertThat(age,not(equalTo(31)));
		assertThat(age,is(not(31)));
	}
	
	@Test
	public void verify_multiple_values() {
		double marks = 100.00;
		assertThat(marks, either(is(100.00)).or(is(90.9)));
		assertThat(marks,both(not(99.99)).and(not(60.00)));
		assertThat(marks,anyOf(is(100.00),is(1.00),is(55.00),is(88.00),is(67.00)));
		assertThat(marks,not(anyOf(is(0.00),is(200.00))));
	}
	
	@Test
	public void verify_collection_values() throws Exception{
		List<Double> salary = Arrays.asList(50.0,200.0,500.0);
		assertThat(salary,hasItem(50.0));
		assertThat(salary,hasItems(50.0,200.0));
		assertThat(salary,not(hasItem(1.00)));
	}
}
