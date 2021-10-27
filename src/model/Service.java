package model;

public class Service{

  //Atributos de la clase Service
  private int IdService;
  private String ServiceType;
  private double PriceS;

  //Constructor class Service
  public Service(int idservice, String servicetype, double prices){
    this.IdService=idservice;
    this.PriceS=prices;
    this.ServiceType=servicetype;
  }

  //Getters & Setters
  public int getIdService(){
    return this.IdService;
  }
  public void setIdService(int idservice){
    this.IdService=idservice;
  }//No. Id del Servicio.(Serial servicio)
  public double getPriceS(){
    return this.PriceS;
  }
  public void setPriceS(double prices){
    this.PriceS=prices;
  }//Precio del Servicio.
  public String getServiceType(){
    return this.ServiceType;
  }
  public void setServiceType(String servicetype){
    this.ServiceType=servicetype;
  }//Tipo de Servicio.
}
