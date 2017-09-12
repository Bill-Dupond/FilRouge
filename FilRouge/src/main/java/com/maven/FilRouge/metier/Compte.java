package com.maven.FilRouge.metier;
/**
 * Classe de gestion des comptes
 * @author Alexandre
 *
 */
public abstract class Compte {
	private long numCompte;
	private float solde;
	private String dateOuverture;
	private Client client;
	private CB carte;
	
	public CB getCarte() {
		return carte;
	}
	public void setCarte(CB carte) {
		this.carte = carte;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public long getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public String getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
}