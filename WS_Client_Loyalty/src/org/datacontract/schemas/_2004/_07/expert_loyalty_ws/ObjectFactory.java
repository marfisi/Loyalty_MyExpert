
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.expert_loyalty_domain.ArrayOfTaglioBuono;
import org.datacontract.schemas._2004._07.expert_loyalty_domain_services_dto.ArrayOfErrorMessage;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.expert_loyalty_ws package. 
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

    private final static QName _RisultatoBruciaturaPunti_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoBruciaturaPunti");
    private final static QName _RisultatoUtilizzoBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoUtilizzoBuono");
    private final static QName _Scontrino_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "Scontrino");
    private final static QName _RisultatoOperazione_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoOperazione");
    private final static QName _RisultatoSaldoPunti_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoSaldoPunti");
    private final static QName _RisultatoCaricamentoPunti_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoCaricamentoPunti");
    private final static QName _RisultatoTagliBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoTagliBuono");
    private final static QName _RisultatoStornoScontrino_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoStornoScontrino");
    private final static QName _RisultatoGenerazioneBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoGenerazioneBuono");
    private final static QName _DettaglioScontrino_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "DettaglioScontrino");
    private final static QName _ArrayOfDettaglioScontrino_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "ArrayOfDettaglioScontrino");
    private final static QName _VerificaCodice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "VerificaCodice");
    private final static QName _RisultatoVerificaBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "RisultatoVerificaBuono");
    private final static QName _DatiClient_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "DatiClient");
    private final static QName _RisultatoGenerazioneBuonoValoreBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "ValoreBuono");
    private final static QName _RisultatoGenerazioneBuonoCodiceBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "CodiceBuono");
    private final static QName _RisultatoGenerazioneBuonoValuta_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "Valuta");
    private final static QName _RisultatoSaldoPuntiDataAggiornamentoSaldo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "DataAggiornamentoSaldo");
    private final static QName _RisultatoSaldoPuntiCodiceInternoExpert_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "CodiceInternoExpert");
    private final static QName _RisultatoSaldoPuntiValoreMigliorBuonoOttenibile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "ValoreMigliorBuonoOttenibile");
    private final static QName _RisultatoTagliBuonoTagliBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "TagliBuono");
    private final static QName _ScontrinoTipoTransazione_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "TipoTransazione");
    private final static QName _ScontrinoNumeroOrdineEcommerce_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "NumeroOrdineEcommerce");
    private final static QName _RisultatoOperazioneTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "Timestamp");
    private final static QName _RisultatoOperazioneErrori_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "Errori");
    private final static QName _DettaglioScontrinoCodiceEAN_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "CodiceEAN");
    private final static QName _DettaglioScontrinoNumeroRigaOrdineEcommerce_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "NumeroRigaOrdineEcommerce");
    private final static QName _DettaglioScontrinoDescrizioneProdotto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", "DescrizioneProdotto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.expert_loyalty_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatiClient }
     * 
     */
    public DatiClient createDatiClient() {
        return new DatiClient();
    }

    /**
     * Create an instance of {@link RisultatoUtilizzoBuono }
     * 
     */
    public RisultatoUtilizzoBuono createRisultatoUtilizzoBuono() {
        return new RisultatoUtilizzoBuono();
    }

    /**
     * Create an instance of {@link RisultatoBruciaturaPunti }
     * 
     */
    public RisultatoBruciaturaPunti createRisultatoBruciaturaPunti() {
        return new RisultatoBruciaturaPunti();
    }

    /**
     * Create an instance of {@link Scontrino }
     * 
     */
    public Scontrino createScontrino() {
        return new Scontrino();
    }

    /**
     * Create an instance of {@link RisultatoTagliBuono }
     * 
     */
    public RisultatoTagliBuono createRisultatoTagliBuono() {
        return new RisultatoTagliBuono();
    }

    /**
     * Create an instance of {@link VerificaCodice }
     * 
     */
    public VerificaCodice createVerificaCodice() {
        return new VerificaCodice();
    }

    /**
     * Create an instance of {@link RisultatoSaldoPunti }
     * 
     */
    public RisultatoSaldoPunti createRisultatoSaldoPunti() {
        return new RisultatoSaldoPunti();
    }

    /**
     * Create an instance of {@link RisultatoVerificaBuono }
     * 
     */
    public RisultatoVerificaBuono createRisultatoVerificaBuono() {
        return new RisultatoVerificaBuono();
    }

    /**
     * Create an instance of {@link RisultatoCaricamentoPunti }
     * 
     */
    public RisultatoCaricamentoPunti createRisultatoCaricamentoPunti() {
        return new RisultatoCaricamentoPunti();
    }

    /**
     * Create an instance of {@link RisultatoGenerazioneBuono }
     * 
     */
    public RisultatoGenerazioneBuono createRisultatoGenerazioneBuono() {
        return new RisultatoGenerazioneBuono();
    }

    /**
     * Create an instance of {@link RisultatoStornoScontrino }
     * 
     */
    public RisultatoStornoScontrino createRisultatoStornoScontrino() {
        return new RisultatoStornoScontrino();
    }

    /**
     * Create an instance of {@link DettaglioScontrino }
     * 
     */
    public DettaglioScontrino createDettaglioScontrino() {
        return new DettaglioScontrino();
    }

    /**
     * Create an instance of {@link RisultatoOperazione }
     * 
     */
    public RisultatoOperazione createRisultatoOperazione() {
        return new RisultatoOperazione();
    }

    /**
     * Create an instance of {@link ArrayOfDettaglioScontrino }
     * 
     */
    public ArrayOfDettaglioScontrino createArrayOfDettaglioScontrino() {
        return new ArrayOfDettaglioScontrino();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoBruciaturaPunti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoBruciaturaPunti")
    public JAXBElement<RisultatoBruciaturaPunti> createRisultatoBruciaturaPunti(RisultatoBruciaturaPunti value) {
        return new JAXBElement<RisultatoBruciaturaPunti>(_RisultatoBruciaturaPunti_QNAME, RisultatoBruciaturaPunti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoUtilizzoBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoUtilizzoBuono")
    public JAXBElement<RisultatoUtilizzoBuono> createRisultatoUtilizzoBuono(RisultatoUtilizzoBuono value) {
        return new JAXBElement<RisultatoUtilizzoBuono>(_RisultatoUtilizzoBuono_QNAME, RisultatoUtilizzoBuono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Scontrino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "Scontrino")
    public JAXBElement<Scontrino> createScontrino(Scontrino value) {
        return new JAXBElement<Scontrino>(_Scontrino_QNAME, Scontrino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione")
    public JAXBElement<RisultatoOperazione> createRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoSaldoPunti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoSaldoPunti")
    public JAXBElement<RisultatoSaldoPunti> createRisultatoSaldoPunti(RisultatoSaldoPunti value) {
        return new JAXBElement<RisultatoSaldoPunti>(_RisultatoSaldoPunti_QNAME, RisultatoSaldoPunti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoCaricamentoPunti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoCaricamentoPunti")
    public JAXBElement<RisultatoCaricamentoPunti> createRisultatoCaricamentoPunti(RisultatoCaricamentoPunti value) {
        return new JAXBElement<RisultatoCaricamentoPunti>(_RisultatoCaricamentoPunti_QNAME, RisultatoCaricamentoPunti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoTagliBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoTagliBuono")
    public JAXBElement<RisultatoTagliBuono> createRisultatoTagliBuono(RisultatoTagliBuono value) {
        return new JAXBElement<RisultatoTagliBuono>(_RisultatoTagliBuono_QNAME, RisultatoTagliBuono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoStornoScontrino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoStornoScontrino")
    public JAXBElement<RisultatoStornoScontrino> createRisultatoStornoScontrino(RisultatoStornoScontrino value) {
        return new JAXBElement<RisultatoStornoScontrino>(_RisultatoStornoScontrino_QNAME, RisultatoStornoScontrino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoGenerazioneBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoGenerazioneBuono")
    public JAXBElement<RisultatoGenerazioneBuono> createRisultatoGenerazioneBuono(RisultatoGenerazioneBuono value) {
        return new JAXBElement<RisultatoGenerazioneBuono>(_RisultatoGenerazioneBuono_QNAME, RisultatoGenerazioneBuono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DettaglioScontrino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "DettaglioScontrino")
    public JAXBElement<DettaglioScontrino> createDettaglioScontrino(DettaglioScontrino value) {
        return new JAXBElement<DettaglioScontrino>(_DettaglioScontrino_QNAME, DettaglioScontrino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDettaglioScontrino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "ArrayOfDettaglioScontrino")
    public JAXBElement<ArrayOfDettaglioScontrino> createArrayOfDettaglioScontrino(ArrayOfDettaglioScontrino value) {
        return new JAXBElement<ArrayOfDettaglioScontrino>(_ArrayOfDettaglioScontrino_QNAME, ArrayOfDettaglioScontrino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaCodice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "VerificaCodice")
    public JAXBElement<VerificaCodice> createVerificaCodice(VerificaCodice value) {
        return new JAXBElement<VerificaCodice>(_VerificaCodice_QNAME, VerificaCodice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoVerificaBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoVerificaBuono")
    public JAXBElement<RisultatoVerificaBuono> createRisultatoVerificaBuono(RisultatoVerificaBuono value) {
        return new JAXBElement<RisultatoVerificaBuono>(_RisultatoVerificaBuono_QNAME, RisultatoVerificaBuono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "DatiClient")
    public JAXBElement<DatiClient> createDatiClient(DatiClient value) {
        return new JAXBElement<DatiClient>(_DatiClient_QNAME, DatiClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "ValoreBuono", scope = RisultatoGenerazioneBuono.class)
    public JAXBElement<String> createRisultatoGenerazioneBuonoValoreBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoValoreBuono_QNAME, String.class, RisultatoGenerazioneBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "CodiceBuono", scope = RisultatoGenerazioneBuono.class)
    public JAXBElement<String> createRisultatoGenerazioneBuonoCodiceBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoCodiceBuono_QNAME, String.class, RisultatoGenerazioneBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione", scope = RisultatoGenerazioneBuono.class)
    public JAXBElement<RisultatoOperazione> createRisultatoGenerazioneBuonoRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, RisultatoGenerazioneBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "Valuta", scope = RisultatoGenerazioneBuono.class)
    public JAXBElement<String> createRisultatoGenerazioneBuonoValuta(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoValuta_QNAME, String.class, RisultatoGenerazioneBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "DataAggiornamentoSaldo", scope = RisultatoSaldoPunti.class)
    public JAXBElement<String> createRisultatoSaldoPuntiDataAggiornamentoSaldo(String value) {
        return new JAXBElement<String>(_RisultatoSaldoPuntiDataAggiornamentoSaldo_QNAME, String.class, RisultatoSaldoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "CodiceInternoExpert", scope = RisultatoSaldoPunti.class)
    public JAXBElement<String> createRisultatoSaldoPuntiCodiceInternoExpert(String value) {
        return new JAXBElement<String>(_RisultatoSaldoPuntiCodiceInternoExpert_QNAME, String.class, RisultatoSaldoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "ValoreMigliorBuonoOttenibile", scope = RisultatoSaldoPunti.class)
    public JAXBElement<String> createRisultatoSaldoPuntiValoreMigliorBuonoOttenibile(String value) {
        return new JAXBElement<String>(_RisultatoSaldoPuntiValoreMigliorBuonoOttenibile_QNAME, String.class, RisultatoSaldoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione", scope = RisultatoSaldoPunti.class)
    public JAXBElement<RisultatoOperazione> createRisultatoSaldoPuntiRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, RisultatoSaldoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione", scope = RisultatoStornoScontrino.class)
    public JAXBElement<RisultatoOperazione> createRisultatoStornoScontrinoRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, RisultatoStornoScontrino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "ValoreBuono", scope = RisultatoUtilizzoBuono.class)
    public JAXBElement<String> createRisultatoUtilizzoBuonoValoreBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoValoreBuono_QNAME, String.class, RisultatoUtilizzoBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "CodiceBuono", scope = RisultatoUtilizzoBuono.class)
    public JAXBElement<String> createRisultatoUtilizzoBuonoCodiceBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoCodiceBuono_QNAME, String.class, RisultatoUtilizzoBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione", scope = RisultatoUtilizzoBuono.class)
    public JAXBElement<RisultatoOperazione> createRisultatoUtilizzoBuonoRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, RisultatoUtilizzoBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaglioBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "TagliBuono", scope = RisultatoTagliBuono.class)
    public JAXBElement<ArrayOfTaglioBuono> createRisultatoTagliBuonoTagliBuono(ArrayOfTaglioBuono value) {
        return new JAXBElement<ArrayOfTaglioBuono>(_RisultatoTagliBuonoTagliBuono_QNAME, ArrayOfTaglioBuono.class, RisultatoTagliBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione", scope = RisultatoTagliBuono.class)
    public JAXBElement<RisultatoOperazione> createRisultatoTagliBuonoRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, RisultatoTagliBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "TipoTransazione", scope = Scontrino.class)
    public JAXBElement<String> createScontrinoTipoTransazione(String value) {
        return new JAXBElement<String>(_ScontrinoTipoTransazione_QNAME, String.class, Scontrino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "NumeroOrdineEcommerce", scope = Scontrino.class)
    public JAXBElement<String> createScontrinoNumeroOrdineEcommerce(String value) {
        return new JAXBElement<String>(_ScontrinoNumeroOrdineEcommerce_QNAME, String.class, Scontrino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione", scope = RisultatoCaricamentoPunti.class)
    public JAXBElement<RisultatoOperazione> createRisultatoCaricamentoPuntiRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, RisultatoCaricamentoPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "ValoreBuono", scope = RisultatoBruciaturaPunti.class)
    public JAXBElement<String> createRisultatoBruciaturaPuntiValoreBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoValoreBuono_QNAME, String.class, RisultatoBruciaturaPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "CodiceBuono", scope = RisultatoBruciaturaPunti.class)
    public JAXBElement<String> createRisultatoBruciaturaPuntiCodiceBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoCodiceBuono_QNAME, String.class, RisultatoBruciaturaPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione", scope = RisultatoBruciaturaPunti.class)
    public JAXBElement<RisultatoOperazione> createRisultatoBruciaturaPuntiRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, RisultatoBruciaturaPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "Valuta", scope = RisultatoBruciaturaPunti.class)
    public JAXBElement<String> createRisultatoBruciaturaPuntiValuta(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoValuta_QNAME, String.class, RisultatoBruciaturaPunti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "ValoreBuono", scope = RisultatoVerificaBuono.class)
    public JAXBElement<String> createRisultatoVerificaBuonoValoreBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoValoreBuono_QNAME, String.class, RisultatoVerificaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "CodiceBuono", scope = RisultatoVerificaBuono.class)
    public JAXBElement<String> createRisultatoVerificaBuonoCodiceBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoCodiceBuono_QNAME, String.class, RisultatoVerificaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "RisultatoOperazione", scope = RisultatoVerificaBuono.class)
    public JAXBElement<RisultatoOperazione> createRisultatoVerificaBuonoRisultatoOperazione(RisultatoOperazione value) {
        return new JAXBElement<RisultatoOperazione>(_RisultatoOperazione_QNAME, RisultatoOperazione.class, RisultatoVerificaBuono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "Timestamp", scope = RisultatoOperazione.class)
    public JAXBElement<String> createRisultatoOperazioneTimestamp(String value) {
        return new JAXBElement<String>(_RisultatoOperazioneTimestamp_QNAME, String.class, RisultatoOperazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "Errori", scope = RisultatoOperazione.class)
    public JAXBElement<ArrayOfErrorMessage> createRisultatoOperazioneErrori(ArrayOfErrorMessage value) {
        return new JAXBElement<ArrayOfErrorMessage>(_RisultatoOperazioneErrori_QNAME, ArrayOfErrorMessage.class, RisultatoOperazione.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "CodiceEAN", scope = DettaglioScontrino.class)
    public JAXBElement<String> createDettaglioScontrinoCodiceEAN(String value) {
        return new JAXBElement<String>(_DettaglioScontrinoCodiceEAN_QNAME, String.class, DettaglioScontrino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "CodiceBuono", scope = DettaglioScontrino.class)
    public JAXBElement<String> createDettaglioScontrinoCodiceBuono(String value) {
        return new JAXBElement<String>(_RisultatoGenerazioneBuonoCodiceBuono_QNAME, String.class, DettaglioScontrino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "NumeroRigaOrdineEcommerce", scope = DettaglioScontrino.class)
    public JAXBElement<String> createDettaglioScontrinoNumeroRigaOrdineEcommerce(String value) {
        return new JAXBElement<String>(_DettaglioScontrinoNumeroRigaOrdineEcommerce_QNAME, String.class, DettaglioScontrino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", name = "DescrizioneProdotto", scope = DettaglioScontrino.class)
    public JAXBElement<String> createDettaglioScontrinoDescrizioneProdotto(String value) {
        return new JAXBElement<String>(_DettaglioScontrinoDescrizioneProdotto_QNAME, String.class, DettaglioScontrino.class, value);
    }

}
