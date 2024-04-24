package org.lessons.java.security;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        	//Si acquisiscono da tastiera i dati dell'utente
 		System.out.print("Inserisci il nome: ");
		String nome = input.nextLine();
		System.out.println("Il nome è: " + nome);
		
		System.out.print("Inserisci il cognome: ");
		String cognome = input.nextLine();
		System.out.println("Il cognome è: " + cognome);
	
		System.out.print("Inserisci il colore preferito: ");
		String colorePreferito = input.nextLine();
		System.out.println("Il colore preferito è: " + colorePreferito);
		
		System.out.print("Inserisci il giorno: ");
		int giorno = input.nextInt();
		System.out.println("Il giorno è: " + giorno);
		
		System.out.print("Inserisci il mese: ");
		int mese = input.nextInt();
		System.out.println("Il mese è: " + mese);
		
		System.out.print("Inserisci l'anno: ");
		int anno = input.nextInt();
		System.out.println("L'anno è: " + anno);
		
		//Si definisce l'oggetto u della classe Utente
		//Si invoca il costruttore passando come parametri i dati acquisiti in input
		Utente u= new Utente(nome, cognome, colorePreferito, giorno, mese, anno);
		
		//Si definisce l'oggetto p della classe passwordGenerator
		//passwordGenerator p = new passwordGenerator();
		//Si invoca il metodo generaPassword sull'istanza p per generare la password
		//String pwGenerata = p.generaPassword(nome, cognome, colorePreferito, giorno, mese, anno);
		//System.out.print("La password generata è: " + pwGenerata);
		
		//BONUS
		//Si invoca il costruttore passando l'oggetto utente
		passwordGenerator p = new passwordGenerator(u);
		String pwGenerata = p.generaPassword();
		System.out.print("La password generata è: " + pwGenerata);
		}
}

