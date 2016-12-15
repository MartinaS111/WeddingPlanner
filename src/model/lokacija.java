package model;

public class lokacija {

	private int LOID;
	private String GradLO;
	private String ImeLO;
	private String AdresaLO;
	private String TelefonLO;
	private String EmailLO;
	private String Sala;
	private String Porcija;
	private int Gosti;
	
	public lokacija(){
		super();
	}
	
	public lokacija(int LOID,String GradLO,String ImeLO,String AdresaLO,String TelefonLO,String EmailLO,String Sala,String Porcija,int Gosti){
		
		super();
		this.LOID=LOID;
		this.GradLO=GradLO;
		this.ImeLO=ImeLO;
		this.AdresaLO=AdresaLO;
		this.TelefonLO=TelefonLO;
		this.EmailLO=EmailLO;
		this.Sala=Sala;
		this.Porcija=Porcija;
		this.Gosti=Gosti;
	}

	public int getLOID() {
		return LOID;
	}

	public void setLOID(int lOID) {
		LOID = lOID;
	}

	public String getGradLO() {
		return GradLO;
	}

	public void setGradLO(String gradLO) {
		GradLO = gradLO;
	}

	public String getImeLO() {
		return ImeLO;
	}

	public void setImeLO(String imeLO) {
		ImeLO = imeLO;
	}

	public String getAdresaLO() {
		return AdresaLO;
	}

	public void setAdresaLO(String adresaLO) {
		AdresaLO = adresaLO;
	}

	public String getTelefonLO() {
		return TelefonLO;
	}

	public void setTelefonLO(String telefonLO) {
		TelefonLO = telefonLO;
	}

	public String getEmailLO() {
		return EmailLO;
	}

	public void setEmailLO(String emailLO) {
		EmailLO = emailLO;
	}

	public String getSala() {
		return Sala;
	}

	public void setSala(String sala) {
		Sala = sala;
	}

	public String getPorcija() {
		return Porcija;
	}

	public void setPorcija(String porcija) {
		Porcija = porcija;
	}

	public int getGosti() {
		return Gosti;
	}

	public void setGosti(int gosti) {
		Gosti = gosti;
	}
	
	
}
