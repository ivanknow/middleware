package br.ufrpe.middleware.common;

import java.util.UUID;

public interface ICalculator {


	String sub(UUID id, int a, int b);

	String mult(UUID id, int a, int b);

	String div(UUID id, int a, int b);

	String add(UUID id, int a, int b);

}
