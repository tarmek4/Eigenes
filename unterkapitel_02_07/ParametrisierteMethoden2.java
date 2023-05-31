 package unterkapitel_02_07;  
    
 public class ParametrisierteMethoden2 {
  
   public static void main (String args []) {      
     System.out.print ("Der ggT von 12 und 8 ist: ");
     printGGT(13,8);
   }  
    
   public static void printGGT(int n1, int n2) {
     while (n2 > 0) {  
       if (n1 > n2) n1 -= n2;  
               else n2 -= n1;      
     }  
     System.out.println (n1);  
   }  
 }