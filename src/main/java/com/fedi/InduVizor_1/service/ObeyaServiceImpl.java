package com.fedi.InduVizor_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fedi.InduVizor_1.entities.Obeya;
import com.fedi.InduVizor_1.repos.ObeyaRepository;


@Service
public class ObeyaServiceImpl implements ObeyaService{

	@Autowired
	ObeyaRepository  obeyaRepository;
	
	@Override
	public Obeya saveTache(Obeya Ob) {
		return obeyaRepository.save(Ob);
	}

	@Override
	public Obeya updateTache(Obeya Ob) {
		return obeyaRepository.save(Ob);
	}

	@Override
	public void deleteTache(Obeya Ob) {
		obeyaRepository.delete(Ob);
		
	}

	@Override
	public void deleteTacheById(Long id) {
		obeyaRepository.deleteById(id);
		
	}

	@Override
	public Obeya getTache(Long id) {
		return obeyaRepository.findById(id).get();
	}

	@Override
	public List<Obeya> getAllTache() {
		 return obeyaRepository.findAll();
	}

}
