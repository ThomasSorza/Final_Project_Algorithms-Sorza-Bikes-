package view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Vista
public class View{
	private Scanner console;

	public View(){
	  console = new Scanner(System.in);
	}

	//Leer entero
	public int readInt(String message){
	  System.out.println(message);
	  int number= Integer.parseInt(console.nextLine());
	  return number;
	}

  //Leer String
	public String readString(String message){
		System.out.println(message);
		String value = console.nextLine();
		return value;
	}

	//Leer Double
	public double readDouble(String message){
	  System.out.println(message);
	  double value = Double.parseDouble(console.nextLine());
	  return value;
	}

//Leer Date

	public Date readDate(String message) {
			System.out.println(message);

			String value = console.nextLine();

			Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(value);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return date1;
		}

	public void showMessage(String message){
	System.out.println(message);
	}

}
