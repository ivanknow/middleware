package br.ufrpe.middleware.core;

import java.io.Serializable;

public class Message implements Serializable {

	private int t;
	private String op;
	private int p1, p2;
	private double r;

	public Message() {

	}

	public void setMessage(int t, String op, int a, int b) {
		this.t = t;
		this.op = op;
		this.p1 = a;
		this.p2 = b;
	}

	public String getOperation() {
		return op;
	}

	public int getP1() {
		return p1;
	}

	public int getP2() {
		return p2;
	}
	
	public double getResult(){
		return r;
	}
	
	public void setResult(double r){
		this.r = r;
	}
	@Override
	public String toString() {
		
		return op+p1+p2;
	}

}
