 package unterkapitel_02_07;    
  
  public class ParametrisierteMethoden1 {
      
    public static void main (String args []) {
      int a = 0, b = -10;
      
      System.out.print (a+" ist ");
      printSignum (a);
     
      System.out.print (b+" ist ");
      printSignum (b);
     
       
    }
     
    public static void printSignum (int a) {
      String text = "positiv";  
      if (a < 0) text = "negativ";  
      System.out.println (text);  
    }
  }