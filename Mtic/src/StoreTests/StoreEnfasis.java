package StoreTests;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Domain.Alumno;
import Domain.Enfasis;
import Domain.Promocion;


public class StoreEnfasis {
	
	public static void main(String[] args) {  
		
        //creating configuration object  
        Configuration cfg=new Configuration();  
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
          
        //creating session factory object  
        SessionFactory factory=cfg.buildSessionFactory();  
          
        //creating session object  
        Session session=factory.openSession();  
          
        //creating transaction object  
        Transaction t=session.beginTransaction(); 
	    
	    List<Promocion> listPromo1 = new ArrayList<Promocion>() ;
	    listPromo1.add(new Promocion("2014","No hay1 "));
	    listPromo1.add(new Promocion("2015","No hay2 "));
	    listPromo1.add(new Promocion("2016","No hay3 "));
	    listPromo1.add(new Promocion("2017","No hay4 "));
	    
	    Enfasis enfa= new Enfasis();
	    
	    enfa.setNombre("Ingenieria de Software");
	    enfa.setObservaciones("Ninguna");
	    enfa.setPromocion(listPromo1);

	    
/*	  for (int i = 0; i < listPromo.size(); i++) {
		  System.out.println(listPromo.get(i).getId());
		  System.out.println(listPromo.get(i).getNombre());
		  System.out.println(listPromo.get(i).getObservaciones());
	}
    
	    
	    System.out.println(enfa.getId());
	    System.out.println(enfa.getNombre());
	    System.out.println(enfa.getObservaciones());
	    System.out.println(enfa.getPromocion());
	    
	    
*/		    
	  
	    
	
	    session.persist(enfa);  
	    
	      
	    t.commit();  
	    session.close();  
	    System.out.println("success"); 
	      

	    
	}
}
