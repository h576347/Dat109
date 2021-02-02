package no.hvl.dat109.tekster;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import no.hvl.dat109.Reservasjon;
import no.hvl.dat109.Utleiekontor;
import no.hvl.dat109.Bil;
import no.hvl.dat109.Bilutleiefirma;
import no.hvl.dat109.Gruppe;
import no.hvl.dat109.Kunde;

public class ReservasjonsTekst {
	
	
	private Bilutleiefirma bf;
	private Reservasjon res;
	private BilGruppeTekst bgt;
	private Kunde kunde;
	private Utleiekontor utKontor, innKontor;
	
	public Reservasjon resTekst() {
		
		Scanner tast = new Scanner(System.in);
		
		System.out.println("Velg utleiekontor for hvor du vil hente bilen");
		utKontor = ut_inn_kontor();
		
		System.out.println("Ønsker du samme innleveringssted som utleveringssted? 1 for ja og 0 for nei");
		int svar = tast.nextInt();
		tast.nextLine();
		
		
		if(svar == 1) {
			innKontor = utKontor;
		}else {
			innKontor = ut_inn_kontor();
		}
		
		System.out.println("Skriv inn dato for henting: ");
		Date ut = dato();
		
		System.out.println("Skriv inn dato for levering: ");
		Date inn = dato();
		
		System.out.println("Skriv inn klokkeslett for henting: ");
		String klSlett = tast.nextLine();
		
		int antDager = inn.getDay()-ut.getDay();
		
		int valg = utleiePris();
		
		Gruppe gruppe = bgt.gruppe(valg);
		kunde = new KundeTekst().nyKundeTekst();
		
		
		Bil valgtBil= velgBil(utKontor,gruppe);
		
		tast.close();
		
		return new Reservasjon(utKontor);
	}
	
	private Date dato() {
		Scanner tast = new Scanner(System.in);
		Date d;
		
		System.out.println("Skriv inn årstall: ");
		int aar = tast.nextInt();
		tast.nextLine();
		
		System.out.println("Skriv inn måned: ");
		int maaned = tast.nextInt();
		tast.nextLine();
		
		System.out.println("Skric inn dag: ");
		int dag = tast.nextInt();
		tast.nextLine();
		
		
		d = new Date(aar,maaned,dag);
		
		return d;
	}
	
	
	private Utleiekontor ut_inn_kontor() {
		
		Scanner tast = new Scanner(System.in);
	
		for(int i = 0; i < bf.getUtleiekontor().size(); i++) {
			System.out.println("Trykk " + i + "for å velge " + bf.getUtleiekontor().get(i));
			
		}
		
		int utKontorIndex = tast.nextInt();
		tast.nextLine();
		
		Utleiekontor utKontor = bf.getUtleiekontor().get(utKontorIndex);
		
		return utKontor;
		
		
		
	}
	
	private int utleiePris(){
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		for (Gruppe g : utKontor.getKatPris().keySet()) {
			String key = g.toString();
			String value = utKontor.getKatPris().get(g).toString();
			System.out.println("Tast " + i + " for å velge denne gruppe med denne prisklassen: " + key + " " + value);
			i++;
		}
		int valg = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		
		return valg;
		
	}
	
	private Bil velgBil(Utleiekontor utleiekontor, Gruppe gruppe) {
		Scanner sc = new Scanner(System.in);
		
		List<Bil> biler = utleiekontor.getBilListe();

		System.out.println("Tast inn tall som tilsvarer bilen du ønsker å velge");
		for(int i = 0; i < biler.size(); i++) {
			if(biler.get(i).isTilgjengelig() && biler.get(i).getUtleiegruppe()==gruppe) {
				System.out.println( i + " " + biler.get(i));
			}
		}
		
		int valg = sc.nextInt();
		sc.nextLine();
		
		Bil valgtBil = biler.get(valg);
		valgtBil.setTilgjengelig(false);
		sc.close();
		
		return valgtBil;
		
		
	}
	
}
