package classexercise;

public class Studententest {

	public static void main(String[] args) {
		Adresse adresse = new Adresse("Taucha", "Teichgasse 5", 04425);
		Student student1 = new Student(1004321, "von Rauchhaupt", "Thimo", adresse);

		System.out.println(student1.adresse.ort);
	}

}
