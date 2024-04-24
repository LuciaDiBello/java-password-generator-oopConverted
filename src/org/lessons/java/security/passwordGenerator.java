package org.lessons.java.security;

//La classe passwordGenerator è composta da un campo per la password, un campo per l'utente, 
//dal costruttore e da un metodo che permette di generare la password
public class passwordGenerator {
	//Campo
	public String pw;
	public Utente u;
	
	//Metodo 
	//Il metodo permette di generare la password prendendo come parametri di input i dati dell'utente
	//public String generaPassword(String nome, String cognome, String colorePreferito, int giorno, int mese, int anno)
	 //{
		//int somma = giorno + mese + anno;
		//this.pw= nome + cognome + colorePreferito + somma;  //concatena le stringhe, (converte somma in una stringa)
		//return this.pw;
	  //}
	
	//BONUS
	//Costruttore
	public passwordGenerator (Utente u) {
	      this.u = u;
      }
	//Metodo 
	public String generaPassword()
	 { 
		int somma = this.u.giorno + this.u.mese + this.u.anno;
		this.pw= this.u.nome + this.u.cognome + this.u.colorePreferito + somma;
		return this.pw;
	   }
	}

