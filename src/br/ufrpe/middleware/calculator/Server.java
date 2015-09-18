package br.ufrpe.middleware.calculator;

import br.ufrpe.middleware.common.ICalculator;
import br.ufrpe.middleware.core.Skeleton;

public class Server implements ICalculator{
	
	public static void main(String[] args) throws Exception {
		
		Skeleton skeleton = new Skeleton();
		skeleton.init();
		
	}
	
	public String add(int a, int b){
		return Double.toString(a + b);
	}
	
	public String sub(int a, int b){
		return Double.toString(a - b);
	}
	
	public String mult(int a, int b){
		return Double.toString(a * b);
	}
	
	public String div(int a, int b){
		if(b == 0){
			return "divisãoPorZero";
		}else{
			return Double.toString(a / b);
		}
		
	}

}
