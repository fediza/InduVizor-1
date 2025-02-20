package com.fedi.InduVizor_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fedi.InduVizor_1.entities.Qualite;
import com.fedi.InduVizor_1.repos.QualiteRepository;


@Service
public class QualiteServiceImpl implements QualiteService{

	@Autowired
	QualiteRepository  qualiteRepository;
	
	@Override
	public Qualite saveQualite(Qualite qu) {
		return qualiteRepository.save(qu);
	}

	@Override
	public Qualite updateQualite(Qualite qu) {
		return qualiteRepository.save(qu);
	}

	@Override
	public void deleteQualite(Qualite qu) {
		qualiteRepository.delete(qu);
		
	}

	@Override
	public void deleteQualiteById(Long id) {
		qualiteRepository.deleteById(id);
		
	}

	@Override
	public Qualite getQualite(Long id) {
		return qualiteRepository.findById(id).get();
	}

	@Override
	public List<Qualite> getAllQualite() {
		 return qualiteRepository.findAll();
	}

}
