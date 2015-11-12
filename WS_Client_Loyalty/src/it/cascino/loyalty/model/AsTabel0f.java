package it.cascino.loyalty.model;

import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang3.StringUtils;

/**
* The persistent class for the cas_dat/tabel0f database table.
* 
*/
@Entity(name="Tabel0f")
@NamedQueries({
	@NamedQuery(name = "AsTabel0f.findAll", query = "SELECT t FROM Tabel0f t WHERE t.tnota = 'LBU'"),
	@NamedQuery(name = "AsTabel0f.findByTcoel", query = "SELECT t FROM Tabel0f t WHERE t.tnota = 'LBU' and t.tcoel = :tcoel "),
	@NamedQuery(name = "AsTabel0f.updateBuono", query = "UPDATE Tabel0f t SET t.tdesc = :tdesc, t.tcomm = :tcomm WHERE t.tnota = 'LBU' and t.tcoel = :tcoel"),
	@NamedQuery(name = "AsTabel0f.updateDaDel", query = "UPDATE Tabel0f t SET t.tdesc = 'DaCancellare' WHERE t.tnota = 'LBU'"),
	@NamedQuery(name = "AsTabel0f.cancellaDaDel", query = "DELETE Tabel0f t WHERE t.tdesc = 'DaCancellare' and t.tnota = 'LBU'")
})
public class AsTabel0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
//	@Inject
//	private Logger log;
	
	private String tnota;
	private String tcoel;
	private String tdesc;
	private String tcomm;

	public AsTabel0f(){
	}
	
	public AsTabel0f(String tnota, String tcoel, String tdesc, String tcomm){
		super();
		this.tnota = "LBU"; // tnota; LoyaltyBUoni
		this.tcoel = tcoel;
		this.tdesc = tdesc;
		this.tcomm = tcomm;
	}
	
	public String getTnota(){
		return tnota;
	}

	public void setTnota(String tnota){
		this.tnota = "LBU"; //  = tnota;
	}

	@Id
	public String getTcoel(){
		return tcoel;
	}

	public void setTcoel(String tcoel){
		this.tcoel = tcoel;
	}

	public String getTdesc(){
		return tdesc;
	}

	public void setTdesc(String tdesc){
		this.tdesc = tdesc;
	}

	public String getTcomm(){
		return tcomm;
	}

	public void setTcomm(String tcomm){
		this.tcomm = tcomm;
	}
	
	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1));
		stringBuilder.append("[");
		stringBuilder.append("tnota=" + StringUtils.trim(tnota)).append(", ");
		stringBuilder.append("tcoel=" + StringUtils.trim(tcoel)).append(", ");
		stringBuilder.append("tdesc=" + StringUtils.trim(tdesc)).append(", ");
		stringBuilder.append("tcomm=" + StringUtils.trim(tcomm));
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tcoel == null) ? 0 : tcoel.hashCode());
		result = prime * result + ((tcomm == null) ? 0 : tcomm.hashCode());
		result = prime * result + ((tdesc == null) ? 0 : tdesc.hashCode());
		result = prime * result + ((tnota == null) ? 0 : tnota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsTabel0f){
			if(this.tcoel == ((AsTabel0f)obj).tcoel){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
}