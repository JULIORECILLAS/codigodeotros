package org.generation.codigoDeOtros4;

import java.util.*;

public class codigo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner scanner = new Scanner(System.in);
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j1 = scanner.nextLine();
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j2 = scanner.nextLine();
		    
		    if (j1 == j2) {
		      System.out.println("Empate");
		    } 
		    
		    else {
		      int g = 2;
		      switch(j1) {
		        case "piedra":
		          if (j2 == "tijeras") {
		            g = 1;
		          }
		          break;

		        case "papel":
		          if (j2 == "piedra") {
		            g = 1;
		          }
		          break;
		          
		        case "tijera":
		          if (j2.equals("papel")) {
		            g = 1;
		          }
		          break;
		        default:
		      }
		      System.out.println("Gana el jugador " + g);
		    }
		  
		  
		}

	}

}
