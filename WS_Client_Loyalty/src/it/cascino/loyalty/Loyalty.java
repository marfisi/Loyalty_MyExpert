package it.cascino.loyalty;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.xml.bind.JAXBElement;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.expert_loyalty_domain.ArrayOfTaglioBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_domain.TaglioBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_domain_services_dto.ArrayOfErrorMessage;
import org.datacontract.schemas._2004._07.expert_loyalty_domain_services_dto.ErrorMessage;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.ArrayOfDettaglioScontrino;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DatiClient;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DettaglioScontrino;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.ObjectFactory;
//import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoBruciaturaPunti;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoCaricamentoPunti;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoGenerazioneBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoOperazione;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoSaldoPunti;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoStornoScontrino;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoTagliBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoUtilizzoBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoVerificaBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.Scontrino;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.VerificaCodice;
import org.tempuri.ILoyaltyIntegration;
import org.tempuri.LoyaltyIntegrationProduzione;
import org.tempuri.LoyaltyIntegrationTest;
import it.cascino.loyalty.dao.AsAafor0fDao;
import it.cascino.loyalty.dao.AsAnmag0fDao;
import it.cascino.loyalty.dao.AsLycmd0fDao;
import it.cascino.loyalty.dao.AsLymov0fDao;
import it.cascino.loyalty.dao.AsMovma0fDao;
import it.cascino.loyalty.dao.AsTabel0fDao;
import it.cascino.loyalty.managmentbean.AsAafor0fDaoMng;
import it.cascino.loyalty.managmentbean.AsAnmag0fDaoMng;
import it.cascino.loyalty.managmentbean.AsLycmd0fDaoMng;
import it.cascino.loyalty.managmentbean.AsLymov0fDaoMng;
import it.cascino.loyalty.managmentbean.AsMovma0fDaoMng;
import it.cascino.loyalty.managmentbean.AsTabel0fDaoMng;
import it.cascino.loyalty.model.AsAafor0f;
import it.cascino.loyalty.model.AsAnmag0f;
import it.cascino.loyalty.model.AsLycmd0f;
import it.cascino.loyalty.model.AsLymov0f;
import it.cascino.loyalty.model.AsMovma0f;
import it.cascino.loyalty.model.AsTabel0f;
import it.cascino.loyalty.model.ElaboraFtp;
import it.cascino.loyalty.soapheader.HeaderHandlerResolver;

public class Loyalty{
	
	private Logger log = Logger.getLogger(Loyalty.class);
	
	StringBuilder stringBuilder = new StringBuilder();
	
	private ILoyaltyIntegration servicePort = null;
	
	private DatiClient datiClient = null;
	
	private String ambiente = "";
	private String username = "";
	private String password = "";
	private String signature = "";
	private String context = "";
	private String indIP = "";
	private String codiceRagSoc = "";
	private String codicePDV = "";
	private String codiceOperatore = "";
	private String codiceClient = "";
	private String funzione = "";
	private String codiceCard = "";
	private String caratteriControllo = "";
	private String posizioniControllo = "";
	private String punti = "";
	private String ammontare = "";
	private String codiceBuono = "";
	private String idTransazione = "";
	
	private final String sepCampiRisposta = "|";
	private final String sepStatoRisposta = "�";
	
	private final String posArt = "posArt";
	
	private AsTabel0fDao asTabel0fDao = new AsTabel0fDaoMng();
	private List<AsTabel0f> buoniLs;
	
	private AsLycmd0fDao asLycmd0fDao = new AsLycmd0fDaoMng();
	private List<AsLycmd0f> cmdLs;
	
	private AsLymov0fDao asLymov0fDao = new AsLymov0fDaoMng();
	private List<AsLymov0f> lymovLs;
	
	private AsMovma0fDao asMovma0fDao = new AsMovma0fDaoMng();
	// private List<AsMovma0f> movmaLs;
	
	private AsAnmag0fDao asAnmag0fDao = new AsAnmag0fDaoMng();
	private AsAafor0fDao asAafor0fDao = new AsAafor0fDaoMng();
	
	Float totaleArticoliLoyalty = 0.0f;
	
