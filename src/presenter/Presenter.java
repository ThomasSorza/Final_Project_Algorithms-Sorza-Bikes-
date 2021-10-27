package presenter;

//imports:
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Invoice;
import model.Mountain;
import model.Road;
import model.User;
import model.Product;
import model.Bicycle;
import model.Service;
import view.View;

public class Presenter{
  private User[] user;
  private Invoice[] invoice;
  private Product[] product;
  private Service[] service;
  private Road[] road;
  private Mountain[] mountain;
  private View view;

//constructor
  public Presenter(){
    user = new User[4];
    invoice = new Invoice[4];
    product = new Product[4];
    road = new Road[4];
    service = new Service[4];
    mountain = new Mountain[4];
    view = new View();
  }

  //MENU PRINCIPAL
  public void run(){
    int opP = 0;
    while(opP != 4){
      opP = showMenuP();
      switch(opP){
      case 1: //Opción 1 MENU PRINCIPAL
        int opA = 0;
          do{
            opA = showMenuA();
            switch(opA){
            case 1:
                addUser();
            break;
            case 2:
                addProduct();
            break;
            case 3:
                int opB = 0;
                  do{
                    opB = showMenuB();
                    switch(opB){
                    case 1:
                        addRoadBike();
                    break;
                    case 2:
                        addMountainBike();
                    break;
                    }
                  }while (opB != 3);
            break;
            case 4:
                addService();
            break;
            }
          }while (opA != 5);
      break;
      case 2://Opción 2 MENU PRINCIPAL
        int opL = 0;
          do{
            opL = showMenuL();
            switch (opL){
            case 1:
                listUser();//listar usuario
            break;
            case 2:
                listProduct();//listar producto
            break;
            case 3:
                listService();//listar servicio
            break;
            case 4:
                int opLB = 0;
                  do{
                    opLB = showMenuLB();
                    switch(opLB){
                    case 1:
                        listRoadBike();
                    break;
                    case 2:
                        listMountainBike();
                    break;
                    }
                  }while (opLB != 3);
            break;
            }
          }while(opL !=5);
      break;
      case 3://Opción 3 MENU PRINCIPAL
          int opF = 0;
            do{
              opF = showMenuF();
              switch(opF){
              case 1:
                  addInvoice();
              break;
              case 2:
                  makeInvoice();
              break;
              }
            }while (opF != 3);
      break;
      case 4://Opción 4 MENU PRINCIPAL
          end();
      break;
      }
    }
  }
  //--------------------MENU PRINCIPAL----------------
  public int showMenuP(){
    int op= view.readInt("**************************************** \n||||||  BIENVENIDO A SORZA BIKES  |||||| \n**************************************** \n          MENÚ PRINCIPAL \n     1. Opciones de Agregar. \n     2. Opciones de Listar. \n     3. Facturar. \n     4. salir. \n     Por Favor, Digite una opción:");
    return op;
  }
  //MENU DE AGREGAR (Usuario-Producto-Servicio-Bicicleta-salir)
	public int showMenuA(){
	  int op = view.readInt("MENU OPCIONES DE AGREGAR \n1. Agregar Usuario. \n2. Agregar Productos. \n3. Agregar Bicicletas. \n4. Agregar Servicios.  \n5. Volver. \n\nPor favor, Digite una opción:");
	  return op;
	}
  //MENU DE AGREGAR BICICLETA(Montaña-Ruta-Salir)
	public int showMenuB(){
	  int op = view.readInt("MENU OPCIONES AGREGAR BICICLETA \n1. Agregar Bicicleta de Ruta. \n2. Agregar Bicicleta de Montaña. \n3. Volver. \n\nPor favor, Digite una opción:");
	  return op;
	}
	//MENU DE LISTAR (Usuario-Producto-Servicio-Bicicleta-salir)
	public int showMenuL(){
		int op = view.readInt("MENU OPCIONES DE LISTAR  \n1. Listar Usuario. \n2. Listar Producto. \n3. Listar Servicio. \n4. Listar Bicicleta. \n5. Volver. \n\nPor favor, Digite una opción:");
		return op;
	}
  //MENU DE LISTAR BICICLETA
  public int showMenuLB(){
		int op = view.readInt("MENU OPCIONES LISTAR BICICLETA \n1. Listar Bicicleta de ruta. \n2. Listar Bicicleta de montaña. \n3. Volver. \n\nPor favor, Digite una opción:");
		return op;
	}
  //Menu Facturar
  public int showMenuF(){
		int op = view.readInt("MENU PARA FACTURAR \n1. Agregar factura. \n2. Hacer Factura. \n3. Volver. \n\nPor favor, Digite una opción:");
		return op;
	}
//-----------------Sub menu 1 (Agregar)--------------
  // (1) Agregar user
  public void addUser(){
    int document = view.readInt("Ingrese número de Documento: ");
		String name = view.readString("Ingrese el Nombre del cliente:");
		String email = view.readString("Ingrese el Email:");
    Date borndate = view.readDate("Ingrese Fecha de nacimiento:");
		addUserList(new User(document, name, email, borndate));
  }

