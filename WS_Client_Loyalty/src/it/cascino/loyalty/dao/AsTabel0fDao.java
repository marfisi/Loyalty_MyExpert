package it.cascino.loyalty.dao;

import java.util.List;
import it.cascino.loyalty.model.AsTabel0f;

public interface AsTabel0fDao{
	List<AsTabel0f> getAll();
	
	void salva(AsTabel0f t);
	
	void aggiorna(AsTabel0f t);
	
	void elimina(AsTabel0f t);

	AsTabel0f getBuono(String tcoel);
	
	String updateBuono(AsTabel0f t);
	
	void updateDaDel();

	void cancellaDaDel();

	void close();
}
