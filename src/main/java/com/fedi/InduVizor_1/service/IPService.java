package com.fedi.InduVizor_1.service;

import java.util.List;

import com.fedi.InduVizor_1.entities.IP;


public interface IPService {

	IP saveIP(IP ip); 
	IP updateIP(IP ip); 
	  void deleteIP(IP ip); 
	    void deleteIPById(Long id); 
	    IP getIP(Long id); 
	  List<IP> getAllIP();
}