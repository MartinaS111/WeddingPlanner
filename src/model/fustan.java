package model;

public class fustan{
	
	private int FUID;
	private String GradFU;
	private String ImeFU;
	private String AdresaFU;
	private String TelefonFU;
	private String EmailFU;
	private String BojaFU;
	private int Dolzina;
	private int BrojFU;
	private int CenaFU;
	
	public fustan(){
		super();
	}
	
	public fustan(int FUID,String GradFU,String ImeFU,String AdresaFU,String TelefonFU,String EmailFU,String BojaFU,int Dolzina,int BrojFU,int CenaFU){
		super();
		this.FUID=FUID;
		this.GradFU=GradFU;
		this.ImeFU=ImeFU;
		this.AdresaFU=AdresaFU;
		this.TelefonFU=TelefonFU;
		this.EmailFU=EmailFU;
		this.BojaFU=BojaFU;
		this.Dolzina=Dolzina;
		this.BrojFU=BrojFU;
		this.CenaFU=CenaFU;
	}

	public int getFUID() {
		return FUID;
	}

	public void setFUID(int fUID) {
		FUID = fUID;
	}

	public String getGradFU() {
		return GradFU;
	}

	public void setGradFU(String gradFU) {
		GradFU = gradFU;
	}

	public String getImeFU() {
		return ImeFU;
	}

	public void setImeFU(String imeFU) {
		ImeFU = imeFU;
	}

	public String getAdresaFU() {
		return AdresaFU;
	}

	public void setAdresaFU(String adresaFU) {
		AdresaFU = adresaFU;
	}

	public String getTelefonFU() {
		return TelefonFU;
	}

	public void setTelefonFU(String telefonFU) {
		TelefonFU = telefonFU;
	}

	public String getEmailFU() {
		return EmailFU;
	}

	public void setEmailFU(String emailFU) {
		EmailFU = emailFU;
	}

	public String getBojaFU() {
		return BojaFU;
	}

	public void setBojaFU(String bojaFU) {
		BojaFU = bojaFU;
	}

	public int getDolzina() {
		return Dolzina;
	}

	public void setDolzina(int dolzina) {
		Dolzina = dolzina;
	}

	public int getBrojFU() {
		return BrojFU;
	}

	public void setBrojFU(int brojFU) {
		BrojFU = brojFU;
	}

	public int getCenaFU() {
		return CenaFU;
	}

	public void setCenaFU(int cenaFU) {
		CenaFU = cenaFU;
	}
	
	

}
