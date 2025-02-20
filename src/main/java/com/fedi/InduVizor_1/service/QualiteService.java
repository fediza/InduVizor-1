package com.fedi.InduVizor_1.service;

import java.util.List;

import com.fedi.InduVizor_1.entities.Qualite;


public interface QualiteService {

	Qualite saveQualite(Qualite qu); 
	Qualite updateQualite(Qualite qu); 
	  void deleteQualite(Qualite qu); 
	    void deleteQualiteById(Long id); 
	    Qualite getQualite(Long id); 
	  List<Qualite> getAllQualite();
}