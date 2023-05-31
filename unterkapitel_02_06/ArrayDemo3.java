 package unterkapitel_02_06;
 
 public class ArrayDemo3 {
 
   public static void main (String args []) {
 
     int [] z;
     float durchschnitt = 0;
 
     z = new int [10];
 
     for (int i = 0; i < 10; i++) {
       System.out.print ("Bitte geben Sie ");
       System.out.print ("die "+(i+1)+". Zahl ein: ");
       z[i] = leseInteger ();
     }
 
     for (int i = 0; i < 10; i++) {
       durchschnitt += z[i];
     }
 
     durchschnitt /= 10f;
     System.out.print ("Der Durchschnittswert Ihrer ");
     System.out.println ("Eingaben beträgt: "+durchschnitt);
   }
 
   public static int leseInteger () {
     java.io.BufferedReader br = 
      new java.io.BufferedReader(new
     java.io.InputStreamReader(System.in));
     try {return Integer.parseInt (br.readLine());} 
     catch (Exception ex) {return 0;}
   }
 }