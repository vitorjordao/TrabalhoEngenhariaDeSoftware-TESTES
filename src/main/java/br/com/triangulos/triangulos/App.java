package br.com.triangulos.triangulos;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( final String[] args )
    {
    	int ladoA, ladoB, ladoC;
    	Triangulo triangulo;
    	
    	try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("Escreva os 3 lados do triângulo");
				ladoA = sc.nextInt();
				ladoB = sc.nextInt();
				ladoC = sc.nextInt();
				triangulo = new Triangulo(ladoA, ladoB, ladoC);
				if(triangulo.valida())
					break;
				System.out.println("Trinválido");
			}
			System.out.println("Triangulo ok");
		}
    	
    	final String tipoDeTriangulo = triangulo.tipoDeTriangulo();
    	
    	System.out.println("O tipo de triângulo é " + tipoDeTriangulo);

    	System.out.println("Perímetro: " + triangulo.perimetro());
    	
    	System.out.println("Semi perímetro: " + triangulo.semiPerimetro());
    	
    	System.out.println("Área: " + triangulo.area());
    }
}
