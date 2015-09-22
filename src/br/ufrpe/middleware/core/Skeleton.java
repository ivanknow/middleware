package br.ufrpe.middleware.core;

import java.util.UUID;

import br.ufrpe.middleware.calculator.Server;

public class Skeleton {
	
	public void init() throws Exception{
		System.out.println("server started");
		ORB m = new ORB();
		Message msg, repMsg = new Message();
		Server server = new Server();
		
		while (true) {
			System.out.println("waiting...");
			System.out.println("Mapa atual:"+server.mapa);
			Object o = m.recive();
			if(o instanceof Message){
				System.out.println("recive a message");
			msg = (Message) o;
			System.out.println("message:"+msg);
			server.mapa.put(msg.getT(),msg);
			}else{
				UUID i = (UUID)o;
				System.out.println("recive a id...:"+i);
				if(!server.mapa.containsKey(i)){
					Message erro = new Message();
					erro.setResult("operacao nao encontrada");
					m.reply(erro);
					
				}else{
				msg = server.mapa.get(i);
				server.mapa.remove(i);
				System.out.println("id referente a:"+msg);
				//m.reply(msg);
				String r;
				switch (msg.getOperation()) {
				case "add":
					r = server.add(msg.getT(),msg.getP1(), msg.getP2());
					repMsg.setResult(r);
					m.reply(repMsg);
					break;
				case "sub":
					r = server.sub(msg.getT(),msg.getP1(), msg.getP2());
					repMsg.setResult(r);
					m.reply(repMsg);
					break;
				case "mult":
					r = server.mult(msg.getT(),msg.getP1(), msg.getP2());
					repMsg.setResult(r);
					m.reply(repMsg);
					break;
				case "div":
					r = server.div(msg.getT(),msg.getP1(), msg.getP2());
					if (r == "divisãoPorZero"){
						repMsg.setMsgError("Não Dividirás por Zero!");
						m.reply(repMsg);
					}else{
						repMsg.setMsgError("Sem exceção");
						repMsg.setResult(r);
						m.reply(repMsg);
						
					}
					break;
						

				default:
					break;
				}
				}
			}
		}
		
		
	}

}
