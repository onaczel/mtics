   
      
    import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

import Domain.Alumno;
      
    public class StoreAlumno {  
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
              
        Alumno alum=new Alumno();  
   
        alum.setNombre("Santiago2");
        alum.setApellido("Lezcano2");
        alum.setNro_documento(4562);       
        alum.setObservaciones("ninguna");
          
        session.persist(alum);//persisting the object  
          
        t.commit();//transaction is committed  
        session.close();  
          
        System.out.println("successfully saved");  
          
    }  
    }  