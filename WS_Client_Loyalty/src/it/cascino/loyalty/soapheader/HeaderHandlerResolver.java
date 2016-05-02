package it.cascino.loyalty.soapheader;

import java.util.ArrayList;
import java.util.List;
//import javax.xml.soap.SOAPElement;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HeaderHandlerResolver implements HandlerResolver{
	private String context;
	private String iPAddress;
	private String password;
	private String signature;
	private String username;
		
	public HeaderHandlerResolver(String context, String iPAddress, String password, String signature, String username){
		super();
		this.context = context;
		this.iPAddress = iPAddress;
		this.password = password;
		this.signature = signature;
		this.username = username;
	}

	@SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo portInfo){
		List<Handler> handlerChain = new ArrayList<Handler>();
		
		HeaderHandler hh = new HeaderHandler(context, iPAddress, password, signature, username); // new HeaderHandler();
		
		handlerChain.add(hh);
		
		return handlerChain;
	}
}