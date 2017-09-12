package com.maven.FilRouge.presentation;

import com.maven.FilRouge.service.AuditeurImpl;
import com.maven.FilRouge.service.ConseillerImpl;
import com.maven.FilRouge.service.GerantImpl;
import com.maven.FilRouge.service.IAuditeur;
import com.maven.FilRouge.service.IConseiller;
import com.maven.FilRouge.service.IGerant;

public class Lanceur {

	public static void main(String[] args) {
	
		IAuditeur ia = new AuditeurImpl();
		IConseiller ic = new ConseillerImpl();
		IGerant ig = new GerantImpl();
		
		/*Fenetre f = new Fenetre();
		f.setVisible(true);*/
	}

}
