package br.ufrpe.middleware.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import br.ufrpe.middleware.common.ICalculator;
import br.ufrpe.middleware.core.Message;
import br.ufrpe.middleware.core.Skeleton;

public class Server implements ICalculator{
	public Map<UUID ,Message> mapa = new HashMap<UUID,Message>();
	public static void main(String[] args) throws Exception {
		
		Skeleton skeleton = new Skeleton();
		skeleton.init();
		
	}
	
	public String add(UUID id,int a, int b){
		return Double.toString(a + b);
	}
	
	public String sub(UUID id,int a, int b){
		return Double.toString(a - b);
	}
	
	public String mult(UUID id,int a, int b){
		return Double.toString(a * b);
	}
	
	public String div(UUID id,int a, int b){
		if(b == 0){
			return "divisãoPorZero";
		}else{
			return Double.toString(a / b);
		}
		
	}

}
