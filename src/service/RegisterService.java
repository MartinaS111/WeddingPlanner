package service;

import model.login;
import dao.RegisterDao;

public class RegisterService {

	private RegisterDao registerDao;
	
	public RegisterService(login korisnik){
		registerDao=new RegisterDao();
		registerDao.vnesi(korisnik);
		
	}
	
	public boolean uspesno(){
		return registerDao.getStatus() > 0 ? true : false;
	}
}
