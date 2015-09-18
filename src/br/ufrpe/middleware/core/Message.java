package br.ufrpe.middleware.core;

import java.io.Serializable;

public class Message implements Serializable {

	private int t;
	private String op;
	private int p1, p2;
	private String r;
	private String erro;

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
	
	public String getResult(){
		return r;
	}
	
	public void setResult(String r){
		this.r = r;
	}
	
	public String getMsgError(){
		return erro;
	}
	
	public String setMsgError(String erro) {
		
		return this.erro = erro;
	}

}
