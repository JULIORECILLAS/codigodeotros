package org.generation.codigoDeOtros;

import java.util.*;
		public class codigo6 {
			  
			public static void main(String[] args) {
				// TODO Auto-generated method stub
			
				Scanner scanner = new Scanner (System.in);
		    int n=[20];
			

		    for (int i = 0; i < 20; i++) {
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.print(n[i] + " ");
		    }
		    
		    System.out.printl("\n¿Qué números quiere resaltar? ");
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    int opcion = System.nextIn();

		    int multiplo = (opcion == 1);
		    char e= null;
		    foreach ( e : n) {
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");}
		       else {
		        System.in.print(e + " ");
		      }
		    }

	}

}
