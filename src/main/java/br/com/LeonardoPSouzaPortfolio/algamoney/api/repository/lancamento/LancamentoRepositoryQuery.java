package br.com.LeonardoPSouzaPortfolio.algamoney.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.LeonardoPSouzaPortfolio.algamoney.api.model.Lancamento;
import br.com.LeonardoPSouzaPortfolio.algamoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
