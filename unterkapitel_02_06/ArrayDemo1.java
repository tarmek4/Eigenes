 package unterkapitel_02_06;
  
 public class ArrayDemo1 {
  
   public static void main (String args []) {
  
     double [] zahlen;
  
     zahlen = new double [3];
  
     zahlen [0] = 4.0;
     zahlen [1] = 3.0;
     zahlen [2] = zahlen [0] * 2;
  
     System.out.println ("erstes Element enthält: "+zahlen[0]);
     System.out.println ("zweites Element enthält: "+zahlen 
       [1]);
     System.out.println ("drittes Element enthält: "+zahlen 
       [2]);
     
     for (double Variable:zahlen){
    	 	System.out.println(Variable);
    	}

   }
 }