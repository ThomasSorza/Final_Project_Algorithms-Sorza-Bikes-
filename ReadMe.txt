**************************************
**	     Fichero léame	     **
**                                  **
**************************************

El programa presenta una estructura demenús y submenús de la siguiente forma:

MENÚ PRINCIPAL
1 Opciones de Agregar
	1- Agregar Usuario
	2- Agregar Producto
	3- Agregar Bicicleta
		1. Agregar Bicicleta de ruta
		2. Agregar Bicicleta de montaña
	4- Agregar Servicio
	5- volver
2 Opciones de Listar
	1- Listar Usuarios
	2- Listar Productos
	3- Listar Servicios
	4- Listar bicicletas 
		1. Listar Bicicletas de Ruta
		2. Listar Bicicletas de Montaña
	5- volver
3 Facturar 
	1- Agregar Factura
	2- Hacer Factura
	3- Volver
4 Salir 

	Para poder usar la opción de la facturación es necesario haber ingresado previamente
un usuario y los productos que se van a facturar, de lo contrario solo se emitirá un mensaje
de que el usuario no existe. Todos los datos que se van ingresando se van guardando en 
arreglos unidimencionales, es decir que existen arreglos; User, Invoice, Product, Service,
Road y Mountain respectivamanete.
	Como aún en el curso de programación no se tiene manejo sobre arreglos dinámicos 
para autoañadir una posición en cada uno de los arreglos, entonces se inicializaron todos los
arreglos a un número 4 posiciones, por eso solo se pueden ingresar cuatro objetos en cada 
uno de los arreglos, seguirán funcionando las opciones listar y agregar luego de haber
completado todos los arreglos y que se hayan recorrido los índices, si se trata de
ingreasar un quito objeto el programa lo permitirá pero no lo almacenará en el arreglo y
solo se listarán los 4 objetos, los declarados en la clase Presenter.
	Se encontró más conveniente usar el número de los usuarios, productos, servicios y
demás objetos para la facturación, pidiendo que se ingrese de cada una de las unidades de los
artículos que se van a facturar, para evitar problemas a la hora de seleccionar clientes y 
buscar los productos, también en la opción de facturación realizar la factura y luego facturar
en 2 opciones resulta más conveniente.
 
 Se han tenido problemas a la hora de usar los enumerados en la facturación.
 public Size getSize(){
    String size = view.readString("Ingrese la talla de la bicicleta: (S - M - L - XL- XXL - XXL)");
    Size the_size = null;
    switch (size){
      case "S":
        the_size = Size.S;
      break;
      case "M":
        the_size = Size.M;
      break;
      case "L":
        the_size = Size.L;
      break;
      case "XL":
        the_size = Size.XL;
      break;
      case "XXL":
        the_size = Size.XXL;
      break;
      case "XXXL":
        the_size = Size.XXXL;
      break;
    }
  }
  Nose reconocen los objetos tipo enumerados. 
  
