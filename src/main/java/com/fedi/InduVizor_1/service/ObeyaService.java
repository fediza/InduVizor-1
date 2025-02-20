package com.fedi.InduVizor_1.service;

import java.util.List;

import com.fedi.InduVizor_1.entities.Obeya;

public interface ObeyaService {

	 Obeya saveTache(Obeya Ob); 
	 Obeya updateTache(Obeya Ob); 
	  void deleteTache(Obeya Ob); 
	    void deleteTacheById(Long id); 
	    Obeya getTache(Long id); 
	  List<Obeya> getAllTache();
}
