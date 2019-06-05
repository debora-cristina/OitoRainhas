package br.com.debora.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.debora.dao.Individuo;

public class OitoRainhasInd implements Individuo
{
	/*ordenar por fitness*/
	
	double fit;
	int vetorRainhas[] = new int[8];
	
	public OitoRainhasInd()
	{
		fit = -1;
		
		//Definição do Individuo
		for(int i = 0; i < vetorRainhas.length; i++)
		{
			vetorRainhas[i] = (int)Math.round(Math.random()*7);
			//System.out.println("\t"+vetor[i]);
		}
		
		/*for(int i = 0; i<8; i++){
			r = (float)Math.round();
			if(r<txMutacao){ //txMut atributo fixo entre 0 e 2
				r2 = Math.random();
				if(r2 > 0.5){
					m.vetor[i] = this.vetor[i]+1;
				}else{
					m.vetor[i] = this.vetor[i]-1;
				}
			}else{
				vetor[i] = this.vetor[i];
			}
		}*/
	}
	
	public List<Individuo> Mutacao()
	{
		List<Individuo> mutante = new ArrayList<Individuo>();
		
		OitoRainhasInd m = new OitoRainhasInd();
		
		
		for(int i = 0; i < 8; i++)
		{
			m.vetorRainhas[i] = this.vetorRainhas[i];
			double r = Math.random();
			
			if(r < 0.5)
			{ //taxa de Mutação( atributo fixo entre 0 e 2)
				if(r > 0.5)
				{
					m.vetorRainhas[i]= this.vetorRainhas[i]+1;
				}
				else
				{
					m.vetorRainhas[i]= this.vetorRainhas[i]-1;
				}
			}
			else
			{
				vetorRainhas[i] = this.vetorRainhas[i];
			}
		}
		mutante.add(m);
		
		return mutante;
	}
	
	public List<Individuo> Recombinar(Individuo ind)
	{
		
		OitoRainhasInd IndObj = (OitoRainhasInd)ind;
		OitoRainhasInd filho1 = new OitoRainhasInd();
		OitoRainhasInd filho2 = new OitoRainhasInd();
		
		for(int i = 0; i < 4; i++)
		{
			
		}
		return null;
	}
	
	
	public double getFitness()
	{
		if(this.fit < 0)
		{
		
		}
		
		return this.fit;	
	}
	
	public List<Individuo> getMutantes()
	{
		
		return null;
	}




}
