<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleILoyaltyIntegrationProxyid" scope="session" class="org.tempuri.ILoyaltyIntegrationProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleILoyaltyIntegrationProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleILoyaltyIntegrationProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleILoyaltyIntegrationProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.tempuri.ILoyaltyIntegration getILoyaltyIntegration10mtemp = sampleILoyaltyIntegrationProxyid.getILoyaltyIntegration();
if(getILoyaltyIntegration10mtemp == null){
%>
<%=getILoyaltyIntegration10mtemp %>
<%
}else{
        if(getILoyaltyIntegration10mtemp!= null){
        String tempreturnp11 = getILoyaltyIntegration10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String codiceClient_2id=  request.getParameter("codiceClient28");
            java.lang.String codiceClient_2idTemp = null;
        if(!codiceClient_2id.equals("")){
         codiceClient_2idTemp  = codiceClient_2id;
        }
        String codicePdv_3id=  request.getParameter("codicePdv30");
            java.lang.String codicePdv_3idTemp = null;
        if(!codicePdv_3id.equals("")){
         codicePdv_3idTemp  = codicePdv_3id;
        }
        String codiceOperatore_4id=  request.getParameter("codiceOperatore32");
            java.lang.String codiceOperatore_4idTemp = null;
        if(!codiceOperatore_4id.equals("")){
         codiceOperatore_4idTemp  = codiceOperatore_4id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_1id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_1id.setCodiceClient(codiceClient_2idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_1id.setCodicePdv(codicePdv_3idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_1id.setCodiceOperatore(codiceOperatore_4idTemp);
        String numeroCard_6id=  request.getParameter("numeroCard36");
            java.lang.String numeroCard_6idTemp = null;
        if(!numeroCard_6id.equals("")){
         numeroCard_6idTemp  = numeroCard_6id;
        }
        String numeroOrdineEcommerce_7id=  request.getParameter("numeroOrdineEcommerce38");
            java.lang.String numeroOrdineEcommerce_7idTemp = null;
        if(!numeroOrdineEcommerce_7id.equals("")){
         numeroOrdineEcommerce_7idTemp  = numeroOrdineEcommerce_7id;
        }
        String valuta_8id=  request.getParameter("valuta40");
            java.lang.String valuta_8idTemp = null;
        if(!valuta_8id.equals("")){
         valuta_8idTemp  = valuta_8id;
        }
        String tipoTransazione_9id=  request.getParameter("tipoTransazione42");
            java.lang.String tipoTransazione_9idTemp = null;
        if(!tipoTransazione_9id.equals("")){
         tipoTransazione_9idTemp  = tipoTransazione_9id;
        }
        String totaleImporto_10id=  request.getParameter("totaleImporto44");
            java.lang.String totaleImporto_10idTemp = null;
        if(!totaleImporto_10id.equals("")){
         totaleImporto_10idTemp  = totaleImporto_10id;
        }
        String idTransazione_11id=  request.getParameter("idTransazione46");
            java.lang.String idTransazione_11idTemp = null;
        if(!idTransazione_11id.equals("")){
         idTransazione_11idTemp  = idTransazione_11id;
        }
        String totaleImportoValuta_12id=  request.getParameter("totaleImportoValuta48");
            java.lang.String totaleImportoValuta_12idTemp = null;
        if(!totaleImportoValuta_12id.equals("")){
         totaleImportoValuta_12idTemp  = totaleImportoValuta_12id;
        }
        String dataOra_13id=  request.getParameter("dataOra50");
            java.lang.String dataOra_13idTemp = null;
        if(!dataOra_13id.equals("")){
         dataOra_13idTemp  = dataOra_13id;
        }
        String extraPuntiAccelerazioneLocale_14id=  request.getParameter("extraPuntiAccelerazioneLocale52");
        int extraPuntiAccelerazioneLocale_14idTemp  = Integer.parseInt(extraPuntiAccelerazioneLocale_14id);
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.Scontrino" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setNumeroCard(numeroCard_6idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setNumeroOrdineEcommerce(numeroOrdineEcommerce_7idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setValuta(valuta_8idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setTipoTransazione(tipoTransazione_9idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setTotaleImporto(totaleImporto_10idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setIdTransazione(idTransazione_11idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setTotaleImportoValuta(totaleImportoValuta_12idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setDataOra(dataOra_13idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id.setExtraPuntiAccelerazioneLocale(extraPuntiAccelerazioneLocale_14idTemp);
        org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoCaricamentoPunti caricamentoPunti13mtemp = sampleILoyaltyIntegrationProxyid.caricamentoPunti(org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_1id,org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1Scontrino_5id);
if(caricamentoPunti13mtemp == null){
%>
<%=caricamentoPunti13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">risultatoOperazione:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">codiceStato:</TD>
<TD>
<%
if(caricamentoPunti13mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=caricamentoPunti13mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.Integer typecodiceStato18 = tebece0.getCodiceStato();
        String tempResultcodiceStato18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceStato18));
        %>
        <%= tempResultcodiceStato18 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(caricamentoPunti13mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=caricamentoPunti13mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typetimestamp20 = tebece0.getTimestamp();
        String tempResulttimestamp20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp20));
        %>
        <%= tempResulttimestamp20 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">idRichiesta:</TD>
<TD>
<%
if(caricamentoPunti13mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=caricamentoPunti13mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typeidRichiesta22 = tebece0.getIdRichiesta();
        String tempResultidRichiesta22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeidRichiesta22));
        %>
        <%= tempResultidRichiesta22 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">errori:</TD>
<TD>
<%
if(caricamentoPunti13mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=caricamentoPunti13mtemp.getRisultatoOperazione();
if(tebece0 != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Services_DTO_Base.ErrorMessage[] typeerrori24 = tebece0.getErrori();
        String temperrori24 = null;
        if(typeerrori24 != null){
        java.util.List listerrori24= java.util.Arrays.asList(typeerrori24);
        temperrori24 = listerrori24.toString();
        }
        %>
        <%=temperrori24%>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 54:
        gotMethod = true;
        String codiceClient_16id=  request.getParameter("codiceClient69");
            java.lang.String codiceClient_16idTemp = null;
        if(!codiceClient_16id.equals("")){
         codiceClient_16idTemp  = codiceClient_16id;
        }
        String codicePdv_17id=  request.getParameter("codicePdv71");
            java.lang.String codicePdv_17idTemp = null;
        if(!codicePdv_17id.equals("")){
         codicePdv_17idTemp  = codicePdv_17id;
        }
        String codiceOperatore_18id=  request.getParameter("codiceOperatore73");
            java.lang.String codiceOperatore_18idTemp = null;
        if(!codiceOperatore_18id.equals("")){
         codiceOperatore_18idTemp  = codiceOperatore_18id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_15id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_15id.setCodiceClient(codiceClient_16idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_15id.setCodicePdv(codicePdv_17idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_15id.setCodiceOperatore(codiceOperatore_18idTemp);
        String idTransazione_19id=  request.getParameter("idTransazione75");
            java.lang.String idTransazione_19idTemp = null;
        if(!idTransazione_19id.equals("")){
         idTransazione_19idTemp  = idTransazione_19id;
        }
        org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoStornoScontrino stornoScontrino54mtemp = sampleILoyaltyIntegrationProxyid.stornoScontrino(org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_15id,idTransazione_19idTemp);
if(stornoScontrino54mtemp == null){
%>
<%=stornoScontrino54mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">risultatoOperazione:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">codiceStato:</TD>
<TD>
<%
if(stornoScontrino54mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=stornoScontrino54mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.Integer typecodiceStato59 = tebece0.getCodiceStato();
        String tempResultcodiceStato59 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceStato59));
        %>
        <%= tempResultcodiceStato59 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(stornoScontrino54mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=stornoScontrino54mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typetimestamp61 = tebece0.getTimestamp();
        String tempResulttimestamp61 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp61));
        %>
        <%= tempResulttimestamp61 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">idRichiesta:</TD>
<TD>
<%
if(stornoScontrino54mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=stornoScontrino54mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typeidRichiesta63 = tebece0.getIdRichiesta();
        String tempResultidRichiesta63 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeidRichiesta63));
        %>
        <%= tempResultidRichiesta63 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">errori:</TD>
<TD>
<%
if(stornoScontrino54mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=stornoScontrino54mtemp.getRisultatoOperazione();
if(tebece0 != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Services_DTO_Base.ErrorMessage[] typeerrori65 = tebece0.getErrori();
        String temperrori65 = null;
        if(typeerrori65 != null){
        java.util.List listerrori65= java.util.Arrays.asList(typeerrori65);
        temperrori65 = listerrori65.toString();
        }
        %>
        <%=temperrori65%>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 77:
        gotMethod = true;
        String codiceClient_21id=  request.getParameter("codiceClient100");
            java.lang.String codiceClient_21idTemp = null;
        if(!codiceClient_21id.equals("")){
         codiceClient_21idTemp  = codiceClient_21id;
        }
        String codicePdv_22id=  request.getParameter("codicePdv102");
            java.lang.String codicePdv_22idTemp = null;
        if(!codicePdv_22id.equals("")){
         codicePdv_22idTemp  = codicePdv_22id;
        }
        String codiceOperatore_23id=  request.getParameter("codiceOperatore104");
            java.lang.String codiceOperatore_23idTemp = null;
        if(!codiceOperatore_23id.equals("")){
         codiceOperatore_23idTemp  = codiceOperatore_23id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_20id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_20id.setCodiceClient(codiceClient_21idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_20id.setCodicePdv(codicePdv_22idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_20id.setCodiceOperatore(codiceOperatore_23idTemp);
        String codiceCard_24id=  request.getParameter("codiceCard106");
            java.lang.String codiceCard_24idTemp = null;
        if(!codiceCard_24id.equals("")){
         codiceCard_24idTemp  = codiceCard_24id;
        }
        org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoSaldoPunti saldoPunti77mtemp = sampleILoyaltyIntegrationProxyid.saldoPunti(org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_20id,codiceCard_24idTemp);
if(saldoPunti77mtemp == null){
%>
<%=saldoPunti77mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">risultatoOperazione:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">codiceStato:</TD>
<TD>
<%
if(saldoPunti77mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=saldoPunti77mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.Integer typecodiceStato82 = tebece0.getCodiceStato();
        String tempResultcodiceStato82 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceStato82));
        %>
        <%= tempResultcodiceStato82 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(saldoPunti77mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=saldoPunti77mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typetimestamp84 = tebece0.getTimestamp();
        String tempResulttimestamp84 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp84));
        %>
        <%= tempResulttimestamp84 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">idRichiesta:</TD>
<TD>
<%
if(saldoPunti77mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=saldoPunti77mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typeidRichiesta86 = tebece0.getIdRichiesta();
        String tempResultidRichiesta86 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeidRichiesta86));
        %>
        <%= tempResultidRichiesta86 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">errori:</TD>
<TD>
<%
if(saldoPunti77mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=saldoPunti77mtemp.getRisultatoOperazione();
if(tebece0 != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Services_DTO_Base.ErrorMessage[] typeerrori88 = tebece0.getErrori();
        String temperrori88 = null;
        if(typeerrori88 != null){
        java.util.List listerrori88= java.util.Arrays.asList(typeerrori88);
        temperrori88 = listerrori88.toString();
        }
        %>
        <%=temperrori88%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dataAggiornamentoSaldo:</TD>
<TD>
<%
if(saldoPunti77mtemp != null){
java.lang.String typedataAggiornamentoSaldo90 = saldoPunti77mtemp.getDataAggiornamentoSaldo();
        String tempResultdataAggiornamentoSaldo90 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedataAggiornamentoSaldo90));
        %>
        <%= tempResultdataAggiornamentoSaldo90 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codiceInternoExpert:</TD>
<TD>
<%
if(saldoPunti77mtemp != null){
java.lang.String typecodiceInternoExpert92 = saldoPunti77mtemp.getCodiceInternoExpert();
        String tempResultcodiceInternoExpert92 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceInternoExpert92));
        %>
        <%= tempResultcodiceInternoExpert92 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalePunti:</TD>
<TD>
<%
if(saldoPunti77mtemp != null){
java.lang.Integer typetotalePunti94 = saldoPunti77mtemp.getTotalePunti();
        String tempResulttotalePunti94 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalePunti94));
        %>
        <%= tempResulttotalePunti94 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">valoreMigliorBuonoOttenibile:</TD>
<TD>
<%
if(saldoPunti77mtemp != null){
java.lang.String typevaloreMigliorBuonoOttenibile96 = saldoPunti77mtemp.getValoreMigliorBuonoOttenibile();
        String tempResultvaloreMigliorBuonoOttenibile96 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevaloreMigliorBuonoOttenibile96));
        %>
        <%= tempResultvaloreMigliorBuonoOttenibile96 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 108:
        gotMethod = true;
        String codiceClient_26id=  request.getParameter("codiceClient133");
            java.lang.String codiceClient_26idTemp = null;
        if(!codiceClient_26id.equals("")){
         codiceClient_26idTemp  = codiceClient_26id;
        }
        String codicePdv_27id=  request.getParameter("codicePdv135");
            java.lang.String codicePdv_27idTemp = null;
        if(!codicePdv_27id.equals("")){
         codicePdv_27idTemp  = codicePdv_27id;
        }
        String codiceOperatore_28id=  request.getParameter("codiceOperatore137");
            java.lang.String codiceOperatore_28idTemp = null;
        if(!codiceOperatore_28id.equals("")){
         codiceOperatore_28idTemp  = codiceOperatore_28id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_25id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_25id.setCodiceClient(codiceClient_26idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_25id.setCodicePdv(codicePdv_27idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_25id.setCodiceOperatore(codiceOperatore_28idTemp);
        String codiceCard_30id=  request.getParameter("codiceCard141");
            java.lang.String codiceCard_30idTemp = null;
        if(!codiceCard_30id.equals("")){
         codiceCard_30idTemp  = codiceCard_30id;
        }
        String posizioniControllo_31id=  request.getParameter("posizioniControllo143");
            java.lang.String posizioniControllo_31idTemp = null;
        if(!posizioniControllo_31id.equals("")){
         posizioniControllo_31idTemp  = posizioniControllo_31id;
        }
        String caratteriControllo_32id=  request.getParameter("caratteriControllo145");
            java.lang.String caratteriControllo_32idTemp = null;
        if(!caratteriControllo_32id.equals("")){
         caratteriControllo_32idTemp  = caratteriControllo_32id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_29id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.VerificaCodice" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_29id.setCodiceCard(codiceCard_30idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_29id.setPosizioniControllo(posizioniControllo_31idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_29id.setCaratteriControllo(caratteriControllo_32idTemp);
        String puntiRichiesti_33id=  request.getParameter("puntiRichiesti147");
            java.lang.Integer puntiRichiesti_33idTemp = null;
        if(!puntiRichiesti_33id.equals("")){
         puntiRichiesti_33idTemp  = java.lang.Integer.valueOf(puntiRichiesti_33id);
        }
        String totaleSpesa_34id=  request.getParameter("totaleSpesa149");
            java.lang.String totaleSpesa_34idTemp = null;
        if(!totaleSpesa_34id.equals("")){
         totaleSpesa_34idTemp  = totaleSpesa_34id;
        }
        org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoBruciaturaPunti bruciaturaPunti108mtemp = sampleILoyaltyIntegrationProxyid.bruciaturaPunti(org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_25id,org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_29id,puntiRichiesti_33idTemp,totaleSpesa_34idTemp);
if(bruciaturaPunti108mtemp == null){
%>
<%=bruciaturaPunti108mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">risultatoOperazione:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">codiceStato:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=bruciaturaPunti108mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.Integer typecodiceStato113 = tebece0.getCodiceStato();
        String tempResultcodiceStato113 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceStato113));
        %>
        <%= tempResultcodiceStato113 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=bruciaturaPunti108mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typetimestamp115 = tebece0.getTimestamp();
        String tempResulttimestamp115 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp115));
        %>
        <%= tempResulttimestamp115 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">idRichiesta:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=bruciaturaPunti108mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typeidRichiesta117 = tebece0.getIdRichiesta();
        String tempResultidRichiesta117 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeidRichiesta117));
        %>
        <%= tempResultidRichiesta117 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">errori:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=bruciaturaPunti108mtemp.getRisultatoOperazione();
if(tebece0 != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Services_DTO_Base.ErrorMessage[] typeerrori119 = tebece0.getErrori();
        String temperrori119 = null;
        if(typeerrori119 != null){
        java.util.List listerrori119= java.util.Arrays.asList(typeerrori119);
        temperrori119 = listerrori119.toString();
        }
        %>
        <%=temperrori119%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nuovoSaldoPunti:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
java.lang.Integer typenuovoSaldoPunti121 = bruciaturaPunti108mtemp.getNuovoSaldoPunti();
        String tempResultnuovoSaldoPunti121 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenuovoSaldoPunti121));
        %>
        <%= tempResultnuovoSaldoPunti121 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">puntiConsumati:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
java.lang.Integer typepuntiConsumati123 = bruciaturaPunti108mtemp.getPuntiConsumati();
        String tempResultpuntiConsumati123 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepuntiConsumati123));
        %>
        <%= tempResultpuntiConsumati123 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">valoreBuono:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
java.lang.String typevaloreBuono125 = bruciaturaPunti108mtemp.getValoreBuono();
        String tempResultvaloreBuono125 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevaloreBuono125));
        %>
        <%= tempResultvaloreBuono125 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codiceBuono:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
java.lang.String typecodiceBuono127 = bruciaturaPunti108mtemp.getCodiceBuono();
        String tempResultcodiceBuono127 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceBuono127));
        %>
        <%= tempResultcodiceBuono127 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">valuta:</TD>
