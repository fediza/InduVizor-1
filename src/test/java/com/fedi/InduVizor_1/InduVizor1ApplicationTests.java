package com.fedi.InduVizor_1;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fedi.InduVizor_1.entities.IP;
import com.fedi.InduVizor_1.entities.Obeya;
import com.fedi.InduVizor_1.repos.IPRepository;
import com.fedi.InduVizor_1.repos.ObeyaRepository;


@SpringBootTest
public class InduVizor1ApplicationTests {

	@Autowired 
	private ObeyaRepository obeyaRepository; 
	
    @Autowired  
    private IPRepository iPRepository; 

	@Test 
	public void testCreateTache() { 
	Obeya Ob = new Obeya("tache A","Projet X","Fedi","en cours",new Date(),10,5,true); 
	obeyaRepository.save(Ob); 
	} 

	@Test 
	public void testFindTache() 
	{ 
	Obeya Ob = obeyaRepository.findById(4L).get();     
	System.out.println(Ob); 
	}
	@Test 
	public void testUpdateTache() 
	{ 
	Obeya Ob = obeyaRepository.findById(4L).get(); 
	Ob.setDelaiEstime(7); 
	obeyaRepository.save(Ob); 
	}
	@Test 
	 public void testDeleteTache() 
	  { 
		obeyaRepository.deleteById(4L);; 
	    
	  } 
	 
	    
	@Test 
	 public void testListerTousTache() 
	  { 
	   List<Obeya>  Obs = obeyaRepository.findAll();   
	   for (Obeya Ob : Obs) 
	   { 
	    System.out.println(Ob); 
	   }   
	  }
	
	@Test 
	public void testCreateIP() { 
	IP ip = new IP("A","X","Y","Z",new Date(),"Y",true); 
	iPRepository.save(ip); 
	} 
	
	 @Test
	    public void testFindObeyaByResponsable() {
	        List<Obeya> ob = obeyaRepository.findByResponsable("Fedi");
	        
	        
	        for (Obeya obs : ob) {
	           
	            System.out.println(obs);
	        }
	    }
	
}
