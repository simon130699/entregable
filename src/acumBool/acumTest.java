package acumBool;

import static org.junit.Assert.*;

import org.junit.Test;

public class acumTest {

	@Test
	public void testNoPerTodos() {
		int[] arr1 = {4,1};
		int[] arr2 = {1,2,3};
		assertFalse(Ejercicios.pertenecenTodos(arr1,arr2));
	}

	@Test
	public void testPertenecenTodos() {
		int[] arr1 = {1,2};
		int[] arr2 = {3,2,1};
		assertTrue(Ejercicios.pertenecenTodos(arr1,arr2));
	}
	
	@Test
	public void empiezanIguales() {
		int[] arr1 = {1,2};
		int[] arr2 = {1,2,1};
		assertEquals(arr1[0],arr2[0]);
	}

}
