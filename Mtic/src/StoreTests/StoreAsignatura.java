package StoreTests;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Domain.Alumno;
import Domain.Asignatura;
import Domain.Promocion;

public class StoreAsignatura {
	
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
        
        List<Promocion> promociones = new ArrayList<Promocion>();
        
        
        Asignatura materia = new Asignatura();
        materia.setNombre("base de datos");
        materia.setCargaHoraria(20);
        materia.setActa1fecha(null);
        materia.setActa1Numero(110);
        materia.setActa2fecha(null);
        materia.setActa2Numero(112);
        
        materia.setObservaciones("Niguna observacion");
        
        
        
        
        session.persist(materia);//persisting the object  
          
        t.commit();//transaction is committed  
        session.close();  
          
        System.out.println("successfully saved");  
          
    } 
}
