import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer");
    int num = in.nextInt();

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    for(int i = 0; i < num; i++) {
      System.out.println("Enter an integer");
      numbers.add(in.nextInt());
    }

    ArrayList<Integer> count = new ArrayList<Integer>();
    for(int i = 0; i < num; i++) {
      int counttime = 0;
      for (int j : numbers) {
        if(j == numbers.get(i)) {
          counttime++;
        }
      }
      count.add(counttime);
    }

    int max = count.indexOf(Collections.max(count));
    System.out.println(numbers.get(max));
  }
}
