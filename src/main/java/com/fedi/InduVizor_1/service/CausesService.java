package com.fedi.InduVizor_1.service;

import java.util.List;

import com.fedi.InduVizor_1.entities.Causes;


public interface CausesService {

	Causes saveCauses(Causes ca); 
	Causes updateCauses(Causes ca); 
	  void deleteCauses(Causes ca); 
	    void deleteCausesById(Long id); 
	    Causes getCauses(Long id); 
	  List<Causes> getAllCauses();
}