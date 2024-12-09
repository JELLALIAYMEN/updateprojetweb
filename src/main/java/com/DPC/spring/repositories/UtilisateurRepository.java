package com.DPC.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.DPC.spring.entities.Classe;
import com.DPC.spring.entities.Utilisateur;
import org.springframework.stereotype.Repository;

@Repository

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
  //  Utilisateur findById (long idUtilisateur) ;
	Utilisateur findByEmail(String email);
	Utilisateur findByLibelle(String libelle);
	List<Utilisateur> findByArchiverIsFalse();
	@Query(nativeQuery=true,value="select COUNT(*) FROM utilisateur where archiver=0")
	Long countuser ();
	@Query(nativeQuery=true,value="select COUNT(*) FROM menmbre")
	Long countmembre ();
	@Query(nativeQuery=true,value="select COUNT(*) FROM joueur")
	Long countjoueur ();
	@Query(nativeQuery=true,value="select COUNT(*) FROM document")
	Long countdocument ();
	List<Utilisateur> findByClasse(Classe c);



	List<Utilisateur> findAllByProfil(String profil);
}