	public Loyalty(String args[]){
		log.info("[" + "Loyalty");
		
		String line = null;
		try{
			String basePathConfigIni = "C:/dev/Loyalty/";
			String fileNameConfigIni = basePathConfigIni + "config.ini";
			File fileConfigIni = new File(fileNameConfigIni);
			FileReader fstream = new FileReader(fileConfigIni);
			BufferedReader in = new BufferedReader(fstream);
			
			line = in.readLine();
			ambiente = StringUtils.upperCase(StringUtils.substring(StringUtils.split(line, ":")[1], 0, 1));
			line = in.readLine();
			username = StringUtils.split(line, ":")[1];
			line = in.readLine();
			password = StringUtils.split(line, ":")[1];
			line = in.readLine();
			signature = StringUtils.split(line, ":")[1];
			line = in.readLine();
			context = StringUtils.split(line, ":")[1];
			line = in.readLine();
			codiceRagSoc = StringUtils.split(line, ":")[1];
			line = in.readLine();
			indIP = StringUtils.split(line, ":")[1];
			
			// Close the input stream
			in.close();
		}catch(IOException ioe){// Catch exception if any
			log.fatal("Error: " + ioe.getMessage());
		}
		
		connectWebService(ambiente);
		
		Integer frequenza = 2000;
		Boolean stopProgramma = false;
		
		String argomenti = "";
		AsLycmd0f cmd = null;
		Iterator<AsLycmd0f> iter_cmd = null;
		while(true){
			cmdLs = asLycmd0fDao.getCmdToDo();
			iter_cmd = cmdLs.iterator();
			while(iter_cmd.hasNext()){
				cmd = iter_cmd.next();
				log.info("Comando: " + cmd.toString());
				
				argomenti = cmd.getId().getLycmd1() + " " + cmd.getId().getLycmd2() + " " + cmd.getId().getLycmd3();
				argomenti = StringUtils.normalizeSpace(argomenti);
				// for(int numArg = 0; numArg < args.length; numArg++){
				// argomenti += args[numArg] + " " ;
				// }
				
				log.info("Parametri: " + argomenti);
				args = StringUtils.split(argomenti);
				for(int numArg = 0; numArg < args.length; numArg++){
					if(args[numArg].compareTo("-codpdv") == 0) {
						numArg++;
						codicePDV = args[numArg];
					}else if(args[numArg].compareTo("-codop") == 0) {
						numArg++;
						codiceOperatore = args[numArg];
					}else if(args[numArg].compareTo("-codcass") == 0) {
						numArg++;
						codiceClient = args[numArg];
					}else if(args[numArg].compareTo("-fun") == 0) {
						numArg++;
						funzione = args[numArg];
						// serie di parametri utili per le funzioni
					}else if(args[numArg].compareTo("-codiceCard") == 0) {
						numArg++;
						codiceCard = args[numArg];
					}else if(args[numArg].compareTo("-codiceBuono") == 0) {
						numArg++;
						codiceBuono = args[numArg];
					}else if(args[numArg].compareTo("-carCon") == 0) {
						numArg++;
						caratteriControllo = args[numArg];
					}else if(args[numArg].compareTo("-posCon") == 0) {
						numArg++;
						posizioniControllo = args[numArg];
					}else if(args[numArg].compareTo("-punti") == 0) {
						numArg++;
						punti = args[numArg];
					}else if(args[numArg].compareTo("-soldi") == 0) {
						numArg++;
						ammontare = args[numArg];
					}else if(args[numArg].compareTo("-idTrans") == 0) {
						numArg++;
						idTransazione = args[numArg];
					}else if(args[numArg].compareTo("-ms") == 0) {
						numArg++;
						frequenza = Integer.parseInt(args[numArg]);
					}
					{ // se c'e' almeno un parametro e non e' tra quelli previsti stampo il messaggio d'aiuto
					}
				}
				creaDatiClient();
				
				// gestisco la chiamata a funzione
				if(funzione.compareTo("caricamentoPunti") == 0) {
					lymovLs = asLymov0fDao.getToElab();
					
					if(lymovLs.isEmpty()){
						stringBuilder = new StringBuilder();
						stringBuilder.append("nessuno scontrino da elaborare");
						log.info(stringBuilder.toString());
						scriviRispostaInDb(cmd);
					}
					
					Scontrino scontrino = null;
					String lyprgScontrino = "";

					// lista in array
					AsLymov0f arrayLymov0f[] = lymovLs.toArray(new AsLymov0f[lymovLs.size()]);
					
					String idTransazioneSuccessiva = "";
					lyprgScontrino = "";
					for(int i = 0; i < arrayLymov0f.length; i++){
						log.info("giro con i = " + i);
						AsLymov0f lymov = arrayLymov0f[i];
						idTransazione = StringUtils.remove(lymov.getId().getLydat() + "-" + lymov.getId().getLycau() + "-" + lymov.getId().getLynuz() + "-" + lymov.getId().getLynum(), " ");
						AsLymov0f lymovSuccessiva = null;
						idTransazioneSuccessiva = "";
						if(i < (arrayLymov0f.length - 1)){
							lymovSuccessiva = arrayLymov0f[i + 1];
							idTransazioneSuccessiva = StringUtils.remove(lymovSuccessiva.getId().getLydat() + "-" + lymovSuccessiva.getId().getLycau() + "-" + lymovSuccessiva.getId().getLynuz() + "-" + lymovSuccessiva.getId().getLynum(), " ");
						}
						
						log.info("lymov: " + lymov.toString());
						log.info("lymovSuccessiva: " + ((lymovSuccessiva == null) ? "" : lymovSuccessiva.toString()));
						log.info("idTransazione: " + idTransazione);
						log.info("idTransazioneSuccessiva: " + idTransazioneSuccessiva);
						
						lyprgScontrino += "-" + lymov.getId().getLyprg();
						log.info("lyprgScontrino: " + lyprgScontrino);
						
						if(StringUtils.equals(idTransazione, idTransazioneSuccessiva)){
							// se sono uguali, anche il rigo successivo fa parte dello stesso scontrino
							// non lancio il caricamento che e' dopo e continuo con il giro successivo
							continue;							
						}
						
						totaleArticoliLoyalty = 0.0f;
						scontrino = creaScontrino(lymov, idTransazione, StringUtils.split(lyprgScontrino, "-"));
						caricamentoPunti(scontrino, lymov, cmd);
						
						lyprgScontrino = "";
					}
				}else if(funzione.compareTo("saldoPunti") == 0) {
					saldoPunti(codiceCard, cmd);
					// }else if(funzione.compareTo("bruciaturaPunti") == 0) {
					// VerificaCodice verificaCodice = creaVerificaCodice(codiceCard, caratteriControllo, posizioniControllo);
					// bruciaturaPunti(verificaCodice, Integer.parseInt(punti), ammontare, cmd);
				}else if(funzione.compareTo("generazioneBuono") == 0) {
					VerificaCodice verificaCodice = creaVerificaCodice(codiceCard, caratteriControllo, posizioniControllo);
					generazioneBuono(verificaCodice, ammontare, Integer.parseInt(punti), cmd);
				}else if(funzione.compareTo("verificaBuono") == 0) {
					verificaBuono(codiceBuono, cmd);
				}else if(funzione.compareTo("utilizzaBuono") == 0) {
					utilizzaBuono(codiceBuono, ammontare, "EUR", cmd);
				}else if(funzione.compareTo("stornoScontrino") == 0) {
					stornoScontrino(idTransazione, cmd);
				}else if(funzione.compareTo("elencaTagliBuono") == 0) {
					elencaTagliBuono(cmd);
				}else if(funzione.compareTo("caricamentoTracciatoFtp") == 0) {
					ElaboraFtp elaboraFtp = new ElaboraFtp();
					elaboraFtp.elaboraTracciato(new String[0], cmd);
				}else if(funzione.compareTo("stopProgramma") == 0) {
					stringBuilder = new StringBuilder();
					stringBuilder.append("stoppato");
					scriviRispostaInDb(cmd);
					stopProgramma = true;
				}else if(funzione.compareTo("setFrequenza") == 0) {
					stringBuilder = new StringBuilder();
					stringBuilder.append("frequenza modificata");
					scriviRispostaInDb(cmd);
					// frequenza viene settata con parametro -ms
				}
			}
			
			if(stopProgramma) {
				break;
			}
			
			try{
				Thread.sleep(frequenza);
			}catch(InterruptedException e){
			}
		}
		
		asTabel0fDao.close();
		asLycmd0fDao.close();
		asLymov0fDao.close();
		asMovma0fDao.close();
		asAnmag0fDao.close();
		asAafor0fDao.close();
		
		log.info("]" + "Loyalty");
	}
	
