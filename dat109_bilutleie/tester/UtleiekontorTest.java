package no.hvl.dat109.tester;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;


import org.junit.Before;
import org.junit.Test;

import no.hvl.dat109.Addresse;
import no.hvl.dat109.Bil;
import no.hvl.dat109.Bilutleiefirma;
import no.hvl.dat109.Farge;
import no.hvl.dat109.Gruppe;
import no.hvl.dat109.Kunde;
import no.hvl.dat109.Reservasjon;
import no.hvl.dat109.Utleiekontor;


public class UtleiekontorTest {
	 
	private Utleiekontor utKontor,innKontor,uk1,uk2;
	private Bil bil,bil1,bil2,bil3;
	private Addresse as,as1,as2,as3,asFirma,asKunde,asKunde1,asKunde2;
	private Farge farge;
	private Gruppe gruppe;
	private Reservasjon res,res1,res2,res3;
	private Date ut;
	private Date inn;
	private int antDager;
	private String klokkeslett;
	private Kunde kunde,kunde1,kunde2;
	private Bilutleiefirma bFirma;
	
	
	@Before
	public void kontor() {
	
		ut = new Date(2020,02,23);
		inn = new Date(2020,03,10);
		
		antDager = 15;
		
		klokkeslett = "12.14";
		
		
	}
	
	
	@Before
	public void addresser() {
		as = new Addresse("123P", 2305,"Bergen");
		as1 = new Addresse("234P",3580,"Forde");
		as2 = new Addresse("567",5610,"Stavanger");
		as3 = new Addresse("567P", 2319,"Bergen");
		
		asKunde = new Addresse("234", 2610,"Førde");
		asKunde1 = new Addresse("456", 6781, "Stavanger");
		asKunde2 = new Addresse("5637", 7812, "Ørsat");
		
		asFirma = new Addresse("345",2517,"Bergen");
		
	}
	
	@Before
	public void Firma_og_kontorer() {
		
		bFirma = new Bilutleiefirma("Utlån_av_bil",19283746, asFirma);
		
		utKontor = new Utleiekontor(as,1,12345678);
		innKontor = new Utleiekontor(as1,2,3456795);
		uk1 = new Utleiekontor(as2,3,12345678);
		uk2 = new Utleiekontor(as3,4,23456789);
		
		bFirma.leggKontorTilIListe(utKontor);
		bFirma.leggKontorTilIListe(innKontor);
		bFirma.leggKontorTilIListe(uk1);
		bFirma.leggKontorTilIListe(uk2);
	}
	
	@Before	
	public void eksisterendeBiler() {
		bil = new Bil("45678", "BMW" , "Stasjonsvogn", farge.SVART, gruppe.B, true,45000);
		bil1 = new Bil("SV.56780","Ford", "Cabriolet",  farge.RØD, gruppe.A, true,15000);
		bil2 = new Bil("TV.9876", "Mercedes", "Stasjonsvogn",farge.BLÅ, gruppe.C,false,17000);
		bil3 = new Bil("TV.5679", "Volksvagen", "Cabriolet", farge.HVIT, gruppe.D, false,19000);
	}
	

	@Before
	public void registrerteKunder() {
		kunde = new Kunde("Maria","Tufteland",asKunde,98765432);
		kunde1 = new Kunde("Solveig","Try", asKunde1,5671234);
		kunde2 = new Kunde("Helge", " Ingstad", asKunde2, 6712789);
		
		
	}
	
	
	@Test
	public void leggTilBil() {
		
		
		uk1.leggTilEnBil(bil);
		uk1.leggTilEnBil(bil1);
		
		uk2.leggTilEnBil(bil2);
		uk2.leggTilEnBil(bil3);
		
		
		//Sjekker at listen ikke er tom
		assertNotNull(uk1.getBilListe());
		assertNotNull(uk2.getBilListe());
		
		//Sjekker at alle bilene er lagt til i listene
		assertEquals(2,uk1.getAntBiler());
		assertEquals(2,uk2.getAntBiler());
		
	}
//	
////	@Test
////	public void leggTilNyReservasjon() {
////		
////		res = new Reservasjon(uk1,innKontor,ut,inn,klokkeslett,antDager,gruppe.B,kunde1,bil);
////		utKontor.leggTilResIListe(res);
////		
////		assertNotNull(utKontor.getReservasjoner());
////		
////	}
//
//	
//	public void leggTilKunde() {
//		
//		
//		
//		
//	}
	
	//Ser på en liste av tilgjengelige biler
	@Test
	public void tilgjengeligeBiler() {
//		assertNotNull(uk1.tilgjengeligeBiler());
		assertEquals(null,uk2.tilgjengeligeBiler());
	}
	
	//Sjekker om de ulike bilene er tilgjengelige
	
	@Test
	public void ledigBil() {
		assertTrue(bil.isTilgjengelig());
		assertTrue(bil1.isTilgjengelig());
		assertFalse(bil2.isTilgjengelig());
		assertFalse(bil3.isTilgjengelig());
	}
	
	//Sjekker antall kontorer
	
	@Test
	public void antKontorer() {
		assertEquals(4,bFirma.getAntKontorer());
	}}
//}
