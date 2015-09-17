package br.ufrpe.middleware.core;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ORB implements IORB{
	
	private int port;
	private String host;
	ServerSocket welcomeSocket;
	Socket connectionSocket;
	
	public ORB(){
		this.port = 1506;
		this.host = "localhost";
	}

	@Override
	public Message sendAndReceive(Message msg) throws Exception {

			Socket clientSocket = null;
			clientSocket = new Socket(host, port);
			ObjectOutputStream outToServer;
			outToServer = new ObjectOutputStream(clientSocket.getOutputStream());
		
			outToServer.writeObject(msg);
		
			Message retorno = null;
			ObjectInputStream inFromClient; 
			inFromClient = new ObjectInputStream(clientSocket.getInputStream());
			retorno= (Message) inFromClient.readObject();
			clientSocket.close();
			
			return retorno;
	
	}
	
	@Override
	public Message receiveAndReply() throws Exception {
		Message msg = null;
		welcomeSocket = new ServerSocket(port);
		connectionSocket = welcomeSocket.accept();
		ObjectInputStream inFromClient; 
		inFromClient = new ObjectInputStream(connectionSocket.getInputStream());
		msg = (Message) inFromClient.readObject();
		
		
		return msg;
		
	}

	@Override
	public void reply(Message msg) throws Exception {
		
		ObjectOutputStream saida = new ObjectOutputStream(connectionSocket.getOutputStream());
		saida.writeObject(msg);
		welcomeSocket.close();
		connectionSocket.close();
	
	}

	
	
	

}