<TD>
<%
if(bruciaturaPunti108mtemp != null){
java.lang.String typevaluta129 = bruciaturaPunti108mtemp.getValuta();
        String tempResultvaluta129 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevaluta129));
        %>
        <%= tempResultvaluta129 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 151:
        gotMethod = true;
        String codiceClient_36id=  request.getParameter("codiceClient176");
            java.lang.String codiceClient_36idTemp = null;
        if(!codiceClient_36id.equals("")){
         codiceClient_36idTemp  = codiceClient_36id;
        }
        String codicePdv_37id=  request.getParameter("codicePdv178");
            java.lang.String codicePdv_37idTemp = null;
        if(!codicePdv_37id.equals("")){
         codicePdv_37idTemp  = codicePdv_37id;
        }
        String codiceOperatore_38id=  request.getParameter("codiceOperatore180");
            java.lang.String codiceOperatore_38idTemp = null;
        if(!codiceOperatore_38id.equals("")){
         codiceOperatore_38idTemp  = codiceOperatore_38id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_35id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_35id.setCodiceClient(codiceClient_36idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_35id.setCodicePdv(codicePdv_37idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_35id.setCodiceOperatore(codiceOperatore_38idTemp);
        String codiceCard_40id=  request.getParameter("codiceCard184");
            java.lang.String codiceCard_40idTemp = null;
        if(!codiceCard_40id.equals("")){
         codiceCard_40idTemp  = codiceCard_40id;
        }
        String posizioniControllo_41id=  request.getParameter("posizioniControllo186");
            java.lang.String posizioniControllo_41idTemp = null;
        if(!posizioniControllo_41id.equals("")){
         posizioniControllo_41idTemp  = posizioniControllo_41id;
        }
        String caratteriControllo_42id=  request.getParameter("caratteriControllo188");
            java.lang.String caratteriControllo_42idTemp = null;
        if(!caratteriControllo_42id.equals("")){
         caratteriControllo_42idTemp  = caratteriControllo_42id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_39id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.VerificaCodice" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_39id.setCodiceCard(codiceCard_40idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_39id.setPosizioniControllo(posizioniControllo_41idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_39id.setCaratteriControllo(caratteriControllo_42idTemp);
        String valoreRichiesto_43id=  request.getParameter("valoreRichiesto190");
            java.lang.String valoreRichiesto_43idTemp = null;
        if(!valoreRichiesto_43id.equals("")){
         valoreRichiesto_43idTemp  = valoreRichiesto_43id;
        }
        String puntiRichiesti_44id=  request.getParameter("puntiRichiesti192");
            java.lang.Integer puntiRichiesti_44idTemp = null;
        if(!puntiRichiesti_44id.equals("")){
         puntiRichiesti_44idTemp  = java.lang.Integer.valueOf(puntiRichiesti_44id);
        }
        org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoGenerazioneBuono generazioneBuono151mtemp = sampleILoyaltyIntegrationProxyid.generazioneBuono(org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_35id,org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1VerificaCodice_39id,valoreRichiesto_43idTemp,puntiRichiesti_44idTemp);
if(generazioneBuono151mtemp == null){
%>
<%=generazioneBuono151mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">risultatoOperazione:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">codiceStato:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=generazioneBuono151mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.Integer typecodiceStato156 = tebece0.getCodiceStato();
        String tempResultcodiceStato156 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceStato156));
        %>
        <%= tempResultcodiceStato156 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=generazioneBuono151mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typetimestamp158 = tebece0.getTimestamp();
        String tempResulttimestamp158 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp158));
        %>
        <%= tempResulttimestamp158 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">idRichiesta:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=generazioneBuono151mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typeidRichiesta160 = tebece0.getIdRichiesta();
        String tempResultidRichiesta160 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeidRichiesta160));
        %>
        <%= tempResultidRichiesta160 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">errori:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=generazioneBuono151mtemp.getRisultatoOperazione();
