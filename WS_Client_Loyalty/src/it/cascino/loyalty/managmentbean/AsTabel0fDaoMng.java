package it.cascino.loyalty.managmentbean;

import java.io.Serializable;
import java.util.List;
import it.cascino.loyalty.model.AsLyanc0f;
import it.cascino.loyalty.model.AsTabel0f;
import it.cascino.loyalty.utils.Resources;
import it.cascino.loyalty.dao.AsTabel0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsTabel0fDaoMng implements AsTabel0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsTabel0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsTabel0f> getAll(){
		List<AsTabel0f> t = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsTabel0f.findAll");
				t = (List<AsTabel0f>)query.getResultList();
			}catch(NoResultException e){
				t = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return t;
	}
	
	public void salva(AsTabel0f t){
		try{
			try{
				utx.begin();
				t.setTnota("LBU");
				log.info("salva: " + t.toString());
				em.persist(t);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void aggiorna(AsTabel0f t){
		try{
			try{
				utx.begin();
				log.info("aggiorna: " + t.toString());
				em.merge(t);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void elimina(AsTabel0f tElimina){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsTabel0f.findByTcoel");
				query.setParameter("tcoel", tElimina.getTcoel());
				AsTabel0f t = (AsTabel0f)query.getSingleResult();
//				AsTabel0f t = em.find(AsTabel0f.class, tElimina.getMcoda());
				log.info("elimina: " + t.toString());
				em.remove(t);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	public AsTabel0f getBuono(String tcoel){
		AsTabel0f t = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsTabel0f.findByTcoel");
				query.setParameter("tcoel", tcoel);
				t = (AsTabel0f)query.getSingleResult();
			}catch(NoResultException e){
				t = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return t;
	}
	
	public String updateBuono(AsTabel0f t){
		Integer c = -1;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsTabel0f.updateBuono");
				query.setParameter("tcoel", t.getTcoel());
				query.setParameter("tdesc", t.getTdesc());
				query.setParameter("tcomm", t.getTcomm());
				c = query.executeUpdate();
			}catch(NoResultException e){
				c = -1;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return c.toString();
	}
	
	public void updateDaDel(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsTabel0f.updateDaDel");
				query.executeUpdate();
			}catch(NoResultException e){
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void cancellaDaDel(){
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsTabel0f.cancellaDaDel");
				query.executeUpdate();
			}catch(NoResultException e){
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}
