package uebungen_uni_erstes_semester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blatt3Aufg6 {
//zwei zahlen werden eingegeben und es wird nur die Summe der beiden Zahlen ausgegeben wenn sie gleich groß sind
	public static void main(String[] args) {
		try {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a= ");
			String Zeile = console.readLine();

			int a = Integer.parseInt(Zeile);
			System.out.print("b= ");
			String Zeile1 = console.readLine();
			int b = Integer.parseInt(Zeile1);

			int Ergebnis = a + b;
			if (a > b) {
				System.out.println(a);
			} else {
				if (a < b) {
					System.out.println(a);
				} else {
					System.out.println(Ergebnis);
				}

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
