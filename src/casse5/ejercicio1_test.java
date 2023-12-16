package casse5;

import static org.junit.Assert.*;

import org.junit.Test;

public class ejercicio1_test {

	@Test
	public void Bisiestotest0() {
		assertTrue(ejercicio1.Bisiesto(2023));
	}
	@Test
	public void Bisiestotest1() {
		assertFalse(ejercicio1.Bisiesto(2023));
	}
	@Test
	public void Bisiestotest2() {
		assertTrue(ejercicio1.Bisiesto(2028));
	}
	@Test
	public void esTriangulo(){
		assertTrue(ejercicio1.verificarTriangulo(10, 10, 10));
	}
	@Test
	public void esTriangulo2(){
		assertTrue(ejercicio1.verificarTriangulo(10, 8, 10));
	}
	@Test
	public void esTriangulo3(){
		assertTrue(ejercicio1.verificarTriangulo(1, 100, 107));
	}
	@Test
	public void esTriangulo4(){
		assertTrue(ejercicio1.verificarTriangulo(18, 18, 18));
	}
	
	
}