	private void connectWebService(String amb){
		log.info("[" + "connectWebService");
		
		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver(context, indIP, password, signature, username); // new HeaderHandlerResolver();
		
		if(StringUtils.equals(amb, "P")){
			LoyaltyIntegrationProduzione service = new LoyaltyIntegrationProduzione();
			service.setHandlerResolver(handlerResolver);
			servicePort = service.getBasicHttpBindingILoyaltyIntegration();
		}else if(StringUtils.equals(amb, "T")){
			LoyaltyIntegrationTest service = new LoyaltyIntegrationTest();
			service.setHandlerResolver(handlerResolver);
			servicePort = service.getBasicHttpBindingILoyaltyIntegration();
		}else{
			log.fatal("ambiente " + amb + " non consentito");
			return;
		}
		
		// ((BindingProvider)servicePort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:6969/WS/monitor"); // per tcp/ip monitor
		log.info("]" + "connectWebService");
	}
	
	private void creaDatiClient(){
		log.info("[" + "creaDatiClient");
		datiClient = new DatiClient();
		datiClient.setCodiceClient(codiceClient); // codice che identifica la cassa (host, ip, codice cassiere)
		datiClient.setCodiceOperatore(codiceOperatore);
		datiClient.setCodicePdv(codicePDV);
		log.info("]" + "creaDatiClient");
	}
	
