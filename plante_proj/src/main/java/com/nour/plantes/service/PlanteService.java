package com.nour.plantes.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nour.plantes.entities.Plante;

public interface PlanteService {
	Plante savePlante(Plante p);
	Plante updatePlante(Plante p);
	void deletePlante(Plante p);
	 void deletePlanteById(Long id);
	 Plante getPlante(Long id);
	List<Plante> getAllPlantes();
	
	Page<Plante> getAllPlantesParPage(int page, int size);

}