if(tebece0 != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Services_DTO_Base.ErrorMessage[] typeerrori162 = tebece0.getErrori();
        String temperrori162 = null;
        if(typeerrori162 != null){
        java.util.List listerrori162= java.util.Arrays.asList(typeerrori162);
        temperrori162 = listerrori162.toString();
        }
        %>
        <%=temperrori162%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nuovoSaldoPunti:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
java.lang.Integer typenuovoSaldoPunti164 = generazioneBuono151mtemp.getNuovoSaldoPunti();
        String tempResultnuovoSaldoPunti164 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenuovoSaldoPunti164));
        %>
        <%= tempResultnuovoSaldoPunti164 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">puntiConsumati:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
java.lang.Integer typepuntiConsumati166 = generazioneBuono151mtemp.getPuntiConsumati();
        String tempResultpuntiConsumati166 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepuntiConsumati166));
        %>
        <%= tempResultpuntiConsumati166 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">valoreBuono:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
java.lang.String typevaloreBuono168 = generazioneBuono151mtemp.getValoreBuono();
        String tempResultvaloreBuono168 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevaloreBuono168));
        %>
        <%= tempResultvaloreBuono168 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codiceBuono:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
java.lang.String typecodiceBuono170 = generazioneBuono151mtemp.getCodiceBuono();
        String tempResultcodiceBuono170 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceBuono170));
        %>
        <%= tempResultcodiceBuono170 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">valuta:</TD>