	private void manageRisposta(JAXBElement<RisultatoOperazione> jaxbElement, String strRisposta, AsLycmd0f cmd){
		log.info("[" + "printRisposta");
		stringBuilder = new StringBuilder();
		stringBuilder.append(strRisposta + sepStatoRisposta);
		RisultatoOperazione risultatoOperazione = jaxbElement.getValue();
		Integer codiceStato = risultatoOperazione.getCodiceStato();
		log.info("CodiceStato: " + codiceStato);
		stringBuilder.append(codiceStato);
		if(codiceStato != 0) {
			log.error("codice stato anomalo");
		}
		ArrayOfErrorMessage errorArray = risultatoOperazione.getErrori().getValue();
		List<ErrorMessage> errorMessageLs = errorArray.getErrorMessage();
		Iterator<ErrorMessage> iterErrorMessageLs = errorMessageLs.iterator();
		ErrorMessage errorMessage = null;
		while(iterErrorMessageLs.hasNext()){
			errorMessage = iterErrorMessageLs.next();
			log.error("Context: " + errorMessage.getContext().getValue());
			stringBuilder.append(sepCampiRisposta + errorMessage.getContext().getValue());
			log.error("Description: " + errorMessage.getDescription().getValue());
			stringBuilder.append(sepCampiRisposta + errorMessage.getDescription().getValue());
		}
		log.info("IdRichiesta: " + risultatoOperazione.getIdRichiesta());
		stringBuilder.append(sepCampiRisposta + risultatoOperazione.getIdRichiesta());
		log.info("Timestamp: " + risultatoOperazione.getTimestamp().getValue());
		stringBuilder.append(sepCampiRisposta + risultatoOperazione.getTimestamp().getValue());
		
		scriviRispostaInDb(cmd);
		
		log.info("]" + "printRisposta");
	}
	
	private void scriviRispostaInDb(AsLycmd0f cmd){
		String rispostaSplit[] = stringBuilder.toString().split("(?<=\\G.{255})");
		String risposta[] = {"", "", "", "", "", "", "", ""};
		for(int i = 0; i < rispostaSplit.length; i++){
			risposta[i] = rispostaSplit[i];
		}
		cmd.setLyris1(risposta[0]);
		cmd.setLyris2(risposta[1]);
		cmd.setLyris3(risposta[2]);
		cmd.setLyris4(risposta[3]);
		cmd.setLyris5(risposta[4]);
		cmd.setLyris6(risposta[5]);
		cmd.setLyris7(risposta[6]);
		cmd.setLyris8(risposta[7]);
		asLycmd0fDao.updateRis(cmd);
	}
	
	private VerificaCodice creaVerificaCodice(String codiceCard, String caratteriControllo, String posizioniControllo){
		log.info("[" + "creaVerificaCodice");
		VerificaCodice verificaCodice = new VerificaCodice();
		verificaCodice.setCodiceCard(codiceCard);
		verificaCodice.setCaratteriControllo(caratteriControllo);
		verificaCodice.setPosizioniControllo(posizioniControllo);
		log.info("]" + "creaVerificaCodice");
		return verificaCodice;
	}
	
