package org.junit.building.customer.matcher;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;


/**
 * @author odin
 * Para construir tu matcher debes de extender de BaseMatcher
 */
public class LessThanOrEqual<T  extends Comparable<T>> 
								extends BaseMatcher<Comparable<T>>{

	private final Comparable<T> expectedValue;
	
	public LessThanOrEqual(T expectedValue) {
		this.expectedValue = expectedValue;
	}
	
	
	/**
	 * This method is invoked by asserThat,
	 * if this method returns false then AssertionError 
	 * exception is thrown
	 */
	public boolean matches(Object t) {
		int compareTo = expectedValue.compareTo((T)t);
		return compareTo > -1;
	}

	/**
	 * This method is invoked when matches(Object obj) returns false,
	 * if this method returns false then AssertionError 
	 * exception is thrown
	 */
	public void describeTo(Description description) {
		description.appendText(" less than or equal(<=)" + expectedValue);
	}
	
	@Factory
	public static<T extends Comparable<T>> Matcher<T> lessThanOrEqual(T t){
		return new LessThanOrEqual(t);
	}

}
