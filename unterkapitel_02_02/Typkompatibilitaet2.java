
 package unterkapitel_02_02;
  
 public class Typkompatibilitaet2 {
  
   public static void main (String args []) {
    
     float radius = 12;
     float umfang = 2 * 3.14159f * radius;
     
     System.out.print("Ein Kreis mit dem Radius "+radius);
     System.out.println (" hat den Umfang "+umfang+"!");
   }
 }