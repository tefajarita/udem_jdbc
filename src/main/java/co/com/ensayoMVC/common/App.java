package co.com.ensayoMVC.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.jdbc.dao.LugarDAO;
import co.com.ensayoMVC.jdbc.entity.Lugar;

public class App {
	
	private static ApplicationContext context;

	public static void main (String args[]){
		context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
    	// Se obtiene el servicio que implementa los servicios de la base de datos, patron factory
        LugarDAO lugarDAO = (LugarDAO) context.getBean("lugarDAO");
        
        //se hace la consulta
        Lugar lugar1= lugarDAO.findLugarById(1);
        System.out.println(lugar1.getNombre()+" "+lugar1.getDireccion()+
        				    lugar1.getDescripcion()+" ");
		
        
        
        
	}

}
