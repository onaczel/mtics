package Domain;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Domain.Alumno;
import Domain.Promocion;


public class StorePromocion {
	
	public static void main(String[] args) {  
		
        //creacion de configuration object  
        Configuration cfg=new Configuration();  
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
          
        //creacion de session factory object  
        SessionFactory factory=cfg.buildSessionFactory();  
          
        //creacion de session object  
        Session session=factory.openSession();  
          
        //creacion de transaction object  
        Transaction t=session.beginTransaction(); 
        
       
	    //creacion de alumnos
        Alumno alum1 = new Alumno();
        alum1.setNombre("Santiago");
        alum1.setApellido("Lezcano");
        alum1.setNro_documento(4758);
        alum1.setObservaciones("nada");
        
        Alumno alum2 = new Alumno();
        alum2.setNombre("Santiago2");
        alum2.setApellido("Lezcano2");
        alum2.setNro_documento(47582);
        alum2.setObservaciones("nada2");
        
        Alumno alum3 = new Alumno();
        alum3.setNombre("Santiago3");
        alum3.setApellido("Lezcano3");
        alum3.setNro_documento(47583);
        alum3.setObservaciones("nada3");
        
        //creacion de lista de alumnos
        List<Alumno> listAlu = new ArrayList<Alumno>();
        
        //se añaden los alumnos a la lista de alumnos
        listAlu.add(alum1);
        listAlu.add(alum2);
        listAlu.add(alum3);
        
        //creacion de promocion
        Promocion promo= new Promocion("2015", "Ninguna");
        //se añade a promocion una lista de alumnos
        promo.setAlumnos(listAlu);
	  
	    
        //persistencia del objeto
        
	    session.persist(promo); 	      
	    t.commit();  
	    session.close();  
	    System.out.println("success"); 
	      

	    
	}
}