	private void generazioneBuono(VerificaCodice verificaCodice, String valoreRichiesto, Integer puntiRichiesti, AsLycmd0f cmd){
		log.info("[" + "generazioneBuono");
		RisultatoGenerazioneBuono risRichiestaWS = servicePort.generazioneBuono(datiClient, verificaCodice, valoreRichiesto, puntiRichiesti);
		
		String risParz = "";
		stringBuilder = new StringBuilder();
		
		risParz = "nuovo saldo punti: " + risRichiestaWS.getNuovoSaldoPunti();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "punti consumati: " + risRichiestaWS.getPuntiConsumati();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "valore: " + risRichiestaWS.getValoreBuono().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "valuta: " + risRichiestaWS.getValuta().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "codice: " + risRichiestaWS.getCodiceBuono().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		
		manageRisposta(risRichiestaWS.getRisultatoOperazione(), stringBuilder.toString(), cmd);
		log.info("]" + "generazioneBuono");
	}
	
	private void saldoPunti(String codiceCard, AsLycmd0f cmd){
		log.info("[" + "saldoPunti");
		RisultatoSaldoPunti risRichiestaWS = servicePort.saldoPunti(datiClient, codiceCard);
		
		String risParz = "";
		stringBuilder = new StringBuilder();
		
		risParz = "punti: " + risRichiestaWS.getTotalePunti();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "data ultimo aggiornamento: " + risRichiestaWS.getDataAggiornamentoSaldo().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "miglior buono ottenibile: " + risRichiestaWS.getValoreMigliorBuonoOttenibile().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "codice interno expert: " + risRichiestaWS.getCodiceInternoExpert().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		
		manageRisposta(risRichiestaWS.getRisultatoOperazione(), stringBuilder.toString(), cmd);
		log.info("]" + "saldoPunti");
	}
	
	private void elencaTagliBuono(AsLycmd0f cmd){
		log.info("[" + "elencaTagliBuono");
		RisultatoTagliBuono risRichiestaWS = servicePort.elencaTagliBuono(datiClient);
		
		String risParz = "";
		stringBuilder = new StringBuilder();
		
		ArrayOfTaglioBuono arrayOfTaglioBuono = risRichiestaWS.getTagliBuono().getValue();
		List<TaglioBuono> taglioBuonoLs = arrayOfTaglioBuono.getTaglioBuono();
		Iterator<TaglioBuono> iterTaglioBuonoLs = taglioBuonoLs.iterator();
		TaglioBuono taglioBuono = null;
		asTabel0fDao.updateDaDel();
		while(iterTaglioBuonoLs.hasNext()){
			AsTabel0f buono = new AsTabel0f();
			taglioBuono = iterTaglioBuonoLs.next();
			risParz = "valore: " + taglioBuono.getValore();
			log.info(risParz);
			stringBuilder.append(risParz);
			risParz = sepCampiRisposta + "punti: " + taglioBuono.getPunti();
			log.info(risParz);
			stringBuilder.append(risParz);
			risParz = sepCampiRisposta + "min spesa: " + taglioBuono.getImportoMinimoSpesa() + sepCampiRisposta;
			log.info(risParz);
			stringBuilder.append(risParz);
			risParz = sepCampiRisposta + "codice expert buono: " + taglioBuono.getCodiceExpertBuono().getValue() + sepCampiRisposta;
			log.info(risParz);
			stringBuilder.append(risParz);
			buono.setTcoel(StringUtils.right("00" + taglioBuono.getValore().intValue(), 3));
			buono.setTdesc("Buono Loyalty da " + taglioBuono.getValore() + " Euro");
			buono.setTcomm(taglioBuono.getValore() + "-" + taglioBuono.getPunti() + "-" + taglioBuono.getImportoMinimoSpesa() + "-" + taglioBuono.getCodiceExpertBuono().getValue());
			Integer aggiornata = Integer.parseInt(asTabel0fDao.updateBuono(buono));
			if(!(aggiornata.equals(1))) {
				asTabel0fDao.salva(buono);
			}
		}
		asTabel0fDao.cancellaDaDel();
		
		manageRisposta(risRichiestaWS.getRisultatoOperazione(), stringBuilder.toString(), cmd);
		log.info("]" + "elencaTagliBuono");
	}
	
