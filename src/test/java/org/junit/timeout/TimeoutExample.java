package org.junit.timeout;

import org.junit.Test;

public class TimeoutExample {
	
	//10 milisegundos
	@Test(timeout = 10)
	public void forEver() throws Exception {
		Thread.sleep(100000);
	}
}
