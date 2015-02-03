package uebungen_uni_erstes_semester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blatt3Aufg4 {

	public static void main(String[] args) {
		try {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1.Ziffer=");
			String Ziffer1 = console.readLine();

			System.out.println("2.Ziffer=");
			String Ziffer2 = console.readLine();

			System.out.println("3.Ziffer=");
			String Ziffer3 = console.readLine();

			int Z1 = Integer.parseInt(Ziffer1);
			int Z2 = Integer.parseInt(Ziffer2);
			int Z3 = Integer.parseInt(Ziffer3);
			int Ergebnis = Z1 + Z2 + Z3;
			System.out.println(Ergebnis);

		} catch (IOException e) {
			// Sollte eigentlich nie passieren
			e.printStackTrace();
		}
	}

}
