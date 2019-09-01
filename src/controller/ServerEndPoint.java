package controller;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;



//TODO explicitly  annotate the class as an stateless bean
//TODO
public class ServerEndPoint {
	private static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());
	
	/**
	 * Method that sends an empty string to all the Sessions 
	 */
	public void broadcastRefresh() {		
//TODO 		
	}

	@OnOpen
	public void open(Session client) {
//TODO		
	}

	@OnClose
	public void close(Session client) {
//TODO				
	}
}

