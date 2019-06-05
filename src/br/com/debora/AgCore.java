package br.com.debora;

import java.util.ArrayList;
import java.util.List;

import br.com.debora.dao.Individuo;
import br.com.debora.dao.IndividuoFactory;

public class AgCore {

	/**
	 * @param args
	 */
	
	public void Processar(IndividuoFactory f,int qtdGeracao ,int tamGeracao,int txMutacao)
	{
		List<Individuo> pop = new ArrayList(tamGeracao);
		
		for ( int i = 0 ; i < qtdGeracao ; i++)
		{
			Individuo ind= f.getNewIndividuo();
			pop.add(ind);
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
