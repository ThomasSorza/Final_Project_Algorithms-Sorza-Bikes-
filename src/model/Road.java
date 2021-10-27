package model;

public class Road extends Bicycle{

  //Atributos clase Road
  private String Type;

  //Constructor de la clase Mountain
  public Road(int idbike, double priceb, String material, String brand, String group, double weight, int model, String type){
    super(idbike, priceb, material, brand, group, weight, model);
    this.Type=type;
  }

  //Getters & Setters
  public String getType(){
    return this.Type;
  }
  public void setType(String type){
    this.Type=type;
  }//Tipo de Bicicleta
}
