package com.DPC.spring.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.DPC.spring.entities.Departement;
import com.DPC.spring.repositories.DepartementRepository;
import com.DPC.spring.services.IDepartementService;
@Service
public class IDepartementServiceImpl implements IDepartementService {
@Autowired
DepartementRepository deprepos ; 
	public String Ajout(Departement d) {
		Departement dexiste = this.deprepos.findByNom(d.getNom());
		if(dexiste==null) {
			this.deprepos.save(d);
			return "true"; 
		}
		else {
			return "false" ;
		}
		}


}
