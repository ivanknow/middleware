package br.ufrpe.middleware.core;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ORB {
	
	private int port;
	private String host;
	ServerSocket welcomeSocket;
	Socket connectionSocket;
	
	public ORB(){
		this.port = 1506;
		this.host = "localhost";
	}

	public void send(Message msg) throws Exception {

			Socket clientSocket = null;
			clientSocket = new Socket(host, port);
			ObjectOutputStream outToServer;
			outToServer = new ObjectOutputStream(clientSocket.getOutputStream());
		
			outToServer.writeObject(msg);
			clientSocket.close();
			Thread.sleep(20);
	
	}
	
	public Message requestAndReceive(UUID id) throws Exception {

		Socket clientSocket = null;
		clientSocket = new Socket(host, port);
		ObjectOutputStream outToServer;
		outToServer = new ObjectOutputStream(clientSocket.getOutputStream());
	
		outToServer.writeObject(id);
	
		Message retorno = null;
		ObjectInputStream inFromClient; 
		inFromClient = new ObjectInputStream(clientSocket.getInputStream());
		retorno= (Message) inFromClient.readObject();
		clientSocket.close();
		Thread.sleep(2);
		return retorno;

}
	public Object recive() throws Exception{
		welcomeSocket = new ServerSocket(port);
		connectionSocket = welcomeSocket.accept();
		ObjectInputStream inFromClient; 
		inFromClient = new ObjectInputStream(connectionSocket.getInputStream());
		
		Object o = inFromClient.readObject();
		
		Thread.sleep(2);
		if(o instanceof Message){
		welcomeSocket.close();
		connectionSocket.close();
		Thread.sleep(2);
		}
		return o;
		
	}

		public void reply(Message msg) throws Exception {
		
		ObjectOutputStream saida = new ObjectOutputStream(connectionSocket.getOutputStream());
		saida.writeObject(msg);
		welcomeSocket.close();
		connectionSocket.close();
		Thread.sleep(2);
	
	}

	
	
	

}
