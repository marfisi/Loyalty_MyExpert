package it.cascino.loyalty.model.pkey;

import java.io.Serializable;
import javax.persistence.Embeddable;
import org.apache.commons.lang3.StringUtils;

@Embeddable
public class AsLycmd0fPKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String lycass;
	private String lycmd1;
	private String lycmd2;
	private String lycmd3;
	private Integer lyidtr;

	public AsLycmd0fPKey(){
	}

	public AsLycmd0fPKey(String lycass, String lycmd1, String lycmd2, String lycmd3, Integer lyidtr){
		super();
		this.lycass = lycass;
		this.lycmd1 = lycmd1;
		this.lycmd2 = lycmd2;
		this.lycmd3 = lycmd3;
		this.lyidtr = lyidtr;
	}
	
	public String getLycass(){
		return lycass;
	}
	
	public void setLycass(String lycass){
		this.lycass = lycass;
	}
	
	public String getLycmd1(){
		return lycmd1;
	}
	
	public void setLycmd1(String lycmd1){
		this.lycmd1 = lycmd1;
	}
	
	public String getLycmd2(){
		return lycmd2;
	}
	
	public void setLycmd2(String lycmd2){
		this.lycmd2 = lycmd2;
	}
	
	public String getLycmd3(){
		return lycmd3;
	}
	
	public void setLycmd3(String lycmd3){
		this.lycmd3 = lycmd3;
	}

	public Integer getLyidtr(){
		return lyidtr;
	}

	public void setLyidtr(Integer lyidtr){
		this.lyidtr = lyidtr;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lycass == null) ? 0 : lycass.hashCode());
		result = prime * result + ((lycmd1 == null) ? 0 : lycmd1.hashCode());
		result = prime * result + ((lycmd2 == null) ? 0 : lycmd2.hashCode());
		result = prime * result + ((lycmd3 == null) ? 0 : lycmd3.hashCode());
		result = prime * result + ((lyidtr == null) ? 0 : lyidtr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof AsMovma0fPKey) {
			if((this.lycass == ((AsLycmd0fPKey)obj).lycass) && (this.lycmd1 == ((AsLycmd0fPKey)obj).lycmd1) && (this.lycmd2 == ((AsLycmd0fPKey)obj).lycmd2) && (this.lycmd3 == ((AsLycmd0fPKey)obj).lycmd3) && (this.lyidtr == ((AsLycmd0fPKey)obj).lyidtr)) {
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
		stringBuilder.append("AsLycmd0fPKey");
		stringBuilder.append("[");
		stringBuilder.append("lycass=" + StringUtils.trim(lycass)).append(", ");
		stringBuilder.append("lycmd1=" + StringUtils.trim(lycmd1)).append(", ");
		stringBuilder.append("lycmd2=" + StringUtils.trim(lycmd2)).append(", ");
		stringBuilder.append("lycmd3=" + StringUtils.trim(lycmd3)).append(", ");
		stringBuilder.append("lyidtr=" + lyidtr);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
