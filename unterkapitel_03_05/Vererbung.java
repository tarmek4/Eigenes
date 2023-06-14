  package unterkapitel_03_05; 
 
  public class Vererbung {
 
    public static void main (String [] args) {
      Person p = new Person ();
      Sportsman s = new Sportsman ();
     
      p.setName ("Paul");
      s.setName ("Maria");
      s.setSport ("Tennis");
     
      p.introduceYourself ();
      s.introduceYourself ();
     
   }
  }