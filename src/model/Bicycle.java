package model;

public class Bicycle{

  //Atributos de la clase Bicycle
  private int IdBike;
  private double PriceB;
  private String Material;
  private String Brand;
  private String Group;
  private double Weight;
  private int Model;

  //Constructor class Bicycle
  public Bicycle(int idbike, double priceb, String material, String brand, String group, double weight, int model){
    this.IdBike=idbike;
    this.PriceB=priceb;
    this.Material=material;
    this.Brand=brand;
    this.Group=group;
    this.Weight=weight;
    this.Model=model;
  }

  //Getters & Setters
  public int getIdBike(){
    return this.IdBike;
  }
  public void setIdBike(int idbike){
    this.IdBike=idbike;
  }//No. Id de la bicicleta.
  public double getPriceB(){
    return this.PriceB;
  }
  public void setPriceB(double priceb){
    this.PriceB=priceb;
  }//Precio de la bicicleta
  public String getMaterial(){
    return this.Material;
  }
  public void setMaterial(String material){
    this.Material=material;
  }//Material de la Bicicleta
  public String getBrand(){
    return this.Brand;
  }
  public void setBrand(String brand){
    this.Brand=brand;
  }//Marca de la bicicleta
  public String getGroup(){
    return this.Group;
  }
  public void setGroup(String group){
    this.Group=group;
  }//Grupo de la bicicleta
  public double getWeight(){
    return this.Weight;
  }
  public void setWeight(double weight){
    this.Weight=weight;
  }//Peso de la Bicicleta
  public int getModel(){
    return this.Model;
  }
  public void setModel(int model){
    this.Model=model;
  }//Modelo de la bicileta (año de lanzamiento)
}
