package org.generation.codigoDeOtros;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroRandom = (int) (Math.random()*100);
		
		System.out.println(numeroRandom);
		
		FizzBuzz numero = new FizzBuzz(numeroRandom);
	
		numero.metodoFizzBuzz(numero);

	}

}
