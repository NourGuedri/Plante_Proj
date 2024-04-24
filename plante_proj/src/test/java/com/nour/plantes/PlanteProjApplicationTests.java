package com.nour.plantes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.nour.plantes.repos.PlanteRepository;
import com.nour.plantes.service.PlanteService;
import com.nour.plantes.entities.Plante;


@SpringBootTest
class PlanteProjApplicationTests {

	@Autowired
	private PlanteRepository planteRepository;
	@Autowired
	private PlanteService planteService;
	@Test
	public void testCreatePlante() {
	Plante pl = new Plante("Cactus","Jaune",new Date());
	planteRepository.save(pl);
	}
	@Test
	public void testFindPlante()
	{
		Plante pl = planteRepository.findById(1L).get();
	System.out.println(pl);
	}
	@Test
	public void testUpdatePlante()
	{
	Plante pl = planteRepository.findById(1L).get();
	pl.setCouleur("Blanche");
	planteRepository.save(pl);
	}
	@Test
	public void testDeletePlante()
	{
		planteRepository.deleteById(1L);;
		}

		@Test
		public void testListerTousPlantes()
		{
		List<Plante> pls = planteRepository.findAll();
		for (Plante pl : pls)
		{
		System.out.println(pl);
		}
		}
		
		@Test
		public void testFindByNomProduitContains()
		{
		Page<Plante> pls = planteService.getAllPlantesParPage(0,2);
		System.out.println(pls.getSize());
		System.out.println(pls.getTotalElements());
		System.out.println(pls.getTotalPages());
		pls.getContent().forEach(p -> {System.out.println(p.toString());
		 });
		/*ou bien
		for (Plante p : pls)
		{
		System.out.println(p);
		} */
		}

}
