package no.hvl.dat109.stigespill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Lillian
 *
 */

public class Stigespill {

	private List<Spiller> spillere;
	private Terning terning = new Terning();
	private Brett brett;
	private boolean ferdig = false;

	public Stigespill() {
		brett = new Brett();
		settOppSpill();
	}

	public Stigespill(List<Spiller> spillere, Brett brett) {
		this.spillere = spillere;
		this.brett = brett;
	}

	/**
	 * starter spillet
	 */
	public void spillStigespill() {
		while (!ferdig) {
			spill();
		}
	}

	/**
	 * spiller en runde for alle spillerene
	 */
	private void spill() {

		for (Spiller spiller : spillere) {
			if (!ferdig) {
				spiller.spillRunde(terning);
				if (spiller.harVunnet()) {
					ferdig = true;
				}
			}
		}
	}

	/**
	 * oppretter spillerene ved å lese inn antall spillere og navn fra tastatur
	 */
	private void settOppSpill() {
		
		boolean korrektAntallSpillere = false;

		while (!korrektAntallSpillere) {
			try {

				@SuppressWarnings("resource")
				Scanner tast = new Scanner(System.in);

				System.out.print("Skriv inn antall spillere [2, 4]: ");
				int antallSpillere = tast.nextInt();
				tast.nextLine();

				if (antallSpillere >= 2 && antallSpillere <= 4) {
					korrektAntallSpillere = true;
					spillere = new ArrayList<Spiller>(antallSpillere);

					for (int i = 0; i < antallSpillere; i++) {
						System.out.print("Skriv inn navn på spiller " + (i + 1) + ": ");
						String navn = tast.nextLine();
						Brikke brikke = new Brikke(brett);
						Spiller spiller = new Spiller(navn, brikke);
						spillere.add(spiller);
					}
				} else {
					System.out.println("Det kan kun være 2-4 spillere. Prøv på nytt.");
				}

			} catch (Exception e) {
				System.out.println("Feil; ikke en gyldig input.");
			}
		}
	}
}
