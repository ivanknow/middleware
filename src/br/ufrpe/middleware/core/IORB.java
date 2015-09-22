package br.ufrpe.middleware.core;

public interface IORB {
	
	void reply(Message msg) throws Exception;
	void send(Message msg) throws Exception;
	Message receive() throws Exception;

}
