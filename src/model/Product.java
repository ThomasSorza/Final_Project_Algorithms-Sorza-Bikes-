package model;

public class Product{

  //Atributos de la clase Product
  private int IdProduct;
  private String NameProduct;
  private String ProductType;
  private double PriceP;
  private int StockP;

  //Constructor de la clase Product
  public Product(int idproduct, String nameproduct, String producttype, double pricep, int stockp){
    this.IdProduct=idproduct;
    this.NameProduct=nameproduct;
    this.ProductType=producttype;
    this.PriceP=pricep;
    this.StockP=stockp;
  }

  //Getters & Setters
  public int getIdProduct(){
    return this.IdProduct;
  }
  public void setIdProduct(int idproduct){
    this.IdProduct=idproduct;
  }//No. de ID del producto
  public String getNameProduct(){
    return this.NameProduct;
  }
  public void setNameProduct(String nameproduct){
    this.NameProduct=nameproduct;
  }//NOmbre del producto
  public String getProductType(){
    return this.ProductType;
  }
  public void setProductType(String producttype){
    this.ProductType=producttype;
  }//Tipo del producto
  public double getPriceP(){
    return this.PriceP;
  }
  public void setPriceP(double pricep){
    this.PriceP=pricep;
  }//Precio del producto
  public int getStockP(){
    return this.StockP;
  }
  public void setStockP(int stockp){
    this.StockP=stockp;
  }//Stock del producto
}
