package br.com.LeonardoPSouzaPortfolio.algamoney.api.repository.lancamento;

import java.util.List;

import br.com.LeonardoPSouzaPortfolio.algamoney.api.model.Lancamento;
import br.com.LeonardoPSouzaPortfolio.algamoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
