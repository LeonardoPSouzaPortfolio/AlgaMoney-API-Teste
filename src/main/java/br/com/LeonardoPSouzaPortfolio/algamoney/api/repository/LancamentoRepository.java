package br.com.LeonardoPSouzaPortfolio.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoPSouzaPortfolio.algamoney.api.model.Lancamento;
import br.com.LeonardoPSouzaPortfolio.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>,  LancamentoRepositoryQuery{

}
	