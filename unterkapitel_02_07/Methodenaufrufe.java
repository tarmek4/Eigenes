
 package unterkapitel_02_07;
  
 public class Methodenaufrufe {
  
   public static void main (String args []) {
  
    System.out.println ("Aufruf der println-Methode!");    
    int zufall = (int) (Math.random () * 100.0) + 1;
  
      System.out.print ("Eine Zahl zwischen 1 und 100 ");
      System.out.println ("mit der Math.random()-Methode:"+zufall);
    }
 }