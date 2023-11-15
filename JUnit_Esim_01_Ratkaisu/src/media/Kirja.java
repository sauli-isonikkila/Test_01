package media;

public class Kirja {
	private String nimi;
	private String tekija;
	private int julkaisuVuosi;

	public Kirja() {
		
	}

	@Deprecated
	public Kirja(String nimi, String tekija, int julkaisuVuosi) {
		this.nimi = nimi;
		this.tekija = tekija;
		this.julkaisuVuosi = julkaisuVuosi;
	}

	@Deprecated
	public String getNimi() {
		return nimi;
	}
	
	public boolean getNimi(String nimi) {
		if (this.nimi != null) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean getNimi(String nimi, String Ok) {
		if (this.nimi != null) {
			return false;
		} else {
			return true;
		}
	}
	

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getTekija() {
		return tekija;
	}

	public void setTekija(String tekija) {
		this.tekija = tekija;
	}

	public int getJulkaisuVuosi() {
		return julkaisuVuosi;
	}

	public boolean  setJulkaisuVuosi(int julkaisuVuosi) {
		boolean okJulkaisuVuosi = false;
		if(julkaisuVuosi >= 0) {
			this.julkaisuVuosi = julkaisuVuosi;
			okJulkaisuVuosi = true;
		} else {
			okJulkaisuVuosi = false;
		}
		return okJulkaisuVuosi;
	}

	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", tekija=" + tekija + ", julkaisuVuosi=" + julkaisuVuosi + "]";
	}
}
