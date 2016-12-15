package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.login;

public class RegisterDao {

	private int uspesno;
	
	public RegisterDao(){
		
	}
	
	public void vnesi(login korisnik){
		
		  try(
				   DBConnect db = new DBConnect();
				   Connection connection =db.getConnection();){
				   
				   //proverka na konekcijata na konzola
				   System.out.println("konekcijata e ovozmozhena, sega ke polnam");
				   
				   //podgotvi sto da mu ispratam so query
				    PreparedStatement preparedStatement = connection.prepareStatement("insert into login (Ime,Prezime,Telefon,Email,Password) values (?,?,?,?,?)");
				    preparedStatement.setString(1, korisnik.getIme());
				    preparedStatement.setString(2, korisnik.getPrezime());
				    preparedStatement.setString(3, korisnik.getTelefon());
				    preparedStatement.setString(4, korisnik.getEmail());
				    preparedStatement.setString(5, korisnik.getPassword());
				  
//				    uspesno=1;
				    uspesno=preparedStatement.executeUpdate();
				   System.out.println("bazata e polna so vnesenite podatoci: "+korisnik.getIme()+" , "+korisnik.getPrezime()+" , "+korisnik.getTelefon()+" , "+korisnik.getEmail()+" , "+korisnik.getPassword());
				    
				   }catch (Exception e) {
				    // TODO: handle exception
				    e.printStackTrace();
				   }
		
	}
	
	public int getStatus(){
		return uspesno;
	}
}
