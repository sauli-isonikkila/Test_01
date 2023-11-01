package hr;

public class TyontekijaOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Henkilo henkilo1 = new Henkilo();
		Henkilo henkilo2 = new Henkilo("Matti Mattila", "Kesäkatu 1");
		henkilo1.setNimi("Viivi Vaara");
		
		Tyontekija t1 = new Tyontekija();
		Tyontekija t2 = new Tyontekija("Milla Magia", "Velhokuja 1", 3000.5);
	}

}
