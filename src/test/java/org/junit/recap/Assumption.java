package org.junit.recap;

import static org.junit.Assert.assertTrue;

import org.junit.Assume;
import org.junit.Test;

/*
 * Assume si la condicion se cumple, se ejecuta el test, si no se cumple lo ignora,
 * podria ser un ignore condicionado a cierto estatus o circunstancia
 * si isSonarRunning = false se ejecuta sino no se ignora el test
 * */
public class Assumption {
	boolean isSonarRunning = false;
	
	@Test
	public void very_critical_test() throws Exception{
		isSonarRunning = true;
		Assume.assumeFalse(isSonarRunning);
		assertTrue(true);
	}
}
