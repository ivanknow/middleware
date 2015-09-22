package br.ufrpe.middleware.core;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {

	private UUID t;
	private String op;
	private int p1, p2;
	private String r;
	private String erro;

	public Message() {

	}

	public void setMessage(UUID t, String op, int a, int b) {
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

	public UUID getT() {
		return t;
	}

	public void setT(UUID t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Message [t=" + t + ", op=" + op + ", p1=" + p1 + ", p2=" + p2 + ", r=" + r + ", erro=" + erro + "]";
	}
	 

}
