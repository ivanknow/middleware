package br.ufrpe.middleware.calculator;

import java.util.UUID;

import br.ufrpe.middleware.core.Stub;

public class Client {

	public static void main(String[] args) throws Exception {

		Stub stub = new Stub();
		UUID i1, i2, i3, i4 = null;
		i1 = stub.add(7, 3);
		Thread.sleep(16);
		i2 = stub.sub(7, 3);
		Thread.sleep(6);
		i3 = stub.mult(7, 3);
		Thread.sleep(16);
		i4 = stub.div(7, 3);
		Thread.sleep(6);

		System.out.println(stub.get(i1));
		Thread.sleep(6);
		System.out.println(stub.get(i2));
		Thread.sleep(6);
		System.out.println(stub.get(i3));
		Thread.sleep(6);
		System.out.println(stub.get(i4));
		Thread.sleep(6);

	}

}
