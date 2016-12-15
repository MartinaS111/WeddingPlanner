package model;


public class login {
	
//	private int LID;
	private String Ime;
	private String Prezime;
	private String Telefon;
	private String Email;
	private String Password;
	private int LID;
	private String DatumSvadba;
	private String Grad;

	public login(){
		super();
	}
	public login (int LID,String Ime,String Prezime,String Telefon,String Email,String Password,String DatumSvadba,String Grad){
		
		super();
		this.LID=LID;
		this.Ime=Ime;
		this.Prezime=Prezime;
		this.Telefon=Telefon;
		this.Email=Email;
		this.Password=Password;
		this.DatumSvadba=DatumSvadba;
		this.Grad=Grad;
		
	}
	 
	public login (String Ime,String Prezime,String Telefon,String Email,String Password){
		
		super();
//		this.LID=LID;
		this.Ime=Ime;
		this.Prezime=Prezime;
		this.Telefon=Telefon;
		this.Email=Email;
		this.Password=Password;
		
	}

	public int getLID() {
		return LID;
	}

	public void setLID(int lID) {
		LID = lID;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public String getTelefon() {
		return Telefon;
	}

	public void setTelefon(String telefon) {
		Telefon = telefon;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDatumSvadba() {
		return DatumSvadba;
	}

	public void setDatumSvadba(String datumSvadba) {
		DatumSvadba = datumSvadba;
	}

	public String getGrad() {
		return Grad;
	}

	public void setGrad(String grad) {
		Grad = grad;
	}
	 
	

}
