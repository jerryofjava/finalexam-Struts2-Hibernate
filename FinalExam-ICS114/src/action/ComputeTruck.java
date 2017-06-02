package action;

import model.TruckBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ComputeTruck extends ActionSupport implements ModelDriven<TruckBean> {

	TruckBean t=new TruckBean();
	
	int truck[]={1, 2, 3, 4, 5, 6, 7};
	int truckWeight[]={50000, 25000, 20000, 35000, 40000, 25000, 30000};
	
	public String execute()
	{
		if(t.getTruckNo()==truck[0])
		{
			t.setWeightLimit(truckWeight[0]);
			t.setStatus("Success");
			
			if(t.getWeight()>truckWeight[0])
			{
				t.setStatus("Exceeded");
				
				SessionFactory sessionFactory = 
						new Configuration().configure().buildSessionFactory();
					
					Session session = sessionFactory.openSession();
					org.hibernate.Transaction tx = session.beginTransaction();
					
					try{
						session.save(t);
						tx.commit();
					} catch(HibernateException he){
						tx.rollback();
					}
				
				return ERROR;	
			}
		}
		
		if(t.getTruckNo()==truck[1])
		{
			t.setWeightLimit(truckWeight[1]);
			t.setStatus("Success");
			
			if(t.getWeight()>truckWeight[1])
			{
				t.setStatus("Exceeded");
				
				SessionFactory sessionFactory = 
						new Configuration().configure().buildSessionFactory();
					
					Session session = sessionFactory.openSession();
					org.hibernate.Transaction tx = session.beginTransaction();
					
					try{
						session.save(t);
						tx.commit();
					} catch(HibernateException he){
						tx.rollback();
					}
				
				return ERROR;	
			}
		}
		
		if(t.getTruckNo()==truck[2])
		{
			t.setWeightLimit(truckWeight[2]);
			t.setStatus("Success");
			
			if(t.getWeight()>truckWeight[2])
			{
				t.setStatus("Exceeded");
				
				SessionFactory sessionFactory = 
						new Configuration().configure().buildSessionFactory();
					
					Session session = sessionFactory.openSession();
					org.hibernate.Transaction tx = session.beginTransaction();
					
					try{
						session.save(t);
						tx.commit();
					} catch(HibernateException he){
						tx.rollback();
					}
				
				return ERROR;	
			}
		}
		
		if(t.getTruckNo()==truck[3])
		{
			t.setWeightLimit(truckWeight[3]);
			t.setStatus("Success");
			
			if(t.getWeight()>truckWeight[3])
			{
				t.setStatus("Exceeded");
				
				SessionFactory sessionFactory = 
						new Configuration().configure().buildSessionFactory();
					
					Session session = sessionFactory.openSession();
					org.hibernate.Transaction tx = session.beginTransaction();
					
					try{
						session.save(t);
						tx.commit();
					} catch(HibernateException he){
						tx.rollback();
					}
				
				return ERROR;	
			}
		}
		
		if(t.getTruckNo()==truck[4])
		{
			t.setWeightLimit(truckWeight[4]);
			t.setStatus("Success");
			
			if(t.getWeight()>truckWeight[4])
			{
				t.setStatus("Exceeded");
				
				SessionFactory sessionFactory = 
						new Configuration().configure().buildSessionFactory();
					
					Session session = sessionFactory.openSession();
					org.hibernate.Transaction tx = session.beginTransaction();
					
					try{
						session.save(t);
						tx.commit();
					} catch(HibernateException he){
						tx.rollback();
					}
				
				return ERROR;	
			}
		}
		
		if(t.getTruckNo()==truck[5])
		{
			t.setWeightLimit(truckWeight[5]);
			t.setStatus("Success");
			
			if(t.getWeight()>truckWeight[5])
			{
				t.setStatus("Exceeded");
				
				SessionFactory sessionFactory = 
						new Configuration().configure().buildSessionFactory();
					
					Session session = sessionFactory.openSession();
					org.hibernate.Transaction tx = session.beginTransaction();
					
					try{
						session.save(t);
						tx.commit();
					} catch(HibernateException he){
						tx.rollback();
					}
				
				return ERROR;	
			}
		}
		
		if(t.getTruckNo()==truck[6])
		{
			t.setWeightLimit(truckWeight[6]);
			t.setStatus("Success");
			
			if(t.getWeight()>truckWeight[6])
			{
				t.setStatus("Exceeded");
				
				SessionFactory sessionFactory = 
						new Configuration().configure().buildSessionFactory();
					
					Session session = sessionFactory.openSession();
					org.hibernate.Transaction tx = session.beginTransaction();
					
					try{
						session.save(t);
						tx.commit();
					} catch(HibernateException he){
						tx.rollback();
					}
				
				return ERROR;	
			}
		}
		
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
			
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			
			try{
				session.save(t);
				tx.commit();
			} catch(HibernateException he){
				tx.rollback();
			}
		
		return SUCCESS;
	}
	
	@Override
	public void validate(){
		
		if(Integer.toString(t.getTruckNo()).trim().length()==0)
		{
			addFieldError("truckNo","Missing entry for truck number");
		}
		if(Integer.toString(t.getWeight()).trim().length()==0)
		{
			addFieldError("weight","Missing entry for truck weight");
		}
		if(t.getTruckNo()<=0||t.getTruckNo()>7)
		{
			addFieldError("truckNo","Truck number does not exist");
		}
		if(t.getWeight()<0)
		{
			addFieldError("weight","Weight cannot be negative");
		}
	}
	
	@Override
	public TruckBean getModel() {
		
		return t;
	}
	
}
