package it.cascino.loyalty.managmentbean;

import java.io.Serializable;
import java.rmi.RemoteException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import org.apache.axis.AxisFault;
//import org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient;
//import org.tempuri.BasicHttpBinding_ILoyaltyIntegrationStub;
//import org.tempuri.LoyaltyIntegration;
//import org.tempuri.LoyaltyIntegrationLocator;
//import sun.net.www.protocol.http.AuthenticationHeader;

@ManagedBean
@SessionScoped
public class WSManBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public void callWebService(){
		try{
			// hello.client.HelloWebServiceService service = new hello.client.HelloWebServiceService();
			// hello.client.HelloWebService port = service.getHelloWebServicePort();
			// java.lang.String result = port.sayHello();
			//
			//
			// System.out.println("Result = " + result);
			//
//			DatiClient datiClient = new DatiClient("1111", "OP0009", "PDV00000");
//			
//			LoyaltyIntegration integ = new LoyaltyIntegrationLocator();
//			
//			
//			
//			
//			integ.getBasicHttpBinding_ILoyaltyIntegration().elencaTagliBuono(datiClient);
			

//			
//			
//			BasicHttpBinding_ILoyaltyIntegrationStub b = null;
//			try{
//				b = new BasicHttpBinding_ILoyaltyIntegrationStub();
//			}catch(AxisFault e){
//				e.printStackTrace();
//			}
//			
//			try{
//				b.elencaTagliBuono(datiClient);
//			}catch(RemoteException e){
//				e.printStackTrace();
//			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}