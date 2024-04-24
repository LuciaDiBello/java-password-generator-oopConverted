package org.lessons.java.security;

//La classe Utente è composta dai campi nome, cognome, colorePreferito, giorno, mese, anno 
//e dal costruttore che permette di inizializzare i campi con i dati di input acquisiti da tastiera
public class Utente {
  //Campi
	public String nome;
	public String cognome;
	public String colorePreferito;
	public int giorno;
	public int mese;
	public int anno;
	//Costruttore
	public Utente(String nome, String cognome, String colorePreferito, int giorno, int mese, int anno){
		this.nome = nome;
		this.cognome = cognome;
		this.colorePreferito = colorePreferito;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
         }
}