package br.com.LeonardoPSouzaPortfolio.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoPSouzaPortfolio.algamoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
	