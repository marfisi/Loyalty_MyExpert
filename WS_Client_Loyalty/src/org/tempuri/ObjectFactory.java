
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DatiClient;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoBruciaturaPunti;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoCaricamentoPunti;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoGenerazioneBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoSaldoPunti;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoStornoScontrino;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoTagliBuono;
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

    private final static QName _BruciaturaPuntiResponseBruciaturaPuntiResult_QNAME = new QName("http://tempuri.org/", "BruciaturaPuntiResult");
    private final static QName _GenerazioneBuonoResponseGenerazioneBuonoResult_QNAME = new QName("http://tempuri.org/", "GenerazioneBuonoResult");
    private final static QName _VerificaBuonoDatiClient_QNAME = new QName("http://tempuri.org/", "datiClient");
    private final static QName _VerificaBuonoCodiceBuono_QNAME = new QName("http://tempuri.org/", "codiceBuono");
    private final static QName _CaricamentoPuntiScontrino_QNAME = new QName("http://tempuri.org/", "scontrino");
    private final static QName _SaldoPuntiCodiceCard_QNAME = new QName("http://tempuri.org/", "codiceCard");
    private final static QName _VerificaBuonoResponseVerificaBuonoResult_QNAME = new QName("http://tempuri.org/", "VerificaBuonoResult");
    private final static QName _GenerazioneBuonoVerificaCodice_QNAME = new QName("http://tempuri.org/", "verificaCodice");
    private final static QName _GenerazioneBuonoValoreRichiesto_QNAME = new QName("http://tempuri.org/", "valoreRichiesto");
    private final static QName _StornoScontrinoResponseStornoScontrinoResult_QNAME = new QName("http://tempuri.org/", "StornoScontrinoResult");
    private final static QName _StornoScontrinoIdTransazione_QNAME = new QName("http://tempuri.org/", "idTransazione");
    private final static QName _CaricamentoPuntiResponseCaricamentoPuntiResult_QNAME = new QName("http://tempuri.org/", "CaricamentoPuntiResult");
    private final static QName _UtilizzaBuonoValutaSpesa_QNAME = new QName("http://tempuri.org/", "valutaSpesa");
    private final static QName _UtilizzaBuonoTotaleSpesa_QNAME = new QName("http://tempuri.org/", "totaleSpesa");
    private final static QName _ElencaTagliBuonoResponseElencaTagliBuonoResult_QNAME = new QName("http://tempuri.org/", "ElencaTagliBuonoResult");
    private final static QName _SaldoPuntiResponseSaldoPuntiResult_QNAME = new QName("http://tempuri.org/", "SaldoPuntiResult");
    private final static QName _UtilizzaBuonoResponseUtilizzaBuonoResult_QNAME = new QName("http://tempuri.org/", "UtilizzaBuonoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UtilizzaBuono }
     * 
     */
    public UtilizzaBuono createUtilizzaBuono() {
        return new UtilizzaBuono();
    }

    /**
     * Create an instance of {@link ElencaTagliBuono }
     * 
     */
    public ElencaTagliBuono createElencaTagliBuono() {
        return new ElencaTagliBuono();
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
     * Create an instance of {@link StornoScontrino }
     * 
     */
    public StornoScontrino createStornoScontrino() {
        return new StornoScontrino();
    }

    /**
     * Create an instance of {@link BruciaturaPuntiResponse }
     * 
     */
    public BruciaturaPuntiResponse createBruciaturaPuntiResponse() {
        return new BruciaturaPuntiResponse();
    }

    /**
     * Create an instance of {@link CaricamentoPunti }
     * 
     */
    public CaricamentoPunti createCaricamentoPunti() {
        return new CaricamentoPunti();
    }

    /**
     * Create an instance of {@link VerificaBuono }
     * 
     */
    public VerificaBuono createVerificaBuono() {
        return new VerificaBuono();
    }

    /**
     * Create an instance of {@link ElencaTagliBuonoResponse }
     * 
     */
    public ElencaTagliBuonoResponse createElencaTagliBuonoResponse() {
        return new ElencaTagliBuonoResponse();
    }

    /**
     * Create an instance of {@link GenerazioneBuono }
     * 
     */
    public GenerazioneBuono createGenerazioneBuono() {
        return new GenerazioneBuono();
    }

    /**
     * Create an instance of {@link SaldoPuntiResponse }
     * 
     */
    public SaldoPuntiResponse createSaldoPuntiResponse() {
        return new SaldoPuntiResponse();
    }

    /**
     * Create an instance of {@link VerificaBuonoResponse }
     * 
     */
    public VerificaBuonoResponse createVerificaBuonoResponse() {
        return new VerificaBuonoResponse();
    }

    /**
     * Create an instance of {@link CaricamentoPuntiResponse }
     * 
     */
    public CaricamentoPuntiResponse createCaricamentoPuntiResponse() {
        return new CaricamentoPuntiResponse();
    }

    /**
     * Create an instance of {@link BruciaturaPunti }
     * 
     */
    public BruciaturaPunti createBruciaturaPunti() {
        return new BruciaturaPunti();
    }

    /**
     * Create an instance of {@link GenerazioneBuonoResponse }
     * 
     */
    public GenerazioneBuonoResponse createGenerazioneBuonoResponse() {
        return new GenerazioneBuonoResponse();
    }

    /**
     * Create an instance of {@link StornoScontrinoResponse }
     * 
     */
    public StornoScontrinoResponse createStornoScontrinoResponse() {
        return new StornoScontrinoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoBruciaturaPunti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BruciaturaPuntiResult", scope = BruciaturaPuntiResponse.class)
    public JAXBElement<RisultatoBruciaturaPunti> createBruciaturaPuntiResponseBruciaturaPuntiResult(RisultatoBruciaturaPunti value) {
        return new JAXBElement<RisultatoBruciaturaPunti>(_BruciaturaPuntiResponseBruciaturaPuntiResult_QNAME, RisultatoBruciaturaPunti.class, BruciaturaPuntiResponse.class, value);
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
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = VerificaBuono.class)
    public JAXBElement<DatiClient> createVerificaBuonoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_VerificaBuonoDatiClient_QNAME, DatiClient.class, VerificaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codiceBuono", scope = VerificaBuono.class)
    public JAXBElement<String> createVerificaBuonoCodiceBuono(String value) {
        return new JAXBElement<String>(_VerificaBuonoCodiceBuono_QNAME, String.class, VerificaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = CaricamentoPunti.class)
    public JAXBElement<DatiClient> createCaricamentoPuntiDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_VerificaBuonoDatiClient_QNAME, DatiClient.class, CaricamentoPunti.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = SaldoPunti.class)
    public JAXBElement<DatiClient> createSaldoPuntiDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_VerificaBuonoDatiClient_QNAME, DatiClient.class, SaldoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codiceCard", scope = SaldoPunti.class)
    public JAXBElement<String> createSaldoPuntiCodiceCard(String value) {
        return new JAXBElement<String>(_SaldoPuntiCodiceCard_QNAME, String.class, SaldoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoVerificaBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VerificaBuonoResult", scope = VerificaBuonoResponse.class)
    public JAXBElement<RisultatoVerificaBuono> createVerificaBuonoResponseVerificaBuonoResult(RisultatoVerificaBuono value) {
        return new JAXBElement<RisultatoVerificaBuono>(_VerificaBuonoResponseVerificaBuonoResult_QNAME, RisultatoVerificaBuono.class, VerificaBuonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = GenerazioneBuono.class)
    public JAXBElement<DatiClient> createGenerazioneBuonoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_VerificaBuonoDatiClient_QNAME, DatiClient.class, GenerazioneBuono.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoStornoScontrino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StornoScontrinoResult", scope = StornoScontrinoResponse.class)
    public JAXBElement<RisultatoStornoScontrino> createStornoScontrinoResponseStornoScontrinoResult(RisultatoStornoScontrino value) {
        return new JAXBElement<RisultatoStornoScontrino>(_StornoScontrinoResponseStornoScontrinoResult_QNAME, RisultatoStornoScontrino.class, StornoScontrinoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = StornoScontrino.class)
    public JAXBElement<DatiClient> createStornoScontrinoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_VerificaBuonoDatiClient_QNAME, DatiClient.class, StornoScontrino.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoCaricamentoPunti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CaricamentoPuntiResult", scope = CaricamentoPuntiResponse.class)
    public JAXBElement<RisultatoCaricamentoPunti> createCaricamentoPuntiResponseCaricamentoPuntiResult(RisultatoCaricamentoPunti value) {
        return new JAXBElement<RisultatoCaricamentoPunti>(_CaricamentoPuntiResponseCaricamentoPuntiResult_QNAME, RisultatoCaricamentoPunti.class, CaricamentoPuntiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = UtilizzaBuono.class)
    public JAXBElement<DatiClient> createUtilizzaBuonoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_VerificaBuonoDatiClient_QNAME, DatiClient.class, UtilizzaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codiceBuono", scope = UtilizzaBuono.class)
    public JAXBElement<String> createUtilizzaBuonoCodiceBuono(String value) {
        return new JAXBElement<String>(_VerificaBuonoCodiceBuono_QNAME, String.class, UtilizzaBuono.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = ElencaTagliBuono.class)
    public JAXBElement<DatiClient> createElencaTagliBuonoDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_VerificaBuonoDatiClient_QNAME, DatiClient.class, ElencaTagliBuono.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoSaldoPunti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SaldoPuntiResult", scope = SaldoPuntiResponse.class)
    public JAXBElement<RisultatoSaldoPunti> createSaldoPuntiResponseSaldoPuntiResult(RisultatoSaldoPunti value) {
        return new JAXBElement<RisultatoSaldoPunti>(_SaldoPuntiResponseSaldoPuntiResult_QNAME, RisultatoSaldoPunti.class, SaldoPuntiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datiClient", scope = BruciaturaPunti.class)
    public JAXBElement<DatiClient> createBruciaturaPuntiDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_VerificaBuonoDatiClient_QNAME, DatiClient.class, BruciaturaPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaCodice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "verificaCodice", scope = BruciaturaPunti.class)
    public JAXBElement<VerificaCodice> createBruciaturaPuntiVerificaCodice(VerificaCodice value) {
        return new JAXBElement<VerificaCodice>(_GenerazioneBuonoVerificaCodice_QNAME, VerificaCodice.class, BruciaturaPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "totaleSpesa", scope = BruciaturaPunti.class)
    public JAXBElement<String> createBruciaturaPuntiTotaleSpesa(String value) {
        return new JAXBElement<String>(_UtilizzaBuonoTotaleSpesa_QNAME, String.class, BruciaturaPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoUtilizzoBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UtilizzaBuonoResult", scope = UtilizzaBuonoResponse.class)
    public JAXBElement<RisultatoUtilizzoBuono> createUtilizzaBuonoResponseUtilizzaBuonoResult(RisultatoUtilizzoBuono value) {
        return new JAXBElement<RisultatoUtilizzoBuono>(_UtilizzaBuonoResponseUtilizzaBuonoResult_QNAME, RisultatoUtilizzoBuono.class, UtilizzaBuonoResponse.class, value);
    }

}
