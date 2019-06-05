package br.com.debora.dao.impl;

import br.com.debora.dao.Individuo;
import br.com.debora.dao.IndividuoFactory;

public class OitoRainhasIndFactory implements IndividuoFactory 
{

 public Individuo getNewIndividuo()
 {
	 return new OitoRainhasInd();
 }
 
}
