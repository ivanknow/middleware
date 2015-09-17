package br.ufrpe.middleware.core;

public interface IORB {
	
	Message sendAndReceive(Message msg)throws Exception;
	Message receiveAndReply() throws Exception;
	void reply(Message msg) throws Exception;

}
