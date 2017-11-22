package br.com.LeonardoPSouzaPortfolio.algamoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.LeonardoPSouzaPortfolio.algamoney.api.model.Lancamento;
import br.com.LeonardoPSouzaPortfolio.algamoney.api.model.Pessoa;
import br.com.LeonardoPSouzaPortfolio.algamoney.api.repository.LancamentoRepository;
import br.com.LeonardoPSouzaPortfolio.algamoney.api.repository.PessoaRepository;
import br.com.LeonardoPSouzaPortfolio.algamoney.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if (pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}
	
}