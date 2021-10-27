package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User{

  //Atributos de la clase User
  private int Document;
  private String Name;
  private String Email;
  private Date Borndate;

  //Constructor de la clase Usuario
  public User(int document, String name, String email, Date borndate){
     this.Document=document;
     this.Name=name;
     this.Email=email;
     this.Borndate=borndate;
  }

  //Getters & Setters
  public int getDocument(){
     return this.Document;
  }
  public void setDocument(int document){
     this.Document=document;
  }//No. de Documento del Usuario
  public String getName(){
     return this.Name;
  }
  public void setName(String name){
     this.Name=name;
  }//Nombre del Usuario
   public String getEmail(){
      return this.Email;
  }
  public void setEmalin(String email){
     this.Email=email;
  }//E-mail del Usuario
  public Date getBorndate(){
    return this.Borndate;
  }
  public void setBorndate(Date borndate){
    this.Borndate=borndate;
  }//Fecha de nacimiento
}
