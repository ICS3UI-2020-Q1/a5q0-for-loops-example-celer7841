/**
 * For loop example
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the counting variable
    int count = 1;
    // create our loop to count 
    while(count <=5){
      // print the number
      System.out.println(count);
      // add 1 to count
      count = count +1;
    }


   // create a for loop that counts to 5
   for(int count2 = 1; count2 <=5; count2 = count2 +1){
     // print the number
     System.out.println("Your number is " + (count2 + 1));
   }

  }
}
