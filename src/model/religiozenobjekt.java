package model;

public class religiozenobjekt {
	
	private int ROID;
	private String GradRO;
	private String ImeRO;
	private String AdresaRO;
	private String TelefonRO;
	
	public religiozenobjekt (){
		super();
	}

	public religiozenobjekt(int ROID,String GradRO,String ImeRO,String AdresaRO,String TelefonRO){
		
		super();
		this.ROID=ROID;
		this.GradRO=GradRO;
		this.ImeRO=ImeRO;
		this.AdresaRO=AdresaRO;
		this.TelefonRO=TelefonRO;
	}

	public int getROID() {
		return ROID;
	}

	public void setROID(int rOID) {
		ROID = rOID;
	}

	public String getGradRO() {
		return GradRO;
	}

	public void setGradRO(String gradRO) {
		GradRO = gradRO;
	}

	public String getImeRO() {
		return ImeRO;
	}

	public void setImeRO(String imeRO) {
		ImeRO = imeRO;
	}

	public String getAdresaRO() {
		return AdresaRO;
	}

	public void setAdresaRO(String adresaRO) {
		AdresaRO = adresaRO;
	}

	public String getTelefonRO() {
		return TelefonRO;
	}

	public void setTelefonRO(String telefonRO) {
		TelefonRO = telefonRO;
	}
	
	
}