<TD>
<%
if(generazioneBuono151mtemp != null){
java.lang.String typevaluta172 = generazioneBuono151mtemp.getValuta();
        String tempResultvaluta172 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevaluta172));
        %>
        <%= tempResultvaluta172 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 194:
        gotMethod = true;
        String codiceClient_46id=  request.getParameter("codiceClient215");
            java.lang.String codiceClient_46idTemp = null;
        if(!codiceClient_46id.equals("")){
         codiceClient_46idTemp  = codiceClient_46id;
        }
        String codicePdv_47id=  request.getParameter("codicePdv217");
            java.lang.String codicePdv_47idTemp = null;
        if(!codicePdv_47id.equals("")){
         codicePdv_47idTemp  = codicePdv_47id;
        }
        String codiceOperatore_48id=  request.getParameter("codiceOperatore219");
            java.lang.String codiceOperatore_48idTemp = null;
        if(!codiceOperatore_48id.equals("")){
         codiceOperatore_48idTemp  = codiceOperatore_48id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_45id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_45id.setCodiceClient(codiceClient_46idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_45id.setCodicePdv(codicePdv_47idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_45id.setCodiceOperatore(codiceOperatore_48idTemp);
        String codiceBuono_49id=  request.getParameter("codiceBuono221");
            java.lang.String codiceBuono_49idTemp = null;
        if(!codiceBuono_49id.equals("")){
         codiceBuono_49idTemp  = codiceBuono_49id;
        }
        org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoVerificaBuono verificaBuono194mtemp = sampleILoyaltyIntegrationProxyid.verificaBuono(org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_45id,codiceBuono_49idTemp);
if(verificaBuono194mtemp == null){
%>
<%=verificaBuono194mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">risultatoOperazione:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">codiceStato:</TD>
<TD>
<%
if(verificaBuono194mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=verificaBuono194mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.Integer typecodiceStato199 = tebece0.getCodiceStato();
        String tempResultcodiceStato199 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceStato199));
        %>
        <%= tempResultcodiceStato199 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(verificaBuono194mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=verificaBuono194mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typetimestamp201 = tebece0.getTimestamp();
        String tempResulttimestamp201 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp201));
        %>
        <%= tempResulttimestamp201 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">idRichiesta:</TD>
<TD>
<%
if(verificaBuono194mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=verificaBuono194mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typeidRichiesta203 = tebece0.getIdRichiesta();
        String tempResultidRichiesta203 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeidRichiesta203));
        %>
        <%= tempResultidRichiesta203 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">errori:</TD>
<TD>
<%
if(verificaBuono194mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=verificaBuono194mtemp.getRisultatoOperazione();
if(tebece0 != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Services_DTO_Base.ErrorMessage[] typeerrori205 = tebece0.getErrori();
        String temperrori205 = null;
        if(typeerrori205 != null){
        java.util.List listerrori205= java.util.Arrays.asList(typeerrori205);
        temperrori205 = listerrori205.toString();
        }
        %>
        <%=temperrori205%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">valoreBuono:</TD>
<TD>
<%
if(verificaBuono194mtemp != null){
java.lang.String typevaloreBuono207 = verificaBuono194mtemp.getValoreBuono();
        String tempResultvaloreBuono207 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevaloreBuono207));
        %>
        <%= tempResultvaloreBuono207 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codiceBuono:</TD>
<TD>
<%
if(verificaBuono194mtemp != null){
java.lang.String typecodiceBuono209 = verificaBuono194mtemp.getCodiceBuono();
        String tempResultcodiceBuono209 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceBuono209));
        %>
        <%= tempResultcodiceBuono209 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">validitaBuono:</TD>
<TD>
<%
if(verificaBuono194mtemp != null){
java.lang.Boolean typevaliditaBuono211 = verificaBuono194mtemp.getValiditaBuono();
        String tempResultvaliditaBuono211 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevaliditaBuono211));
        %>
        <%= tempResultvaliditaBuono211 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 223:
        gotMethod = true;
        String codiceClient_51id=  request.getParameter("codiceClient242");
            java.lang.String codiceClient_51idTemp = null;
        if(!codiceClient_51id.equals("")){
         codiceClient_51idTemp  = codiceClient_51id;
        }
        String codicePdv_52id=  request.getParameter("codicePdv244");
            java.lang.String codicePdv_52idTemp = null;
        if(!codicePdv_52id.equals("")){
         codicePdv_52idTemp  = codicePdv_52id;
        }
        String codiceOperatore_53id=  request.getParameter("codiceOperatore246");
            java.lang.String codiceOperatore_53idTemp = null;
        if(!codiceOperatore_53id.equals("")){
         codiceOperatore_53idTemp  = codiceOperatore_53id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_50id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_50id.setCodiceClient(codiceClient_51idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_50id.setCodicePdv(codicePdv_52idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_50id.setCodiceOperatore(codiceOperatore_53idTemp);
        String codiceBuono_54id=  request.getParameter("codiceBuono248");
            java.lang.String codiceBuono_54idTemp = null;
        if(!codiceBuono_54id.equals("")){
         codiceBuono_54idTemp  = codiceBuono_54id;
        }
        String totaleSpesa_55id=  request.getParameter("totaleSpesa250");
            java.lang.String totaleSpesa_55idTemp = null;
        if(!totaleSpesa_55id.equals("")){
         totaleSpesa_55idTemp  = totaleSpesa_55id;
        }
        String valutaSpesa_56id=  request.getParameter("valutaSpesa252");
            java.lang.String valutaSpesa_56idTemp = null;
        if(!valutaSpesa_56id.equals("")){
         valutaSpesa_56idTemp  = valutaSpesa_56id;
        }
        org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoUtilizzoBuono utilizzaBuono223mtemp = sampleILoyaltyIntegrationProxyid.utilizzaBuono(org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_50id,codiceBuono_54idTemp,totaleSpesa_55idTemp,valutaSpesa_56idTemp);
if(utilizzaBuono223mtemp == null){
%>
<%=utilizzaBuono223mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">risultatoOperazione:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">codiceStato:</TD>
<TD>
<%
if(utilizzaBuono223mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=utilizzaBuono223mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.Integer typecodiceStato228 = tebece0.getCodiceStato();
        String tempResultcodiceStato228 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceStato228));
        %>
        <%= tempResultcodiceStato228 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(utilizzaBuono223mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=utilizzaBuono223mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typetimestamp230 = tebece0.getTimestamp();
        String tempResulttimestamp230 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp230));
        %>
        <%= tempResulttimestamp230 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">idRichiesta:</TD>
<TD>
<%
if(utilizzaBuono223mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=utilizzaBuono223mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typeidRichiesta232 = tebece0.getIdRichiesta();
        String tempResultidRichiesta232 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeidRichiesta232));
        %>
        <%= tempResultidRichiesta232 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">errori:</TD>
<TD>
<%
if(utilizzaBuono223mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=utilizzaBuono223mtemp.getRisultatoOperazione();
if(tebece0 != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Services_DTO_Base.ErrorMessage[] typeerrori234 = tebece0.getErrori();
        String temperrori234 = null;
        if(typeerrori234 != null){
        java.util.List listerrori234= java.util.Arrays.asList(typeerrori234);
        temperrori234 = listerrori234.toString();
        }
        %>
        <%=temperrori234%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">valoreBuono:</TD>
<TD>
<%
if(utilizzaBuono223mtemp != null){
java.lang.String typevaloreBuono236 = utilizzaBuono223mtemp.getValoreBuono();
        String tempResultvaloreBuono236 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevaloreBuono236));
        %>
        <%= tempResultvaloreBuono236 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codiceBuono:</TD>
<TD>
<%
if(utilizzaBuono223mtemp != null){
java.lang.String typecodiceBuono238 = utilizzaBuono223mtemp.getCodiceBuono();
        String tempResultcodiceBuono238 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceBuono238));
        %>
        <%= tempResultcodiceBuono238 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 254:
        gotMethod = true;
        String codiceClient_58id=  request.getParameter("codiceClient271");
            java.lang.String codiceClient_58idTemp = null;
        if(!codiceClient_58id.equals("")){
         codiceClient_58idTemp  = codiceClient_58id;
        }
        String codicePdv_59id=  request.getParameter("codicePdv273");
            java.lang.String codicePdv_59idTemp = null;
        if(!codicePdv_59id.equals("")){
         codicePdv_59idTemp  = codicePdv_59id;
        }
        String codiceOperatore_60id=  request.getParameter("codiceOperatore275");
            java.lang.String codiceOperatore_60idTemp = null;
        if(!codiceOperatore_60id.equals("")){
         codiceOperatore_60idTemp  = codiceOperatore_60id;
        }
        %>
        <jsp:useBean id="org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_57id" scope="session" class="org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.DatiClient" />
        <%
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_57id.setCodiceClient(codiceClient_58idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_57id.setCodicePdv(codicePdv_59idTemp);
        org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_57id.setCodiceOperatore(codiceOperatore_60idTemp);
        org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoTagliBuono elencaTagliBuono254mtemp = sampleILoyaltyIntegrationProxyid.elencaTagliBuono(org1datacontract1schemas1_20041_071Expert_Loyalty_WS_DTO1DatiClient_57id);
if(elencaTagliBuono254mtemp == null){
%>
<%=elencaTagliBuono254mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">tagliBuono:</TD>
<TD>
<%
if(elencaTagliBuono254mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Configurazione.TaglioBuono[] typetagliBuono257 = elencaTagliBuono254mtemp.getTagliBuono();
        String temptagliBuono257 = null;
        if(typetagliBuono257 != null){
        java.util.List listtagliBuono257= java.util.Arrays.asList(typetagliBuono257);
        temptagliBuono257 = listtagliBuono257.toString();
        }
        %>
        <%=temptagliBuono257%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">risultatoOperazione:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">codiceStato:</TD>
<TD>
<%
if(elencaTagliBuono254mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=elencaTagliBuono254mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.Integer typecodiceStato261 = tebece0.getCodiceStato();
        String tempResultcodiceStato261 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceStato261));
        %>
        <%= tempResultcodiceStato261 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">timestamp:</TD>
<TD>
<%
if(elencaTagliBuono254mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=elencaTagliBuono254mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typetimestamp263 = tebece0.getTimestamp();
        String tempResulttimestamp263 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetimestamp263));
        %>
        <%= tempResulttimestamp263 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">idRichiesta:</TD>
<TD>
<%
if(elencaTagliBuono254mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=elencaTagliBuono254mtemp.getRisultatoOperazione();
if(tebece0 != null){
java.lang.String typeidRichiesta265 = tebece0.getIdRichiesta();
        String tempResultidRichiesta265 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeidRichiesta265));
        %>
        <%= tempResultidRichiesta265 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">errori:</TD>
<TD>
<%
if(elencaTagliBuono254mtemp != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_WS_DTO.RisultatoOperazione tebece0=elencaTagliBuono254mtemp.getRisultatoOperazione();
if(tebece0 != null){
org.datacontract.schemas._2004._07.Expert_Loyalty_Domain_Services_DTO_Base.ErrorMessage[] typeerrori267 = tebece0.getErrori();
        String temperrori267 = null;
        if(typeerrori267 != null){
        java.util.List listerrori267= java.util.Arrays.asList(typeerrori267);
        temperrori267 = listerrori267.toString();
        }
        %>
        <%=temperrori267%>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>