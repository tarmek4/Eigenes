
 package unterkapitel_02_03;
 
 public class BoolescheOperatoren {
   
    public static void main (String args []) {
     
      boolean istKind, istTeenager, istErwachsen;
      int alter = 13;
     
      istKind      = alter <= 12;
      istTeenager  = alter > 12 && alter < 20;
      istErwachsen = alter > 19;
     
      System.out.println ("Kind? "+istKind);
      System.out.println ("Teenager? "+istTeenager);
      System.out.println ("Erwachsen? "+istErwachsen);
 
    }
 }