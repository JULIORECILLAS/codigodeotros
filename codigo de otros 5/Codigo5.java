package org.generation.codigoDeOtros;

import java.util.*;
		
		public class Codigo5 {
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub

		    Scanner scanner = new Scanner(System.in);
				System.out.print("Introduzca un número: ");
				int valor = scanner.nextInt();
				
				int afortunado = 0;
				int noAfortunado = 0;
				
				//while (valor > 0) {
				  int digito =(valor % 10);
				  if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
					afortunado++;
				  } else {
					noAfortunado++;
				  
				  valor /= 10;
				}
				if (afortunado > noAfortunado) {
				  System.out.println("El " + valor + " es un número afortunado.");
				} else {
				  System.out.println("El " + valor + " no es un número afortunado.");
				}
				
  //}
			
		  
		}

	}
