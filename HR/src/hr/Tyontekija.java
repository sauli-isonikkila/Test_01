package hr;

import hr.Henkilo;

public class Tyontekija extends Henkilo {
	private double tuntipalkka;
	
	public Tyontekija() {
		
	}
	
	public Tyontekija(String nimi, String osoite, double tuntipalkka) {
		super();
		super.setNimi(nimi);
		super.setOsoite(osoite);
		this.setNimi(nimi);	
	}

	public double getTuntipalkka() {
		return tuntipalkka;
	}

	public void setTuntipalkka(double tuntipalkka) {
		this.tuntipalkka = tuntipalkka;
	}

	@Override
	public String toString() {
		return "Tyontekija [tuntipalkka=" + tuntipalkka + "]";
	}
	
	
}
