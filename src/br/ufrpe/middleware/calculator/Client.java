package br.ufrpe.middleware.calculator;

import br.ufrpe.middleware.core.Stub;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		Stub stub = new Stub();
		
		System.out.println("Resultado = " + stub.add(7, 3));
		System.out.println("Resultado = " + stub.sub(7, 3));
		System.out.println("Resultado = " + stub.mult(7, 3));
		System.out.println("Resultado = " + stub.div(7, 3));
		
	}

}
