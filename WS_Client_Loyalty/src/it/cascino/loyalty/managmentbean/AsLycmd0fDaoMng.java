package it.cascino.loyalty.managmentbean;

import java.io.Serializable;
import java.util.List;
import it.cascino.loyalty.model.AsLycmd0f;
import it.cascino.loyalty.utils.Resources;
import it.cascino.loyalty.dao.AsLycmd0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsLycmd0fDaoMng implements AsLycmd0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsLycmd0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsLycmd0f> getAll(){
		List<AsLycmd0f> c = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsLycmd0f.findAll");
				c = (List<AsLycmd0f>)query.getResultList();
			}catch(NoResultException e){
				c = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return c;
	}
	
	public void salva(AsLycmd0f c){
		try{
			try{
				utx.begin();
				// precodice.setId(null);
				log.info("salva: " + c.toString());
				em.persist(c);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void aggiorna(AsLycmd0f c){
		try{
			try{
				utx.begin();
				log.info("aggiorna: " + c.toString());
				em.merge(c);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void elimina(AsLycmd0f cElimina){
		try{
			try{
				utx.begin();
				AsLycmd0f c = em.find(AsLycmd0f.class, cElimina.getId());
				log.info("elimina: " + c.toString());
				em.remove(c);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<AsLycmd0f> getCmdByLycass(String lycass){
		List<AsLycmd0f> c = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsLycmd0f.findByLycass");
				query.setParameter("lycass", lycass);
				c = (List<AsLycmd0f>)query.getResultList();
			}catch(NoResultException e){
				c = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return c;
	}
	
	@SuppressWarnings("unchecked")
	public List<AsLycmd0f>  getCmdToDo(){
		List<AsLycmd0f> c = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsLycmd0f.findByToDo");
				c = (List<AsLycmd0f>)query.getResultList();
			}catch(NoResultException e){
				c = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return c;
	}
	
	@SuppressWarnings("unchecked")
	public String updateRis(AsLycmd0f cmd){
		Integer c = -1;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsLycmd0f.updateRis");
				query.setParameter("lycass", cmd.getId().getLycass());
				query.setParameter("lycmd1", cmd.getId().getLycmd1());
				query.setParameter("lycmd2", cmd.getId().getLycmd2());
				query.setParameter("lycmd3", cmd.getId().getLycmd3());
				query.setParameter("lyris1", cmd.getLyris1());
				query.setParameter("lyris2", cmd.getLyris2());
				query.setParameter("lyris3", cmd.getLyris3());
				query.setParameter("lyris4", cmd.getLyris4());
				query.setParameter("lyris5", cmd.getLyris5());
				query.setParameter("lyris6", cmd.getLyris6());
				query.setParameter("lyris7", cmd.getLyris7());
				query.setParameter("lyris8", cmd.getLyris8());
				query.setParameter("lyidtr", cmd.getId().getLyidtr());
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
	
	public void close(){
		res.close();
		log.info("chiuso");
	}
}