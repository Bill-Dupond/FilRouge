package com.maven.FilRouge.service;

import com.maven.FilRouge.metier.Agence;
import com.maven.FilRouge.metier.Conseiller;
import com.maven.FilRouge.metier.Employe;
import com.maven.FilRouge.metier.Gerant;
/**
 * Interface faisant le lien entre la couche pr�sentation et la couche dao pour les g�rants
 * @author Alexandre
 *
 */
public interface IGerant extends IConseiller {
	
	public void creerConseiller(Conseiller c);
	public void lireConseiller(Conseiller c);
	public void modifierConseiller(Conseiller c);
	public void supprimerConseiller(Conseiller c);
	public void attribuerAgence(Agence a, Employe e);
	public void ajouterEmploye(Employe e, Agence a);
	public void attribuerGerant(Gerant g, Conseiller c);
	public void ajouterConseiller(Conseiller c, Gerant g);
	
}
