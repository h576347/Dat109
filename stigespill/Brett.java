package no.hvl.dat109.stigespill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Definerer brettet.
 * 
 * @author Lillian
 *
 */

public class Brett {

	private List<Rute> brett = new ArrayList<Rute>();
	private HashMap<Rute, Rute> stige = new HashMap<Rute, Rute>();

	public Brett() {

		// oppretter rutenummer for alle rutene på brettet
		for (int i = 1; i <= 100; i++) {
			Rute rute = new Rute(i);
			brett.add(rute);
		}

		// tildeler stiger og slanger til forskjellige ruter
		stige.put(brett.get(1), brett.get(37));
		stige.put(brett.get(3), brett.get(13));
		stige.put(brett.get(14), brett.get(5));
		stige.put(brett.get(7), brett.get(30));
		stige.put(brett.get(47), brett.get(10));
		stige.put(brett.get(46), brett.get(25));
		stige.put(brett.get(27), brett.get(83));
		stige.put(brett.get(61), brett.get(18));
		stige.put(brett.get(20), brett.get(41));
		stige.put(brett.get(86), brett.get(23));
		stige.put(brett.get(35), brett.get(43));
		stige.put(brett.get(55), brett.get(52));
		stige.put(brett.get(63), brett.get(59));
		stige.put(brett.get(50), brett.get(76));
		stige.put(brett.get(97), brett.get(77));
		stige.put(brett.get(94), brett.get(74));
		stige.put(brett.get(91), brett.get(72));
		stige.put(brett.get(70), brett.get(90));
		stige.put(brett.get(79), brett.get(99));

	}

	/**
	 * henter ny rute n (verdi) plasser bak ruten som gis som parameter
	 * 
	 * @param rute
	 * @param verdi
	 * @return
	 */
	public Rute hentNyPosisjon(Rute rute, int verdi) {

		int nyRuteVerdi = rute.getRuteVerdi() + verdi;

		// stå i ro dersom nyRuteVerdi > 100
		if (nyRuteVerdi <= 100) {
			return brett.get(nyRuteVerdi - 1);
		} else {
			return rute;
		}
	}

	/**
	 * returnerer første rute på brettet
	 * 
	 * @return
	 */
	public Rute startPosisjon() {
		return brett.get(0);
	}

	/**
	 * skjekker om en rute finnes i listen over ruter med stiger/slanger
	 * 
	 * @param rute
	 * @return
	 */
	public Rute skjekkRute(Rute rute) {
		if (stige.containsKey(rute)) {
			return stige.get(rute);
		} else {
			return rute;
		}
	}

	/**
	 * Finner ruten i fra listen
	 * 
	 * @param rutenr
	 * @return
	 */
	public Rute getRuteFraBrett(int rutenr) {
		return brett.get(rutenr - 1);
	}

}
