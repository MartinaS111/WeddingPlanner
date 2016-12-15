package model;

public class fotostudio {
	
	private int FSID;
	private String GradFS;
	private String ImeFS;
	private String AdresaFS;
	private String TelefonFS;
	private String EmailFS;
	private int BrojSliki;
	private boolean Video;
	private boolean Fotosesija;
	private int CenaFS;
	
	public fotostudio(){
		super();
	}

	public fotostudio(int FSID,String GradFS,String ImeFS,String AdresaFS,String TelefonFS,String EmailFS,int BrojSliki,boolean Video,boolean Fotosesija,int CenaFS){
		super();
		this.FSID=FSID;
		this.GradFS=GradFS;
		this.ImeFS=ImeFS;
		this.AdresaFS=AdresaFS;
		this.TelefonFS=TelefonFS;
		this.EmailFS=EmailFS;
		this.BrojSliki=BrojSliki;
		this.Video=Video;
		this.Fotosesija=Fotosesija;
		this.CenaFS=CenaFS;
	}

	public int getFSID() {
		return FSID;
	}

	public void setFSID(int fSID) {
		FSID = fSID;
	}

	public String getGradFS() {
		return GradFS;
	}

	public void setGradFS(String gradFS) {
		GradFS = gradFS;
	}

	public String getImeFS() {
		return ImeFS;
	}

	public void setImeFS(String imeFS) {
		ImeFS = imeFS;
	}

	public String getAdresaFS() {
		return AdresaFS;
	}

	public void setAdresaFS(String adresaFS) {
		AdresaFS = adresaFS;
	}

	public String getTelefonFS() {
		return TelefonFS;
	}

	public void setTelefonFS(String telefonFS) {
		TelefonFS = telefonFS;
	}

	public String getEmailFS() {
		return EmailFS;
	}

	public void setEmailFS(String emailFS) {
		EmailFS = emailFS;
	}

	public int getBrojSliki() {
		return BrojSliki;
	}

	public void setBrojSliki(int brojSliki) {
		BrojSliki = brojSliki;
	}

	public boolean isVideo() {
		return Video;
	}

	public void setVideo(boolean video) {
		Video = video;
	}

	public boolean isFotosesija() {
		return Fotosesija;
	}

	public void setFotosesija(boolean fotosesija) {
		Fotosesija = fotosesija;
	}

	public int getCenaFS() {
		return CenaFS;
	}

	public void setCenaFS(int cenaFS) {
		CenaFS = cenaFS;
	}
	
	
}
