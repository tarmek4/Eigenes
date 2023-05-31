 package unterkapitel_02_02;
  
 public class Variablenueberlauf1 {
   public static void main (String [] args) {
     int alterInJahren = 70;
     int alterInSekunden;
     alterInSekunden  = alterInJahren * 365 * 24 * 3600;
     System.out.println ("Sie sind "+alterInJahren+" Jahre alt.");
     System.out.println ("Dies entspricht "+alterInSekunden+
       " Sekunden.");
   }
 }