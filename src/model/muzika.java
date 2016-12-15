package model;

public class muzika {
	
	private int MID;
	private String GradM;
	private String ImeM;
	private String AdresaM;
	private String TelefonM;
	private String EmailM;
	private int BrojSviraci;
	private String Solist;
	
	public muzika(){
		super();
	}
	
	public muzika(int MID,String GradM,String ImeM,String AdresaM,String TelefonM,String EmailM,int BrojSviraci,String Solist){
		super();
		this.MID=MID;
		this.GradM=GradM;
		this.ImeM=ImeM;
		this.AdresaM=AdresaM;
		this.TelefonM=TelefonM;
		this.EmailM=EmailM;
		this.BrojSviraci=BrojSviraci;
		this.Solist=Solist;
	}

	public int getMID() {
		return MID;
	}

	public void setMID(int mID) {
		MID = mID;
	}

	public String getGradM() {
		return GradM;
	}

	public void setGradM(String gradM) {
		GradM = gradM;
	}

	public String getImeM() {
		return ImeM;
	}

	public void setImeM(String imeM) {
		ImeM = imeM;
	}

	public String getAdresaM() {
		return AdresaM;
	}

	public void setAdresaM(String adresaM) {
		AdresaM = adresaM;
	}

	public String getTelefonM() {
		return TelefonM;
	}

	public void setTelefonM(String telefonM) {
		TelefonM = telefonM;
	}

	public String getEmailM() {
		return EmailM;
	}

	public void setEmailM(String emailM) {
		EmailM = emailM;
	}

	public int getBrojSviraci() {
		return BrojSviraci;
	}

	public void setBrojSviraci(int brojSviraci) {
		BrojSviraci = brojSviraci;
	}

	public String getSolist() {
		return Solist;
	}

	public void setSolist(String solist) {
		Solist = solist;
	}
	
	

}
