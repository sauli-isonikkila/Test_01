package media;

public class KirjaOhjelma {

	public static void main(String[] args) {
		Kirja k1 = new Kirja();
		Kirja k2 = new Kirja("Javaa", "Jim Guru", 2023);
		k1.setJulkaisuVuosi(2020);
		
		System.out.println(k1.toString());
		System.out.println(k2.toString());
	}

}
