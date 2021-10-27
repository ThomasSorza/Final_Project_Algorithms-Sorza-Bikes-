package model;

public class Mountain extends Bicycle{

  //Atributos de la la clase Mountain
  //Clase con Herencia de Bicycle
  private String Suspenssion;
  private int LongSuspenssion;

  //Constructor de la clase Mountain
  public Mountain(int idbike, double priceb, String material, String brand, String group, double weight, int model, String suspenssion, int longsuspenssion){
    super(idbike, priceb, material, brand, group, weight, model);
    this.Suspenssion=suspenssion;
    this.LongSuspenssion=longsuspenssion;
  }

  //Getters & Setters
  public String getSuspenssion(){
    return this.Suspenssion;
  }
  public void setSuspenssion(String suspenssion){
    this.Suspenssion=suspenssion;
  }//Tipo de suspensión de la bicileta
  public int getLongSuspenssion(){
    return this.LongSuspenssion;
  }
  public void setLongSuspenssion(int longsuspenssion){
    this.LongSuspenssion=longsuspenssion;
  }//Largo de la suspensión en milimetros
}
