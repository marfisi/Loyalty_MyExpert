package it.cascino.loyalty.dao;

import java.util.List;
import it.cascino.loyalty.model.AsLyanc0f;

public interface AsLyanc0fDao{
	List<AsLyanc0f> getAll();
	
	void salva(AsLyanc0f a);
	
	void aggiorna(AsLyanc0f a);
	
	void elimina(AsLyanc0f a);

	AsLyanc0f  getAnagConLyean(String lyean);
	
	AsLyanc0f  getAnagConLycli(Integer lycli);
	
	List<AsLyanc0f> getAnagConCognNome(String cogn, String nome);
	
	String updateAnagrafica(AsLyanc0f a);
	
	void close();
}
