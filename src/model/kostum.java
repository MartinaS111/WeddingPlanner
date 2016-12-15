package model;

public class kostum {
	
	private int KID;
	private String GradK;
	private String ImeK;
	private String AdresaK;
	private String TelefonK;
	private String EmailK;
	private String BojaK;
	private int BrojK;
	private int CenaK;
	
	public kostum(){
		super();
	}
	
	public kostum(int KID,String GradK,String ImeK,String AdresaK,String TelefonK,String EmailK,String BojaK,int BrojK,int CenaK){
		super();
		this.KID=KID;
		this.GradK=GradK;
		this.ImeK=ImeK;
		this.AdresaK=AdresaK;
		this.TelefonK=TelefonK;
		this.EmailK=EmailK;
		this.BojaK=BojaK;
		this.BrojK=BrojK;
		this.CenaK=CenaK;
	}

	public int getKID() {
		return KID;
	}

	public void setKID(int kID) {
		KID = kID;
	}

	public String getGradK() {
		return GradK;
	}

	public void setGradK(String gradK) {
		GradK = gradK;
	}

	public String getImeK() {
		return ImeK;
	}

	public void setImeK(String imeK) {
		ImeK = imeK;
	}

	public String getAdresaK() {
		return AdresaK;
	}

	public void setAdresaK(String adresaK) {
		AdresaK = adresaK;
	}

	public String getTelefonK() {
		return TelefonK;
	}

	public void setTelefonK(String telefonK) {
		TelefonK = telefonK;
	}

	public String getEmailK() {
		return EmailK;
	}

	public void setEmailK(String emailK) {
		EmailK = emailK;
	}

	public String getBojaK() {
		return BojaK;
	}

	public void setBojaK(String bojaK) {
		BojaK = bojaK;
	}

	public int getBrojK() {
		return BrojK;
	}

	public void setBrojK(int brojK) {
		BrojK = brojK;
	}

	public int getCenaK() {
		return CenaK;
	}

	public void setCenaK(int cenaK) {
		CenaK = cenaK;
	}
	
	

}
