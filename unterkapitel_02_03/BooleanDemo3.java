 package unterkapitel_02_03;
 public class BooleanDemo3 {
   public static void main (String args []) {
     
     int z1 = 15;
     int z2 = 20;
     
     boolean sindGleich           = z1 == z2;
     boolean istGroesser          = z1 >  z2;
     boolean istKleinerOderGleich = z1 <= z2;
     
     System.out.println ("z1 == z2 ? " + sindGleich);
     System.out.println ("z1  > z2 ? " + istGroesser);
     System.out.println ("z1 <= z2 ? " + istKleinerOderGleich);
   }
 }