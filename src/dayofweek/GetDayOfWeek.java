package dayofweek;

import java.text.DateFormat;
import java.util.Locale;

import java.util.Calendar;
import java.util.Scanner; 

class GetDayOfWeek {
  public static void main(String[] args) {
	  Calendar calendario = Calendar.getInstance(); 
	  calendario.set(Calendar.YEAR, 2022); 
	  calendario.get(Calendar.YEAR); 
      System.out.println(calendario.getTime());
	 
      Scanner myObj = new Scanner(System.in);
      
      System.out.println("Digite um numero:");
      int numero = myObj.nextInt();
      
      calendario.add(Calendar.DAY_OF_MONTH, numero); 
      
      DateFormat formatDate = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
      
      System.out.println("Daqui a " + numero + " dias será: " + formatDate.format(calendario.getTime())); 
      
  }
}