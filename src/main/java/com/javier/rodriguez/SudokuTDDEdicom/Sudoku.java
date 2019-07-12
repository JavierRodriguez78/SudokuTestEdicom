package com.javier.rodriguez.SudokuTDDEdicom;

public class Sudoku {

	


	private final int orden;
	
	
	public Sudoku(int orden) {
		super();
		this.orden = orden;
	}



	
	
	public int getOrden() {
		return orden;
	}
	
	public int getTotalCasillas() {
		return cuadrado(cuadrado(this.orden));
	}
	
	public int cuadrado(int n) {
		return n * n;
	}
	
	public int getTotalCuadrados() {
		return cuadrado(this.orden);
	}
	
}
