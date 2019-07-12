package com.javier.rodriguez.SudokuTDDEdicom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SudokuTEst {

	@Test
	public void prueba() {
		assertTrue(false);
	}
	
	/**
	 * 1
	 */
	@Test
	public void unSudokuDeOrden1Tiene1Casilla() {
		int orden = 1;
		Sudoku sudoku = new Sudoku(orden);
		int totalCasillas = sudoku.getTotalCasillas();
		assertEquals((1, totalCasillas);
	}
}