	// private void bruciaturaPunti(VerificaCodice verificaCodice, Integer puntiRichiesti, String totaleSpesa, AsLycmd0f cmd){
	// log.info("[" + "bruciaturaPunti");
	// RisultatoBruciaturaPunti risRichiestaWS = servicePort.bruciaturaPunti(datiClient, verificaCodice, puntiRichiesti, totaleSpesa);
	//
	// String risParz = "";
	// stringBuilder = new StringBuilder();
	//
	// risParz = "nuovo saldo punti: " + risRichiestaWS.getNuovoSaldoPunti();
	// log.info(risParz);
	// stringBuilder.append(risParz);
	// risParz = sepCampiRisposta + "punti consumati: " + risRichiestaWS.getPuntiConsumati();
	// log.info(risParz);
	// stringBuilder.append(risParz);
	// risParz = sepCampiRisposta + "valore: " + risRichiestaWS.getValoreBuono().getValue();
	// log.info(risParz);
	// stringBuilder.append(risParz);
	// risParz = sepCampiRisposta + "valuta: " + risRichiestaWS.getValuta().getValue();
	// log.info(risParz);
	// stringBuilder.append(risParz);
	// risParz = sepCampiRisposta + "codice: " + risRichiestaWS.getCodiceBuono().getValue();
	// log.info(risParz);
	// stringBuilder.append(risParz);
	//
	// manageRisposta(risRichiestaWS.getRisultatoOperazione(), stringBuilder.toString(), cmd);
	// log.info("]" + "bruciaturaPunti");
	// }
	
	private void verificaBuono(String codiceBuono, AsLycmd0f cmd){
		log.info("[" + "verificaBuono");
		RisultatoVerificaBuono risRichiestaWS = servicePort.verificaBuono(datiClient, codiceBuono);
		
		String risParz = "";
		stringBuilder = new StringBuilder();
		
		risParz = "valido: " + risRichiestaWS.isValiditaBuono();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "codice: " + risRichiestaWS.getCodiceBuono().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "valore: " + risRichiestaWS.getValoreBuono().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		
		manageRisposta(risRichiestaWS.getRisultatoOperazione(), stringBuilder.toString(), cmd);
		log.info("]" + "verificaBuono");
	}
	
	private void utilizzaBuono(String codiceBuono, String totaleSpesa, String valutaSpesa, AsLycmd0f cmd){
		log.info("[" + "utilizzaBuono");
		RisultatoUtilizzoBuono risRichiestaWS = servicePort.utilizzaBuono(datiClient, codiceBuono, totaleSpesa, valutaSpesa);
		
		String risParz = "";
		stringBuilder = new StringBuilder();
		
		risParz = "codice: " + risRichiestaWS.getCodiceBuono().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		risParz = sepCampiRisposta + "valore: " + risRichiestaWS.getValoreBuono().getValue();
		log.info(risParz);
		stringBuilder.append(risParz);
		
		manageRisposta(risRichiestaWS.getRisultatoOperazione(), stringBuilder.toString(), cmd);
		log.info("]" + "utilizzaBuono");
	}
	
	private Scontrino creaScontrino(AsLymov0f lymov, String idTransazione, String righeScontrino[]){
		log.info("[" + "creaScontrino");
		Scontrino scontrino = new Scontrino();
		
		log.info("lymov: " + lymov);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
		Date now = Calendar.getInstance().getTime();
		String orario = dateFormat.format(now);
		scontrino.setDataOra(lymov.getId().getLydat() + orario);
		
		ArrayOfDettaglioScontrino arrayOfDettaglioScontrino = creaArrayOfDettaglioScontrino(lymov, righeScontrino);
		scontrino.setDettagli(arrayOfDettaglioScontrino);
		scontrino.setExtraPuntiAccelerazioneLocale(0);
		scontrino.setIdTransazione(idTransazione);
		scontrino.setNumeroCard(lymov.getLyean());
		
		String importo = floatToString(totaleArticoliLoyalty);
		log.info("importo: " + importo);
		scontrino.setTotaleImporto(importo);
		scontrino.setTotaleImportoValuta(importo);
		scontrino.setValuta("EUR");
		log.info("]" + "creaScontrino");
		return scontrino;
	}
	
