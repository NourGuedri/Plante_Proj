package com.nour.plantes.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nour.plantes.entities.Plante;

public interface PlanteRepository extends JpaRepository<Plante, Long> {

}
