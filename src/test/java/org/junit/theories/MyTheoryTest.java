package org.junit.theories;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MyTheoryTest {
	@DataPoint public static String jack="Jack";
	@DataPoint public static String mike="Mike";
	@DataPoint public static String jorge="Jorge";

	//Automaticamente el metodo pasa los valores
	@Theory
	public void sanity(String aName) {
		System.out.println("Sanity check " + aName);
	}
	
	//Introduce todas las combinaciones posibles
	@Theory
	public void sanity2(String firstName,String lastName) {
		System.out.println("Sanity check " + firstName+", "+lastName);
	}
	
	@DataPoints public static char[] chars = new char[] {'A', 'B', 'C'};
	
	@Theory
	public void build(char c, char d) {
		System.out.println(c+" "+d);
	}
}
