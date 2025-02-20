package com.fedi.InduVizor_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fedi.InduVizor_1.entities.Causes;

import com.fedi.InduVizor_1.repos.CausesRepository;


@Service
public class CausesServiceImpl implements CausesService{

	@Autowired
	CausesRepository  causesRepository;
	
	@Override
	public Causes saveCauses(Causes ca) {
		return causesRepository.save(ca);
	}

	@Override
	public Causes updateCauses(Causes ca) {
		return causesRepository.save(ca);
	}

	@Override
	public void deleteCauses(Causes ca) {
		causesRepository.delete(ca);
		
	}

	@Override
	public void deleteCausesById(Long id) {
		causesRepository.deleteById(id);
		
	}

	@Override
	public Causes getCauses(Long id) {
		return causesRepository.findById(id).get();
	}

	@Override
	public List<Causes> getAllCauses() {
		 return causesRepository.findAll();
	}

}
