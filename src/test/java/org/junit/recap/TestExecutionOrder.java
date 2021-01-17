package org.junit.recap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/*
 * • MethodSorters.JVM: 
 * 	This leaves the test methods in the order returned by the JVM. This order may vary from run to run.
• MethodSorters.NAME_ASCENDING: 
	This sorts the test methods by the method name in the lexicographic order.
• MethodSorters.DEFAULT: 
	This is the default value that doesn't guarantee the execution order.
 * 
 * */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExecutionOrder {

	@Test
	public void edit() throws Exception{
		System.out.println("edit executed");
	}
	
	@Test
	public void create() throws Exception{
		System.out.println("create executed");
	}
	
	@Test
	public void remove() throws Exception{
		System.out.println("edit executed");
	}

}
