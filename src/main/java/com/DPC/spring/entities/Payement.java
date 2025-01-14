package com.DPC.spring.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	@Builder
	public class Payement {
	@Id
	
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id; // Correct, this works with MongoDB for String IDs.
	@ManyToOne
	Utilisateur user ;
	    private LocalDate date;
	    private String file;
	    private Double amount;

	    @Enumerated(EnumType.STRING)
	    private Typepay typepay;

	    @Enumerated(EnumType.STRING)
	    private Statuspay statuspay;

	    @Enumerated(EnumType.STRING)
	    private Modepay modepay;

	    @Enumerated(EnumType.STRING)
	    private ModalitePay modalitePay;
	}
