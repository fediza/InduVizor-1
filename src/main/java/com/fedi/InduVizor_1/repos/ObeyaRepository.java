package com.fedi.InduVizor_1.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fedi.InduVizor_1.entities.Obeya;

public interface ObeyaRepository extends JpaRepository<Obeya, Long> {

	List<Obeya> findByResponsable(String resp);
	List<Obeya> findByProjet(String proj);
	List<Obeya> findByStatus(String stat);
	List<Obeya> findBylivrableJalon(boolean livr);
	
}
