package br.ufrpe.middleware.core;

import java.util.UUID;

import br.ufrpe.middleware.common.ICalculator;

public class Stub{
	
	Message reqMsg = new Message();
	Message repMsg = new Message();

	public String get(UUID id) throws Exception {
		ORB middleware = new ORB();
		repMsg = middleware.requestAndReceive(id);
		
		return repMsg.getResult();
	}
	
	
	public UUID add(int a, int b) {
	UUID id = UUID.randomUUID();
		ORB middleware = new ORB();
		reqMsg.setMessage(id, "add", a, b);
		try {
			middleware.send(reqMsg);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return id;
	}

	
	public UUID sub(int a, int b) {
		
		ORB middleware = new ORB();
		UUID id = UUID.randomUUID();
		reqMsg.setMessage(id, "sub", a, b);
		try {
			middleware.send(reqMsg);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return id;
	
	}

	
	public UUID  mult(int a, int b) {
		ORB middleware = new ORB();
		UUID id = UUID.randomUUID();
		reqMsg.setMessage(id, "mult", a, b);
		try {
			middleware.send(reqMsg);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return id;
	}

	
	public UUID div( int a, int b) {
		ORB middleware = new ORB();
		UUID id = UUID.randomUUID();
		reqMsg.setMessage(id, "div", a, b);
		try {
			middleware.send(reqMsg);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return id;
		
	}
	
	

}
