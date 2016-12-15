package model;

public class pokani {
	
	private int PID;
	private int CenaP;
	
	public pokani(){
		super();
	}
	
	public pokani(int PID,int CenaP){
		
		this.PID=PID;
		this.CenaP=CenaP;
	}

	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public int getCenaP() {
		return CenaP;
	}

	public void setCenaP(int cenaP) {
		CenaP = cenaP;
	}

	
}
