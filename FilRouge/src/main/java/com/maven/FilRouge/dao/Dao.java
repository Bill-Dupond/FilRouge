package com.maven.FilRouge.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.maven.FilRouge.metier.Agence;
import com.maven.FilRouge.metier.Client;
import com.maven.FilRouge.metier.Compte;
import com.maven.FilRouge.metier.Conseiller;
import com.maven.FilRouge.metier.Employe;
import com.maven.FilRouge.metier.Gerant;
/**
 * 
 * @author 
 *
 */
public class Dao implements Idao {

	@Override
	public void creerClient(Client c) {
		try {
            //  1-charger le pilote
            Class.forName("com.mysql.jdbc.Driver");

            // 2- adresse de la BDD
            String adresse = "jdbc:mysql://localhost:8889/proxybanque";
            String login = "root";
            String mdp = "root";

            // 3- Connection a la BDD
            Connection con = DriverManager.getConnection(adresse, login, mdp);

            

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}

	@Override
	public void lireClient(Client c) {
		System.out.println("Je lis un client en BDD");		
	}

	@Override
	public void modifierClient(Client c) {
		System.out.println("Je modifie un client en BDD");		
	}

	@Override
	public void supprimerClient(Client c) {
		System.out.println("Je supprime un client en BDD");		
	}

	@Override
	public void creerCompte(Compte c) {
		System.out.println("Je cr�e un compte en BDD");		
	}

	@Override
	public void lireCompte(Compte c) {
		System.out.println("Je lis un compte en BDD");		
	}

	@Override
	public void modifierCompte(Compte c) {
		System.out.println("Je modifie un compte en BDD");	
	}

	@Override
	public void supprimerCompte(Compte c) {
		System.out.println("Je supprime un compte en BDD");	
	}

	@Override
	public void faireVirement(Compte c) {
		System.out.println("Je fais un virement depuis un compte en BDD");	
	}

	@Override
	public void simuler() {
		System.out.println("Je simule un placement en BDD");	
	}

	@Override
	public void placerArgent(float montant, Compte c) {
		System.out.println("Je fais un placement");
	}		

	@Override
	public void seconnecter(String login, String mdp) {
		System.out.println("Je me connecte");	
	}

	@Override
	public void auditer() {
		System.out.println("J'audite");	
	}

	@Override
	public void creerConseiller(Conseiller c) {
		System.out.println("Je cr�e un conseiller en BDD");	
	}

	@Override
	public void lireConseiller(Conseiller c) {
		System.out.println("Je lis un conseiller en BDD");	
	}

	@Override
	public void modifierConseiller(Conseiller c) {
		System.out.println("Je modifie un conseiller en BDD");	
	}

	@Override
	public void supprimerConseiller(Conseiller c) {
		System.out.println("Je supprimer un conseiller en BDD");
	}

	@Override
	public void attribuerAgence(Agence a, Employe e) {
		System.out.println("J'attribue une agence � un employ�");		
	}

	@Override
	public void ajouterEmploye(Employe e, Agence a) {
		System.out.println("J'ajoute un employ� � une agence");				
	}

	@Override
	public void ajouterConseiller(Conseiller c, Gerant g) {
		System.out.println("J'ajoute un conseiller � un g�rant");			
	}

	@Override
	public void attribuerGerant(Gerant g, Conseiller c) {
		System.out.println("J'attribue un g�rant � un conseiller");			
	}

	@Override
	public void attribuerClient(Client cl, Compte c) {
		System.out.println("J'attribue un client � un compte");				
	}

	@Override
	public void ajouterCompte(Compte c, Client cl) {
		System.out.println("J'ajoute un compte � un client");				
	}

	@Override
	public void attibuerConseiller(Conseiller c, Client cl) {
		System.out.println("J'attribue un conseiller � un client");						
	}

	@Override
	public void ajouterClient(Client cl, Conseiller c) {
		System.out.println("J'ajoute un client � un conseiller");						
	}

}
