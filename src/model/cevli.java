package model;

public class cevli {

	private int CEID;
	private String GradCE;
	private String ImeCE;
	private String AdresaCE;
	private String TelefonCE;
	private String EmailCE;
	private int BrojCE;
	private String BojaCE;
	private Boolean Zenski;
	private Boolean Maski;
	private int CenaCE;
	
	public cevli(){
		super();
	}
	
	public cevli(int CEID,String GradCE,String ImeCE,String AdresaCE,String TelefonCE,String EmailCE,int BrojCE,String BojaCE,Boolean Zenski,Boolean Maski,int CenaCE){
		super();
		this.CEID=CEID;
		this.GradCE=GradCE;
		this.ImeCE=ImeCE;
		this.AdresaCE=AdresaCE;
		this.TelefonCE=TelefonCE;
		this.EmailCE=EmailCE;
		this.BrojCE=BrojCE;
		this.BojaCE=BojaCE;
		this.Zenski=Zenski;
		this.Maski=Maski;
		this.CenaCE=CenaCE;
	
	}

	public int getCEID() {
		return CEID;
	}

	public void setCEID(int cEID) {
		CEID = cEID;
	}

	public String getGradCE() {
		return GradCE;
	}

	public void setGradCE(String gradCE) {
		GradCE = gradCE;
	}

	public String getImeCE() {
		return ImeCE;
	}

	public void setImeCE(String imeCE) {
		ImeCE = imeCE;
	}

	public String getAdresaCE() {
		return AdresaCE;
	}

	public void setAdresaCE(String adresaCE) {
		AdresaCE = adresaCE;
	}

	public String getTelefonCE() {
		return TelefonCE;
	}

	public void setTelefonCE(String telefonCE) {
		TelefonCE = telefonCE;
	}

	public String getEmailCE() {
		return EmailCE;
	}

	public void setEmailCE(String emailCE) {
		EmailCE = emailCE;
	}

	public int getBrojCE() {
		return BrojCE;
	}

	public void setBrojCE(int brojCE) {
		BrojCE = brojCE;
	}

	public String getBojaCE() {
		return BojaCE;
	}

	public void setBojaCE(String bojaCE) {
		BojaCE = bojaCE;
	}

	public Boolean getZenski() {
		return Zenski;
	}

	public void setZenski(Boolean zenski) {
		Zenski = zenski;
	}

	public Boolean getMaski() {
		return Maski;
	}

	public void setMaski(Boolean maski) {
		Maski = maski;
	}

	public int getCenaCE() {
		return CenaCE;
	}

	public void setCenaCE(int cenaCE) {
		CenaCE = cenaCE;
	}
	
	
}
