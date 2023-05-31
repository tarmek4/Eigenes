 package unterkapitel_02_04;
  
 public class IfDemo3 {
   
   public static void main (String args []) {
     int alter;
     
     System.out.print ("Wie alt sind Sie? ");
     alter = readInt ();
     
     if (alter < 3 || alter > 99) {
       System.out.print ("Ungültige Eingabe! Geben Sie ");
       System.out.println ("eine Zahl zwischen 3 und 99 ein!");
     }
     else {
       System.out.println ("Sie sind also "+alter+"Jahre alt!");
       
       if (alter > 12 && alter < 20) {
         System.out.println ("Sie sind ein Teenager!");
       }
       else {
     System.out.println ("Sie sind kein Teenager!");
       }
     }  
   }
   
   public static int readInt () {
     java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
     try {return Integer.parseInt (br.readLine());} 
      catch (Exception ex) {return 0;}
    }
  }