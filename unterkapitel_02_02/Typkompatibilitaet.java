
 package unterkapitel_02_02;
  
 public class Typkompatibilitaet {
  
   public static void main (String args []) {
   
     int   anzahlArtikel    = 120;
     float kostenProArtikel = 13.99f;
     float gesamtkosten     = anzahlArtikel * kostenProArtikel;
    
     System.out.println ("Gesamtpreis: "+gesamtkosten);
   }
 }