package br.ufrpe.middleware.calculator;

import br.ufrpe.middleware.common.ICalculator;
import br.ufrpe.middleware.core.Skeleton;

public class Server implements ICalculator{
	
	public static void main(String[] args) throws Exception {
		
		Skeleton skeleton = new Skeleton();
		skeleton.init();
		
	}
	
	public double add(int a, int b){
		return a + b;
	}
	
	public double sub(int a, int b){
		return a - b;
	}
	
	public double mult(int a, int b){
		return a * b;
	}
	
	public double div(int a, int b){
		return a / b;
	}

}
