package classexercise;

public class Student {
	int matrikelnummer;
	String name;
	String vorname;
	Adresse adresse;

	public Student(int matrikelnummer, String name, String vorname, Adresse adresse) {
		this.matrikelnummer = matrikelnummer;
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
	}

	public Student(int matrikelnummer, String name, String ort, String straße, int plz) {
		this.matrikelnummer = matrikelnummer;
		this.name = name;
		this.adresse = new Adresse(ort, straße, plz);
	}

}
