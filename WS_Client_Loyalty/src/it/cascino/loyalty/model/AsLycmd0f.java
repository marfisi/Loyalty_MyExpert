package it.cascino.loyalty.model;

import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang3.StringUtils;
import it.cascino.loyalty.model.pkey.AsLycmd0fPKey;

/**
* The persistent class for the cas_dat/lycmd0f database table.
* 
*/
@Entity(name = "Lycmd0f")
@NamedQueries({@NamedQuery(name = "AsLycmd0f.findAll", query = "SELECT c FROM Lycmd0f c"), @NamedQuery(name = "AsLycmd0f.findByLycass", query = "SELECT c FROM Lycmd0f c WHERE c.id.lycass = :lycass"), @NamedQuery(name = "AsLycmd0f.findByToDo", query = "SELECT c FROM Lycmd0f c WHERE c.lyris1 = ''"), @NamedQuery(name = "AsLycmd0f.updateRis", query = "UPDATE Lycmd0f c SET c.lyris1 = :lyris1, c.lyris2 = :lyris2, c.lyris3 = :lyris3, c.lyris4 = :lyris4, c.lyris5 = :lyris5, c.lyris6 = :lyris6, c.lyris7 = :lyris7, c.lyris8 = :lyris8 WHERE c.id.lycass = :lycass and c.id.lycmd1 = :lycmd1 and c.id.lycmd2 = :lycmd2 and c.id.lycmd3 = :lycmd3 and c.lyris1 = '' and c.id.lyidtr = :lyidtr")
})
public class AsLycmd0f implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Logger
	 */
	// @Inject
	// private Logger log;
	
	@EmbeddedId
	private AsLycmd0fPKey id;
	private String lyris1;
	private String lyris2;
	private String lyris3;
	private String lyris4;
	private String lyris5;
	private String lyris6;
	private String lyris7;
	private String lyris8;
	
	public AsLycmd0f(){
		this.id = new AsLycmd0fPKey();
	}
	
	public AsLycmd0f(AsLycmd0fPKey id, String lyris1, String lyris2, String lyris3, String lyris4, String lyris5, String lyris6, String lyris7, String lyris8){
		super();
		this.id = id;
		this.lyris1 = lyris1;
		this.lyris2 = lyris2;
		this.lyris3 = lyris3;
		this.lyris4 = lyris4;
		this.lyris5 = lyris5;
		this.lyris6 = lyris6;
		this.lyris7 = lyris7;
		this.lyris8 = lyris8;
	}
	
	public AsLycmd0fPKey getId(){
		return id;
	}
	
	public void setId(AsLycmd0fPKey id){
		this.id = id;
	}
	
	public String getLyris1(){
		return lyris1;
	}
	
	public void setLyris1(String lyris1){
		this.lyris1 = lyris1;
	}
	
	public String getLyris2(){
		return lyris2;
	}
	
	public void setLyris2(String lyris2){
		this.lyris2 = lyris2;
	}
	
	public String getLyris3(){
		return lyris3;
	}
	
	public void setLyris3(String lyris3){
		this.lyris3 = lyris3;
	}
	
	public String getLyris4(){
		return lyris4;
	}
	
	public void setLyris4(String lyris4){
		this.lyris4 = lyris4;
	}
	
	public String getLyris5(){
		return lyris5;
	}
	
	public void setLyris5(String lyris5){
		this.lyris5 = lyris5;
	}
	
	public String getLyris6(){
		return lyris6;
	}
	
	public void setLyris6(String lyris6){
		this.lyris6 = lyris6;
	}
	
	public String getLyris7(){
		return lyris7;
	}
	
	public void setLyris7(String lyris7){
		this.lyris7 = lyris7;
	}
	
	public String getLyris8(){
		return lyris8;
	}
	
	public void setLyris8(String lyris8){
		this.lyris8 = lyris8;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lyris1 == null) ? 0 : lyris1.hashCode());
		result = prime * result + ((lyris2 == null) ? 0 : lyris2.hashCode());
		result = prime * result + ((lyris3 == null) ? 0 : lyris3.hashCode());
		result = prime * result + ((lyris4 == null) ? 0 : lyris4.hashCode());
		result = prime * result + ((lyris5 == null) ? 0 : lyris5.hashCode());
		result = prime * result + ((lyris6 == null) ? 0 : lyris6.hashCode());
		result = prime * result + ((lyris7 == null) ? 0 : lyris7.hashCode());
		result = prime * result + ((lyris8 == null) ? 0 : lyris8.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsLycmd0f) {
			if(this.id == ((AsLycmd0f)obj).id) {
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1));
		stringBuilder.append("[");
		stringBuilder.append("id=" + StringUtils.trim(id.toString())).append(", ");
		stringBuilder.append("lyris1=" + StringUtils.trim(lyris1)).append(", ");
		stringBuilder.append("lyris2=" + StringUtils.trim(lyris2)).append(", ");
		stringBuilder.append("lyris3=" + StringUtils.trim(lyris3)).append(", ");
		stringBuilder.append("lyris4=" + StringUtils.trim(lyris4)).append(", ");
		stringBuilder.append("lyris5=" + StringUtils.trim(lyris5)).append(", ");
		stringBuilder.append("lyris6=" + StringUtils.trim(lyris6)).append(", ");
		stringBuilder.append("lyris7=" + StringUtils.trim(lyris7)).append(", ");
		stringBuilder.append("lyris8=" + StringUtils.trim(lyris8));
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}