package br.ufrpe.middleware.core;

import br.ufrpe.middleware.calculator.Server;

public class Skeleton {
	
	public void init() throws Exception{
		
		ORB m = new ORB();
		Message reqMsg, repMsg = new Message();
		Server server = new Server();
		
		while (true) {
			String r;
			reqMsg = m.receiveAndReply();
			
			switch (reqMsg.getOperation()) {
			case "add":
				r = server.add(reqMsg.getP1(), reqMsg.getP2());
				repMsg.setResult(r);
				m.reply(repMsg);
				break;
			case "sub":
				r = server.sub(reqMsg.getP1(), reqMsg.getP2());
				repMsg.setResult(r);
				m.reply(repMsg);
				break;
			case "mult":
				r = server.mult(reqMsg.getP1(), reqMsg.getP2());
				repMsg.setResult(r);
				m.reply(repMsg);
				break;
			case "div":
				r = server.div(reqMsg.getP1(), reqMsg.getP2());
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
