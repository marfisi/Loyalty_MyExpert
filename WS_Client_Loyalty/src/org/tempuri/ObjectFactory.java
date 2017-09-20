
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DatiClient;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.FiltroElencoOrdini;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.Riparazione;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoAttivaGiftCard;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoCaricamentoPunti;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoConfermaRiga;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoGenerazioneBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoInserisciRiparazione;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoLeggiGiftCard;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoOttieniElencoOrdini;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoOttieniOrdine;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoSaldoPunti;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoStornoScontrino;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoTagliBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoUsaGiftCard;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoUtilizzoBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoVerificaBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.Scontrino;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.VerificaCodice;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OttieniOrdineDatiClient_QNAME = new QName("http://tempuri.org/", "datiClient");
    private final static QName _OttieniOrdineIdRigaUnivoca_QNAME = new QName("http://tempuri.org/", "idRigaUnivoca");
    private final static QName _OttieniOrdineResponseOttieniOrdineResult_QNAME = new QName("http://tempuri.org/", "OttieniOrdineResult");
    private final static QName _InserisciRiparazioneRiparazione_QNAME = new QName("http://tempuri.org/", "riparazione");
    private final static QName _UtilizzaBuonoCodiceBuono_QNAME = new QName("http://tempuri.org/", "codiceBuono");
    private final static QName _UtilizzaBuonoValutaSpesa_QNAME = new QName("http://tempuri.org/", "valutaSpesa");
    private final static QName _UtilizzaBuonoTotaleSpesa_QNAME = new QName("http://tempuri.org/", "totaleSpesa");
    private final static QName _UsaGiftCardNumeroGiftCard_QNAME = new QName("http://tempuri.org/", "numeroGiftCard");
    private final static QName _UsaGiftCardDescrizioneOperazione_QNAME = new QName("http://tempuri.org/", "descrizioneOperazione");
    private final static QName _UsaGiftCardPin_QNAME = new QName("http://tempuri.org/", "pin");
    private final static QName _UsaGiftCardNumeroScontrino_QNAME = new QName("http://tempuri.org/", "numeroScontrino");
    private final static QName _OttieniElencoOrdiniResponseOttieniElencoOrdiniResult_QNAME = new QName("http://tempuri.org/", "OttieniElencoOrdiniResult");
    private final static QName _CaricamentoPuntiScontrino_QNAME = new QName("http://tempuri.org/", "scontrino");
    private final static QName _ElencaTagliBuonoResponseElencaTagliBuonoResult_QNAME = new QName("http://tempuri.org/", "ElencaTagliBuonoResult");
    private final static QName _AttivaGiftCardResponseAttivaGiftCardResult_QNAME = new QName("http://tempuri.org/", "AttivaGiftCardResult");
    private final static QName _SaldoPuntiResponseSaldoPuntiResult_QNAME = new QName("http://tempuri.org/", "SaldoPuntiResult");
    private final static QName _UtilizzaBuonoResponseUtilizzaBuonoResult_QNAME = new QName("http://tempuri.org/", "UtilizzaBuonoResult");
    private final static QName _GenerazioneBuonoVerificaCodice_QNAME = new QName("http://tempuri.org/", "verificaCodice");
    private final static QName _GenerazioneBuonoValoreRichiesto_QNAME = new QName("http://tempuri.org/", "valoreRichiesto");
    private final static QName _UsaGiftCardResponseUsaGiftCardResult_QNAME = new QName("http://tempuri.org/", "UsaGiftCardResult");
    private final static QName _InserisciRiparazioneResponseInserisciRiparazioneResult_QNAME = new QName("http://tempuri.org/", "InserisciRiparazioneResult");
    private final static QName _OttieniElencoOrdiniFiltro_QNAME = new QName("http://tempuri.org/", "filtro");
    private final static QName _StornoScontrinoResponseStornoScontrinoResult_QNAME = new QName("http://tempuri.org/", "StornoScontrinoResult");
    private final static QName _LeggiGiftCardResponseLeggiGiftCardResult_QNAME = new QName("http://tempuri.org/", "LeggiGiftCardResult");
    private final static QName _GenerazioneBuonoResponseGenerazioneBuonoResult_QNAME = new QName("http://tempuri.org/", "GenerazioneBuonoResult");
    private final static QName _StornoScontrinoIdTransazione_QNAME = new QName("http://tempuri.org/", "idTransazione");
    private final static QName _VerificaSpendibilitaBuonoResponseVerificaSpendibilitaBuonoResult_QNAME = new QName("http://tempuri.org/", "VerificaSpendibilitaBuonoResult");
    private final static QName _ConfermaRigaResponseConfermaRigaResult_QNAME = new QName("http://tempuri.org/", "ConfermaRigaResult");
    private final static QName _CaricamentoPuntiResponseCaricamentoPuntiResult_QNAME = new QName("http://tempuri.org/", "CaricamentoPuntiResult");
    private final static QName _SaldoPuntiCodiceCardInterno_QNAME = new QName("http://tempuri.org/", "codiceCardInterno");
    private final static QName _SaldoPuntiCodiceCard_QNAME = new QName("http://tempuri.org/", "codiceCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LeggiGiftCard }
     * 
     */
    public LeggiGiftCard createLeggiGiftCard() {
        return new LeggiGiftCard();
    }

    /**
     * Create an instance of {@link ElencaTagliBuono }
     * 
     */
    public ElencaTagliBuono createElencaTagliBuono() {
        return new ElencaTagliBuono();
    }

    /**
     * Create an instance of {@link OttieniElencoOrdini }
     * 
     */
    public OttieniElencoOrdini createOttieniElencoOrdini() {
        return new OttieniElencoOrdini();
    }

    /**
     * Create an instance of {@link AttivaGiftCard }
     * 
     */
    public AttivaGiftCard createAttivaGiftCard() {
        return new AttivaGiftCard();
    }

    /**
     * Create an instance of {@link SaldoPunti }
     * 
     */
    public SaldoPunti createSaldoPunti() {
        return new SaldoPunti();
    }

    /**
     * Create an instance of {@link UtilizzaBuonoResponse }
     * 
     */
    public UtilizzaBuonoResponse createUtilizzaBuonoResponse() {
        return new UtilizzaBuonoResponse();
    }

    /**
     * Create an instance of {@link OttieniOrdine }
     * 
     */
    public OttieniOrdine createOttieniOrdine() {
        return new OttieniOrdine();
    }

    /**
     * Create an instance of {@link InserisciRiparazione }
     * 
     */
    public InserisciRiparazione createInserisciRiparazione() {
        return new InserisciRiparazione();
    }

    /**
     * Create an instance of {@link UsaGiftCardResponse }
     * 
     */
    public UsaGiftCardResponse createUsaGiftCardResponse() {
        return new UsaGiftCardResponse();
    }

    /**
     * Create an instance of {@link CaricamentoPunti }
     * 
     */
    public CaricamentoPunti createCaricamentoPunti() {
        return new CaricamentoPunti();
    }

    /**
     * Create an instance of {@link GenerazioneBuono }
     * 
     */
    public GenerazioneBuono createGenerazioneBuono() {
        return new GenerazioneBuono();
    }

    /**
     * Create an instance of {@link VerificaSpendibilitaBuono }
     * 
     */
    public VerificaSpendibilitaBuono createVerificaSpendibilitaBuono() {
        return new VerificaSpendibilitaBuono();
    }

    /**
     * Create an instance of {@link OttieniOrdineResponse }
     * 
     */
    public OttieniOrdineResponse createOttieniOrdineResponse() {
        return new OttieniOrdineResponse();
    }

    /**
     * Create an instance of {@link StornoScontrinoResponse }
     * 
     */
    public StornoScontrinoResponse createStornoScontrinoResponse() {
        return new StornoScontrinoResponse();
    }

    /**
     * Create an instance of {@link UtilizzaBuono }
     * 
     */
    public UtilizzaBuono createUtilizzaBuono() {
        return new UtilizzaBuono();
    }

    /**
     * Create an instance of {@link ConfermaRiga }
     * 
     */
    public ConfermaRiga createConfermaRiga() {
        return new ConfermaRiga();
    }

    /**
     * Create an instance of {@link StornoScontrino }
     * 
     */
    public StornoScontrino createStornoScontrino() {
        return new StornoScontrino();
    }

    /**
     * Create an instance of {@link VerificaSpendibilitaBuonoResponse }
     * 
     */
    public VerificaSpendibilitaBuonoResponse createVerificaSpendibilitaBuonoResponse() {
        return new VerificaSpendibilitaBuonoResponse();
    }

    /**
     * Create an instance of {@link OttieniElencoOrdiniResponse }
     * 
     */
    public OttieniElencoOrdiniResponse createOttieniElencoOrdiniResponse() {
        return new OttieniElencoOrdiniResponse();
    }

    /**
     * Create an instance of {@link ElencaTagliBuonoResponse }
     * 
     */
    public ElencaTagliBuonoResponse createElencaTagliBuonoResponse() {
        return new ElencaTagliBuonoResponse();
    }

    /**
     * Create an instance of {@link InserisciRiparazioneResponse }
     * 
     */
    public InserisciRiparazioneResponse createInserisciRiparazioneResponse() {
        return new InserisciRiparazioneResponse();
    }

    /**
     * Create an instance of {@link UsaGiftCard }
     * 
     */
    public UsaGiftCard createUsaGiftCard() {
        return new UsaGiftCard();
    }

    /**
     * Create an instance of {@link SaldoPuntiResponse }
     * 
     */
    public SaldoPuntiResponse createSaldoPuntiResponse() {
        return new SaldoPuntiResponse();
    }

    /**
     * Create an instance of {@link LeggiGiftCardResponse }
     * 
     */
    public LeggiGiftCardResponse createLeggiGiftCardResponse() {
        return new LeggiGiftCardResponse();
    }

    /**
     * Create an instance of {@link CaricamentoPuntiResponse }
     * 
     */
    public CaricamentoPuntiResponse createCaricamentoPuntiResponse() {
        return new CaricamentoPuntiResponse();
    }

    /**
     * Create an instance of {@link ConfermaRigaResponse }
     * 
     */
    public ConfermaRigaResponse createConfermaRigaResponse() {
        return new ConfermaRigaResponse();
    }

    /**
     * Create an instance of {@link AttivaGiftCardResponse }
     * 
     */
    public AttivaGiftCardResponse createAttivaGiftCardResponse() {
        return new AttivaGiftCardResponse();
    }

    /**
     * Create an instance of {@link GenerazioneBuonoResponse }
     * 
     */
    public GenerazioneBuonoResponse createGenerazioneBuonoResponse() {
        return new GenerazioneBuonoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = OttieniOrdine.class)
    public JAXBElement<DatiClient> createOttieniOrdineDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, OttieniOrdine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idRigaUnivoca", scope = OttieniOrdine.class)
    public JAXBElement<String> createOttieniOrdineIdRigaUnivoca(String value) {
        return new JAXBElement<String>(_OttieniOrdineIdRigaUnivoca_QNAME, String.class, OttieniOrdine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = ConfermaRiga.class)
    public JAXBElement<DatiClient> createConfermaRigaDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, ConfermaRiga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idRigaUnivoca", scope = ConfermaRiga.class)
    public JAXBElement<String> createConfermaRigaIdRigaUnivoca(String value) {
        return new JAXBElement<String>(_OttieniOrdineIdRigaUnivoca_QNAME, String.class, ConfermaRiga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOttieniOrdine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OttieniOrdineResult", scope = OttieniOrdineResponse.class)
    public JAXBElement<RisultatoOttieniOrdine> createOttieniOrdineResponseOttieniOrdineResult(RisultatoOttieniOrdine value) {
        return new JAXBElement<RisultatoOttieniOrdine>(_OttieniOrdineResponseOttieniOrdineResult_QNAME, RisultatoOttieniOrdine.class, OttieniOrdineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = InserisciRiparazione.class)
    public JAXBElement<DatiClient> createInserisciRiparazioneDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, InserisciRiparazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Riparazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "riparazione", scope = InserisciRiparazione.class)
    public JAXBElement<Riparazione> createInserisciRiparazioneRiparazione(Riparazione value) {
        return new JAXBElement<Riparazione>(_InserisciRiparazioneRiparazione_QNAME, Riparazione.class, InserisciRiparazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = UtilizzaBuono.class)
    public JAXBElement<DatiClient> createUtilizzaBuonoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, UtilizzaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codiceBuono", scope = UtilizzaBuono.class)
    public JAXBElement<String> createUtilizzaBuonoCodiceBuono(String value) {
        return new JAXBElement<String>(_UtilizzaBuonoCodiceBuono_QNAME, String.class, UtilizzaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "valutaSpesa", scope = UtilizzaBuono.class)
    public JAXBElement<String> createUtilizzaBuonoValutaSpesa(String value) {
        return new JAXBElement<String>(_UtilizzaBuonoValutaSpesa_QNAME, String.class, UtilizzaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "totaleSpesa", scope = UtilizzaBuono.class)
    public JAXBElement<String> createUtilizzaBuonoTotaleSpesa(String value) {
        return new JAXBElement<String>(_UtilizzaBuonoTotaleSpesa_QNAME, String.class, UtilizzaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroGiftCard", scope = UsaGiftCard.class)
    public JAXBElement<String> createUsaGiftCardNumeroGiftCard(String value) {
        return new JAXBElement<String>(_UsaGiftCardNumeroGiftCard_QNAME, String.class, UsaGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = UsaGiftCard.class)
    public JAXBElement<DatiClient> createUsaGiftCardDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, UsaGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "descrizioneOperazione", scope = UsaGiftCard.class)
    public JAXBElement<String> createUsaGiftCardDescrizioneOperazione(String value) {
        return new JAXBElement<String>(_UsaGiftCardDescrizioneOperazione_QNAME, String.class, UsaGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pin", scope = UsaGiftCard.class)
    public JAXBElement<String> createUsaGiftCardPin(String value) {
        return new JAXBElement<String>(_UsaGiftCardPin_QNAME, String.class, UsaGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroScontrino", scope = UsaGiftCard.class)
    public JAXBElement<String> createUsaGiftCardNumeroScontrino(String value) {
        return new JAXBElement<String>(_UsaGiftCardNumeroScontrino_QNAME, String.class, UsaGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOttieniElencoOrdini }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OttieniElencoOrdiniResult", scope = OttieniElencoOrdiniResponse.class)
    public JAXBElement<RisultatoOttieniElencoOrdini> createOttieniElencoOrdiniResponseOttieniElencoOrdiniResult(RisultatoOttieniElencoOrdini value) {
        return new JAXBElement<RisultatoOttieniElencoOrdini>(_OttieniElencoOrdiniResponseOttieniElencoOrdiniResult_QNAME, RisultatoOttieniElencoOrdini.class, OttieniElencoOrdiniResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = VerificaSpendibilitaBuono.class)
    public JAXBElement<DatiClient> createVerificaSpendibilitaBuonoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, VerificaSpendibilitaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codiceBuono", scope = VerificaSpendibilitaBuono.class)
    public JAXBElement<String> createVerificaSpendibilitaBuonoCodiceBuono(String value) {
        return new JAXBElement<String>(_UtilizzaBuonoCodiceBuono_QNAME, String.class, VerificaSpendibilitaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "totaleSpesa", scope = VerificaSpendibilitaBuono.class)
    public JAXBElement<String> createVerificaSpendibilitaBuonoTotaleSpesa(String value) {
        return new JAXBElement<String>(_UtilizzaBuonoTotaleSpesa_QNAME, String.class, VerificaSpendibilitaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = CaricamentoPunti.class)
    public JAXBElement<DatiClient> createCaricamentoPuntiDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, CaricamentoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Scontrino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "scontrino", scope = CaricamentoPunti.class)
    public JAXBElement<Scontrino> createCaricamentoPuntiScontrino(Scontrino value) {
        return new JAXBElement<Scontrino>(_CaricamentoPuntiScontrino_QNAME, Scontrino.class, CaricamentoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoTagliBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ElencaTagliBuonoResult", scope = ElencaTagliBuonoResponse.class)
    public JAXBElement<RisultatoTagliBuono> createElencaTagliBuonoResponseElencaTagliBuonoResult(RisultatoTagliBuono value) {
        return new JAXBElement<RisultatoTagliBuono>(_ElencaTagliBuonoResponseElencaTagliBuonoResult_QNAME, RisultatoTagliBuono.class, ElencaTagliBuonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoAttivaGiftCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AttivaGiftCardResult", scope = AttivaGiftCardResponse.class)
    public JAXBElement<RisultatoAttivaGiftCard> createAttivaGiftCardResponseAttivaGiftCardResult(RisultatoAttivaGiftCard value) {
        return new JAXBElement<RisultatoAttivaGiftCard>(_AttivaGiftCardResponseAttivaGiftCardResult_QNAME, RisultatoAttivaGiftCard.class, AttivaGiftCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoSaldoPunti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SaldoPuntiResult", scope = SaldoPuntiResponse.class)
    public JAXBElement<RisultatoSaldoPunti> createSaldoPuntiResponseSaldoPuntiResult(RisultatoSaldoPunti value) {
        return new JAXBElement<RisultatoSaldoPunti>(_SaldoPuntiResponseSaldoPuntiResult_QNAME, RisultatoSaldoPunti.class, SaldoPuntiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroGiftCard", scope = LeggiGiftCard.class)
    public JAXBElement<String> createLeggiGiftCardNumeroGiftCard(String value) {
        return new JAXBElement<String>(_UsaGiftCardNumeroGiftCard_QNAME, String.class, LeggiGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = LeggiGiftCard.class)
    public JAXBElement<DatiClient> createLeggiGiftCardDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, LeggiGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoUtilizzoBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UtilizzaBuonoResult", scope = UtilizzaBuonoResponse.class)
    public JAXBElement<RisultatoUtilizzoBuono> createUtilizzaBuonoResponseUtilizzaBuonoResult(RisultatoUtilizzoBuono value) {
        return new JAXBElement<RisultatoUtilizzoBuono>(_UtilizzaBuonoResponseUtilizzaBuonoResult_QNAME, RisultatoUtilizzoBuono.class, UtilizzaBuonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = GenerazioneBuono.class)
    public JAXBElement<DatiClient> createGenerazioneBuonoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, GenerazioneBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaCodice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "verificaCodice", scope = GenerazioneBuono.class)
    public JAXBElement<VerificaCodice> createGenerazioneBuonoVerificaCodice(VerificaCodice value) {
        return new JAXBElement<VerificaCodice>(_GenerazioneBuonoVerificaCodice_QNAME, VerificaCodice.class, GenerazioneBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "valoreRichiesto", scope = GenerazioneBuono.class)
    public JAXBElement<String> createGenerazioneBuonoValoreRichiesto(String value) {
        return new JAXBElement<String>(_GenerazioneBuonoValoreRichiesto_QNAME, String.class, GenerazioneBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = ElencaTagliBuono.class)
    public JAXBElement<DatiClient> createElencaTagliBuonoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, ElencaTagliBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoUsaGiftCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UsaGiftCardResult", scope = UsaGiftCardResponse.class)
    public JAXBElement<RisultatoUsaGiftCard> createUsaGiftCardResponseUsaGiftCardResult(RisultatoUsaGiftCard value) {
        return new JAXBElement<RisultatoUsaGiftCard>(_UsaGiftCardResponseUsaGiftCardResult_QNAME, RisultatoUsaGiftCard.class, UsaGiftCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoInserisciRiparazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InserisciRiparazioneResult", scope = InserisciRiparazioneResponse.class)
    public JAXBElement<RisultatoInserisciRiparazione> createInserisciRiparazioneResponseInserisciRiparazioneResult(RisultatoInserisciRiparazione value) {
        return new JAXBElement<RisultatoInserisciRiparazione>(_InserisciRiparazioneResponseInserisciRiparazioneResult_QNAME, RisultatoInserisciRiparazione.class, InserisciRiparazioneResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = OttieniElencoOrdini.class)
    public JAXBElement<DatiClient> createOttieniElencoOrdiniDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, OttieniElencoOrdini.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroElencoOrdini }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filtro", scope = OttieniElencoOrdini.class)
    public JAXBElement<FiltroElencoOrdini> createOttieniElencoOrdiniFiltro(FiltroElencoOrdini value) {
        return new JAXBElement<FiltroElencoOrdini>(_OttieniElencoOrdiniFiltro_QNAME, FiltroElencoOrdini.class, OttieniElencoOrdini.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoStornoScontrino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StornoScontrinoResult", scope = StornoScontrinoResponse.class)
    public JAXBElement<RisultatoStornoScontrino> createStornoScontrinoResponseStornoScontrinoResult(RisultatoStornoScontrino value) {
        return new JAXBElement<RisultatoStornoScontrino>(_StornoScontrinoResponseStornoScontrinoResult_QNAME, RisultatoStornoScontrino.class, StornoScontrinoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoLeggiGiftCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LeggiGiftCardResult", scope = LeggiGiftCardResponse.class)
    public JAXBElement<RisultatoLeggiGiftCard> createLeggiGiftCardResponseLeggiGiftCardResult(RisultatoLeggiGiftCard value) {
        return new JAXBElement<RisultatoLeggiGiftCard>(_LeggiGiftCardResponseLeggiGiftCardResult_QNAME, RisultatoLeggiGiftCard.class, LeggiGiftCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoGenerazioneBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GenerazioneBuonoResult", scope = GenerazioneBuonoResponse.class)
    public JAXBElement<RisultatoGenerazioneBuono> createGenerazioneBuonoResponseGenerazioneBuonoResult(RisultatoGenerazioneBuono value) {
        return new JAXBElement<RisultatoGenerazioneBuono>(_GenerazioneBuonoResponseGenerazioneBuonoResult_QNAME, RisultatoGenerazioneBuono.class, GenerazioneBuonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = StornoScontrino.class)
    public JAXBElement<DatiClient> createStornoScontrinoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, StornoScontrino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idTransazione", scope = StornoScontrino.class)
    public JAXBElement<String> createStornoScontrinoIdTransazione(String value) {
        return new JAXBElement<String>(_StornoScontrinoIdTransazione_QNAME, String.class, StornoScontrino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoVerificaBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VerificaSpendibilitaBuonoResult", scope = VerificaSpendibilitaBuonoResponse.class)
    public JAXBElement<RisultatoVerificaBuono> createVerificaSpendibilitaBuonoResponseVerificaSpendibilitaBuonoResult(RisultatoVerificaBuono value) {
        return new JAXBElement<RisultatoVerificaBuono>(_VerificaSpendibilitaBuonoResponseVerificaSpendibilitaBuonoResult_QNAME, RisultatoVerificaBuono.class, VerificaSpendibilitaBuonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoConfermaRiga }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfermaRigaResult", scope = ConfermaRigaResponse.class)
    public JAXBElement<RisultatoConfermaRiga> createConfermaRigaResponseConfermaRigaResult(RisultatoConfermaRiga value) {
        return new JAXBElement<RisultatoConfermaRiga>(_ConfermaRigaResponseConfermaRigaResult_QNAME, RisultatoConfermaRiga.class, ConfermaRigaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoCaricamentoPunti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CaricamentoPuntiResult", scope = CaricamentoPuntiResponse.class)
    public JAXBElement<RisultatoCaricamentoPunti> createCaricamentoPuntiResponseCaricamentoPuntiResult(RisultatoCaricamentoPunti value) {
        return new JAXBElement<RisultatoCaricamentoPunti>(_CaricamentoPuntiResponseCaricamentoPuntiResult_QNAME, RisultatoCaricamentoPunti.class, CaricamentoPuntiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroGiftCard", scope = AttivaGiftCard.class)
    public JAXBElement<String> createAttivaGiftCardNumeroGiftCard(String value) {
        return new JAXBElement<String>(_UsaGiftCardNumeroGiftCard_QNAME, String.class, AttivaGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = AttivaGiftCard.class)
    public JAXBElement<DatiClient> createAttivaGiftCardDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, AttivaGiftCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = SaldoPunti.class)
    public JAXBElement<DatiClient> createSaldoPuntiDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_OttieniOrdineDatiClient_QNAME, DatiClient.class, SaldoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codiceCardInterno", scope = SaldoPunti.class)
    public JAXBElement<String> createSaldoPuntiCodiceCardInterno(String value) {
        return new JAXBElement<String>(_SaldoPuntiCodiceCardInterno_QNAME, String.class, SaldoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codiceCard", scope = SaldoPunti.class)
    public JAXBElement<String> createSaldoPuntiCodiceCard(String value) {
        return new JAXBElement<String>(_SaldoPuntiCodiceCard_QNAME, String.class, SaldoPunti.class, value);
    }

}
