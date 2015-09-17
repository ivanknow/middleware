package br.ufrpe.middleware.core;

import br.ufrpe.middleware.common.ICalculator;

public class Stub implements ICalculator{
	
	Message reqMsg = new Message();
	Message repMsg = new Message();

	@Override
	public double add(int a, int b) {
		ORB middleware = new ORB();
		reqMsg.setMessage(1, "add", a, b);
		try {
			repMsg = middleware.sendAndReceive(reqMsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return repMsg.getResult();
	}

	@Override
	public double sub(int a, int b) {
		ORB middleware = new ORB();
		reqMsg.setMessage(1, "sub", a, b);
		try {
			repMsg = middleware.sendAndReceive(reqMsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return repMsg.getResult();
	}

	@Override
	public double mult(int a, int b) {
		ORB middleware = new ORB();
		reqMsg.setMessage(1, "mult", a, b);
		try {
			repMsg = middleware.sendAndReceive(reqMsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return repMsg.getResult();
	}

	@Override
	public double div(int a, int b) {
		ORB middleware = new ORB();
		reqMsg.setMessage(1, "div", a, b);
		try {
			repMsg = middleware.sendAndReceive(reqMsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return repMsg.getResult();
	}
	
	

}
