package org.istv.spring.AirBnB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.LocatairesCreationDto;
import model.Appartement;
import model.Locataire;
import service.BienService;
import service.LocataireService;

@Controller
@RequestMapping("/locataires")
public class LocataireController {
	
	@Autowired
	private LocataireService locataireService;
	@Autowired
	private BienService bienService;
	Locataire l1 = new Locataire();
	Locataire l2 = new Locataire();
	Locataire l3 = new Locataire();
	Appartement a1 = new Appartement();
	Appartement a2 = new Appartement();
	Appartement a3 = new Appartement();
	Appartement a4 = new Appartement();
	Appartement a5 = new Appartement();
	Appartement a6 = new Appartement();
	LocatairesCreationDto locatairesFormA = new LocatairesCreationDto();
	
	
	@GetMapping("/all")
	public String showAll(Model model) {
		l1.setId(1);
		l1.setName("Guillaume");
		l2.setId(2);
		l2.setName("Jerome");
		l3.setId(3);
		l3.setName("Olivier");
		a1.setId(1);
		a1.setPrix(14.5f);
		a1.setAdresse("91 rue pierre semard");
		a1.setParking(true);
		a2.setId(2);
		a2.setPrix(14.5f);
		a2.setAdresse("91 rue pierre semard");
		a2.setParking(false);
		l1.addBien(a1);
		l1.addBien(a2);
		a3.setId(3);
		a3.setPrix(180.41f);
		a3.setAdresse("8 rue de la paix");
		a3.setParking(true);
		l2.addBien(a3);
		locatairesFormA.addLocataire(l1);
		locatairesFormA.addLocataire(l2);
		locatairesFormA.addLocataire(l3);
		bienService.saveAll(l1.getBiens());
		bienService.saveAll(l2.getBiens());
		locataireService.saveAll(locatairesFormA.getLocataires());
		model.addAttribute("locataires", locataireService.findAll());
		model.addAttribute("biens", bienService.findAll());
		return "allLocataire";
	}
	
	@PostMapping("/save")
	public String saveLocataires(@ModelAttribute LocatairesCreationDto form, Model model) {
		locataireService.saveAll(form.getLocataires());
		
		model.addAttribute("locataires", locataireService.findAll());
		return "redirect:/locataires/all";
	}
	
	@GetMapping("/create")
	public String showCreateForm(Model model) {
		LocatairesCreationDto locatairesForm = new LocatairesCreationDto();
		for(int i = 1; i <= 3; i++ ) {
			locatairesForm.addLocataire(new Locataire());
		}
		
		model.addAttribute("form", locatairesForm);
		
		return "createLocatairesForm";
	}

}
