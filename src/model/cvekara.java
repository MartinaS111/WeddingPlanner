package model;

public class cvekara {
	
	private int CID;
	private String GradC;
	private String ImeC;
	private String AdresaC;
	private String TelefonC;
	private String EmailC;
	private String Boja;
	private int    CenaC;
	private Boolean Sala;
	private Boolean Kola;
	private Boolean Dom;
	
	public cvekara(){
		super();
	}

	public cvekara(int CID,String GradC,String ImeC,String AdresaC,String TelefonC,String EmailC,String Boja,int    CenaC,Boolean Sala,Boolean Kola,Boolean Dom){
		super();
		this.CID=CID;
		this.GradC=GradC;
		this.ImeC=ImeC;
		this.AdresaC=AdresaC;
		this.TelefonC=TelefonC;
		this.EmailC=EmailC;
		this.Boja=Boja;
		this.CenaC=CenaC;
		this.Sala=Sala;
		this.Kola=Kola;
		this.Dom=Dom;
	}

	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}

	public String getGradC() {
		return GradC;
	}

	public void setGradC(String gradC) {
		GradC = gradC;
	}

	public String getImeC() {
		return ImeC;
	}

	public void setImeC(String imeC) {
		ImeC = imeC;
	}

	public String getAdresaC() {
		return AdresaC;
	}

	public void setAdresaC(String adresaC) {
		AdresaC = adresaC;
	}

	public String getTelefonC() {
		return TelefonC;
	}

	public void setTelefonC(String telefonC) {
		TelefonC = telefonC;
	}

	public String getEmailC() {
		return EmailC;
	}

	public void setEmailC(String emailC) {
		EmailC = emailC;
	}

	public String getBoja() {
		return Boja;
	}

	public void setBoja(String boja) {
		Boja = boja;
	}

	public int getCenaC() {
		return CenaC;
	}

	public void setCenaC(int cenaC) {
		CenaC = cenaC;
	}

	public Boolean getSala() {
		return Sala;
	}

	public void setSala(Boolean sala) {
		Sala = sala;
	}

	public Boolean getKola() {
		return Kola;
	}

	public void setKola(Boolean kola) {
		Kola = kola;
	}

	public Boolean getDom() {
		return Dom;
	}

	public void setDom(Boolean dom) {
		Dom = dom;
	}
	
	
}
