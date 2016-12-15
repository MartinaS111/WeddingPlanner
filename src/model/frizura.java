package model;

public class frizura {
	
	private int FRID;
	private String GradFR;
	private String ImeFR;
	private String AdresaFR;
	private String TelefonFR;
	private String EmailFR;
	private Boolean Nevestinska;
	private Boolean Ostanato;
	private int CenaFR;
	
	public frizura(){
		super();
	}
	
	public frizura(int FRID,String GradFR,String ImeFR,String AdresaFR,String TelefonFR,String EmailFR,Boolean Nevestinska,Boolean Ostanato,int CenaFR){
		super();
		this.FRID=FRID;
		this.GradFR=GradFR;
		this.ImeFR=ImeFR;
		this.AdresaFR=AdresaFR;
		this.TelefonFR=TelefonFR;
		this.EmailFR=EmailFR;
		this.Nevestinska=Nevestinska;
		this.Ostanato=Ostanato;
		this.CenaFR=CenaFR;
	}

	public int getFRID() {
		return FRID;
	}

	public void setFRID(int fRID) {
		FRID = fRID;
	}

	public String getGradFR() {
		return GradFR;
	}

	public void setGradFR(String gradFR) {
		GradFR = gradFR;
	}

	public String getImeFR() {
		return ImeFR;
	}

	public void setImeFR(String imeFR) {
		ImeFR = imeFR;
	}

	public String getAdresaFR() {
		return AdresaFR;
	}

	public void setAdresaFR(String adresaFR) {
		AdresaFR = adresaFR;
	}

	public String getTelefonFR() {
		return TelefonFR;
	}

	public void setTelefonFR(String telefonFR) {
		TelefonFR = telefonFR;
	}

	public String getEmailFR() {
		return EmailFR;
	}

	public void setEmailFR(String emailFR) {
		EmailFR = emailFR;
	}

	public Boolean getNevestinska() {
		return Nevestinska;
	}

	public void setNevestinska(Boolean nevestinska) {
		Nevestinska = nevestinska;
	}

	public Boolean getOstanato() {
		return Ostanato;
	}

	public void setOstanato(Boolean ostanato) {
		Ostanato = ostanato;
	}

	public int getCenaFR() {
		return CenaFR;
	}

	public void setCenaFR(int cenaFR) {
		CenaFR = cenaFR;
	}
	
	

}
