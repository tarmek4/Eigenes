 package unterkapitel_02_06;
  
 public class Bitmap {
  
   public static void main (String args []) {
     int[][] bitmap = { 
      {0,0,1,1,1,1,1,1,1,0,0},
      {0,1,0,0,0,0,0,0,0,1,0},
      {1,0,0,1,1,0,1,1,0,0,1},                          
      {1,0,0,1,0,0,0,1,0,0,1},
      {1,0,0,0,0,1,0,0,0,0,1},
      {1,0,0,0,0,1,0,0,0,0,1},
      {1,0,0,1,0,0,0,1,0,0,1},
      {1,0,0,0,1,1,1,0,0,0,1},
      {0,1,0,0,0,0,0,0,0,1,0},
      {0,0,1,1,1,1,1,1,1,0,0} };
    
     
     for (int[] zeile : bitmap) {
       for (int farbe : zeile) {        
        
    	   
    	   if (farbe == 1) {
        	 
    		   if (args.length == 0) {
        		 System.out.print("**");
    		   }
    		   else {        	 
    			   System.out.print(args[0]+args[0]);
        		
        	 }
        	 
    	   }
    	   if (farbe == 0)
    		   if (args.length <=1 ) {
    			   System.out.print("  ");
    		   }
    		   else  System.out.print(args[1]+args[1]);
       }
       System.out.println ();
     }  
   }
 }