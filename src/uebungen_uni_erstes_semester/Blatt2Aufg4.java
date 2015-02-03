package uebungen_uni_erstes_semester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blatt2Aufg4 {
	public static void main(String[] args) {
		try {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("a=");
			String Zahl1 = console.readLine();
			System.out.println("b=");
			String Zahl2 = console.readLine();
			
			int a = Integer.parseInt(Zahl1);
			int b = Integer.parseInt(Zahl2);
			
			double Ergebnis = (11 * Math.pow(a, 3) * Math.pow(b, 5) + 3 * Math.pow(a, 4) * Math.pow(a, 6)) * Math.pow(a, 4) * Math.pow(b, 2)
					- (11 * Math.pow(a, 4) * b - 6 * Math.pow(a, 5) * Math.pow(b, 2)) * Math.pow(a, 3) * Math.pow(b, 6);
			// f(a, b) = (11a3b5 + 3a4b6) · a4b2 − (11a4b− 6a5b2) · a3b6

			System.out.println(Ergebnis);
		} catch (IOException e) {
			// Sollte eigentlich nie passieren
			e.printStackTrace();
		}
	}
}
