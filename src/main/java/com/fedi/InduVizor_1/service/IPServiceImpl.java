package com.fedi.InduVizor_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fedi.InduVizor_1.entities.IP;
import com.fedi.InduVizor_1.repos.IPRepository;


@Service
public class IPServiceImpl implements IPService{

	@Autowired
	IPRepository  IPRepository;
	
	@Override
	public IP saveIP(IP I) {
		return IPRepository.save(I);
	}

	@Override
	public IP updateIP(IP I) {
		return IPRepository.save(I);
	}

	@Override
	public void deleteIP(IP I) {
		IPRepository.delete(I);
		
	}

	@Override
	public void deleteIPById(Long id) {
		IPRepository.deleteById(id);
		
	}

	@Override
	public IP getIP(Long id) {
		return IPRepository.findById(id).get();
	}

	@Override
	public List<IP> getAllIP() {
		 return IPRepository.findAll();
	}}