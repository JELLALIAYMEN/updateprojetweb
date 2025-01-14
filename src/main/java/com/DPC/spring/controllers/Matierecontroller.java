package com.DPC.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DPC.spring.entities.Matiere;
import com.DPC.spring.repositories.MatiereRepository;

@RestController
@RequestMapping("matiere")
public class Matierecontroller {
@Autowired
MatiereRepository matrepos ; 
@PostMapping("ajout")
public String ajout(@RequestBody Matiere m) {
	Matiere matiere = this.matrepos.findByNom(m.getNom());
	if(matiere==null) {
		this.matrepos.save(m);
		return "true";
	}
	else {
		return "false" ; 
	}
}

@GetMapping("afficher")
public List<Matiere> afficher(){
	return this.matrepos.findAll() ;
}
}

