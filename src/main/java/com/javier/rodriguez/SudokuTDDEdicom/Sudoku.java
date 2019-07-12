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
		return Arrays.copyOfRange(this.datos, this.getPosicionInicialFila(i), 
				this.getPosicionFinalFila(i));
	}
	
	int getPosicionInicialFila(int i)
	{
		return i*this.getTotalCasillasPorFila();
	}
	
	int getPosicionFinalFila(int i)
	{
		return this.getPosicionInicialFila(i)+this.getTotalCasillasPorFila();
	}
	
	public int getTotalCasillasPorFila() {
		return cuadrado(this.orden);
	}
	
	public int getTotalCasillasPorColumna() {
		return cuadrado(this.orden);
	}
	
	public int[] getColumna(int i) {
		int k= this.getTotalCasillasPorColumna();
		int [] columna = new int [k];
		for(int j=0; j<k; j++)
		{
			columna[j]=this.datos[i];
			i=i+k;
		}
		
		
		return columna;
	}
}
