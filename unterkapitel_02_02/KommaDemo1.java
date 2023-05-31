
 package unterkapitel_02_02;
  
 public class KommaDemo1 {
  
   public static void main (String args []) {
  
     float temperaturCelsius, temperaturFahrenheit;
     temperaturFahrenheit = 50.5f; 
     temperaturCelsius = (temperaturFahrenheit - 32f) * 5f / 9f;
  
     System.out.print (temperaturFahrenheit+" Grad Fahrenheit");
  System.out.print (" entsprechen ");
  System.out.println (temperaturCelsius+" Grad Celsius.");
   }
 }