	private ArrayOfDettaglioScontrino creaArrayOfDettaglioScontrino(AsLymov0f lymov, String righeScontrino[]){
		log.info("[" + "creaArrayOfDettaglioScontrino");
		ArrayOfDettaglioScontrino arrayOfDettaglioScontrino = new ArrayOfDettaglioScontrino();
		DettaglioScontrino dettaglioScontrino = null;
		List<DettaglioScontrino> dettaglioScontrinoLs = new ArrayList<DettaglioScontrino>();
		for(int i = 0; i < righeScontrino.length; i++){
			log.info("rigo scontrino: " + righeScontrino[i]);
			dettaglioScontrino = creaDettaglioScontrino(lymov, righeScontrino[i], false);
			dettaglioScontrinoLs.add(i, dettaglioScontrino);
		}
		
		// gestisco se ho usato piu' buoni di quanto ho speso come articoli loyalty, ed aggiungo un articolo fittizio che mi porta l'importo in positivo ma lo escludo dal calcolo punti
		if(totaleArticoliLoyalty.compareTo(0.0f) <= 0) {
			log.info("devo usare posArt - totaleArticoliLoyalty: " + totaleArticoliLoyalty );
			dettaglioScontrino = creaDettaglioScontrino(lymov, posArt, true);
			dettaglioScontrinoLs.add(righeScontrino.length, dettaglioScontrino);
		}
		arrayOfDettaglioScontrino.getDettaglioScontrino().addAll(dettaglioScontrinoLs);
		log.info("]" + "creaArrayOfDettaglioScontrino");
		return arrayOfDettaglioScontrino;
	}
	
