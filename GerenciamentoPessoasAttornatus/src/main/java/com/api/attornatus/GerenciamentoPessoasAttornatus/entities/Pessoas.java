package com.api.attornatus.GerenciamentoPessoasAttornatus.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pessoas {

	
	private String nome;
	private String email; 
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataNascimento;
	
	
	private Enderecos enderecos; 
	
	
}
