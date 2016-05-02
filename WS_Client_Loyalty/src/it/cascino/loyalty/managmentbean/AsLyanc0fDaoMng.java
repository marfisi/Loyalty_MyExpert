package it.cascino.loyalty.managmentbean;

import java.io.Serializable;
import java.util.List;
import it.cascino.loyalty.model.AsLyanc0f;
import it.cascino.loyalty.utils.Resources;
import it.cascino.loyalty.dao.AsLyanc0fDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class AsLyanc0fDaoMng implements AsLyanc0fDao, Serializable{
	private static final long serialVersionUID = 1L;
	private Resources res = new Resources();
	private EntityManager em = res.getEmAs();
	private EntityTransaction utx = res.getUtxAs();	
	
	Logger log = Logger.getLogger(AsLyanc0fDaoMng.class);
	
	@SuppressWarnings("unchecked")
	public List<AsLyanc0f> getAll(){
		List<AsLyanc0f> a = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsLyanc0f.findAll");
				a = (List<AsLyanc0f>)query.getResultList();
			}catch(NoResultException e){
				a = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return a;
	}
	
	public void salva(AsLyanc0f a){
		try{
			try{
				em.clear();
				utx.begin();
				log.info("salva: " + a.toString());
				em.persist(a);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void aggiorna(AsLyanc0f a){
		try{
			try{
				utx.begin();
				log.info("aggiorna: " + a.toString());
				em.merge(a);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public void elimina(AsLyanc0f aElimina){
		try{
			try{
				utx.begin();
				AsLyanc0f a = em.find(AsLyanc0f.class, aElimina.getLyean());
				log.info("elimina: " + a.toString());
				em.remove(a);
			}finally{
				utx.commit();
			}
		}catch(Exception e){
			log.fatal(e.toString());
		}
	}
	
	public AsLyanc0f getAnagConLyean(String lyean){
		AsLyanc0f a = null;
		try{
			try{
				utx.begin();
				em.clear();
				Query query = em.createNamedQuery("AsLyanc0f.findByLyean");
				query.setParameter("lyean", lyean);
//				a = (AsLyanc0f)query.getSingleResult();
				a = (AsLyanc0f)query.getResultList().get(0);
			}catch(NoResultException e){
				a = null;
			}catch(IndexOutOfBoundsException iob){
				a = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return a;
	}
	
	public AsLyanc0f getAnagConLycli(Integer lycli){
		AsLyanc0f a = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsLyanc0f.findByLycli");
				query.setParameter("lycli", lycli);
//				a = (AsLyanc0f)query.getSingleResult();
				a = (AsLyanc0f)query.getResultList().get(0);
			}catch(NoResultException e){
				a = null;
			}catch(IndexOutOfBoundsException iob){
				a = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return a;
	}
	
	@SuppressWarnings("unchecked")
	public List<AsLyanc0f> getAnagConCognNome(String cogn, String nome){
		List<AsLyanc0f> a = null;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsLyanc0f.findByCognNom");
				query.setParameter("lycog", cogn);
				query.setParameter("lynom", nome);
				a = (List<AsLyanc0f>)query.getResultList();
			}catch(NoResultException e){
				a = null;
			}
			utx.commit();
		}catch(Exception e){
			log.fatal(e.toString());
		}
		return a;
	}
	
	public String updateAnagrafica(AsLyanc0f a){
		Integer c = -1;
		try{
			try{
				utx.begin();
				Query query = em.createNamedQuery("AsLyanc0f.updateAnagrafica");
				query.setParameter("lycli", a.getLycli());
				query.setParameter("lyean", a.getLyean());
				query.setParameter("lypdv", a.getLypdv());
				query.setParameter("lynom", a.getLynom());
				query.setParameter("lycog", a.getLycog());
				query.setParameter("lydna", a.getLydna());
				query.setParameter("lyind", a.getLyind());
				query.setParameter("lynci", a.getLynci());
				query.setParameter("lycap", a.getLycap());
				query.setParameter("lyloc", a.getLyloc());
				query.setParameter("lypro", a.getLypro());
				query.setParameter("lypry", a.getLypry());
				query.setParameter("lypun", a.getLypun());
				query.setParameter("lysta", a.getLysta());
				query.setParameter("lyste", a.getLyste());
				query.setParameter("lybuo", a.getLybuo());
				query.setParameter("lydup", a.getLydup());
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
