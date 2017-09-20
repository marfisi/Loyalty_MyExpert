package it.cascino.loyalty.soapheader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.apache.log4j.Logger;

public class HeaderHandler implements SOAPHandler<SOAPMessageContext>{
	private Logger log = Logger.getLogger(HeaderHandler.class);
	
	private String context;
	private String iPAddress;
	private String password;
	private String signature;
	private String username;
	
	public HeaderHandler(String context, String iPAddress, String password, String signature, String username){
		super();
		this.context = context;
		this.iPAddress = iPAddress;
		this.password = password;
		this.signature = signature;
		this.username = username;
	}
	
	public boolean handleMessage(SOAPMessageContext smc){
		
		Boolean outboundProperty = (Boolean)smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		
		if(outboundProperty.booleanValue()) {
			
			SOAPMessage message = smc.getMessage();
			
			try{
				
				SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader header = null;
				try{
					header = envelope.addHeader();
				}catch(SOAPException se){
					envelope.getHeader().detachNode();
					header = envelope.addHeader();
					
				}
				
				SOAPElement shieldHeader = header.addChildElement("shieldHeader", "shi", "www.shield-services.org");
				// shieldHeader.addAttribute(new QName("xmlns:shi1"), "http://schemas.datacontract.org/2004/07/Shield.Client");
				shieldHeader.addAttribute(envelope.createName("xmlns:shi1"), "http://schemas.datacontract.org/2004/07/Shield.Client");
				
				SOAPElement nodoContext = shieldHeader.addChildElement("Context", "shi1");
				nodoContext.addTextNode(context);
				
				SOAPElement nodoIpAddress = shieldHeader.addChildElement("IPAddress", "shi1");
				nodoIpAddress.addTextNode(iPAddress);
				
				SOAPElement nodoPassword = shieldHeader.addChildElement("Password", "shi1");
				nodoPassword.addTextNode(password);
				
				SOAPElement nodoSignature = shieldHeader.addChildElement("Signature", "shi1");
				nodoSignature.addTextNode(signature);
				
				SOAPElement nodoUsername = shieldHeader.addChildElement("Username", "shi1");
				nodoUsername.addTextNode(username);
				
				message.saveChanges();
				
				// Print out the outbound SOAP message to System.out
				// message.writeTo(System.out);
				// System.out.println("");
				logSoapMessage(message);
				
				// message.saveChanges(); // tmp
				
			}catch(Exception e){
				e.printStackTrace();
				log.fatal(e.toString());
			}
			
		}else{
			try{
				// This handler does nothing with the response from the Web Service so
				// we just print out the SOAP message.
				SOAPMessage message = smc.getMessage();
				// message.writeTo(System.out);
				// System.out.println("");
				logSoapMessage(message);
				
			}catch(Exception ex){
				ex.printStackTrace();
				log.fatal(ex.toString());
			}
		}
		return outboundProperty;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public Set getHeaders(){
		// throw new UnsupportedOperationException("Not supported yet.");
		return null;
	}
	
	// @Override
	// public Set getHeaders() {
	// // The code below is added on order to invoke Spring secured WS.
	// // Otherwise,
	// // http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
	// // won't be recognised
	// final QName securityHeader = new QName(
	// "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
	// "Security", "wsse");
	//
	// final HashSet headers = new HashSet();
	// headers.add(securityHeader);
	//
	// return headers;
	// }
	
	public boolean handleFault(SOAPMessageContext context){
		// throw new UnsupportedOperationException("Not supported yet.");
		return true;
	}
	
	public void close(MessageContext context){
		// throw new UnsupportedOperationException("Not supported yet.");
	}
	
	public void logSoapMessage(SOAPMessage message) throws SOAPException, IOException{
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		message.writeTo(bout);
		log.info(bout.toString("UTF-8"));
	}
}
