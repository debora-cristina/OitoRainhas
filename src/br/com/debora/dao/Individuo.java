package br.com.debora.dao;

import java.util.List;


public interface Individuo 
{
	public List<Individuo> getMutantes();
	public List<Individuo> Recombinar(Individuo ind);
	public double getFitness();

}
