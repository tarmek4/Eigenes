 package unterkapitel_02_06;
 public class Programmargumente {
   public static void main (String [] args) {
	   
     System.out.print   ("Folgende Argumente wurden ");
     System.out.print   ("beim Start an dieses Programm ");
     System.out.println ("übergeben: ");
     if (args.length == 0) {
       System.out.println ("keine Argumente!");
     }
     else {
       for (int i = 0; i < args.length; i++) {
         System.out.print   ((i+1)+". Argument: '");
         System.out.println ( args [i]+"'");
         
       }
     }
   }
 }