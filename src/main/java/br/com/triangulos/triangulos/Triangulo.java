package br.com.triangulos.triangulos;

public class Triangulo {
	private int ladoA = 0;
	private int ladoB = 0;
	private int ladoC = 0;
	
	public Triangulo(final int ladoA, final int ladoB, final int ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	public boolean valida() {
		final boolean tentativa1 = (this.ladoA + this.ladoB) >= this.ladoC;
		final boolean tentativa2 = (this.ladoC + this.ladoB) >= this.ladoA;
		final boolean tentativa3 = (this.ladoC + this.ladoA) >= this.ladoB;
		
		return tentativa1 || tentativa2 || tentativa3;
	}
	
	
	public String tipoDeTriangulo() {
		if(!valida())
			return "Por favor, primeiro leia o triângulo";
		
		if(this.ladoA != this.ladoB && this.ladoA != this.ladoC)
			return "escaleno";

		else if(this.ladoA == this.ladoB && this.ladoA == this.ladoC)
			return "equilátero";
		
		else if(this.ladoA == this.ladoB || this.ladoA == this.ladoC || this.ladoB == this.ladoC)
			return "isósceles";
		
		
		return "";
	}
	
	public int perimetro() {
		return this.ladoA + this.ladoB + this.ladoC;
	}
	
	public int semiPerimetro() {
		return (this.ladoA + this.ladoB + this.ladoC) / 2;
	}
	
	public double area() {
		return Math.sqrt(perimetro() * 
				(perimetro() - this.ladoA) * 
				(perimetro() - this.ladoB) * 
				(perimetro() - this.ladoC));
	}
}
