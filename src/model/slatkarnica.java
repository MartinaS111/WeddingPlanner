package model;

public class slatkarnica {
	
	private int TID;
	private String GradT;
	private String ImeT;
	private String AdresaT;
	private String TelefonT;
	private String EmailT;
	private String Vkusovi;
	private int BrojSpratovi;
	private int CenaT;

	public slatkarnica(){
		super();
	}
	
	public slatkarnica(int TID,String GradT,String ImeT,String AdresaT,String TelefonT,String EmailT,String Vkusovi,int BrojSpratovi,int CenaT){
		super();
		this.TID=TID;
		this.GradT=GradT;
		this.ImeT=ImeT;
		this.AdresaT=AdresaT;
		this.TelefonT=TelefonT;
		this.EmailT=EmailT;
		this.Vkusovi=Vkusovi;
		this.BrojSpratovi=BrojSpratovi;
		this.CenaT=CenaT;
	}

	public int getTID() {
		return TID;
	}

	public void setTID(int tID) {
		TID = tID;
	}

	public String getGradT() {
		return GradT;
	}

	public void setGradT(String gradT) {
		GradT = gradT;
	}

	public String getImeT() {
		return ImeT;
	}

	public void setImeT(String imeT) {
		ImeT = imeT;
	}

	public String getAdresaT() {
		return AdresaT;
	}

	public void setAdresaT(String adresaT) {
		AdresaT = adresaT;
	}

	public String getTelefonT() {
		return TelefonT;
	}

	public void setTelefonT(String telefonT) {
		TelefonT = telefonT;
	}

	public String getEmailT() {
		return EmailT;
	}

	public void setEmailT(String emailT) {
		EmailT = emailT;
	}

	public String getVkusovi() {
		return Vkusovi;
	}

	public void setVkusovi(String vkusovi) {
		Vkusovi = vkusovi;
	}

	public int getBrojSpratovi() {
		return BrojSpratovi;
	}

	public void setBrojSpratovi(int brojSpratovi) {
		BrojSpratovi = brojSpratovi;
	}

	public int getCenaT() {
		return CenaT;
	}

	public void setCenaT(int cenaT) {
		CenaT = cenaT;
	}
	
	
}