	private DettaglioScontrino creaDettaglioScontrino(AsLymov0f lymov, String numRigoScontrino, Boolean escludiPunti){
		log.info("[" + "creaDettaglioScontrino");
		
		ObjectFactory factory = new ObjectFactory();
		
		Boolean eUnPosArt = false;
		if(StringUtils.equals(numRigoScontrino, posArt)) {
			log.info("posArt");
			eUnPosArt = true;
		}
		
		AsMovma0f movma = new AsMovma0f();
		if(!(eUnPosArt)) {
			movma = asMovma0fDao.getMovCassaConRigo(lymov.getId().getLydat(), lymov.getId().getLycau(), lymov.getId().getLynuz(), lymov.getId().getLynum(), Integer.parseInt(numRigoScontrino));
		}else{
			movma.setVcoda(posArt);
			movma.setVdesc(posArt);
		}
		
		Boolean eUnBuono = false;
		if(StringUtils.equals(movma.getVcoda(), "/SCOCARD")) {
			eUnBuono = true;
		}
		
		AsAnmag0f anmag = new AsAnmag0f();
		AsAafor0f aafor = new AsAafor0f();
		
		if(!(eUnBuono || eUnPosArt)) { // deve essere un articolo reale (ne buono e nemmeno posArt)
			anmag = asAnmag0fDao.getArticoloDaMcoda(movma.getVcoda());
			aafor = asAafor0fDao.getArticoloDaAaforAacoa(anmag.getMcofo(), anmag.getMcoaf());
			// in caso non trovassi l'articolo in AsAafor0f
			if(aafor == null){
				log.warn(anmag + " non presente in Aafor0f");
				aafor = new AsAafor0f();
				aafor.getId().setAacoa("artNoInAafor");
				aafor.getId().setAafor(777);
				aafor.setAasfa("artNoInAafor");
			}
		}else{
			aafor = new AsAafor0f();
			if(eUnBuono) { // e' un buono
				aafor.getId().setAacoa("buono");
				aafor.getId().setAafor(888);
				aafor.setAasfa("buono");
			}else if(eUnPosArt) { // e' un posArt
				aafor.getId().setAacoa(posArt);
				aafor.getId().setAafor(999);
				aafor.setAasfa(posArt);
				movma.setVquan(1.0f);
				movma.setVprez(-totaleArticoliLoyalty + ((float)Math.random() * 10.0f));
				movma.setVsco1(0.0f);
				movma.setVsco2(0.0f);
				movma.setVsco3(0.0f);
				movma.setVciva("0");
			}
		}
		
		log.info("movma: " + movma);
		log.info("anmag: " + anmag);
		log.info("aafor: " + aafor);

		DettaglioScontrino dettaglioScontrino = new DettaglioScontrino();
		dettaglioScontrino.setCategoriaMerceologica(aafor.getAasfa() + "-" + movma.getVcoda());
		dettaglioScontrino.setCodiceBrand(aafor.getId().getAafor().toString());
		if(eUnBuono) {
			JAXBElement<String> buono = factory.createDettaglioScontrinoCodiceBuono(movma.getVdesc());
			dettaglioScontrino.setCodiceBuono(buono);
		}
		// JAXBElement<String> codiceEan = factory.createDettaglioScontrinoCodiceEAN("1234567890123");
		// dettaglioScontrino.setCodiceEAN(codiceEan);
		dettaglioScontrino.setCodiceProdotto(aafor.getId().getAacoa());
		dettaglioScontrino.setCodiceProdottoPdv(movma.getVcoda());
		
		JAXBElement<String> descrizioneProdotto = factory.createDettaglioScontrinoDescrizioneProdotto(movma.getVdesc() + "-" + movma.getVcoda());
		dettaglioScontrino.setDescrizioneProdotto(descrizioneProdotto);
		dettaglioScontrino.setEsclusioneCalcoloPunti(escludiPunti);
		dettaglioScontrino.setPercentualeAccelerazioneLocale(0);
		
		Float prezzoTot = movma.getVquan() * movma.getVprez();
		prezzoTot = prezzoTot - (prezzoTot * movma.getVsco1() / 100.0f);
		prezzoTot = prezzoTot - (prezzoTot * movma.getVsco2() / 100.0f);
		prezzoTot = prezzoTot - (prezzoTot * movma.getVsco3() / 100.0f);
		String iva = movma.getVciva();
		try{
			Integer.parseInt(iva);
		}catch(NumberFormatException e){
			iva = "0.0";
		}
		prezzoTot = prezzoTot + (prezzoTot * Float.parseFloat(iva) / 100.0f);
		
		// aggiorno il totale dell'intero scontrino
		totaleArticoliLoyalty += prezzoTot;
		
		String prezzoTotStr = floatToString(prezzoTot);
		
		dettaglioScontrino.setPrezzoTotale(prezzoTotStr); // qty * prezzo singolo
		dettaglioScontrino.setPrezzoTotaleValuta(prezzoTotStr);
		
		DecimalFormat decimalFormatQty = new DecimalFormat("#");
		decimalFormatQty.setRoundingMode(RoundingMode.DOWN);
		String qty = decimalFormatQty.format(movma.getVquan());
		dettaglioScontrino.setQuantita(Integer.parseInt(qty));
		dettaglioScontrino.setTipologiaRiga("indefinita"); // a che cosa serve?
		log.info("]" + "creaDettaglioScontrino");
		return dettaglioScontrino;
	}
	
	private void caricamentoPunti(Scontrino scontrino, AsLymov0f lymov, AsLycmd0f cmd){
		log.info("[" + "caricamentoPunti");
		RisultatoCaricamentoPunti risRichiestaWS = servicePort.caricamentoPunti(datiClient, scontrino);
		manageRisposta(risRichiestaWS.getRisultatoOperazione(), "funzione senza risposta", cmd);
		
		String risposta[] = StringUtils.split(stringBuilder.toString(), sepCampiRisposta);
		risposta[0] = StringUtils.split(risposta[0], sepStatoRisposta)[1];
		if(StringUtils.equals(risposta[0], "0")){
			asLymov0fDao.updateElab(lymov);
		}
		log.info("]" + "caricamentoPunti");
	}
	
	private void stornoScontrino(String idTransazione, AsLycmd0f cmd){
		log.info("[" + "stornoScontrino");
		RisultatoStornoScontrino risRichiestaWS = servicePort.stornoScontrino(datiClient, idTransazione);
		manageRisposta(risRichiestaWS.getRisultatoOperazione(), "funzione senza risposta", cmd);
		log.info("]" + "stornoScontrino");
	}
	
	private String floatToString(Float f){
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.ITALY);
		otherSymbols.setDecimalSeparator('.');
		DecimalFormat decimalFormatPrezzo = new DecimalFormat("#.##", otherSymbols);
		decimalFormatPrezzo.setRoundingMode(RoundingMode.HALF_UP);
		String fToStr = decimalFormatPrezzo.format(f);
		return fToStr;
		
	}
}