  public void tipoDeDocumento(){
    view.showMessage("Tipo de documento");
  }
  //bucle boolean para User
  public boolean addUserList(User UserObj){
    for(int i = 0; i < user.length; i++){
      if(user[i] == null){
        user[i] = UserObj;
        return true;

      }
    }
    return false;
  }

  public boolean Validation(String cadena)
  {
    int num;
    try {
      num = Integer.parseInt(cadena);
      return true;
    }
    catch(Exception e){
      return false;
    }
  }
  // (2) Agregar producto
  public void addProduct(){
    int idproduct = view.readInt("Id del producto: ");
		String nameproduct = view.readString("Nombre del producto: ");
    String producttype = view.readString("Tipo de producto: ");
    int stockp = view.readInt("Ingrese cantidad de stock:");
		double pricep = view.readDouble("Ingrese el precio del producto: ");
		addProductList(new Product(idproduct, nameproduct, producttype, pricep, stockp));
  }
  //bucle boolean para Producto
  public boolean addProductList(Product ProductObj){
    for(int i = 0; i < product.length; i++){
      if(product[i] == null){
        product[i] = ProductObj;
        return true;

      }
    }
    return false;
  }

  // (3) Agregar bicicleta de ruta
  public void addRoadBike(){
    int idbike = view.readInt("Id de la bicileta: ");
    double priceb = view.readDouble("Precio de la Bicicleta: ");
    String material = view.readString("Seleccione Material:");
    String brand = view.readString("Ingrese la marca de la Bicicleta: ");
    String group = view.readString("Seleccione grupo de la bicicleta: ");
    double weight = view.readDouble("Ingrese el peso de la bicicleta: ");
    int model = view.readInt("Seleccione el modelo de la bicileta: ");
    String type = view.readString("Ingrese el tipo: ");
    addRoadBikeList(new Road(idbike, priceb, material, brand, group, weight, model, type));
  }
  //bucle boolean para Roadbike
  public boolean addRoadBikeList(Road RoadObj){
    for(int i = 0; i < road.length; i++){
      if(road[i] == null){
        road[i] = RoadObj;
        return true;

      }
    }
    return false;
  }

  //Talla Enum Size clase Size

