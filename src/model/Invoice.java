package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice{

    //Atributos clase Invoice (Factura)
    private int CodInvoice;
    private double Iva;
    private double Total;
    private double Subtotal;
    private Date Indate;

    //constructor clase factura
    public Invoice(int codinvoice, double iva, double total, double subtotal, Date indate){
      this.CodInvoice=codinvoice;
      this.Iva=iva;
      this.Total=total;
      this.Subtotal=subtotal;
      this.Indate=indate;
    }

    //getters & Setters
    public int getCodInvoice(){
      return this.CodInvoice;
    }
    public void setCodInvoice(int codinvoice){
      this.CodInvoice=codinvoice;
    }//No. del código de la factura
    public double getIva(){
      return this.Iva;
    }
    public void setIva(double iva){
      this.Iva=iva;
    }//Iva para el valor total de la factura
    public double getTotal(){
      return this.Total;
    }
    public void setTotal(double total){
      this.Total=total;
    }//Valor total de la factura
    public double getSubtotal(){
      return this.Total;
    }
    public void setSubtotal(double subtotal){
      this.Subtotal=subtotal;
    }//Subtotal de la factura
    public Date getIndate(){
      return this.Indate;
    }
    public void setIndate(Date indate){
      this.Indate=indate;
    }//Fecha de factura
}
