package com.crud.crudBasico;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.crud.crudBasico.rh.dominio.Pessoa;
import com.crud.crudBasico.rh.dominio.PessoaRepositorio;



@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {
	
	@Autowired
	public PessoaRepositorio pessoaRepo;

	@Override
	public void run(String... args) throws Exception{
		
		Pessoa pes1 = new Pessoa("Michel");
		pes1.setDataNascimento(LocalDate.of(2021, 01, 01));
		pes1.setEmail("michel@gmail.com");
		
		Pessoa pes2 = new Pessoa("Carla");
		pes1.setDataNascimento(LocalDate.of(2021, 02, 02));
		pes1.setEmail("carla@gmail.com");
		
		pessoaRepo.save(pes1);
		pessoaRepo.save(pes2);
		
	}
	

}