  // (3) Agregar bicicleta de Montaña
  public void addMountainBike(){
    view.showMessage("AGREGAR BICICLETA DE MONTAÑA");
    int idbike = view.readInt("Id de la bicileta: ");
    double priceb = view.readDouble("Precio de la Bicicleta: ");
    String material = view.readString("Seleccione Material:");
    String brand = view.readString("Ingrese la marca de la Bicicleta: ");
    String group = view.readString("Seleccione grupo de la bicicleta: ");
    double weight = view.readDouble("Ingrese el peso de la bicicleta: ");
    int model = view.readInt("Seleccione el modelo de la bicileta: ");
    String suspenssion = view.readString("Ingrese suspensión: ");
    int longsuspenssion = view.readInt("Ingrese el largo de la suspensión");
    addMountainBikeList(new Mountain(idbike, priceb, material, brand, group, weight, model, suspenssion, longsuspenssion));
  }
  //bucle boolean para Roadbike
  public boolean addMountainBikeList(Mountain MountainObj){
    for(int i = 0; i < mountain.length; i++){
      if(mountain[i] == null){
        mountain[i] = MountainObj;
        return true;

      }
    }
    return false;
  }
  // (4) Agregar Servicio
  public void addService(){
    int idservice = view.readInt("Id del servicio: ");
    String servicetype = view.readString("Tipo de Servicio:");
    double prices = view.readDouble("Precio del servicio: ");
    addServiceList(new Service(idservice, servicetype, prices));
  }
  //bucle boolean para Roadbike
  public boolean addServiceList(Service ServiceObj){
    for(int i = 0; i < service.length; i++){
      if(service[i] == null){
        service[i] = ServiceObj;
        return true;

      }
    }
    return false;
  }
//-----------------Sub menu 2 (Listar)--------------
// (1) Listar Usuario
public void listUser() {
  for(int i = 0; i< user.length; i++){
    if (user[i] != null){ //the array's position must not be null
      view.showMessage("Cliente #" + (i+1) + ":");
      view.showMessage("Nombre: " + user[i].getName());
      view.showMessage("Documento:" + user[i].getDocument());
      view.showMessage("Email: " + user[i].getEmail());
      view.showMessage("Fecha de Nacimiento: " + user[i].getBorndate()+ "\n");
    }
  }
}
// (2) Listar Producto
public void listProduct() {
  for(int i = 0; i< product.length; i++){
    if (product[i] != null){ //the array's position must not be null
      view.showMessage("Producto " + product[i].getIdProduct() + ":");
      view.showMessage("Nombre: " + product[i].getNameProduct());
      view.showMessage("Tipo de producto: " + product[i].getProductType() + "\n");
      view.showMessage("Precio del producto: " + product[i].getPriceP() + "\n");
      view.showMessage("Stock del producto: " + product[i].getStockP() + "\n");
    }
  }
}
// (3) Listar Servicio
public void listService() {
  for(int i = 0; i< service.length; i++){
    if (service[i] != null){ //the array's position must not be null
      view.showMessage("Servicio " + service[i].getIdService() + ":");
      view.showMessage("Precio del servicio: " + service[i].getPriceS());
      view.showMessage("Tipo de Servicio:" + service[i].getServiceType());
    }
  }
}
// (4) Listar Bicicleta de Montaña
public void listMountainBike() {
  for(int i = 0; i< mountain.length; i++){
    if (mountain[i] != null){ //La posición del array no debe estar null
      view.showMessage("Bicicleta MTB " + mountain[i].getIdBike() + ":");
      view.showMessage("Precio de la bicicleta: " + mountain[i].getPriceB());
      view.showMessage("Material:" + mountain[i].getMaterial());
      view.showMessage("Marca:" + mountain[i].getBrand());
      view.showMessage("Grupo:" + mountain[i].getGroup());
      view.showMessage("Peso:" + mountain[i].getWeight());
      view.showMessage("Modelo:" + mountain[i].getModel());
      view.showMessage("Suspensión:" + mountain[i].getSuspenssion());
      view.showMessage("Largo de Suspensión:" + mountain[i].getLongSuspenssion());
    }
  }
}
// (4) Listar Bicicleta de Ruta
public void listRoadBike() {
  for(int i = 0; i< road.length; i++){
    if (road[i] != null){ //la posición del array no puede estar null
      view.showMessage("Bicicleta de ruta " + road[i].getIdBike() + ":");
      view.showMessage("Precio de la bicicleta: " + road[i].getPriceB());
      view.showMessage("Material:" + road[i].getMaterial());
      view.showMessage("Marca:" + road[i].getBrand());
      view.showMessage("Grupo:" + road[i].getGroup());
      view.showMessage("Peso:" + road[i].getWeight());
      view.showMessage("Modelo:" + road[i].getModel());
      view.showMessage("Tipo:" + road[i].getType());
    }
  }
}
//-------------------FACTURAR--------------------
public void addInvoice(){
  int codinvoice = view.readInt("Ingrese código de la factura:");
  double iva = 0;
  double total = 0;
  double subtotal = 0;
  Date indate = view.readDate("Ingrese Fecha de factura:");
  addInvoiceList(new Invoice(codinvoice, iva, total, subtotal, indate));
}
//bucle boolean para Factura
public boolean addInvoiceList(Invoice InvoiceObj){
  for(int i = 0; i < invoice.length; i++){
    if(invoice[i] == null){
      invoice[i] = InvoiceObj;
      return true;

    }
  }
  return false;
}
public void makeInvoice(){
  int iF = view.readInt("Ingrese número de factura: ");
    iF = iF - 1;
  int ic = view.readInt("Ingrese número del cliente a facturar: ");
    ic = ic - 1;
  int ip = view.readInt("Ingrese número del producto a facturar: ");
    ip = ip-1;
  int up = view.readInt("Cuantas unidades desea del producto:");
  int irb = view.readInt("Ingrese número de la bicileta de ruta a facturar: ");
    irb = irb-1;
  int urb = view.readInt("Cuantas unidades desea de la bicicleta:");
  int imb = view.readInt("Ingrese número de la bicileta de montaña a facturar: ");
    imb = imb-1;
  int umb = view.readInt("Cuantas unidades desea de la bicicleta:");
  int is = view.readInt("Ingrese el número de servicio que desea facturar: ");
    is = is-1;
  view.showMessage("	*************************************************** \n ");
  view.showMessage("	*		Factura Electrónica 		  * \n ");
  view.showMessage("	*	 	    SORZA BIKES			  * \n ");
  view.showMessage("	*************************************************** \n ");
  view.showMessage("                            Factura# " + invoice[ic].getCodInvoice());
  if(ic >= 0 && product[ip] != null && user[ic] != null && road[irb] != null && road[irb] != null && road[imb] != null && service[is] != null){//the array's position must not be null
    view.showMessage("Cliente #:......................................" + (ic+1));
    view.showMessage("Nombre del Cliente:............................." + user[ic].getName());
    view.showMessage("Documento:......................................" + user[ic].getDocument());
    view.showMessage("Email:.........................................." + user[ic].getEmail());
    view.showMessage("Fecha de Nacimiento:............................" + user[ic].getBorndate()+ "\n");
    view.showMessage("Producto #:....................................." + (ip+1));
    view.showMessage("Nombre del producto:............................" + product[ip].getNameProduct());
    view.showMessage("Tipo de producto:..............................." + product[ip].getProductType());
    view.showMessage("Precio por unidad:.............................." + product[ip].getPriceP() + "\n");
    view.showMessage("Unidades del producto:.........................." + up);
    view.showMessage("Bicicleta de ruta:.............................." + road[irb].getIdBike());
    view.showMessage("Material:......................................." + road[irb].getMaterial());
    view.showMessage("Marca:.........................................." + road[irb].getBrand());
    view.showMessage("Grupo:.........................................." + road[irb].getGroup());
    view.showMessage("Peso:..........................................." + road[irb].getWeight());
    view.showMessage("Modelo:........................................." + road[irb].getModel());
    view.showMessage("Tipo:..........................................." + road[irb].getType());
    view.showMessage("Precio por bicicleta:..........................." + road[irb].getPriceB());
    view.showMessage("Unidades de bicicleta de ruta:.................." + urb);
    view.showMessage("Bicicleta MTB:.................................." + mountain[imb].getIdBike());
    view.showMessage("Material:......................................." + mountain[imb].getMaterial());
    view.showMessage("Marca:.........................................." + mountain[imb].getBrand());
    view.showMessage("Grupo:.........................................." + mountain[imb].getGroup());
    view.showMessage("Peso:..........................................." + mountain[imb].getWeight());
    view.showMessage("Modelo:........................................." + mountain[imb].getModel());
    view.showMessage("Suspensión:....................................." + mountain[imb].getSuspenssion());
    view.showMessage("Largo de Suspensión:............................" + mountain[imb].getLongSuspenssion());
    view.showMessage("Precio por bicicleta:..........................." + mountain[imb].getPriceB());
    view.showMessage("Unidades de MTB:................................" + umb);
    view.showMessage("Servicio #:....................................." + service[is].getIdService() + ":");
    view.showMessage("Tipo de servicio:..............................." + service[is].getServiceType());
    view.showMessage("Precio del producto:............................" + service[is].getPriceS());
    double products = (product[ip].getPriceP()*up);
    double roadbikes = (road[irb].getPriceB()*urb);
    double mountainbikes = (mountain[imb].getPriceB()*umb);
    double services = (service[is].getPriceS());
    double bikes = roadbikes + mountainbikes;
    double total = products + bikes + services;
    double iva = total * 0.19;
    view.showMessage("IVA:............................................" + iva);
    view.showMessage("Subtotal:......................................." + (total - iva));
    view.showMessage("Total:.........................................." + total);
    // se debe operar el product[ip].getPriceP()*up para sacar el precio
    // de todas las unidades y se suman en el total.
  }
    else{
    view.showMessage("Error Usuario no registrado.");
  }
}

  //Exit
  public void end() {
	 System.exit(0);
	}

	public static void main(String args[]){
	  new Presenter().run();
	}
}
