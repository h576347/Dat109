package no.hvl.dat109.stigespill;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Lillian
 *
 */
public class Main {

	public static void main(String[] args) {

		// Alt.1: opprette spillere manuelt
		Stigespill stigespill = new Stigespill();
		stigespill.spillStigespill();

		// Alt.2: ferdig genererte spillere
//		List<Spiller> spillere = new ArrayList<Spiller>();
//		Brett brett = new Brett();
//		Spiller spiller1 = new Spiller("Per", new Brikke(brett));
//		Spiller spiller2 = new Spiller("Anne", new Brikke(brett));
//		Spiller spiller3 = new Spiller("Robin", new Brikke(brett));
//		spillere.add(spiller1);
//		spillere.add(spiller2);
//		spillere.add(spiller3);
//		
//		Stigespill stigespill = new Stigespill(spillere, brett);
//		stigespill.spillStigespill();

	}

}
