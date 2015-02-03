package simple_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		try {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("5+x->x: ");
			String Zeile = console.readLine();

			int Ergebnis = 5 + Integer.parseInt(Zeile);
			// Vorbereitung für Eingabe

			while (Ergebnis > 0) {

				if (Ergebnis <= 8) {
					System.out.println(Ergebnis);
					// erstes Ergebnis
				} else {
					int High = Ergebnis - 7;
					if (High > Ergebnis / 2) {
						System.out.println("realyHigh");
						// Unterscheidung zwischen sehr hoch oder abziehen
					} else {
						System.out.println(Ergebnis);

					}
				}
				if (Ergebnis > 0) {
					break;
					// Schleifenende
				}
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
					System.out.println("HelloWorld");
				}
				String path = "www.tutego.com";
				String[] segs = path.split("\",\"");
				for (String element : segs) {
					System.out.println(element);
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
