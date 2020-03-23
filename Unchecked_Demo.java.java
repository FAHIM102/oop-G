package Example1;

public class Unchecked_Demo {
	  public static void main(String args[]) {  
		  
      int num[] = {1, 2, 3, 4};
      
      try {
      System.out.println(num[9]);
      }catch (Exception e) {
    	System.out.println("This happen because of out of bound");  
      }
      
      System.out.println("DataBAse connection");
      System.out.println("Sendin email");
      
	  }     

}
