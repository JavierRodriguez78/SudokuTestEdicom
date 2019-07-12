package com.javier.rodriguez.SudokuTDDEdicom;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SudokuTEst {

	@Test
	public void prueba() {
		assertTrue(true);
	}
	
	/**
	 * 1
	 */
	@Test
	public void unSudokuDeOrden1Tiene1Casilla() {
		int orden = 1;
		Sudoku sudoku = new Sudoku(orden);
		int totalCasillas = sudoku.getTotalCasillas();
		assertEquals(1, totalCasillas);
	}
	/**
	 * 1  2  1  2
	 * 3  4  3  4 
	 * 1  2  1   2
	 * 3  4   2  4
	 */
		@Test
		public void unSudokuDeOrden2TieneEnTotal16Casillas() {
			int orden = 2;
			Sudoku sudoku = new Sudoku(orden);
			int totalCasillas = sudoku.getTotalCasillas();
			assertEquals(16, totalCasillas);
		}
		
		@Test
		public void unSudokuDeOrden3TieneEnTotal81Casillas() {
			int orden = 3;
			Sudoku sudoku = new Sudoku(orden);
			int totalCasillas = sudoku.getTotalCasillas();
			assertEquals(81, totalCasillas);
		}

		@Test
		public void unSudokuDeOrden1TieneEnTotal1() {
			int orden = 1;
			Sudoku sudoku = new Sudoku(orden);
			int totalCuadrados = sudoku.getTotalCuadrados();
			assertEquals(1, totalCuadrados);
		}
		

		@Test
		public void unSudokuDeOrden2TieneEnTotal4Cuadrados() {
			int orden = 2;
			Sudoku sudoku = new Sudoku(orden);
			int totalCuadrados = sudoku.getTotalCuadrados();
			assertEquals(4, totalCuadrados);
		}
		
		@Test
		public void devuelveLaPrimeraFilaDeunSudokuDeOrden1() {
			int orden =1;
			Sudoku sudoku = new Sudoku(orden);
			int [] datos = new int[] {1};
			sudoku.cargar(datos);
			int[] fila = sudoku.getFila(0);
			assertArrayEquals(new int[] {1}, fila);
		}
}		


