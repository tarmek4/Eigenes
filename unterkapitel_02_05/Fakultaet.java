
 package unterkapitel_02_05;
 
 public class Fakultaet {
 
   public static void main (String args []) {
 
     int x = 6;
     long y = 1;
 
     System.out.print   ("Die Fakultät von "+x);
 
     while (x >= 2) {
       y *= x;
       x--;
     }
 
     System.out.println (" ergibt "+y);
   }
 }