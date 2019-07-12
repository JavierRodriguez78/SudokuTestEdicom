package com.javier.rodriguez.SudokuTDDEdicom;

import java.util.Arrays;

public class Sudoku {

	


	private final int orden;
	private int[] datos;
	
	
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
	
	public void cargar(int [] datos)
	{
		this.datos = datos;
	}
	
	public int[] getFila(int i)
	{
		return Arrays.copyOfRange(this.datos, 0, 1);
	}
}
